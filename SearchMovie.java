
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.lang.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class SearchMovie extends javax.swing.JFrame {

    /**
     * Creates new form SearchMovie
     */
    String username;
    String Movie;
    public SearchMovie() {
        initComponents();
    }
    
    
    
    public SearchMovie(String movie,String user){
        username=user;
        Movie=movie;
        initComponents();
        setTitle("SEARCH MOVIE BY MOVIE NAME");
        try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                    String query = "select * from shows JOIN Theatre ON shows.RegistrationNumber = Theatre.registrationno where shows.movie = ?";
                    PreparedStatement prepStmt = con.prepareStatement(query);
                    prepStmt.setString(1, Movie);
                    ResultSet rs = prepStmt.executeQuery();
                   DefaultTableModel table2=(DefaultTableModel)jTable2.getModel();
                    while(rs.next()){
                        String theatre=rs.getString(10);
                    
                        
                        String screenid=rs.getString(1);
                        String showdate=rs.getString(4);
                        String showtime = rs.getString(5);
                        String[] arr={theatre,showdate,showtime,screenid};
                        
                         table2.addRow(arr);
                    }
                    
                    con.close();
                        
                    }
        
        catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Theatre", "Show Date", "Show Time", "Screen"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(130, 290, 719, 97);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BACK TO HOMEPAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(678, 496, 291, 37);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("BOOK SHOW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 496, 185, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\movie.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(870, -140, 1160, 900);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserHomepage h = new UserHomepage(username);
        h.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int selectedRow = jTable2.getSelectedRow();
         int max1=0;
        if(selectedRow==-1){}
        else{
            String screenid=model.getValueAt(selectedRow, 3).toString();
            String showdate = model.getValueAt(selectedRow,1).toString();
            String showtime = model.getValueAt(selectedRow,2).toString();
           
             try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");  
            String query = "select * from screen where ScreenID = ?";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,screenid);      
            ResultSet rs = prepStmt.executeQuery();
            int capacityfr, capacitymr, capacitylr;
          
            if(rs.next()){
                 capacityfr = rs.getInt(3);
                 capacitymr = rs.getInt(4);
                 capacitylr = rs.getInt(5);
               
          
                if(capacityfr>max1)
                    max1=capacityfr;
                if(capacitymr>max1)
                    max1=capacitymr;
                if(capacitylr>max1)
                    max1=capacitylr;
            
            }
            con.close();
             }
             
             catch(Exception e){};
            
             try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");  
            String query = "select * from shows where screenid = ? and (showdate=? and showtime=?)";
            PreparedStatement prepStmt = con.prepareStatement(query);      
            prepStmt.setString(1,screenid);
            prepStmt.setString(2,showdate);
            prepStmt.setString(3,showtime);
            ResultSet rs = prepStmt.executeQuery();
            String showid;
            if(rs.next()){
               showid=rs.getString(9);
                Booking b = new Booking(max1,showid,username,screenid);
           
                b.setVisible(true);
         
            }
          
           }
             
             catch(Exception e){}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
