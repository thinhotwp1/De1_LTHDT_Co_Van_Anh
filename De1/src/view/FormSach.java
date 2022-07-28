/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import controller.SoluongExeption;
import controller.TrongExeption;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

/**
 *
 * @author chouv
 */
public class FormSach extends javax.swing.JPanel {
    
    DefaultTableModel tm;
    private boolean them,sua;
    private String fsach; 
    private List<Sach> lsach;

    /**
     * Creates new form FormSach
     */
    public FormSach() {
        initComponents();
        setSize(1000,950);
        String[] cols={"Ma sach","Ten sach","Tac gia","Chuyen nganh","So luong"};
        tm=new DefaultTableModel(cols,0);
        jTable1.setModel(tm);
        buttonState(true);
        them=false;
        sua=false;
        fsach="src/controller/Sach.dat";
        loadData();
    }
    private void loadData(){
        File f = new File(fsach);
        if(f.exists()){
            lsach=IOFile.doc(fsach);
        }
    }
    private void buttonState(boolean b){
        btThem.setEnabled(b);
        btCapnhat.setEnabled(!b);
        btBoqua.setEnabled(!b);
                
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
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btHT = new javax.swing.JButton();
        btLuu = new javax.swing.JButton();
        btCapnhat = new javax.swing.JButton();
        btBoqua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btThem.setText("Them ");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btHT.setText("Hien thi");
        btHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHTActionPerformed(evt);
            }
        });

        btLuu.setText("Luu vao file");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });

        btCapnhat.setText("Cap nhat");
        btCapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapnhatActionPerformed(evt);
            }
        });

        btBoqua.setText("Bo qua");
        btBoqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoquaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btThem)
                .addGap(26, 26, 26)
                .addComponent(btSua)
                .addGap(28, 28, 28)
                .addComponent(btXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHT)
                .addGap(22, 22, 22)
                .addComponent(btLuu)
                .addGap(18, 18, 18)
                .addComponent(btCapnhat)
                .addGap(11, 11, 11))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btBoqua))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThem)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btHT)
                    .addComponent(btLuu)
                    .addComponent(btCapnhat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBoqua)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa hoc tu nhien", "Nghe thuat", "Dien tu vien thong", "Cong nghe thong tin" }));

        jLabel5.setText("So luong:");

        jLabel1.setText("Ma sach:");

        jLabel2.setText("Ten sach:");

        jLabel3.setText("Tac gia:");

        jLabel4.setText("Chuyen nganh:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3))
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        buttonState(false);
        them=true;
        if(lsach != null && lsach.size() > 0 )
            Sach.setSma(lsach.get(lsach.size()-1).getMa()+1);
        else
            lsach = new ArrayList<>();
        jTextField1.setText(Sach.getSma()+"");
        jTextField2.requestFocus();
        
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        
        int row = jTable1.getSelectedRow();        // TODO add your handling code here:
        if(row<0 || row >jTable1.getSelectedRow()){
            JOptionPane.showMessageDialog(this,"Chon sach de sua");
        }
        else{
            sua=true;
            buttonState(false);
            jTextField2.requestFocus();
            
        }
        
    }//GEN-LAST:event_btSuaActionPerformed

    private void btHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHTActionPerformed
        // TODO add your handling code here:
        loadData();
        tm.setRowCount(0);
        for(Sach i:lsach){
            tm.addRow(i.toObject());
        }
    }//GEN-LAST:event_btHTActionPerformed

    private void btBoquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoquaActionPerformed
        // TODO add your handling code here:
        if(them){
            them=false;
            buttonState(true);
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_btBoquaActionPerformed

    private void btCapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapnhatActionPerformed
        // TODO add your handling code here:
        String ten,tacgia;
        int s1;        
        if(them){
            try{
                ten=jTextField2.getText();
                tacgia=jTextField3.getText();
                if(ten.isEmpty()||tacgia.isEmpty()) throw new TrongExeption();
                s1=Integer.parseInt(jTextField4.getText());
                if(s1<0) throw new SoluongExeption();
                int ma=Integer.parseInt(jTextField1.getText());
                Sach s = new Sach(ma, ten, tacgia, jComboBox1.getSelectedItem().toString(), s1);
                tm.addRow(s.toObject());
                lsach.add(s);
                    buttonState(true);
                    them=false;

            }catch(TrongExeption e){
                JOptionPane.showMessageDialog(this, "Khong duoc de trong!!");  
                jTextField2.requestFocus();
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Phai nhap so nguyen!!");
                jTextField4.requestFocus();
            }catch(SoluongExeption e){
                JOptionPane.showMessageDialog(this,"Phai nhap so duong!!");
                jTextField4.requestFocus();
            }    
        }
        if(sua){
            int row = jTable1.getSelectedRow(); 
            ten=jTextField2.getText();
            
            tacgia=jTextField3.getText();
            int ma = Integer.parseInt(jTextField1.getText());
            String cn = jComboBox1.getSelectedItem().toString();
            int sl=Integer.parseInt(tm.getValueAt(row,4).toString());
            try{
                sl =  Integer.parseInt(jTextField4.getText());
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this,"Nhap so");
            }
            Sach s = new Sach(ma, ten, tacgia, cn, sl);
            tm.setValueAt(ma, row, 0);
            tm.setValueAt(ten, row, 1);
            tm.setValueAt(tacgia, row, 2);
            tm.setValueAt(cn, row, 3);
            tm.setValueAt(sl, row, 4);
            
            lsach.set(row, s);
            sua=false;
            buttonState(true);
        }
    }//GEN-LAST:event_btCapnhatActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int row = jTable1.getSelectedRow();        // TODO add your handling code here:
        if(row<0 || row >jTable1.getSelectedRow()){
            JOptionPane.showMessageDialog(this,"Chon sach de xoa");
        }
        else{
            tm.removeRow(row);
            lsach.remove(row);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row<0 || row >jTable1.getSelectedRow()){
            JOptionPane.showMessageDialog(this,"Chon sach de chon");
        }
        else{
            jTextField1.setText(tm.getValueAt(row,0).toString());
            jTextField2.setText(tm.getValueAt(row,1).toString());
            jTextField3.setText(tm.getValueAt(row,2).toString());
            jTextField4.setText(tm.getValueAt(row,4).toString());
            for(int i=0;i<jComboBox1.getItemCount();i++){
                if(tm.getValueAt(row,3).equals(jComboBox1.getItemAt(i))){
                    jComboBox1.setSelectedIndex(i);
                    break;
                }
            }
        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        // TODO add your handling code here:
        IOFile.viet(fsach, lsach);
    }//GEN-LAST:event_btLuuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoqua;
    private javax.swing.JButton btCapnhat;
    private javax.swing.JButton btHT;
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}