
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDialog;


/**
 *
 * @author MDena
 * https://github.com/WrongCode-01?tab=repositories
 */
public class DataSiswa extends javax.swing.JFrame {

    
    public DataSiswa() {
        initComponents();
        showData();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_21552011440 = new javax.swing.JPanel();
        LabelJudul_21552011440 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_siswa_21552011440 = new javax.swing.JTable();
        cmdRefresh_21552011440 = new javax.swing.JButton();
        cmdHapus_21552011440 = new javax.swing.JButton();
        Panel2_21552011440 = new javax.swing.JPanel();
        TextField2NIS_21552011440 = new javax.swing.JTextField();
        TextField2Nama_21552011440 = new javax.swing.JTextField();
        TextField2Kelas_21552011440 = new javax.swing.JTextField();
        TextField2Jurusan_21552011440 = new javax.swing.JTextField();
        Button2Simpan_21552011440 = new javax.swing.JButton();
        Label2Jurusan_21552011440 = new javax.swing.JLabel();
        Label2Kelas_21552011440 = new javax.swing.JLabel();
        Label2Nama_21552011440 = new javax.swing.JLabel();
        Label2NIS_21552011440 = new javax.swing.JLabel();
        LabelJudul2_21552011440 = new javax.swing.JLabel();
        Button2Cancel_21552011440 = new javax.swing.JButton();
        cmdEdit_21552011440 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        Panel_21552011440.setBackground(new java.awt.Color(0, 255, 255));
        Panel_21552011440.setForeground(new java.awt.Color(153, 153, 153));

        LabelJudul_21552011440.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelJudul_21552011440.setText("DATA SISWA");

        tbl_siswa_21552011440.setBackground(new java.awt.Color(153, 153, 255));
        tbl_siswa_21552011440.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Kelas", "Jurusan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_siswa_21552011440.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_siswa_21552011440MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_siswa_21552011440);

        cmdRefresh_21552011440.setText("Refresh");
        cmdRefresh_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRefresh_21552011440ActionPerformed(evt);
            }
        });

        cmdHapus_21552011440.setText("Hapus");
        cmdHapus_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHapus_21552011440ActionPerformed(evt);
            }
        });

        Panel2_21552011440.setBackground(new java.awt.Color(0, 255, 255));

        Button2Simpan_21552011440.setText("Simpan");
        Button2Simpan_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2Simpan_21552011440ActionPerformed(evt);
            }
        });

        Label2Jurusan_21552011440.setText("Jurusan");

        Label2Kelas_21552011440.setText("Kelas");

        Label2Nama_21552011440.setText("Nama");

        Label2NIS_21552011440.setText("NIS");

        LabelJudul2_21552011440.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        LabelJudul2_21552011440.setText("Simpan Data Siswa");

        Button2Cancel_21552011440.setText("Cancel");
        Button2Cancel_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2Cancel_21552011440ActionPerformed(evt);
            }
        });

        cmdEdit_21552011440.setText("Ubah");
        cmdEdit_21552011440.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEdit_21552011440ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2_21552011440Layout = new javax.swing.GroupLayout(Panel2_21552011440);
        Panel2_21552011440.setLayout(Panel2_21552011440Layout);
        Panel2_21552011440Layout.setHorizontalGroup(
            Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2_21552011440Layout.createSequentialGroup()
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2_21552011440Layout.createSequentialGroup()
                        .addComponent(Button2Simpan_21552011440)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEdit_21552011440)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Button2Cancel_21552011440))
                    .addGroup(Panel2_21552011440Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelJudul2_21552011440))
                    .addGroup(Panel2_21552011440Layout.createSequentialGroup()
                        .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Label2NIS_21552011440)
                            .addComponent(Label2Nama_21552011440)
                            .addComponent(Label2Kelas_21552011440)
                            .addComponent(Label2Jurusan_21552011440))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextField2NIS_21552011440)
                            .addComponent(TextField2Nama_21552011440)
                            .addComponent(TextField2Kelas_21552011440)
                            .addComponent(TextField2Jurusan_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2_21552011440Layout.setVerticalGroup(
            Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2_21552011440Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelJudul2_21552011440)
                .addGap(18, 18, 18)
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label2NIS_21552011440)
                    .addComponent(TextField2NIS_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField2Nama_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2Nama_21552011440))
                .addGap(23, 23, 23)
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField2Kelas_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2Kelas_21552011440))
                .addGap(18, 18, 18)
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextField2Jurusan_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label2Jurusan_21552011440))
                .addGap(18, 18, 18)
                .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button2Simpan_21552011440)
                    .addComponent(Button2Cancel_21552011440)
                    .addGroup(Panel2_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdEdit_21552011440)))
                .addGap(83, 83, 83))
        );

        javax.swing.GroupLayout Panel_21552011440Layout = new javax.swing.GroupLayout(Panel_21552011440);
        Panel_21552011440.setLayout(Panel_21552011440Layout);
        Panel_21552011440Layout.setHorizontalGroup(
            Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                                .addComponent(cmdRefresh_21552011440)
                                .addGap(237, 237, 237)
                                .addComponent(cmdHapus_21552011440))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Panel2_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(LabelJudul_21552011440)))
                .addContainerGap())
        );
        Panel_21552011440Layout.setVerticalGroup(
            Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_21552011440Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelJudul_21552011440)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_21552011440Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Panel2_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdHapus_21552011440)
                    .addGroup(Panel_21552011440Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdRefresh_21552011440)))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_21552011440, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_21552011440, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRefresh_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRefresh_21552011440ActionPerformed
    showData();
    }//GEN-LAST:event_cmdRefresh_21552011440ActionPerformed

    private void tbl_siswa_21552011440MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_siswa_21552011440MouseClicked
     int baris = tbl_siswa_21552011440.rowAtPoint(evt.getPoint());
        String nis =tbl_siswa_21552011440.getValueAt(baris, 0).toString();
        TextField2NIS_21552011440.setText(nis);
        String nama = tbl_siswa_21552011440.getValueAt(baris,1).toString();
        TextField2Nama_21552011440.setText(nama);
        String kelas=tbl_siswa_21552011440.getValueAt(baris, 2).toString();
        TextField2Kelas_21552011440.setText(kelas);
        String jurusan = tbl_siswa_21552011440.getValueAt(baris, 3).toString();
        TextField2Jurusan_21552011440.setText(jurusan);
    }//GEN-LAST:event_tbl_siswa_21552011440MouseClicked

    private void Button2Simpan_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2Simpan_21552011440ActionPerformed
       try {
            String sql = "INSERT INTO t_siswa VALUES ('"+TextField2NIS_21552011440.getText()+"','"+TextField2Nama_21552011440.getText()+"','"+TextField2Kelas_21552011440.getText()+"','"+TextField2Jurusan_21552011440.getText()+"')";
            java.sql.Connection conn=(Connection)DatabaseConnection.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
       clear();
    }//GEN-LAST:event_Button2Simpan_21552011440ActionPerformed

    private void Button2Cancel_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2Cancel_21552011440ActionPerformed
    clear();
    }//GEN-LAST:event_Button2Cancel_21552011440ActionPerformed

    private void cmdHapus_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHapus_21552011440ActionPerformed
    try {
            String sql ="delete from t_siswa where nis='"+TextField2NIS_21552011440.getText()+"'";
            java.sql.Connection conn=(Connection)DatabaseConnection.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "berhasil di hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cmdHapus_21552011440ActionPerformed

    private void cmdEdit_21552011440ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEdit_21552011440ActionPerformed
    try {
            String sql ="UPDATE t_siswa SET nis = '"+TextField2NIS_21552011440.getText()+"', nama = '"+TextField2Nama_21552011440.getText()+"',kelas= '"+TextField2Kelas_21552011440.getText()+"',jurusan= '"+TextField2Jurusan_21552011440.getText()+"' WHERE nis = '"+TextField2NIS_21552011440.getText()+"'";
            java.sql.Connection conn=(Connection)DatabaseConnection.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "data berhasil di edit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
        }
    }//GEN-LAST:event_cmdEdit_21552011440ActionPerformed

    
   public void showData(){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIS");
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Jurusan");
        
        //menampilkan data database kedalam tabel
        try {
            String sql = "select * from t_siswa";
            java.sql.Connection conn=(Connection)DatabaseConnection.configDB();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),res.getString(2),res.getString(3),res.getString(4)});
            }
            tbl_siswa_21552011440.setModel(model);
        } catch (Exception e) {
        }
   }
    
   void clear(){
    TextField2NIS_21552011440.setText("");
    TextField2Nama_21552011440.setText("");
    TextField2Kelas_21552011440.setText("");
    TextField2Jurusan_21552011440.setText("");
   }
   
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
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button2Cancel_21552011440;
    private javax.swing.JButton Button2Simpan_21552011440;
    private javax.swing.JLabel Label2Jurusan_21552011440;
    private javax.swing.JLabel Label2Kelas_21552011440;
    private javax.swing.JLabel Label2NIS_21552011440;
    private javax.swing.JLabel Label2Nama_21552011440;
    private javax.swing.JLabel LabelJudul2_21552011440;
    private javax.swing.JLabel LabelJudul_21552011440;
    private javax.swing.JPanel Panel2_21552011440;
    private javax.swing.JPanel Panel_21552011440;
    private javax.swing.JTextField TextField2Jurusan_21552011440;
    private javax.swing.JTextField TextField2Kelas_21552011440;
    private javax.swing.JTextField TextField2NIS_21552011440;
    private javax.swing.JTextField TextField2Nama_21552011440;
    private javax.swing.JButton cmdEdit_21552011440;
    private javax.swing.JButton cmdHapus_21552011440;
    private javax.swing.JButton cmdRefresh_21552011440;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_siswa_21552011440;
    // End of variables declaration//GEN-END:variables
}
