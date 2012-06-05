package pkgInterface;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pkgData.cEmployee;
import pkgData.cMain;

public final class dEmployee extends javax.swing.JDialog {

    cMain mainBoard;
    Object[] columns = {"ID", "Nombre", "Apellidos", "Teléfono", "Dirección"};
    cEmployee selected;

    /** Creates new form dEmployee */
    public dEmployee(java.awt.Frame parent, boolean modal, cMain main) {
        super(parent, modal);
        initComponents();
        mainBoard = main;
        updateTable();
    }

    public void updateTable() {
        jTable1.setModel(new DefaultTableModel(mainBoard.getEmployeeData(), columns));
        jtfSearchid.setText("");
        selected = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lSearchid = new javax.swing.JLabel();
        jtfSearchid = new javax.swing.JTextField();
        bSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        bAddEmployee = new javax.swing.JButton();
        bModifyEmployee = new javax.swing.JButton();
        bDeleteEmployee = new javax.swing.JButton();
        bCloseEmployee = new javax.swing.JButton();
        bAddEmployee1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lSearchid.setText("Search by ID");

        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });

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

        bAddEmployee.setText("Add");
        bAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddEmployeeActionPerformed(evt);
            }
        });

        bModifyEmployee.setText("Modify");
        bModifyEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyEmployeeActionPerformed(evt);
            }
        });

        bDeleteEmployee.setText("Delete");
        bDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteEmployeeActionPerformed(evt);
            }
        });

        bCloseEmployee.setText("Close");
        bCloseEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCloseEmployeeActionPerformed(evt);
            }
        });

        bAddEmployee1.setText("Jobs");
        bAddEmployee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddEmployee1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bModifyEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bDeleteEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAddEmployee1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCloseEmployee)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddEmployee)
                    .addComponent(bModifyEmployee)
                    .addComponent(bDeleteEmployee)
                    .addComponent(bCloseEmployee)
                    .addComponent(bAddEmployee1))
                .addContainerGap(13, Short.MAX_VALUE))
        );

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lSearchid)
                        .addGap(18, 18, 18)
                        .addComponent(jtfSearchid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        int id;
        try {
            id = Integer.parseInt(jtfSearchid.getText());
        } catch (NumberFormatException nfe) {
            return;
        }
        selected = mainBoard.getEmployee(id);

        if (selected != null) {
            Object[][] data = new Object[1][];
            data[0] = selected.getData();
            jTable1.setModel(new DefaultTableModel(data, columns));
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró");
            updateTable();
        }
}//GEN-LAST:event_bSearchActionPerformed

    private void bAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddEmployeeActionPerformed
        dAddEmployee ae = new dAddEmployee(this, true, mainBoard);
        ae.setVisible(true);
        updateTable();
}//GEN-LAST:event_bAddEmployeeActionPerformed

    private void bDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteEmployeeActionPerformed
        if (selected != null) {
            mainBoard.remove(selected);
            updateTable();
        }
}//GEN-LAST:event_bDeleteEmployeeActionPerformed

    private void bCloseEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCloseEmployeeActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_bCloseEmployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jtfSearchid.setText("");
        updateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bModifyEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyEmployeeActionPerformed
        if (selected != null) {
            dModifyClient mc = new dModifyClient(this, true, selected);
            mc.setVisible(true);
            if (mc.result.length > 0) {
                selected.Modify(mc.result);
                updateTable();
            }
        }
    }//GEN-LAST:event_bModifyEmployeeActionPerformed

    private void bAddEmployee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddEmployee1ActionPerformed
        if (selected != null) {
            dJob dj = new dJob(this, true, mainBoard, selected);
            dj.setVisible(true);
        }
    }//GEN-LAST:event_bAddEmployee1ActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddEmployee;
    private javax.swing.JButton bAddEmployee1;
    private javax.swing.JButton bCloseEmployee;
    private javax.swing.JButton bDeleteEmployee;
    private javax.swing.JButton bModifyEmployee;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtfSearchid;
    private javax.swing.JLabel lSearchid;
    // End of variables declaration//GEN-END:variables
}
