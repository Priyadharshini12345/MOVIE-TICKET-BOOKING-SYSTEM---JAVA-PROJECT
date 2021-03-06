
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class UpdateM extends javax.swing.JFrame {

    /**
     * Creates new form UpdateM
     */
    String name;
    
    public UpdateM(){
        initComponents();
        
    }
    public UpdateM(String nm){
        name=nm;
        initComponents();
        setTitle("UPDATE MOVIE");
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/movieticketbooking","root","");   
            String query = "select * from movie where name = ?";
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1, name);
           
            ResultSet rs = prepStmt.executeQuery();

            if(rs.next())  {
                jTextField1.setText(rs.getString(1));  
                jTextField2.setText(rs.getString(2)); 
                jTextField3.setText(rs.getString(3)); 
                jTextField4.setText(rs.getString(4)); 
                jTextField5.setText(rs.getString(5)); 
                jTextField6.setText(rs.getString(6)); 
                jTextField7.setText(rs.getString(7)); 
                jTextField8.setText(rs.getString(8)); 
        }


con.close();  
}catch(Exception e){ } 
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 280, 54, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("RELEASE DATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 353, 134, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CAST");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 425, 47, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("DIRECTOR");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 474, 95, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("PRODUCTIONS");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(110, 525, 132, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("LANGUAGE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(110, 589, 103, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("DESCRIPTION");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(110, 662, 123, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("TRAILER");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(110, 806, 80, 22);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(355, 277, 436, 28);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(355, 350, 436, 28);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(355, 422, 436, 28);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(355, 468, 436, 28);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(355, 522, 436, 28);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(355, 595, 436, 28);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField7);
        jTextField7.setBounds(355, 662, 436, 104);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(355, 802, 436, 31);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(326, 881, 129, 37);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\movie.jpg")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(860, 80, 1360, 750);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("BACK TO HOMEPAGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(550, 930, 340, 37);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: 
        
        try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
 

    
        PreparedStatement stmt = con.prepareStatement("update movie set date=?, cast =?, director =?, producer=?, language=?, description=?, teaser=? where name=?"); 
      stmt.setString(8, name);
       stmt.setString(1,jTextField2.getText());
       stmt.setString(2,jTextField3.getText());
       stmt.setString(3,jTextField4.getText());
       stmt.setString(4,jTextField5.getText());
       stmt.setString(5,jTextField6.getText());
       stmt.setString(6,jTextField7.getText());
       stmt.setString(7,jTextField8.getText());
      stmt.executeUpdate();
      
      JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Updated movie successfully");
        }
        catch(Exception e){ JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Updation failed"); }
                                              
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Adminpage a = new Adminpage();
        a.setVisible(true);
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
            java.util.logging.Logger.getLogger(UpdateM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateM().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private final javax.swing.JTextField jTextField1 = new javax.swing.JTextField();
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
