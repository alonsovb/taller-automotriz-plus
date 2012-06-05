/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * fMainLists.java
 *
 * Created on 15-nov-2010, 20:29:53
 */
package pkgInterface;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import pkgData.cMain;
import pkgData.cQueries;
import pkgFile.fInterpreter;
import pkgFile.fReader;

/**
 *
 * @author YASER
 */
public class fMainLists extends javax.swing.JFrame {

    cMain mainBoard;

    /** Creates new form fMainLists */
    public fMainLists(cMain a) {
        mainBoard = a;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pMainWindow = new javax.swing.JPanel();
        bCars = new javax.swing.JButton();
        bQueries = new javax.swing.JButton();
        bClients = new javax.swing.JButton();
        bEmployees = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tec@workshop-manager");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkgImages/top.png"))); // NOI18N

        bCars.setText("Cars");
        bCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCarsActionPerformed(evt);
            }
        });

        bQueries.setText("Queries");
        bQueries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQueriesActionPerformed(evt);
            }
        });

        bClients.setText("Clients");
        bClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClientsActionPerformed(evt);
            }
        });

        bEmployees.setText("Employees");
        bEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmployeesActionPerformed(evt);
            }
        });

        jButton1.setText("Load from file");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMainWindowLayout = new javax.swing.GroupLayout(pMainWindow);
        pMainWindow.setLayout(pMainWindowLayout);
        pMainWindowLayout.setHorizontalGroup(
            pMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bQueries, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(bClients, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(bEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(bCars, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        pMainWindowLayout.setVerticalGroup(
            pMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMainWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bClients)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pMainWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bQueries)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("File");

        jMenuItem1.setText("Load from file");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Lists");

        jMenuItem2.setText("Clients");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Employees");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Cars");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(pMainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pMainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClientsActionPerformed
        dClients dc = new dClients(this, true, mainBoard);
        dc.setVisible(true);
    }//GEN-LAST:event_bClientsActionPerformed

    private void bCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCarsActionPerformed
        dCars fcars = new dCars(this, true, mainBoard);
        fcars.setVisible(true);
    }//GEN-LAST:event_bCarsActionPerformed

    private void bEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmployeesActionPerformed
        dEmployee femploye = new dEmployee(this, true, mainBoard);
        femploye.setVisible(true);
    }//GEN-LAST:event_bEmployeesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.showDialog(null, "Generar árbol");
        File selected = fc.getSelectedFile();
        if (selected != null) {
            fReader fr = new fReader(fc.getSelectedFile().getPath(), mainBoard);
            fInterpreter fi = new fInterpreter(mainBoard);
            fi.readClients(fr.readFile());
            JOptionPane.showMessageDialog(this, "Listas cargadas con éxito");
        }        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jButton1.doClick();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        bClients.doClick();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        bEmployees.doClick();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        bCars.doClick();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void bQueriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQueriesActionPerformed
        dQueries dq = new dQueries(this, true, mainBoard);
        dq.setVisible(true);
    }//GEN-LAST:event_bQueriesActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCars;
    private javax.swing.JButton bClients;
    private javax.swing.JButton bEmployees;
    private javax.swing.JButton bQueries;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel pMainWindow;
    // End of variables declaration//GEN-END:variables
}
