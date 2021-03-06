/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Configuration.ChangePassword;
import Doctor.Doctor;
import Configuration.Configuration;
import Configuration.UserLogin;
import DoctorAssistant.DoctorAssistant;
import Medicine.Medicine;
import Patient.Patient;
import Reciptionist.ReciptionistHomepage;
import Room.Room;
import TestReport.TestReport;

/**
 *
 * @author Shihab Rashel
 */
public class AdminHome extends javax.swing.JFrame {

    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
        
        
        lblAdminUserName.setText(Configuration.loggedUser);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminUserName = new javax.swing.JLabel();
        btnDoctor = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnpatient = new javax.swing.JButton();
        btnnurse = new javax.swing.JButton();
        btnReciptionist = new javax.swing.JButton();
        btnMedicine = new javax.swing.JButton();
        btnTestReport = new javax.swing.JButton();
        btnRoomNo = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnDoctorAssistant = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdminHome");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAdminUserName.setText("jLabel1");

        btnDoctor.setText("Doctor");
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnpatient.setText("Patient");
        btnpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientActionPerformed(evt);
            }
        });

        btnnurse.setText("Nurse");

        btnReciptionist.setText("Reciptionist");
        btnReciptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReciptionistActionPerformed(evt);
            }
        });

        btnMedicine.setText("Medicine");
        btnMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicineActionPerformed(evt);
            }
        });

        btnTestReport.setText("TestReport");
        btnTestReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestReportActionPerformed(evt);
            }
        });

        btnRoomNo.setText("RoomNo");
        btnRoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomNoActionPerformed(evt);
            }
        });

        btnEmployee.setText("Employee");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnDoctorAssistant.setText("DoctorAssistant");
        btnDoctorAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorAssistantActionPerformed(evt);
            }
        });

        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblAdminUserName)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChangePassword)
                        .addGap(29, 29, 29)
                        .addComponent(btnLogout)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDoctor)
                                .addGap(58, 58, 58))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReciptionist)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpatient)
                            .addComponent(btnMedicine))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnurse)
                            .addComponent(btnTestReport))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmployee)
                            .addComponent(btnDoctorAssistant))
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRoomNo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout)
                    .addComponent(btnChangePassword))
                .addGap(7, 7, 7)
                .addComponent(lblAdminUserName)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoctor)
                    .addComponent(btnpatient)
                    .addComponent(btnnurse)
                    .addComponent(btnDoctorAssistant))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReciptionist)
                    .addComponent(btnMedicine)
                    .addComponent(btnTestReport)
                    .addComponent(btnEmployee))
                .addGap(54, 54, 54)
                .addComponent(btnRoomNo)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if(!Configuration.isLoggedIn){
            this.setVisible(false);
            new UserLogin().setVisible(true);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        new Doctor().setVisible(true);
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Configuration.Logout();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientActionPerformed
       new Patient().setVisible(true);
    }//GEN-LAST:event_btnpatientActionPerformed

    private void btnReciptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReciptionistActionPerformed
      new ReciptionistHomepage().setVisible(true);
    }//GEN-LAST:event_btnReciptionistActionPerformed

    private void btnMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicineActionPerformed
        new Medicine().setVisible(true);
    }//GEN-LAST:event_btnMedicineActionPerformed

    private void btnDoctorAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorAssistantActionPerformed
         new DoctorAssistant().setVisible(true);
    }//GEN-LAST:event_btnDoctorAssistantActionPerformed

    private void btnTestReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestReportActionPerformed
        new TestReport().setVisible(true);
    }//GEN-LAST:event_btnTestReportActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        this.setVisible(false);
        new ChangePassword(lblAdminUserName.getText()).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
       new Employee().setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnRoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRoomNoActionPerformed
        new Room().setVisible(true);
    }//GEN-LAST:event_btnRoomNoActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnDoctorAssistant;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMedicine;
    private javax.swing.JButton btnReciptionist;
    private javax.swing.JButton btnRoomNo;
    private javax.swing.JButton btnTestReport;
    private javax.swing.JButton btnnurse;
    private javax.swing.JButton btnpatient;
    private javax.swing.JLabel lblAdminUserName;
    // End of variables declaration//GEN-END:variables

    
    
}
