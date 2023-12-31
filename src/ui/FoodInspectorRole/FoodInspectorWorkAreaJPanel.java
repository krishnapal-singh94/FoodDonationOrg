/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.FoodInspectorRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.FoodDonation;
import Business.Network.Network;
import Business.Organization.IndividualFoodDonorOrg;
import Business.Organization.IndividualReceiverOrg;
import Business.Organization.Organization;
import Business.Organization.PartyOrganizerOrg;
import Business.Organization.RestaurantOrg;
import Business.UserAccount.UserAccount;
import Business.Utils.TableColors;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KNN Team
 */
public class FoodInspectorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodInspectorWorkAreaJPanel
     */
    JPanel userContainer;
    UserAccount account;
    Organization org;
    Enterprise enterprise;
    Network network;
    EcoSystem business;
    
    public FoodInspectorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        initComponents();
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        this.userContainer = userProcessContainer;
        this.account = account;
        this.org = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        populateTable();
        
    }

    public void populateTable(){
        organizationJTable.getTableHeader().setDefaultRenderer(new TableColors());
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enterprise instanceof FoodDonation){
                for(Organization org : enterprise.getOrganizationDirectory().getListOfOrgs()){
                    if(org instanceof RestaurantOrg){
                        RestaurantOrg restorg = (RestaurantOrg)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationAddress();
                        row[3] = restorg.getCertified();
                        row[4] = restorg.getManagersName();
                        model.addRow(row);
                    }else if(org instanceof PartyOrganizerOrg){
                        PartyOrganizerOrg restorg = (PartyOrganizerOrg)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationAddress();
                        row[3] = restorg.getIfCertified();
                        row[4] = restorg.getOfficerName();
                        model.addRow(row);
                    }else if(org instanceof IndividualFoodDonorOrg){
                        IndividualFoodDonorOrg restorg = (IndividualFoodDonorOrg)org;
                        Object[] row = new Object[5];
                        row[0] = restorg;
                        row[1] = restorg.getType();
                        row[2] = restorg.getLocationAddress();
                        row[3] = restorg.getCertified();
                        row[4] = restorg.getManagersName();
                        model.addRow(row);
                    }
                    
                }
            }
            
            
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
        organizationJTable = new javax.swing.JTable();
        btnCertify = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAssignTome = new javax.swing.JButton();

        setBackground(new java.awt.Color(106, 137, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        organizationJTable.setForeground(new java.awt.Color(25, 56, 82));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Organization name", "Organization type", "Address", "Cerified", "Inspecteer User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        organizationJTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 165, 1050, 116));

        btnCertify.setBackground(new java.awt.Color(255, 255, 255));
        btnCertify.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnCertify.setForeground(new java.awt.Color(25, 56, 82));
        btnCertify.setText("Certify");
        btnCertify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCertifyActionPerformed(evt);
            }
        });
        add(btnCertify, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, -1));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(25, 56, 82));
        jLabel4.setText("MANAGE FOOD INSPECTOR WORK AREA PANEL");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 440, -1));

        btnAssignTome.setBackground(new java.awt.Color(255, 255, 255));
        btnAssignTome.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssignTome.setForeground(new java.awt.Color(25, 56, 82));
        btnAssignTome.setText("Assign to me");
        btnAssignTome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignTomeActionPerformed(evt);
            }
        });
        add(btnAssignTome, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCertifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCertifyActionPerformed
        
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select row!");
            return;
        }
        Organization org = (Organization)organizationJTable.getValueAt(selectedRow, 0);
        if(org instanceof RestaurantOrg ){
            RestaurantOrg restorg = (RestaurantOrg)org;
            if(restorg.getManagersName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setCertified("Certified");
        }else if(org instanceof PartyOrganizerOrg){
            PartyOrganizerOrg restorg = (PartyOrganizerOrg)org;
            if(restorg.getOfficerName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setIfCertified("Certified");
        }else if(org instanceof IndividualFoodDonorOrg){
            IndividualFoodDonorOrg restorg = (IndividualFoodDonorOrg)org;
            if(restorg.getManagersName().equals("not assigned")){JOptionPane.showMessageDialog(null, "assign it to yourself first!");return;}
            restorg.setCertified("Certified");
        }
     
        populateTable();
    }//GEN-LAST:event_btnCertifyActionPerformed

    private void btnAssignTomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignTomeActionPerformed
        int selectedRow = organizationJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "select row!");
            return;
        }
        Organization org = (Organization)organizationJTable.getValueAt(selectedRow, 0);
        if(org instanceof RestaurantOrg ){
            RestaurantOrg restorg = (RestaurantOrg)org;
            restorg.setManagersName(account.getUsername());
        }else if(org instanceof PartyOrganizerOrg){
            PartyOrganizerOrg restorg = (PartyOrganizerOrg)org;
            restorg.setOfficerName(account.getUsername());
        }else if(org instanceof IndividualFoodDonorOrg){
            IndividualFoodDonorOrg restorg = (IndividualFoodDonorOrg)org;
            restorg.setManagersName(account.getUsername());
        }
     
        populateTable();
    }//GEN-LAST:event_btnAssignTomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignTome;
    private javax.swing.JButton btnCertify;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
