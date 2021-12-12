/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
       
    }
    private void manageEnterpriseAdmin(){
        
//        manageEnterpriseAdmin.setBackground(new Color(236,113,107));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ui.SystemAdminWorkArea.ManageEnterpriseAdminJPanel manageEnterpriseAdmin = new ui.SystemAdminWorkArea.ManageEnterpriseAdminJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseAdminJPanel",manageEnterpriseAdmin);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
    }
    
    private void manageNetwork(){
//        manageNetworkPanel.setBackground(new Color(236,113,107));
//        manageEnterprise.setBackground(new Color(215,81,81));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ui.SystemAdminWorkArea.ManageNetworkJPanel manageNetworkPanel = new ui.SystemAdminWorkArea.ManageNetworkJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageNetworkJPanel",manageNetworkPanel);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
     }
    private void manageEnterprise(){
//        manageEnterprise.setBackground(new Color(236,113,107));
//        manageNetworkPanel.setBackground(new Color(215,81,81));
//        manageEnterpriseAdmin.setBackground(new Color(215,81,81));
//        viewGraphScene.setBackground(new Color(215,81,81));
//        noOfSceneGraph.setBackground(new Color(215,81,81));
        ui.SystemAdminWorkArea.ManageEnterpriseJPanel manageEnterprise = new ui.SystemAdminWorkArea.ManageEnterpriseJPanel(rightSystemAdminPanel, ecosystem);
        rightSystemAdminPanel.add("ManageEnterpriseJPanel",manageEnterprise);
        CardLayout layout = (CardLayout) rightSystemAdminPanel.getLayout();
        layout.next(rightSystemAdminPanel);
        
    }
    
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        systemAdminPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        manageNetworkPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageNetwork = new javax.swing.JLabel();
        manageEnterprise = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        manageEnterpriseLabel = new javax.swing.JLabel();
        manageEnterpriseAdmin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        manageEnterpriseAdminLabel = new javax.swing.JLabel();
        noOfSceneGraph = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        noOfGraphSceneLabel = new javax.swing.JLabel();
        lblSelectedNode1 = new javax.swing.JLabel();
        viewGraphScene = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        viewGraphSceneDetails = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        rightSystemAdminPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        systemAdminPanel.setBackground(new java.awt.Color(51, 255, 204));
        systemAdminPanel.setPreferredSize(new java.awt.Dimension(1338, 840));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setMinimumSize(new java.awt.Dimension(280, 148));
        jPanel3.setPreferredSize(new java.awt.Dimension(280, 148));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        manageNetworkPanel.setBackground(new java.awt.Color(102, 153, 0));
        manageNetworkPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetworkPanelMousePressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/worldwide.png"))); // NOI18N

        manageNetwork.setBackground(new java.awt.Color(51, 255, 204));
        manageNetwork.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageNetwork.setText("Manage Network");
        manageNetwork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageNetworkMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageNetworkPanelLayout = new javax.swing.GroupLayout(manageNetworkPanel);
        manageNetworkPanel.setLayout(manageNetworkPanelLayout);
        manageNetworkPanelLayout.setHorizontalGroup(
            manageNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        manageNetworkPanelLayout.setVerticalGroup(
            manageNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageNetworkPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageNetworkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageNetwork, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageNetworkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, -1));

        manageEnterprise.setBackground(new java.awt.Color(102, 153, 0));
        manageEnterprise.setPreferredSize(new java.awt.Dimension(264, 48));
        manageEnterprise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseMousePressed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/group.png"))); // NOI18N

        manageEnterpriseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        manageEnterpriseLabel.setText("Manage Enterprise");
        manageEnterpriseLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout manageEnterpriseLayout = new javax.swing.GroupLayout(manageEnterprise);
        manageEnterprise.setLayout(manageEnterpriseLayout);
        manageEnterpriseLayout.setHorizontalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEnterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEnterpriseLayout.setVerticalGroup(
            manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageEnterpriseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(manageEnterpriseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.add(manageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 280, 50));

        manageEnterpriseAdmin.setBackground(new java.awt.Color(102, 153, 0));
        manageEnterpriseAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                manageEnterpriseAdminMousePressed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/administrator.png"))); // NOI18N

        manageEnterpriseAdminLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        manageEnterpriseAdminLabel.setText("Manage Enterprise Admin");
        manageEnterpriseAdminLabel.setPreferredSize(new java.awt.Dimension(115, 16));

        javax.swing.GroupLayout manageEnterpriseAdminLayout = new javax.swing.GroupLayout(manageEnterpriseAdmin);
        manageEnterpriseAdmin.setLayout(manageEnterpriseAdminLayout);
        manageEnterpriseAdminLayout.setHorizontalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(manageEnterpriseAdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addContainerGap())
        );
        manageEnterpriseAdminLayout.setVerticalGroup(
            manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(manageEnterpriseAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(manageEnterpriseAdminLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(manageEnterpriseAdminLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.add(manageEnterpriseAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 88, 280, -1));

        noOfSceneGraph.setBackground(new java.awt.Color(102, 153, 0));
        noOfSceneGraph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noOfSceneGraphMousePressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stats.png"))); // NOI18N

        noOfGraphSceneLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        noOfGraphSceneLabel.setText("No Of Graph Scene");
        noOfGraphSceneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noOfGraphSceneLabelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout noOfSceneGraphLayout = new javax.swing.GroupLayout(noOfSceneGraph);
        noOfSceneGraph.setLayout(noOfSceneGraphLayout);
        noOfSceneGraphLayout.setHorizontalGroup(
            noOfSceneGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, noOfSceneGraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noOfGraphSceneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        noOfSceneGraphLayout.setVerticalGroup(
            noOfSceneGraphLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noOfSceneGraphLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(noOfSceneGraphLayout.createSequentialGroup()
                .addComponent(noOfGraphSceneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(noOfSceneGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 280, 40));

        lblSelectedNode1.setBackground(new java.awt.Color(51, 255, 204));
        lblSelectedNode1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jPanel3.add(lblSelectedNode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 230, 30));

        viewGraphScene.setBackground(new java.awt.Color(102, 153, 0));
        viewGraphScene.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewGraphSceneMousePressed(evt);
            }
        });
        viewGraphScene.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
        viewGraphScene.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 37, 31));

        viewGraphSceneDetails.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        viewGraphSceneDetails.setText("View Graph Scene Details");
        viewGraphSceneDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewGraphSceneDetailsMousePressed(evt);
            }
        });
        viewGraphScene.add(viewGraphSceneDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 6, 231, 31));

        jPanel3.add(viewGraphScene, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 40));

        jSeparator2.setBackground(new java.awt.Color(51, 255, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        rightSystemAdminPanel.setBackground(new java.awt.Color(106, 137, 204));
        rightSystemAdminPanel.setPreferredSize(new java.awt.Dimension(1058, 840));
        rightSystemAdminPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout systemAdminPanelLayout = new javax.swing.GroupLayout(systemAdminPanel);
        systemAdminPanel.setLayout(systemAdminPanelLayout);
        systemAdminPanelLayout.setHorizontalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(systemAdminPanelLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        systemAdminPanelLayout.setVerticalGroup(
            systemAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(rightSystemAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        add(systemAdminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void manageNetworkMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkMousePressed
        manageNetwork();
    }//GEN-LAST:event_manageNetworkMousePressed

    private void manageNetworkPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageNetworkPanelMousePressed
        // TODO add your handling code here:
       manageNetwork();
    }//GEN-LAST:event_manageNetworkPanelMousePressed

    private void manageEnterpriseLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseLabelMousePressed
        manageEnterprise();
    }//GEN-LAST:event_manageEnterpriseLabelMousePressed

    private void manageEnterpriseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseMousePressed
        // TODO add your handling code here:
        manageEnterprise();
    }//GEN-LAST:event_manageEnterpriseMousePressed

    private void manageEnterpriseAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageEnterpriseAdminMousePressed
        manageEnterpriseAdmin();
    }//GEN-LAST:event_manageEnterpriseAdminMousePressed

    private void noOfGraphSceneLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noOfGraphSceneLabelMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_noOfGraphSceneLabelMousePressed

    private void noOfSceneGraphMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noOfSceneGraphMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_noOfSceneGraphMousePressed

    private void viewGraphSceneDetailsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewGraphSceneDetailsMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewGraphSceneDetailsMousePressed

    private void viewGraphSceneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewGraphSceneMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_viewGraphSceneMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblSelectedNode1;
    private javax.swing.JPanel manageEnterprise;
    private javax.swing.JPanel manageEnterpriseAdmin;
    private javax.swing.JLabel manageEnterpriseAdminLabel;
    private javax.swing.JLabel manageEnterpriseLabel;
    private javax.swing.JLabel manageNetwork;
    private javax.swing.JPanel manageNetworkPanel;
    private javax.swing.JLabel noOfGraphSceneLabel;
    private javax.swing.JPanel noOfSceneGraph;
    private javax.swing.JPanel rightSystemAdminPanel;
    private javax.swing.JPanel systemAdminPanel;
    private javax.swing.JPanel viewGraphScene;
    private javax.swing.JLabel viewGraphSceneDetails;
    // End of variables declaration//GEN-END:variables
}