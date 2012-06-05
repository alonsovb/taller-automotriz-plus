
package pkgInterface;

import javax.swing.JOptionPane;
import pkgData.cCar;

public class dAddCar extends javax.swing.JDialog {
    private cCar nCar;


    public dAddCar(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        nCar = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gbFondoAuto = new javax.swing.JPanel();
        lPlacaAuto = new javax.swing.JLabel();
        tfPlacaAuto = new javax.swing.JTextField();
        lMarca = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox();
        lModeloAuto = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox();
        bGuardarAuto = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        gbFondoAuto.setBackground(new java.awt.Color(255, 255, 255));
        gbFondoAuto.setForeground(new java.awt.Color(102, 102, 102));

        lPlacaAuto.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        lPlacaAuto.setText("Plate:");

        lMarca.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        lMarca.setText("Model:");

        cbMarca.setEditable(true);
        cbMarca.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        cbMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acura ", "Asia ", "Audi", "Bmw ", "Cherokee ", "Chevrolet ", "Citroen ", "Daewoo ", "Daihatsu ", "Datsun ", "Dodge ", "Fiat ", "Ford ", "Freightliner ", "Geo ", "Gmc ", "Great Wall ", "Honda ", "Hummer ", "Hyundai ", "International ", "Isuzu ", "Jeep ", "Kia ", "Land Rover ", "Lincoln ", "Chuck Norris'", "Mack ", "Mazda ", "Mercedes Benz ", "Mitsubishi ", "Nissan ", "Peugeot ", "Renault ", "Ssang Yong ", "Subaru ", "Suzuki ", "Toyota ", "Toyotona ", "Volkswagen ", "Volvo" }));

        lModeloAuto.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        lModeloAuto.setText("Year:");

        cbModelo.setEditable(true);
        cbModelo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 11));
        cbModelo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962" }));

        javax.swing.GroupLayout gbFondoAutoLayout = new javax.swing.GroupLayout(gbFondoAuto);
        gbFondoAuto.setLayout(gbFondoAutoLayout);
        gbFondoAutoLayout.setHorizontalGroup(
            gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gbFondoAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPlacaAuto)
                    .addComponent(lMarca)
                    .addComponent(lModeloAuto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbModelo, 0, 276, Short.MAX_VALUE)
                    .addComponent(cbMarca, 0, 276, Short.MAX_VALUE)
                    .addComponent(tfPlacaAuto, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addContainerGap())
        );
        gbFondoAutoLayout.setVerticalGroup(
            gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gbFondoAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPlacaAuto)
                    .addComponent(tfPlacaAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lMarca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gbFondoAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lModeloAuto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bGuardarAuto.setText("Guardar");
        bGuardarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGuardarAutoActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bCancelar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(bGuardarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(gbFondoAuto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(gbFondoAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGuardarAuto)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bGuardarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGuardarAutoActionPerformed

        int plate;
        try {
            plate = Integer.parseInt(tfPlacaAuto.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "La placa no tiene el formato correcto",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        nCar = new cCar(plate, cbMarca.getSelectedItem().toString(),
                cbModelo.getSelectedItem().toString()); //revisar el metodo para imprimir los autos

        this.setVisible(false);
}//GEN-LAST:event_bGuardarAutoActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_bCancelarActionPerformed

    public cCar getCar() {
        return nCar;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bGuardarAuto;
    private javax.swing.JComboBox cbMarca;
    private javax.swing.JComboBox cbModelo;
    private javax.swing.JPanel gbFondoAuto;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lModeloAuto;
    private javax.swing.JLabel lPlacaAuto;
    private javax.swing.JTextField tfPlacaAuto;
    // End of variables declaration//GEN-END:variables

}
