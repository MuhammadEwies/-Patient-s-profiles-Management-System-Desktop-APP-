/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insert;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mohamed
 */
public class login extends javax.swing.JFrame  implements ActionListener{
 private ImageIcon  img = new ImageIcon(getClass().getResource("Capture.PNG"));
 private JLabel jLabel9 = new JLabel();
    /**
     * Creates new form login
     */
    public login() {
        this.setSize(995, 664);
        
        this.setResizable(false);
        initComponents();
        this.setVisible(true);
        jLabel9.setIcon(img);
        jLabel9.setSize(995, 664);
        
        login.addActionListener(this);
        cancel.addActionListener(this);
        help.addActionListener(this);
        ///////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////
        
       
        jPanel1.add(this.jLabel9);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        help = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(995, 664));
        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(760, 250, 190, 30);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(760, 290, 190, 27);

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(630, 250, 125, 27);

        login.setBackground(new java.awt.Color(24, 0, 84));
        login.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setBorder(null);
        login.setFocusPainted(false);
        jPanel1.add(login);
        login.setBounds(630, 330, 320, 40);

        jLabel2.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(630, 290, 140, 30);

        cancel.setBackground(new java.awt.Color(24, 0, 84));
        cancel.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");
        cancel.setBorder(null);
        cancel.setFocusPainted(false);
        jPanel1.add(cancel);
        cancel.setBounds(790, 380, 160, 40);

        help.setBackground(new java.awt.Color(24, 0, 84));
        help.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        help.setForeground(new java.awt.Color(255, 255, 255));
        help.setText("Help ");
        help.setBorder(null);
        help.setFocusPainted(false);
        jPanel1.add(help);
        help.setBounds(630, 380, 150, 40);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("All rights reserved © by Mohammed Ewies Ewies ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 620, 430, 40);

        jLabel5.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Phone Number : +201126330970");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(750, 610, 230, 20);

        jLabel6.setFont(new java.awt.Font("Lucida Handwriting", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Mail : mohaosa666@gmail.com");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(750, 630, 220, 20);

        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("we are strive to help  doctors and patients , by saving their time");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 440, 520, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("and give the user the flexibility to deal with patient's data ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 460, 510, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("by storing the data organized in our software  ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 490, 380, 20);

        jLabel10.setFont(new java.awt.Font("Lucida Handwriting", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("We doing our best to develop this software efficiency");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 510, 450, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("by mohamed Ewies");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(90, 60, 280, 70);

        jLabel12.setFont(new java.awt.Font("Lucida Handwriting", 2, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Recovery");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 10, 210, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JButton help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables

 private  final String  username = "Ayman El-Koly";
private final  String   password = "passion";
JOptionPane suc = new JOptionPane();
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
     if(e.getSource()==login)
     {
        String user = jTextField1.getText();
        String pass = jPasswordField1.getText();
        pass.trim();
        user.trim();
       if(!user.equals(username) && !pass.equals(password))
       {   
          this.setVisible(false );
          choose frame = new choose();
       }
       else 
       {
           suc.showMessageDialog(null,"wrong user or pass ");
           jTextField1.setText(null);
           jPasswordField1.setText(null);
       }
     }
     else if(e.getSource()==cancel)
     {
        System.exit(0);
     }
       else if(e.getSource()==help)
     {
         suc.showMessageDialog(null, "call me in my number or send an email and "
                 + "wait my secrtary\n Ewies");
     }
    }

}
