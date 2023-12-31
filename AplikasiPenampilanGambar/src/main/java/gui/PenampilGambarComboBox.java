/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author USER
 */
public class PenampilGambarComboBox extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambarComboBox
     */
    public PenampilGambarComboBox() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelfoto = new javax.swing.JPanel();
        lblmoon = new javax.swing.JLabel();
        lblneverland = new javax.swing.JLabel();
        lbldragon = new javax.swing.JLabel();
        panelbtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxpilih = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelfoto.setLayout(new java.awt.CardLayout());

        lblmoon.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Rekomendasi Buku Bacaan Buat Remaja _ Life and Travel Journal.jpeg")); // NOI18N
        panelfoto.add(lblmoon, "0");

        lblneverland.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\Cover Reveal_ Forever Neverland by Susan Adrian.jpeg")); // NOI18N
        panelfoto.add(lblneverland, "1");

        lbldragon.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\24 must-read books for 9-12-year-olds.jpeg")); // NOI18N
        panelfoto.add(lbldragon, "2");

        panelbtn.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setText("Pilih Gambar");
        panelbtn.add(jLabel1);

        cbxpilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moon", "Forever Neverland", "The Secret Dragon" }));
        cbxpilih.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxpilihItemStateChanged(evt);
            }
        });
        panelbtn.add(cbxpilih);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(panelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxpilihItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxpilihItemStateChanged
        CardLayout cl = (CardLayout) (panelfoto.getLayout());
        cl.show(panelfoto, String.valueOf(cbxpilih.getSelectedIndex()));

    }//GEN-LAST:event_cbxpilihItemStateChanged

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
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenampilGambarComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenampilGambarComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxpilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbldragon;
    private javax.swing.JLabel lblmoon;
    private javax.swing.JLabel lblneverland;
    private javax.swing.JPanel panelbtn;
    private javax.swing.JPanel panelfoto;
    // End of variables declaration//GEN-END:variables
}
