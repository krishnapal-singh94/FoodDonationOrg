/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.IndividualDonorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrg;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrg;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import javax.swing.JPanel;

/**
 *
 * @author KNN Team
 */
public class IndividualDonorWokAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form IndividualDonorWokAreaJPanel
     */
    public IndividualDonorWokAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
       individualDonorAdminDashboardJTable.getTableHeader().setDefaultRenderer(new TableColors());
       individualDonorAdminMenuJTable.getTableHeader().setDefaultRenderer(new TableColors());
       populateStatus(organization);
    }
    public void populateStatus(Organization organization){
        if(organization instanceof IndividualFoodDonorOrg){
            IndividualFoodDonorOrg org = (IndividualFoodDonorOrg)organization;
            lblIndividualDonorStatus.setText(org.getCertified());
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        individualDonorAdminDashboardJTable = new javax.swing.JTable();
        lblIndividualDonorStatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFoodDishName = new javax.swing.JLabel();
        lblImageUploadBtn = new javax.swing.JLabel();
        txtFoodName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblViewImage = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        individualDonorAdminMenuJTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(106, 137, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        individualDonorAdminDashboardJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        individualDonorAdminDashboardJTable.setForeground(new java.awt.Color(25, 56, 82));
        individualDonorAdminDashboardJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "Food Name", "No Of Serves", "Address", "Contact No", "Status", "Food Prepare Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        individualDonorAdminDashboardJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(individualDonorAdminDashboardJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 880, 116));

        lblIndividualDonorStatus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblIndividualDonorStatus.setForeground(new java.awt.Color(25, 56, 82));
        lblIndividualDonorStatus.setText("approved/not approved");
        add(lblIndividualDonorStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 190, -1));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 56, 82));
        jLabel7.setText("Individual Donor Work Area");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 56, 82));
        jLabel8.setText("Food Safety Certify:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 190, -1));

        lblFoodDishName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblFoodDishName.setForeground(new java.awt.Color(25, 56, 82));
        lblFoodDishName.setText("Food Dish Name");
        lblFoodDishName.setToolTipText("");
        add(lblFoodDishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 100, -1));

        lblImageUploadBtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblImageUploadBtn.setForeground(new java.awt.Color(25, 56, 82));
        lblImageUploadBtn.setText("Upload Image");
        lblImageUploadBtn.setToolTipText("");
        add(lblImageUploadBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 570, 110, -1));

        txtFoodName.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtFoodName.setForeground(new java.awt.Color(25, 56, 82));
        txtFoodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFoodNameActionPerformed(evt);
            }
        });
        add(txtFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 210, -1));

        txtQuantity.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtQuantity.setForeground(new java.awt.Color(25, 56, 82));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, 210, -1));

        lblQuantity.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(25, 56, 82));
        lblQuantity.setText("Quantity");
        lblQuantity.setToolTipText("");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 110, -1));

        btnSubmit.setBackground(new java.awt.Color(255, 255, 255));
        btnSubmit.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(25, 56, 82));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, -1, 30));

        lblViewImage.setText("jLabel14");
        add(lblViewImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 580, 270, 180));

        individualDonorAdminMenuJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Food Name", "No Of Serves", "Food prepare time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(individualDonorAdminMenuJTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 180));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFoodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFoodNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFoodNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        //        Type type = (Type) organizationJComboBox.getSelectedItem();
        //
        //        if("".equals(orgNameTextField.getText())) {
            //            JOptionPane.showMessageDialog(null, "Enter organization name!");
            //        }else if("".equals(orgLocation.getText())) {
            //            JOptionPane.showMessageDialog(null, "Please set a location");
            //        }else {
            //            locationPoint = orgLocation.getText();
            //            Organization organization = directory.createOrganization(type,orgNameTextField.getText(), locationPoint);
            //            JOptionPane.showMessageDialog(null, "Organization Successfully Created");
            //
            //            populateTable();
            //            resetFields();
            //        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTable individualDonorAdminDashboardJTable;
    private javax.swing.JTable individualDonorAdminMenuJTable;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblFoodDishName;
    private javax.swing.JLabel lblImageUploadBtn;
    private javax.swing.JLabel lblIndividualDonorStatus;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblViewImage;
    private javax.swing.JTextField txtFoodName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
