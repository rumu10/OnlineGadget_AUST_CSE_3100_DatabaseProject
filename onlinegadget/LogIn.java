/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinegadget;

import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class LogIn extends javax.swing.JFrame {
 OnlineDatabaseImplement ob = new OnlineDatabaseImplement();
  int id;
    
    public LogIn() {
        initComponents();
         groupButton();
         mypanel2.setVisible(false);
    }
 public void groupButton() {
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(admin);
        buttongroup.add(user);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mypanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        uName_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logInBttn = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JRadioButton();
        admin = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        pass_tf = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        mypanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user2_tf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pass2_tf = new javax.swing.JPasswordField();
        new_pass_tf = new javax.swing.JPasswordField();
        conPass_tf = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setPreferredSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        mypanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("UserName:");
        mypanel1.add(jLabel2);
        jLabel2.setBounds(100, 320, 120, 40);
        mypanel1.add(uName_tf);
        uName_tf.setBounds(220, 320, 170, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Password:");
        mypanel1.add(jLabel3);
        jLabel3.setBounds(110, 400, 110, 40);

        logInBttn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logInBttn.setForeground(new java.awt.Color(0, 0, 102));
        logInBttn.setText("Log In");
        logInBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBttnActionPerformed(evt);
            }
        });
        mypanel1.add(logInBttn);
        logInBttn.setBounds(250, 470, 100, 30);

        signUpButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 0, 102));
        signUpButton.setText("Sign UP");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        mypanel1.add(signUpButton);
        signUpButton.setBounds(240, 640, 120, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Are You New?? Then ...");
        mypanel1.add(jLabel4);
        jLabel4.setBounds(200, 580, 220, 40);

        user.setBackground(new java.awt.Color(0, 0, 102));
        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(240, 240, 240));
        user.setText("user");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        mypanel1.add(user);
        user.setBounds(447, 10, 70, 30);

        admin.setBackground(new java.awt.Color(0, 0, 102));
        admin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        admin.setForeground(new java.awt.Color(240, 240, 240));
        admin.setText("Admin");
        admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminMouseClicked(evt);
            }
        });
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });
        mypanel1.add(admin);
        admin.setBounds(330, 10, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Change Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        mypanel1.add(jButton2);
        jButton2.setBounds(210, 520, 180, 40);
        mypanel1.add(pass_tf);
        pass_tf.setBounds(220, 400, 170, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinegadget/icon.png"))); // NOI18N
        mypanel1.add(jLabel9);
        jLabel9.setBounds(130, 50, 294, 256);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinegadget/jfrmbg.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        mypanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 900, 700);

        getContentPane().add(mypanel1);
        mypanel1.setBounds(0, 0, 540, 700);

        mypanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Old Password:");
        mypanel2.add(jLabel5);
        jLabel5.setBounds(120, 170, 130, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("New Password:");
        mypanel2.add(jLabel6);
        jLabel6.setBounds(120, 270, 130, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("User:");
        mypanel2.add(jLabel7);
        jLabel7.setBounds(150, 50, 60, 40);

        user2_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user2_tfActionPerformed(evt);
            }
        });
        mypanel2.add(user2_tf);
        user2_tf.setBounds(100, 110, 170, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        mypanel2.add(jButton1);
        jButton1.setBounds(140, 540, 100, 40);
        mypanel2.add(pass2_tf);
        pass2_tf.setBounds(100, 210, 170, 40);
        mypanel2.add(new_pass_tf);
        new_pass_tf.setBounds(110, 310, 170, 40);
        mypanel2.add(conPass_tf);
        conPass_tf.setBounds(100, 450, 180, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Confirm New Password");
        mypanel2.add(jLabel8);
        jLabel8.setBounds(90, 390, 210, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinegadget/jfrmbg.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        mypanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 380, 700);

        getContentPane().add(mypanel2);
        mypanel2.setBounds(540, 0, 360, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInBttnActionPerformed(java.awt.event.ActionEvent evt) {                                          
      String uname,password;
      uname=uName_tf.getText();
      password=pass_tf.getText();
      
      
     if (user.isSelected()) {
           
           try {
      if(uname.isEmpty() || password.isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Some field are lying empty ");
          
      }
      else if(ob.login(uname, password))
      {
          
          
            ResultSet res=ob.getCustomerId(uname);
            res.next();
            id=res.getInt(1);
            JOptionPane.showMessageDialog(null, "Logged in ");
          new Categories(id).setVisible(true);
           
      }
      else
      {
         JOptionPane.showMessageDialog(null, "incorrect ");
         this.dispose();
          new LogIn().setVisible(true);
      }
    }                                                                                  
      catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
       
     else if (admin.isSelected()) {
           
           try {
      if(uname.isEmpty() || password.isEmpty())
      {
          JOptionPane.showMessageDialog(null, "Some field are lying empty ");
          
      }
      else if(ob.adminlogin(uname, password))
      {
          
          JOptionPane.showMessageDialog(null, "Logged in ");
          new AdminTask().setVisible(true);
           
      }
      else
      {
         JOptionPane.showMessageDialog(null, "incorrect ");
         this.dispose();
          new LogIn().setVisible(true);
      }
    }                                         
      catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
          else
             JOptionPane.showMessageDialog(null, "PLEASE select if you are an admin or user"); 
              this.dispose();
    }
    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
         new SignUp().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void user2_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user2_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user2_tfActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username=user2_tf.getText();
        String pass=pass2_tf.getText();
        String newPass=new_pass_tf.getText();
       String conPass=conPass_tf.getText();
        
        
    if (user.isSelected()) {
           
        try {
        if(username.isEmpty() || pass.isEmpty() || newPass.isEmpty()|| conPass.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Some field are lying empty ");
          
        }
        else if(!new_pass_tf.getText().equals(conPass_tf.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Same Password ");
            new_pass_tf.setText(null);
            conPass_tf.setText(null);
        }
        else if(ob.login(username, pass))
        {
         
          
          ob.userChangePassword(username, pass, newPass);
          JOptionPane.showMessageDialog(null, " Password Changed Sucessfully");
           // ResultSet res=ob.getCustomerId(uname);
          new LogIn().setVisible(true);
          
          
        }
        else
        {
          JOptionPane.showMessageDialog(null, "User or Password incorrect ");
           user2_tf.setText(null);
            pass2_tf.setText(null);
           new_pass_tf.setText(null);
            conPass_tf.setText(null);
          
        
        }
     }                                                                                  
      catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
    else if (admin.isSelected()) {
           
        try {
        if(username.isEmpty() || pass.isEmpty() || newPass.isEmpty()|| conPass.isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Some field are lying empty ");
          new LogIn().setVisible(true);
          
        }
        
        else if(!new_pass_tf.getText().equals(conPass_tf.getText()))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Same Password ");
            new_pass_tf.setText(null);
            conPass_tf.setText(null);
        }
        else if(ob.adminlogin(username, pass))
        {
         
          
          ob.adminChangePassword(username, pass, newPass);
          JOptionPane.showMessageDialog(null, "admin Password Changed Sucessfully");
           // ResultSet res=ob.getCustomerId(uname);
          new LogIn().setVisible(true);
          
          
        }
        else
        {
         JOptionPane.showMessageDialog(null, "Old Password incorrect ");
          user2_tf.setText(null);
          pass2_tf.setText(null);
           new_pass_tf.setText(null);
            conPass_tf.setText(null);
        }
     
     }                                                                                  
      catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

    }
    else
    {
             JOptionPane.showMessageDialog(null, "PLEASE select if you are an admin or user"); 
             new LogIn().setVisible(true);
              this.dispose();
    }         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        mypanel2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_adminMouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try{
                    
                    Thread.sleep(5000);
                }
                
                catch(Exception e){
                    
                }
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JPasswordField conPass_tf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logInBttn;
    private javax.swing.JPanel mypanel1;
    private javax.swing.JPanel mypanel2;
    private javax.swing.JPasswordField new_pass_tf;
    private javax.swing.JPasswordField pass2_tf;
    private javax.swing.JPasswordField pass_tf;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField uName_tf;
    private javax.swing.JRadioButton user;
    private javax.swing.JTextField user2_tf;
    // End of variables declaration//GEN-END:variables

   
}
