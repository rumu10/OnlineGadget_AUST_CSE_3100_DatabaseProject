/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinegadget;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author sudiptarumu
 */
public class AdminTask extends javax.swing.JFrame {
    
    
  OnlineDatabaseImplement ob = new OnlineDatabaseImplement();
   Connection connect = null;
    Statement statement = null;
    PreparedStatement pStatement = null;
    String s;
 
    /**
     * Creates new form AdminTask
     */
    public AdminTask() {
        initComponents();
        
         mypanel.setVisible(false);
         
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mypanel = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        brand = new javax.swing.JLabel();
        camera = new javax.swing.JLabel();
        ram = new javax.swing.JLabel();
        os = new javax.swing.JLabel();
        processor = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pprice = new javax.swing.JTextField();
        pbrand = new javax.swing.JTextField();
        pcamera = new javax.swing.JTextField();
        pram = new javax.swing.JTextField();
        pos = new javax.swing.JTextField();
        pprocessor = new javax.swing.JTextField();
        pdisplay = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        show = new javax.swing.JButton();
        insert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Task");
        setBackground(new java.awt.Color(51, 204, 255));

        mypanel.setLayout(null);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 102, 0));
        name.setText("Name:");
        mypanel.add(name);
        name.setBounds(450, 30, 70, 40);

        price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(0, 102, 0));
        price.setText("Price:\n");
        mypanel.add(price);
        price.setBounds(460, 110, 60, 30);

        brand.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        brand.setForeground(new java.awt.Color(0, 102, 0));
        brand.setText("Brand:");
        mypanel.add(brand);
        brand.setBounds(460, 180, 70, 30);

        camera.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        camera.setForeground(new java.awt.Color(0, 102, 0));
        camera.setText("Camera:");
        mypanel.add(camera);
        camera.setBounds(450, 250, 70, 30);

        ram.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ram.setForeground(new java.awt.Color(0, 102, 0));
        ram.setText("Ram:");
        mypanel.add(ram);
        ram.setBounds(470, 320, 60, 30);

        os.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        os.setForeground(new java.awt.Color(0, 102, 0));
        os.setText("OS:");
        mypanel.add(os);
        os.setBounds(470, 390, 50, 30);

        processor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processor.setForeground(new java.awt.Color(0, 102, 0));
        processor.setText("Processor:");
        mypanel.add(processor);
        processor.setBounds(420, 450, 90, 30);

        display.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        display.setForeground(new java.awt.Color(0, 102, 0));
        display.setText("Display:");
        mypanel.add(display);
        display.setBounds(450, 510, 80, 40);
        mypanel.add(pname);
        pname.setBounds(540, 30, 140, 40);
        mypanel.add(pprice);
        pprice.setBounds(540, 100, 140, 40);
        mypanel.add(pbrand);
        pbrand.setBounds(540, 170, 140, 40);

        pcamera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcameraActionPerformed(evt);
            }
        });
        mypanel.add(pcamera);
        pcamera.setBounds(540, 240, 140, 40);

        pram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pramActionPerformed(evt);
            }
        });
        mypanel.add(pram);
        pram.setBounds(540, 310, 140, 40);
        mypanel.add(pos);
        pos.setBounds(540, 380, 140, 40);
        mypanel.add(pprocessor);
        pprocessor.setBounds(540, 440, 140, 40);
        mypanel.add(pdisplay);
        pdisplay.setBounds(540, 510, 140, 40);

        ok.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ok.setForeground(new java.awt.Color(0, 102, 0));
        ok.setText("ok");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        mypanel.add(ok);
        ok.setBounds(560, 590, 100, 40);
        mypanel.add(image);
        image.setBounds(120, 140, 245, 471);

        browse.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        browse.setForeground(new java.awt.Color(0, 102, 0));
        browse.setText("Browse Image");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        mypanel.add(browse);
        browse.setBounds(110, 30, 190, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinegadget/admin_task.jpg"))); // NOI18N
        mypanel.add(jLabel2);
        jLabel2.setBounds(-130, 0, 860, 700);

        jLabel3.setText("jLabel3");
        mypanel.add(jLabel3);
        jLabel3.setBounds(60, 50, 34, 14);

        jLabel4.setText("jLabel4");
        mypanel.add(jLabel4);
        jLabel4.setBounds(50, 50, 34, 14);

        jButton2.setText("jButton2");
        mypanel.add(jButton2);
        jButton2.setBounds(50, 30, 73, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinegadget/admin_task.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        show.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        show.setForeground(new java.awt.Color(0, 102, 0));
        show.setText("Show Data");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        insert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 102, 0));
        insert.setText("Insert Product");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 51));
        jButton1.setText("Sign Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insert)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(show)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(show)
                .addGap(54, 54, 54)
                .addComponent(insert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mypanel, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mypanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
       
        mypanel.setVisible(true);
        
        
    }//GEN-LAST:event_insertActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
               String name ,price,brand,camera,ram,os,processor,display;
               connect=ConnectionConfiguration.setConnection();
      try {
          pStatement = connect.prepareStatement("INSERT INTO product (product_name,image,brand,price,camera,ram,os,processor,display)"
                    + "VALUES (?,?,?, ?,?,?,?,?,?)");
        
        
        
         InputStream is = new FileInputStream(new File(s));
         
         name=pname.getText();
         pStatement.setBlob(2,is);
          brand=pbrand.getText();
        price=pprice.getText();
       
        camera=pcamera.getText();
         ram=pram.getText();
          os=pos.getText();
          processor=pprocessor.getText();
          display=pdisplay.getText();
          
            pStatement.setString(1, name);
              pStatement.setBlob(2,is);
             pStatement.setString(3, brand);
             pStatement.setString(4, price);
             pStatement.setString(5, camera);
             pStatement.setString(6, ram);
             pStatement.setString(7, os);
             pStatement.setString(8, processor);
             pStatement.setString(9, display);
             
            
              pStatement.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Inserted");
         
          
             }catch(Exception e){
            System.out.println("Error in Query..");
         e.printStackTrace();

            
        }        // TODO add your handling code here:
        
        
         if(pname.getText().isEmpty()||pprice.getText().isEmpty()||pbrand.getText().isEmpty()||
            pcamera.getText().isEmpty()||pram.getText().isEmpty() ||pos.getText().isEmpty()||pprocessor.getText().isEmpty()||pdisplay.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "One or more fields are empty ");
        }
         else {
             
            
             this.dispose();
             new AdminTask().setVisible(true);
         }// TODO add your handling code here:
    }//GEN-LAST:event_okActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
               new NewJFrame().setVisible(true);   
               this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_showActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
                  JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
             s=path;
           
            image.setIcon(resizeImage(path));
     
           
         
           
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
           
        }        // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_browseActionPerformed

    private void pcameraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcameraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcameraActionPerformed

    private void pramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pramActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new LogIn().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
 public ImageIcon resizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }
     
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
            java.util.logging.Logger.getLogger(AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel brand;
    private javax.swing.JButton browse;
    private javax.swing.JLabel camera;
    private javax.swing.JLabel display;
    private javax.swing.JLabel image;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel mypanel;
    private javax.swing.JLabel name;
    private javax.swing.JButton ok;
    private javax.swing.JLabel os;
    private javax.swing.JTextField pbrand;
    private javax.swing.JTextField pcamera;
    private javax.swing.JTextField pdisplay;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pos;
    private javax.swing.JTextField pprice;
    private javax.swing.JTextField pprocessor;
    private javax.swing.JTextField pram;
    private javax.swing.JLabel price;
    private javax.swing.JLabel processor;
    private javax.swing.JLabel ram;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
