/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.IOException; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.apache.pdfbox.pdmodel.PDDocument;  
import org.apache.pdfbox.pdmodel.PDPage;  
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;  
import org.apache.pdfbox.pdmodel.font.PDType1Font;  
import org.apache.pdfbox.pdmodel.font.PDTrueTypeFont;

import org.apache.pdfbox.pdmodel.font.encoding.WinAnsiEncoding;
  
public class PDF {
    static String username,bID,showID,Regno;
   static String bookingid="",user="",showid="",showdate="",showtime="",movie="",regno="",screen="",seats="",theatre="";
   static int noofseats,price;
   
    public PDF(){
    }
    
    public PDF(String user,String bid,String showid,String regno){
     username = user;
     bID=bid;
     showID=showid;
     Regno=regno;
        
    }
    private static void Display(){
         try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");  
            String query = "select * from booking where BookingID=?";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,"6TNUQ");
            
              
            ResultSet rs = prepStmt.executeQuery();
            if(rs.next()){
                bookingid=rs.getString(2);
                noofseats=rs.getInt(4);
                price=rs.getInt(5);
                user=rs.getString(1);
                showid=rs.getString(3);
            }
            con.close();
    }
        
        catch(Exception e){}
        
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root",""); 
             String query = "select * from shows where showid=?";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,showID);
            
            ResultSet rs = prepStmt.executeQuery();
            if(rs.next()){
                movie=rs.getString(3);
                showdate=rs.getString(4);
               showtime=rs.getString(5);
               screen=rs.getString(1);
                regno=rs.getString(2);
            }
            
            con.close();
        }
        
        catch(Exception e){}
        String seat="";
        try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root",""); 
             String query = "select * from seats where BookingID=?";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,bID);
            
            ResultSet rs = prepStmt.executeQuery();
            while(rs.next()){
                seat+=rs.getString(1)+" ";
            }
            seats=seat;
            con.close();
        }
        
        catch(Exception e){}
        
        try{
             Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root",""); 
             String query = "select * from theatre where registrationno=?";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,Regno);
            
            ResultSet rs = prepStmt.executeQuery();
            if(rs.next()){
                theatre=rs.getString(1);
            }
            con.close();
        }
        
        catch(Exception e){}
    }
    
    public static void call(){
        Display();
         try (PDDocument document = new PDDocument()) {
             PDPage myPage = new PDPage();
             document.addPage(myPage);
             try ( //Saving the document
                     PDPageContentStream cont = new PDPageContentStream(document, myPage)) {
                 PDFont font = PDTrueTypeFont.load(document, PDDocument.class.getResourceAsStream("/org/apache/pdfbox/resources/ttf/LiberationSans-Regular.ttf"), WinAnsiEncoding.INSTANCE);
                 cont.beginText();
                 cont.setFont( font, 16 );
                 cont.setLeading(14.5f);
                 cont.newLineAtOffset(25,725 );
                 cont.showText("Thank you for your purchase!");
                 cont.newLine();
                 cont.newLine();
                 cont.newLine();
                 cont.showText( "USERNAME: "+username );
                 cont.newLine();
                  cont.newLine();
                 cont.showText("MOVIE: "+movie);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("SHOW DATE: "+showdate);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("SHOW TIME: "+showtime);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("NUMBER OF SEATS: "+noofseats);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("SEATS: "+seats);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("THEATRE: "+theatre);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("SCREEN: "+screen);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("TICKET PRICE: "+price);
                 cont.newLine();
                  cont.newLine();
                 cont.showText("BOOKING ID: "+bID);
                 cont.newLine();
                  cont.newLine();
                  cont.showText("PAYMENT METHOD: Credit/Debit Card");
                  cont.newLine();
                  cont.newLine();
                  cont.newLine();
                  cont.showText("IMPORTANT INSTRUCTIONS");
                  cont.newLine();
                  cont.newLine();
                  cont.showText("Tickets once booked cannot be canceled or refunded.");
                  cont.newLine();
                  cont.newLine();
                  cont.showText("GST collected is paid to the department.");
                  cont.newLine();
                 cont.endText();
                 
                 cont.close();
                 //  closed the content stream class.
             }
             /*cont.beginText();
             cont.setFont(font,12);
             cont.showText(line1);
             cont.endText();*/
             document.save("D:/Users/user/Documents/BookingConfirmation.pdf");
             System.out.println("PDF created");
             //Closing the document  */
         }
     
     
     catch(Exception e){}
    }

    
    
   public static void main (String args[]) throws IOException {
       
      //Creating PDF document object 
      
    call();
   }  
}

