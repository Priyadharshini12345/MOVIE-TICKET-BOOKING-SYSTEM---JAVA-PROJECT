
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class ViewScreen extends javax.swing.JFrame {

    /**
     * Creates new form ViewScreen
     */
    String RegNo;
    String screenID;
    String username;
    
    public ViewScreen() {
        initComponents();
        Display();
    }
    
    public ViewScreen(String reg,String user){
        RegNo=reg;
        username = user;
        initComponents();
       setTitle("VIEW SCREEN");
        Display();
    }

     private void Display(){
    
  
        try{
                    Class.forName("com.mysql.jdbc.Driver");  
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
                    String query = "select * from screen where RegistrationNumber = ?";
                    PreparedStatement prepStmt = con.prepareStatement(query);
                    prepStmt.setString(1, RegNo);
                    ResultSet rs = prepStmt.executeQuery();
                    jTable1.setFont(new Font("Times New Roman", Font.BOLD, 18));
                    DefaultTableModel table1=(DefaultTableModel)jTable1.getModel();
                    
                    while(rs.next()){
                        screenID = rs.getString(1);
                       String registrationNumber = rs.getString(2);
                       String CapacityFR = Integer.toString(rs.getInt(3));
                        String CapacityMR = Integer.toString(rs.getInt(4));
                        String CapacityLR = Integer.toString(rs.getInt(5));
                        String PriceFR = Integer.toString(rs.getInt(6));
                        String PriceMR = Integer.toString(rs.getInt(7));
                        String PriceLR = Integer.toString(rs.getInt(8));
                        String arr[] ={screenID,registrationNumber,CapacityFR,CapacityMR,CapacityLR,PriceFR,PriceMR,PriceLR};
                       
                        table1.addRow(arr);
                         
                    }
                 //  jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                    
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
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SCREEN ID", "REGISTRATION NUMBER", "FRONT ROW CAPACITY", "MIDDLE ROW CAPACITY", "LAST ROW CAPACITY", "FRONT ROW PRICE", "MIDDLE ROW PRICE", "LAST ROW PRICE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(28, 220, 1251, 120);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("ADD SHOW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(164, 391, 163, 37);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("VIEW SHOWS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(386, 391, 191, 37);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton5.setText("BACK TO HOMEPAGE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(649, 522, 291, 37);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("DELETE SCREEN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(649, 391, 231, 37);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("UPDATE SCREEN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(926, 391, 231, 37);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Pictures\\Saved Pictures\\cinema.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1080, -50, 1770, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow==-1){}
        else{
       String regNo=model.getValueAt(selectedRow, 1).toString();
       String screenID=model.getValueAt(selectedRow, 0).toString();
       
        AddShow s = new AddShow(username);
        s.setVisible(true);
        s.jTextField1.setText(screenID);
        s.jTextField2.setText(regNo);
         try{
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
            String query = "select * from screen where RegistrationNumber = ? and ScreenID = ?";
            PreparedStatement prepStmt = con.prepareStatement(query);
            prepStmt.setString(1, regNo);
            prepStmt.setString(2,screenID);
            ResultSet rs = prepStmt.executeQuery();
            if(rs.next()){
            s.jTextField6.setText(Integer.toString(rs.getInt(4)));
            s.jTextField7.setText(Integer.toString(rs.getInt(3)));
            s.jTextField8.setText(Integer.toString(rs.getInt(5)));
            }
         
        
    }
         catch(Exception e){}
         
        try{
            Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/movieticketbooking","root","");  
 
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from movie");
while(rs.next()){
    s.jComboBox1.addItem(rs.getString(1));
}
        }
        
        catch(Exception e){}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow==-1){}
        else{
       String regNo=model.getValueAt(selectedRow, 1).toString();
       String screenID=model.getValueAt(selectedRow, 0).toString();
        ViewShow f = new ViewShow(regNo,screenID,username);
        f.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
      
        TheatreHomepage h = new TheatreHomepage(username);
        h.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
       String regNo=model.getValueAt(selectedRow, 1).toString();
       String screenid=model.getValueAt(selectedRow,0).toString();
       
       Connection connection;
         try{
            Class.forName("com.mysql.jdbc.Driver");
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
  
   
    PreparedStatement st = connection.prepareStatement("DELETE FROM shows WHERE RegistrationNumber=? and screenid=?");
    
    st.setString(1,regNo);
    st.setString(2,screenid);
   
        st.executeUpdate(); 
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Deleted shows in the screen successfully");
        
    } catch(Exception e) {
        System.out.println(e);
    }
        try{
            Class.forName("com.mysql.jdbc.Driver");
  connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","");
  
   
    PreparedStatement st = connection.prepareStatement("DELETE FROM screen WHERE RegistrationNumber=? and ScreenID=?");
    
    st.setString(1,regNo);
    st.setString(2,screenid);
   
        st.executeUpdate(); 
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Deleted screen successfully");
        
    } catch(Exception e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
       String regNo=model.getValueAt(selectedRow, 1).toString();
       String screenid=model.getValueAt(selectedRow,0).toString();
       
        UpdateScreen1 t = new UpdateScreen1(screenid,regNo,username);
        t.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
