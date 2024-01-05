/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplicationsms;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplicationsms.EnrollNow.getId;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Sameeksha Singh
 */
public final class EnrolledCourses extends javax.swing.JFrame {

    /**
     * Creates new form EnrolledCourses
     */
    public EnrolledCourses() {
        initComponents();
        login l = new login();
        String un = login.un;
        int id = 0;
        try
        {
            id = getId(un);             
        }
        catch(SQLException ex){Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);}
        try{
        setData(id);}
        catch(SQLException ex){Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);}
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Enrolled Courses");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("My Courses");

        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                c1ComponentShown(evt);
            }
        });

        l1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));

        l2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));

        l3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));

        l4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));

        l5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));

        l6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        l6.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                            .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(c6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_c1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         dispose();
        Dashboard d = new Dashboard();
        d.setTitle("back to page");
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(EnrolledCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnrolledCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnrolledCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnrolledCourses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new EnrolledCourses().setVisible(true);
            }
        });
        
    }
   
    public void setData(int id) throws SQLException
    {
        
        Connection dbcon = DBConnection.connectDB();
       
        //Connection dbconn = DriverManager.getConnection("jdbc:mysql://localhost:3307/login?useSSL=true","root","Password@1234");
        if(dbcon != null)
        {
            int i = 1; 
            //ResultSet res = null;
            try{               
                 Statement st = dbcon.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
                 String sql="select course.name,student_course.courseId from course,student_course where course.courseId = student_course.courseId and student_course.studId = "+id+" order by student_course.courseId";
                //int res = st.executeUpdate();
                ResultSet res = (ResultSet)st.executeQuery(sql);
                    
                 String s1 = "Programming Basics";
                 String s2 = "Fundamentals of Java";
                 String s3 = "Data Structures";
                 String s4 = "Database Management System";
                 String s5 = "Problem Solving";
                 String s6 = "Introduction of operating system";
                 //JLabel c1 = new JLabel();
                 int count = 1;
                    while(res.next())
                    {
                        System.out.println(res.getString(1));
                        String s7 = res.getString(1);
                        if(count == 1){
                            if(s1.equals(s7)){
                           
                                
                           c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Programming Basics.png")));
                            l1.setText("Programming Basics");}
                            else if(s2.equals(s7)){
                                 c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Fundamentals of Java.png")));
                            l1.setText("Fundamentals of Java");}
                            else if(s3.equals(s7)){
                                 c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Data Structures.png")));
                            l1.setText("Data Structures");}
                            else if(s4.equals(s7)){
                                 c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Database Management System.png")));
                            l1.setText("Database management system");}
                            else if(s5.equals(s7)){
                                 c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Problem Solving.png")));
                            l1.setText("Problem Solving");}
                            else if(s6.equals(s7)){
                                 c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                            l1.setText("Introduction of operating system");} }                           
                             //======================================================================
                            if(count == 2){
                            if(s2.equals(s7)){
                                 c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Fundamentals of Java.png")));
                            l2.setText("Fundamentals of Java");}
                            else if(s3.equals(s7)){
                                 c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Data Structures.png")));
                            l2.setText("Data Structures");}
                             else if(s4.equals(s7)){
                                 c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Database Management System.png")));
                             l2.setText("Database management system");}
                             else if(s5.equals(s7)){
                                 c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Problem Solving.png")));
                              l2.setText("Problem Solving");}
                             else if(s6.equals(s7)){
                                 c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                             l2.setText("Introduction of operating system");}}
                            
                             //=========================================================================================
                             if(count == 3){
                             if(s3.equals(s7)){
                                 c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Data Structures.png")));
                             l3.setText("Data Structures");}
                             else if(s4.equals(s7)){
                                 c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Database Management System.png")));
                             l3.setText("Database management system");}
                             else if(s5.equals(s7)){
                                 c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Problem Solving.png")));
                             l3.setText("Problem Solving");}
                             else if(s6.equals(s7)){
                                 c3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                             l3.setText("Introduction of operating system");}}
                            
                             //================================================================================
                             if(count == 4){
                             if(s4.equals(s7)){
                                 c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Database Management System.png")));
                             l4.setText("Database management system");}
                             else if(s5.equals(s7)){
                                 c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Problem Solving.png")));
                             l4.setText("Problem Solving");}
                             else if(s6.equals(s7)){
                                 c4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                             l4.setText("Introduction of operating system");}}
                            
                             //======================================================================================
                             if(count == 5){
                             if(s5.equals(s7)){
                                 c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Problem Solving.png")));
                             l5.setText("Problem Solving");}
                             else if(s6.equals(s7)){
                                 c5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                             l5.setText("Introduction of operating system");}}
                            
                             //===========================================================
                            if(count == 6){
                             if(s6.equals(s7)){
                                 c6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplicationsms/icons/Introduction of operating system.png")));
                             l6.setText("Introduction of operating system");}
                            }
                    count++;}
                    if(count == 1)
                    {
                        jLabel3.setText("Not enrolled Yet");
                    }
            }
            catch(SQLException ex)
            {
                //Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                System.out.println(ex);
                //System.out.println(res.next());
            }
             dbcon.close();
        }
         else
        {
           System.out.println("The connection not available.");
        } 
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel c1;
    private static javax.swing.JLabel c2;
    private static javax.swing.JLabel c3;
    private static javax.swing.JLabel c4;
    private static javax.swing.JLabel c5;
    private static javax.swing.JLabel c6;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables
}
