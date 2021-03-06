/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import tubespbo.Kelas;

/**
 *
 * @author tinodau
 */
public class ViewAdminHapusKelas extends javax.swing.JFrame {

    /**
     * Creates new form AdminHapusKelas
     */
    public ViewAdminHapusKelas() {
        initComponents();
        setTitle("Hapus Kelas | Admin");
        setLocationRelativeTo(null);
        setHeader();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKelas = new javax.swing.JTable();
        comboKelas = new javax.swing.JComboBox<>();
        labelKelas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hapus Kelas");

        btnKembali.setText("Kembali");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabelKelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelKelas);

        labelKelas.setText("Kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelKelas)
                        .addGap(18, 18, 18)
                        .addComponent(comboKelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelKelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public JButton getBtnHapus() {
        return btnHapus;
    }
    
    public JButton getBtnKembali() {
        return btnKembali;
    }
    
    
    public void addListener(ActionListener a){
        btnHapus.addActionListener(a);
        btnKembali.addActionListener(a);
        comboKelas.addActionListener(a);
    }
    
    
    public void setComboKelas(String kelas) {
        comboKelas.addItem(kelas);
    }
    
    public String getComboKelas() {
        return comboKelas.getSelectedItem().toString();
    }
    
    public void setHeader() {
        String[] header = {"No","Kelas","Matakuliah","Dosen"};
        DefaultTableModel model = new DefaultTableModel(null, header);
        tabelKelas.setModel(model);
    }

    
    public void inputData(ArrayList<Kelas> daftarKelas) {
        DefaultTableModel tabelModel = (DefaultTableModel) tabelKelas.getModel();
        for (int i = 0; i < daftarKelas.size(); i++) {
            if(daftarKelas.get(i).getMK()!=null) {
                if(daftarKelas.get(i).getDosen()!=null) {
                    tabelModel.addRow(
                        new String[] {
                            (i+1)+"",daftarKelas.get(i).getKelasnya(),    
                            daftarKelas.get(i).getMK().getMKnya(),
                            daftarKelas.get(i).getDosen().getNama()
                        }
                    );
                } 
                else {
                    tabelModel.addRow(
                        new String[] {
                            (i+1)+"",daftarKelas.get(i).getKelasnya(),
                            daftarKelas.get(i).getMK().getMKnya(),
                            ""
                        }
                    );
                }
            } 
            
            else if(daftarKelas.get(i).getDosen()!=null) {
                tabelModel.addRow(
                    new String[] {
                        (i+1)+"",daftarKelas.get(i).getKelasnya(),
                        "",
                        daftarKelas.get(i).getDosen().getNama()
                    }
                );
            } 
            
            else {
                tabelModel.addRow(
                    new String[] {(i+1)+"",daftarKelas.get(i).getKelasnya(),
                    "",
                    ""
                    }
                );
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JComboBox<String> comboKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelKelas;
    private javax.swing.JTable tabelKelas;
    // End of variables declaration//GEN-END:variables
}
