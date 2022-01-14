
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class ViewBookingHistory extends javax.swing.JFrame {

    /**
     * Creates new form ViewBookingHistory
     */
    String username;
    public ViewBookingHistory() {
        initComponents();
    }
    
    public ViewBookingHistory(String user){
        username=user;
        initComponents();
        setTitle("VIEW BOOKING HISTORY");
        Display();
    }
    
    private void Display(){
        try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                   String query = "select * from booking where username = ?";
                    PreparedStatement prepStmt = con.prepareStatement(query);                   
                    prepStmt.setString(1,username); 
                    ResultSet rs = prepStmt.executeQuery();
                    
                  
                    DefaultTableModel table1=(DefaultTableModel)jTable1.getModel();
                      
                    while(rs.next()){
                       
                        String bookingid = rs.getString(2);
                        String showid = rs.getString(3);
                        String noofseats = Integer.toString(rs.getInt(4));
                        String screenid="",movie="",showdate="",showtime="";
                        String regno="",theatre="";
                        String seat="";
                        
                        try{
                             Class.forName("com.mysql.jdbc.Driver");  
                            Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                            String query1 = "select * from shows where showid = ?";
                            PreparedStatement prepStmt1 = con1.prepareStatement(query1);                   
                            prepStmt1.setString(1,showid); 
                            ResultSet rs1 = prepStmt1.executeQuery();
                            
                            if(rs1.next()){
                                screenid=rs1.getString(1);
                                showdate=rs1.getString(4);
                                showtime=rs1.getString(5);
                                movie=rs1.getString(3);
                                regno=rs1.getString(2);
                            }
                    
                        }
                        
                        catch(Exception e){}
                        
                        try{
                            Class.forName("com.mysql.jdbc.Driver");  
                            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                            String query2 = "select * from theatre where registrationno = ?";
                            PreparedStatement prepStmt2 = con2.prepareStatement(query2);                   
                            prepStmt2.setString(1,regno); 
                            ResultSet rs2 = prepStmt2.executeQuery();
                            
                            if(rs2.next()) theatre=rs2.getString(1);
                            
                        }
                        
                        catch(Exception e){}
                        
                        try{
                            Class.forName("com.mysql.jdbc.Driver");  
                            Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                            String query2 = "select * from seats where BookingID = ?";
                            PreparedStatement prepStmt2 = con2.prepareStatement(query2);                   
                            prepStmt2.setString(1,bookingid); 
                            ResultSet rs2 = prepStmt2.executeQuery();
                            
                            while(rs2.next()) seat+=rs2.getString(1)+" ";
                        }
                        
                        catch(Exception e){}
                        
                        String arr[] ={movie,showdate,showtime,screenid,theatre,noofseats,seat};
                      //jtable1.setModel(DbUtils.resultSetToTableModel(rs));
                        table1.addRow(arr);
                     
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Movie", "Show Date", "Show Time", "Screen ID", "Theatre", "Number of seats", "Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(140, 320, 1120, 137);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("BACK TO HOMEPAGE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 520, 291, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\IMG.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, -160, 1330, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserHomepage u = new UserHomepage(username);
        u.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewBookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewBookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewBookingHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewBookingHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
