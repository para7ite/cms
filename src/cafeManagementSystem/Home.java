/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cafeManagementSystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Home extends javax.swing.JFrame {

    public String email;

    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        if (!email.equals("admin@ccn.com")) {
            btnManageCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewDeleteProduct.setVisible(false);
            btnVerifyUser.setVisible(false);
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

        btnLogout = new javax.swing.JButton();
        btnPlaceOrder = new javax.swing.JButton();
        btnViewBillOrder = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnChangeSecQues = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnManageCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewDeleteProduct = new javax.swing.JButton();
        btnVerifyUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        btnPlaceOrder.setText("Place Order");
        btnPlaceOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnPlaceOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btnViewBillOrder.setText("View Bill and Order Placed");
        btnViewBillOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBillOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewBillOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        btnChangeSecQues.setText("Change Security Question");
        btnChangeSecQues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecQuesActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecQues, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        btnManageCategory.setText("Manage Category");
        btnManageCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnManageCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, -1, -1));

        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 620, -1, -1));

        btnViewDeleteProduct.setText("View Edit and Delete Product");
        btnViewDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 600, 190, -1));

        btnVerifyUser.setText("VerifyUser");
        btnVerifyUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 600, 98, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ccn_home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnChangeSecQuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecQuesActionPerformed
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecQuesActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnViewBillOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillOrderActionPerformed
        new ViewBillOrderPlacedDetails().setVisible(true);
    }//GEN-LAST:event_btnViewBillOrderActionPerformed

    private void btnPlaceOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrderActionPerformed
        setVisible(false);
        new PlaceOrder(email).setVisible(true);
    }//GEN-LAST:event_btnPlaceOrderActionPerformed

    private void btnManageCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCategoryActionPerformed
        new ManageCategory().setVisible(true);//doubt
    }//GEN-LAST:event_btnManageCategoryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDeleteProductActionPerformed
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewDeleteProductActionPerformed

    private void btnVerifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUserActionPerformed
        new VerifyUser().setVisible(true);
    }//GEN-LAST:event_btnVerifyUserActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecQues;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCategory;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnPlaceOrder;
    private javax.swing.JButton btnVerifyUser;
    private javax.swing.JButton btnViewBillOrder;
    private javax.swing.JButton btnViewDeleteProduct;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
