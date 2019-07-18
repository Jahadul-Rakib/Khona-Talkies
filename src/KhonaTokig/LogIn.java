package KhonaTokig;
import JavaClasses.DBconnection;
import JavaClasses.Email;
import JavaClasses.session;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LogIn extends javax.swing.JFrame {

    DBconnection d = new DBconnection();
    session ssn = new session();
    public LogIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KHONA TALKIES");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("K H O N A  T A L K I E S");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 51, 255)));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Email:");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Password:");

        txtemail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnlogin.setBackground(new java.awt.Color(92, 92, 212));
        btnlogin.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        btnlogin.setText("Log In");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jButton1.setText("Forgot Your Password ? Click Here...");
        jButton1.setBorder(null);
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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogin)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtemail)
                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        
        String userEmail = txtemail.getText();
        String userPassword = txtpassword.getText(); 
        
        try {

            if(userEmail.equals("")){
                JOptionPane.showMessageDialog(null, "Email Field is Blank. Sign In With Your Email and Paasword.");
            }
            else if(userPassword.equals("")){
                JOptionPane.showMessageDialog(null, "Password Field is Blank. Sign In With Your Email and Paasword.");
            }
            else{
                String sqlEmailCheck = "select * from user where user.email = '"+userEmail+"'";
                ResultSet emailAndPassword = d.statement.executeQuery(sqlEmailCheck); 
                boolean value = emailAndPassword.next();
                if(value==false){
                    JOptionPane.showMessageDialog(null, "Your Email and Password is Incorrect.");
                }
                else{
                    while (value) {
                        String Admin = "Admin";
                        String uEmail = emailAndPassword.getString("Email");
                        String uPass = emailAndPassword.getString("Password");
                        String uType = emailAndPassword.getString("type");
                        if(uEmail.equalsIgnoreCase(userEmail)){
                            if(uPass.equals(userPassword)){
                                if (uType.equals(Admin)) {
                                        AdminPane t = new AdminPane();
                                        t.setVisible(true);
                                        ssn.setUserEmail(uEmail);
                                        ssn.setUserPass(uPass);
                                        LogIn.this.setVisible(false);
                                        break;
                                        }
                                else { 
                                    
                                    User us = new User();
                                    us.setVisible(true);
                                        ssn.setUserEmail(uEmail);
                                        ssn.setUserPass(uPass);
                                        this.setVisible(false);
                                        break;
                                        
                                }  
                            }
                        else{
                                JOptionPane.showMessageDialog(null, "Your Email and Password is Incorrect.");
                            } 
                        }
                        
                    }                         
                }
            }
    }//GEN-LAST:event_btnloginActionPerformed

    catch (SQLException ex) {           
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);           
     } }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String email = JOptionPane.showInputDialog(null,"Please Input Email Addres");
        ssn.setEmail(email);
        
        
        try {
            if(email.equals("")){
                JOptionPane.showMessageDialog(null,"Fill the blank Email Address","Error",JOptionPane.OK_OPTION);
            }
            
            else{               
                String sqlEmailCheck = "select * from user where user.email = '"+email+"'";
                ResultSet emailAndPassword = d.statement.executeQuery(sqlEmailCheck); 
                boolean value = emailAndPassword.next();
                if(value==false){
                    JOptionPane.showMessageDialog(null, "Your Email is Incorrect.");
                }
                else{
                while (value) {
                        String uEmail = emailAndPassword.getString("email");
                        ssn.setUEmail(uEmail);
                        String uPass = emailAndPassword.getString("password"); 
                        ssn.setPass(uPass);
                        
                String subject = "Your Password";
                Email emails = new Email();
                emails.sendMail(ssn.getUEmail(), subject , ssn.getPass());
                JOptionPane.showMessageDialog(null, "Please Check Your Email.");
                break;
                }
                }


            }  
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Email Not Send.");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed
  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtemail;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
