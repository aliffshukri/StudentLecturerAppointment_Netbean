/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import java.sql. *;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class BookApp extends javax.swing.JFrame {
Connection conn = null;
ResultSet rs = null;
PreparedStatement pst = null;
    /**
     * Creates new form BookApp
     */
    public BookApp() {
        initComponents();
        conn = ConnectJ.ConnectDB();
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
        check_btn = new Student.Button();
        back_btn = new Student.Button();
        lect_name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        stud_name = new javax.swing.JTextField();
        time = new javax.swing.JComboBox<>();
        date = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        reason_field = new javax.swing.JTextArea();
        book_btn = new Student.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        check_btn.setText("CHECK");
        check_btn.setColorClick(new java.awt.Color(0, 105, 186));
        check_btn.setColorOver(new java.awt.Color(199, 199, 199));
        check_btn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        check_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_btnMouseClicked(evt);
            }
        });
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });
        jPanel1.add(check_btn);
        check_btn.setBounds(630, 363, 80, 39);

        back_btn.setBorder(null);
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Arrows-Back-icon.png"))); // NOI18N
        back_btn.setBorderColor(new java.awt.Color(255, 255, 255));
        back_btn.setColorClick(new java.awt.Color(199, 199, 199));
        back_btn.setColorOver(new java.awt.Color(239, 240, 241));
        back_btn.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        back_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        back_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_btnMouseClicked(evt);
            }
        });
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn);
        back_btn.setBounds(90, 138, 48, 48);

        lect_name.setBackground(new java.awt.Color(239, 240, 241));
        lect_name.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        lect_name.setActionCommand("<Not Set>");
        lect_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lect_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(lect_name);
        lect_name.setBounds(108, 363, 602, 39);

        email.setBackground(new java.awt.Color(239, 240, 241));
        email.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        email.setActionCommand("<Not Set>");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(email);
        email.setBounds(108, 532, 602, 39);

        stud_name.setBackground(new java.awt.Color(239, 240, 241));
        stud_name.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        stud_name.setActionCommand("<Not Set>");
        stud_name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        stud_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(stud_name);
        stud_name.setBounds(108, 448, 602, 39);

        time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 am - 11.00 am", "2.00 pm - 4.00 pm", }));
        time.setBackground(new java.awt.Color(239, 240, 241));
        time.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPanel1.add(time);
        time.setBounds(730, 450, 602, 39);

        date.setBackground(new java.awt.Color(239, 240, 241));
        date.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        jPanel1.add(date);
        date.setBounds(730, 363, 602, 39);

        reason_field.setBackground(new java.awt.Color(239, 240, 241));
        reason_field.setColumns(20);
        reason_field.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        reason_field.setRows(5);
        reason_field.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jScrollPane1.setViewportView(reason_field);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(730, 530, 602, 111);

        book_btn.setForeground(new java.awt.Color(255, 255, 255));
        book_btn.setText("Book");
        book_btn.setColor(new java.awt.Color(95, 182, 249));
        book_btn.setColorClick(new java.awt.Color(0, 105, 186));
        book_btn.setColorOver(new java.awt.Color(199, 199, 199));
        book_btn.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        book_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        book_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                book_btnMouseClicked(evt);
            }
        });
        book_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_btnActionPerformed(evt);
            }
        });
        jPanel1.add(book_btn);
        book_btn.setBounds(618, 702, 204, 66);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Book Appointment.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 1440, 891);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 891));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_btnMouseClicked
        // TODO add your handling code here:
        MainPage start = new MainPage();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_back_btnActionPerformed

    private void book_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_book_btnMouseClicked
        String lectname = lect_name.getText();
        String studname = stud_name.getText();
        String emel = email.getText();
        String datee = (String)date.getSelectedItem();
        String timee = (String)time.getSelectedItem();
        String reason = reason_field.getText();
        
        if(lectname.equals("")||studname.equals("")||emel.equals("")||reason.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill in the blank space details");}
        else if(datee == null){
            JOptionPane.showMessageDialog(null,"Please click check on Lecturer's Name to find Date");
        }
        else{
            try{
            Statement s = conn.createStatement();
            s.executeUpdate("INSERT INTO book_app(LectName, StudName, Email, Date, Time, Reason) "
                + "VALUES ('"+lectname+"','"+studname+"','"+emel+"','"+datee+"','"+timee+"','"+reason+"')");
            JOptionPane.showMessageDialog(null, "Successfully Booking");
                //go to MainPage
                this.setVisible(false); // close BookApp
                new MainPage().setVisible(true); //open MainPage
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
            //to reset field
            lect_name.setText("");
            stud_name.setText("");
            email.setText("");
            reason_field.setText("");
        
    }//GEN-LAST:event_book_btnMouseClicked

    private void book_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_btnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_book_btnActionPerformed

    private void check_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_btnMouseClicked
        // TODO add your handling code here:
        String sql = "SELECT * FROM book_details WHERE LectName=?";
        date.removeAllItems();
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,lect_name.getText());
            rs = pst.executeQuery(); //take from database
            int i=0;
            while(rs.next()){
                date.addItem(rs.getString("Date"));
                i++;
            }if(i==0){
                JOptionPane.showMessageDialog(null, "Lecturer Not Found or Not Available");
                lect_name.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Lecturer Available");
            }
            
        }catch(Exception e){
        }
    }//GEN-LAST:event_check_btnMouseClicked

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_btnActionPerformed

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
            java.util.logging.Logger.getLogger(BookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Student.Button back_btn;
    private Student.Button book_btn;
    private Student.Button check_btn;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lect_name;
    private javax.swing.JTextArea reason_field;
    private javax.swing.JTextField stud_name;
    private javax.swing.JComboBox<String> time;
    // End of variables declaration//GEN-END:variables
}
