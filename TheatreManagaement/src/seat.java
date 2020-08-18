/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Jaison J
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.*;
public class seat extends javax.swing.JFrame {
      public static final String DBURL="jdbc:oracle:thin:@HPPRO547:1521:XE";
      public static final String DBUSER="system";
       public static final String DBPASS="ashwin123";
      
    public static int b; 
 public static int u;

    /**
     * Creates new form SeatBooking
     */
    public seat() {
        initComponents();
    }
     public seat(int a,int z) {
        b=a;
        u=z;
        System.out.println(b);
        initComponents();
      
       
      try{
        
        
        String[] imageList =  { 
          
         "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

        ResultSet rs = statement.executeQuery("SELECT seat_no,status FROM movie_seat where movie_id ='"+b+"' ");

         

         

        while (rs.next()) 
        {
         int s=rs.getInt(2);
         int n=rs.getInt(1);
         if(n==1&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton2.setIcon(image);
           
        }
         else if(n==1&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton2.setIcon(image);
             
           }
         
         else if(n==2&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton4.setIcon(image);
          
        }
         else if(n==2&&s==1)
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton4.setIcon(image);
            
           }
          
         else if(n==3&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton6.setIcon(image);
          
        }
         else if(n==3&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton6.setIcon(image);
            
           }
         
         else if(n==4&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton7.setIcon(image);
          
        }
         else if(n==4&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton7.setIcon(image);
             
           }
          else if(n==5&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton8.setIcon(image);
          
        }
         else if(n==5&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton8.setIcon(image);
             
           }
         
          else if(n==6&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton9.setIcon(image);
          
        }
         else if(n==6&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton9.setIcon(image);
             
           }
          else if(n==7&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton10.setIcon(image);
          
        }
         else if(n==7&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton10.setIcon(image);
             
           }
          else if(n==8&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton11.setIcon(image);
          
        }
         else if(n==8&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton11.setIcon(image);
             
           }
          else if(n==9&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton12.setIcon(image);
          
        }
         else if(n==9&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton12.setIcon(image);
             
           }
         
         else if(n==10&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton13.setIcon(image);
          
        }
         else if(n==10&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton13.setIcon(image);
             
           }
         
          else if(n==11&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton14.setIcon(image);
          
        }
         else if(n==11&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton14.setIcon(image);
             
           }
         
          else if(n==12&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton15.setIcon(image);
          
        }
         else if(n==12&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton15.setIcon(image);
             
           }
         
          else if(n==13&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton16.setIcon(image);
          
        }
         else if(n==13&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton16.setIcon(image);
             
           }
         
          else if(n==14&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton17.setIcon(image);
          
        }
         else if(n==14&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton17.setIcon(image);
             
           }
         
          else if(n==15&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton18.setIcon(image);
          
        }
         else if(n==15&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton18.setIcon(image);
             
           }
         
          else if(n==16&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton19.setIcon(image);
          
        }
         else if(n==16&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton19.setIcon(image);
             
           }
         
          else if(n==17&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton20.setIcon(image);
          
        }
         else if(n==17&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton20.setIcon(image);
             
           }
         
          else if(n==18&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton21.setIcon(image);
          
        }
         else if(n==18&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton21.setIcon(image);
             
           }
         
          else if(n==19&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton22.setIcon(image);
          
        }
         else if(n==19&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton22.setIcon(image);
             
           }
         
          else if(n==20&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton23.setIcon(image);
          
        }
         else if(n==20&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton23.setIcon(image);
             
           }
         
          else if(n==21&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton24.setIcon(image);
          
        }
         else if(n==21&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton24.setIcon(image);
             
           }
         
          else if(n==22&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton25.setIcon(image);
          
        }
         else if(n==22&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton25.setIcon(image);
             
           }
         
          else if(n==23&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton26.setIcon(image);
          
        }
         else if(n==23&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton26.setIcon(image);
             
           }
         
          else if(n==24&&s==0)
        {  ImageIcon image = new ImageIcon(imageList[1]);
           jButton27.setIcon(image);
          
        }
         else if(n==24&&s==1) 
           { ImageIcon image = new ImageIcon(imageList[0]);
             jButton27.setIcon(image);
             
           }
         
        
         
         
         
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
    }
         catch(Exception e)
                 {e.printStackTrace();
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

        canvas1 = new java.awt.Canvas();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(800, 680));
        setMinimumSize(new java.awt.Dimension(800, 680));
        setPreferredSize(new java.awt.Dimension(800, 680));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Screen This Way");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 6, 107, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 140, 800, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/3eed8b8c.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 140);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 340, 810, 10);

        jLabel1.setText("PLatinum");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 360, 43, 14);

        jLabel3.setText("Economy");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 180, 43, 14);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(670, 450, 60, 70);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(570, 450, 60, 70);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(460, 450, 60, 70);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(340, 450, 60, 70);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(240, 450, 60, 70);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(140, 450, 60, 70);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(670, 360, 60, 70);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(570, 360, 60, 70);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(450, 360, 60, 70);

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        getContentPane().add(jButton13);
        jButton13.setBounds(350, 360, 60, 70);

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        getContentPane().add(jButton14);
        jButton14.setBounds(250, 360, 60, 70);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(130, 360, 60, 70);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton16MouseClicked(evt);
            }
        });
        getContentPane().add(jButton16);
        jButton16.setBounds(670, 260, 60, 70);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton17MouseClicked(evt);
            }
        });
        getContentPane().add(jButton17);
        jButton17.setBounds(570, 270, 60, 70);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton18MouseClicked(evt);
            }
        });
        getContentPane().add(jButton18);
        jButton18.setBounds(460, 270, 60, 70);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        getContentPane().add(jButton19);
        jButton19.setBounds(350, 270, 60, 70);

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(240, 270, 60, 70);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(140, 270, 60, 70);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(660, 180, 60, 70);

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        getContentPane().add(jButton23);
        jButton23.setBounds(570, 180, 60, 70);

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton24MouseClicked(evt);
            }
        });
        getContentPane().add(jButton24);
        jButton24.setBounds(450, 180, 60, 70);

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton25MouseClicked(evt);
            }
        });
        getContentPane().add(jButton25);
        jButton25.setBounds(350, 180, 60, 70);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton26MouseClicked(evt);
            }
        });
        getContentPane().add(jButton26);
        jButton26.setBounds(240, 180, 60, 70);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/images1 (2).jpg"))); // NOI18N
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton27MouseClicked(evt);
            }
        });
        getContentPane().add(jButton27);
        jButton27.setBounds(130, 180, 60, 70);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setText("Confirm Seats");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(290, 590, 190, 30);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/theatremanagement/depositphotos_13129173-stock-photo-grey-carpet-closeup.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 170, 800, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
          try{
        
        
      String[] imageList =  { 
          
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=1 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton2.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=1 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton2.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=1 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
          try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=2 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton4.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=2 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton4.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=2 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
          try{
        
        
      String[] imageList =  { 
 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=3 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton6.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=3 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton6.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=3 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=4 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton7.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=4 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton7.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=4 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=5 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton8.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=5 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton8.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=5 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=6 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton9.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=6 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton9.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=6 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=7 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton10.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=7 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton10.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=7 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=8 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton11.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=8 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton11.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=8 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=9 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton12.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=9 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton12.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=9 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=10 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton13.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=10 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton13.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=10 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=11 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton14.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=11 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton14.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=11 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=12 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton15.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=12 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton15.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=12 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=13 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton16.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=13 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton16.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=13 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton16MouseClicked

    private void jButton17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=14 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton17.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=14 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton17.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=14 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton17MouseClicked

    private void jButton18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=15 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton18.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=15 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton18.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=15 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton18MouseClicked

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=16 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton19.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=16 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton19.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=16 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=17 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton20.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=17 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton20.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=17 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=18 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton21.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=18 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton21.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=18 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=19 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton22.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=19 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton22.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=19 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=20 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton23.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=20 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton23.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=20 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton23MouseClicked

    private void jButton24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=21 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton24.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=21 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton24.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=21 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton24MouseClicked

    private void jButton25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=22 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton25.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=22 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton25.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=22 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton25MouseClicked

    private void jButton26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=23 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton26.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=23 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton26.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=23 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton26MouseClicked

    private void jButton27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseClicked
        // TODO add your handling code here:
        try{
        
        
      String[] imageList =  { 
          
          "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2).jpg", "C:\\Users\\Mahe\\Desktop\\theatre\\TheatreManagement\\src\\theatremanagement\\images1 (2)select.jpg"};
      
         Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

 

        Statement statement = con.createStatement();

 

        // Execute a SELECT query on Oracle Dummy DUAL Table. Useful for retrieving system values

        // Enables us to retrieve values as if querying from a table

       ResultSet rs = statement.executeQuery("SELECT status,user_id FROM movie_seat where seat_no=24 and movie_id ='"+b+"' ");

         

         

        if (rs.next()) {
            if(rs.getInt(2)==u ||rs.getInt(2)==0 )
         
            {

       
           int s=rs.getInt(1);
           // get first column returned
           System.out.print(s);
            
           if(s==1)
           {   ImageIcon image = new ImageIcon(imageList[1]);
           jButton27.setIcon(image);
          
               statement.execute("update movie_seat set status=0,user_id='"+u+"'where seat_no=24 and movie_id='"+b+"' ");
           
           }
           else 
           {       ImageIcon image = new ImageIcon(imageList[0]);
           jButton27.setIcon(image);
               statement.execute("update movie_seat set status=1,user_id=0 where seat_no=24 and movie_id='"+b+"' ");
               
          
           }
            }
            else
            { 
            }
            

        }

        rs.close();

        statement.close();

        con.close();

 
           
           
           
         
        }
        catch(Exception e)
        { System.out.println(e);
            e.printStackTrace();
        
            
        }
    }//GEN-LAST:event_jButton27MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        Refershments r = new Refershments(u);
        r.show();
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
