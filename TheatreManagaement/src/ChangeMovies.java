

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaison J
 */
public class ChangeMovies extends javax.swing.JFrame {
       public static final String DBURL="jdbc:oracle:thin:@HPPRO547:1521:XE";
      public static final String DBUSER="system";
       public static final String DBPASS="ashwin123";
    public static final String imageList[] =new String[4];

    /**
     * Creates new form ChangeMovies
     */
    public ChangeMovies() {
        initComponents();
try{
   Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();
         ResultSet rs = statement.executeQuery("select image from movie order by movie_id");


 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

        if(rs.next()){
          imageList[0]=rs.getString(1);
        ImageIcon image1 = new ImageIcon(imageList[0]);
         jLabel8.setIcon(image1);
        }
         if(rs.next()){
          imageList[1]=rs.getString(1);
        ImageIcon image2 = new ImageIcon(imageList[1]);
        jLabel11.setIcon(image2);
        }
         if(rs.next()){
          imageList[2]=rs.getString(1);
        ImageIcon image3 = new ImageIcon(imageList[2]);
         jLabel9.setIcon(image3);
        }
         if(rs.next()){
          imageList[3]=rs.getString(1);
        ImageIcon image4 = new ImageIcon(imageList[3]);
        jLabel10.setIcon(image4);
        }
        
         }
       catch(Exception e)
       {
           e.printStackTrace();
       }
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 680));
        setMinimumSize(new java.awt.Dimension(800, 680));
        setPreferredSize(new java.awt.Dimension(800, 680));
        getContentPane().setLayout(null);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel15.setText("Screen 3");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(460, 180, 90, 25);

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel19.setText("Screen 1");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(70, 170, 80, 40);

        jLabel12.setText("Movie_id");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(110, 530, 110, 30);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(30, 180, 30, 21);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(240, 180, 30, 21);

        buttonGroup1.add(jRadioButton3);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(420, 180, 30, 21);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Change Movie");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 580, 150, 23);

        buttonGroup1.add(jRadioButton4);
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(620, 180, 30, 21);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 530, 260, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(410, 210, 190, 300);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(610, 210, 190, 300);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 210, 190, 300);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 210, 190, 300);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("BACK<<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 120, 140, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/3eed8b8c.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 170);

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel5.setText("Screen 4");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(660, 180, 170, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel3.setText("Screen 2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 180, 120, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/geometric-white-hexagonal-vector-seamless-pattern-tile-45608163.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 170, 800, 460);

        jLabel14.setText("jLabel1");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 450, 34, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
        Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();
        Statement statement1 = con.createStatement();
        Statement statement2 = con.createStatement();
        
        if(jRadioButton1.isSelected())
        {
            int a=Integer.parseInt(jTextField6.getText());
            ResultSet rs = statement.executeQuery("select image,name from extra_movie where movie_id=+'"+a+"' ");
            rs.next();
            statement2.executeUpdate("update movie set image='"+rs.getString(1)+"',name='"+rs.getString(2)+"' where movie_id=100" );
            ResultSet r= statement1.executeQuery("select image from movie where movie_id=100");
            r.next();
            ImageIcon image5 = new ImageIcon(rs.getString(1));
              jLabel8.setIcon(image5);
            
             

                 }
            
            
            
            
        
        if(jRadioButton2.isSelected())
        {
            int a=Integer.parseInt(jTextField6.getText());
            ResultSet rs = statement.executeQuery("select image,name  from extra_movie where movie_id=+'"+a+"' ");
            rs.next();
            statement1.executeUpdate("update movie set image=+'"+rs.getString(1)+"' ,name='"+rs.getString(2)+"' where movie_id=100");
            ResultSet r= statement1.executeQuery("select image from movie where movie_id=101");
            r.next();
            ImageIcon image5 = new ImageIcon(rs.getString(1));
              jLabel11.setIcon(image5);
            
            
        }
        if(jRadioButton3.isSelected())
        {
             int a=Integer.parseInt(jTextField6.getText());
            ResultSet rs = statement.executeQuery("select image,name from extra_movie where movie_id=+'"+a+"' ");
            rs.next();
            statement1.executeUpdate("update movie set image=+'"+rs.getString(1)+"' ,name='"+rs.getString(2)+"' where movie_id=100");
            ResultSet r= statement1.executeQuery("select image from movie where movie_id=102");
            r.next();
            ImageIcon image5 = new ImageIcon(rs.getString(1));
              jLabel9.setIcon(image5);
            
        }
        if(jRadioButton4.isSelected())
        {
              int a=Integer.parseInt(jTextField6.getText());
            ResultSet rs = statement.executeQuery("select image,name from extra_movie where movie_id=+'"+a+"' ");
            rs.next();
            statement1.executeUpdate("update movie set image=+'"+rs.getString(1)+"' ,name='"+rs.getString(2)+"' where movie_id=100");
            ResultSet r= statement1.executeQuery("select image from movie where movie_id=103");
            r.next();
            ImageIcon image5 = new ImageIcon(rs.getString(1));
              jLabel10.setIcon(image5);
            
            
            
        }
        
        
        
        }
        catch(Exception e)
        {e.printStackTrace();
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        AdminScreen a =new AdminScreen();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(ChangeMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeMovies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeMovies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}