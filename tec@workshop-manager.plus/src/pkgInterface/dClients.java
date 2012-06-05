/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * dClients.java
 *
 * Created on 17-nov-2010, 13:29:33
 */
package pkgInterface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkgData.cCar;
import pkgData.cClient;
import pkgData.cMain;

/**
 *
 * @author YASER
 */
public final class dClients extends javax.swing.JDialog {

    cMain mainBoard;
    Object[] columns = {"ID", "Nombre", "Apellidos", "Teléfono", "Dirección"};
    cClient selected;

    /** Creates new form dClients */
    public dClients(java.awt.Frame parent, boolean modal, cMain main) {
        super(parent, modal);
        initComponents();
        mainBoard = main;
        updateTable();
    }

    public void updateTable() {
        jTable1.setModel(new DefaultTableModel(mainBoard.getClientData(), columns));
        jtfSearchid.setText("");
        selected = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bAddClient = new javax.swing.JButton();
        bModifyClient = new javax.swing.JButton();
        bDeleteClient = new javax.swing.JButton();
        bCloseClient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lSearchid = new javax.swing.JLabel();
        jtfSearchid = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        bAddClient.setText("Add");
        bAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddClientActionPerformed(evt);
            }
        });

        bModifyClient.setText("Modify");
        bModifyClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyClientActionPerformed(evt);
            }
        });

        bDeleteClient.setText("Delete");
        bDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteClientActionPerformed(evt);
            }
        });

        bCloseClient.setText("Close");
        bCloseClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseClientActionPerformed(evt);
            }
        });

        jButton2.setText("Add Car");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Cars");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bAddClient, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bModifyClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bDeleteClient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCloseClient)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddClient)
                    .addComponent(bModifyClient)
                    .addComponent(bDeleteClient)
                    .addComponent(bCloseClient)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lSearchid.setText("Search by ID");

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lSearchid)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSearchid)
                    .addComponent(jtfSearchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSearch)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddClientActionPerformed
        dAddClient nc = new dAddClient(this, true, mainBoard);
        nc.setVisible(true);
        updateTable();
}//GEN-LAST:event_bAddClientActionPerformed

    private void bDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteClientActionPerformed
        if (selected != null) {
            mainBoard.remove(selected);
            updateTable();
        }
}//GEN-LAST:event_bDeleteClientActionPerformed

    private void bCloseClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseClientActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_bCloseClientActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed

        int id;
        try {
            id = Integer.parseInt(jtfSearchid.getText());
        } catch (NumberFormatException nfe) {
            return;
        }
        selected = mainBoard.getClient(id);

        if (selected != null) {
            Object[][] data = new Object[1][];
            data[0] = selected.getData();
            jTable1.setModel(new DefaultTableModel(data, columns));
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró");
            updateTable();
        }

}//GEN-LAST:event_bSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bModifyClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyClientActionPerformed
        if (selected != null) {
            dModifyClient mc = new dModifyClient(this, true, selected);
            mc.setVisible(true);
            if (mc.result.length > 0) {
                selected.Modify(mc.result);
                updateTable();
            }
        }
    }//GEN-LAST:event_bModifyClientActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (selected != null) {
            dAddCar dac = new dAddCar(this, true);
            dac.setVisible(true);
            cCar nCar = dac.getCar();
            if (nCar != null) {
                mainBoard.insert(nCar);
                mainBoard.insert(nCar, selected);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (selected != null) {
            dClientsCars dcc = new dClientsCars(this, true, selected);
            dcc.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddClient;
    private javax.swing.JButton bCloseClient;
    private javax.swing.JButton bDeleteClient;
    private javax.swing.JButton bModifyClient;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfSearchid;
    private javax.swing.JLabel lSearchid;
    // End of variables declaration//GEN-END:variables
}
