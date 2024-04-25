/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aliff
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public MainPage() {
        initComponents();

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
        button1 = new Student.Button();
        button2 = new Student.Button();
        button3 = new Student.Button();
        button4 = new Student.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Book");
        button1.setColor(new java.awt.Color(95, 182, 249));
        button1.setColorClick(new java.awt.Color(0, 105, 186));
        button1.setColorOver(new java.awt.Color(199, 199, 199));
        button1.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        button1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        jPanel1.add(button1);
        button1.setBounds(618, 485, 204, 66);

        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Booking List");
        button2.setColor(new java.awt.Color(95, 182, 249));
        button2.setColorClick(new java.awt.Color(0, 105, 186));
        button2.setColorOver(new java.awt.Color(199, 199, 199));
        button2.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        button2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(618, 565, 204, 66);

        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Log out ");
        button3.setColor(new java.awt.Color(134, 134, 134));
        button3.setColorClick(new java.awt.Color(0, 105, 186));
        button3.setColorOver(new java.awt.Color(199, 199, 199));
        button3.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        button3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        jPanel1.add(button3);
        button3.setBounds(920, 200, 130, 40);

        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("My Profile");
        button4.setToolTipText("");
        button4.setColor(new java.awt.Color(95, 182, 249));
        button4.setColorClick(new java.awt.Color(0, 105, 186));
        button4.setColorOver(new java.awt.Color(199, 199, 199));
        button4.setFont(new java.awt.Font("Arial", 1, 23)); // NOI18N
        button4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });
        jPanel1.add(button4);
        button4.setBounds(618, 645, 204, 66);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/Main Page.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1440, 890);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        BookingList start = new BookingList();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        // TODO add your handling code here:
        BookApp start = new BookApp();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button1MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        // TODO add your handling code here:
        LoginStudent start = new LoginStudent();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button3MouseClicked

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        // TODO add your handling code here:
        MyProfile start = new MyProfile();
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_button4ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Student.Button button1;
    private Student.Button button2;
    private Student.Button button3;
    private Student.Button button4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
