/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import ConexionDB.ConexionMYSQL;
import DAO.ClsContacto;
import Entidades.Contactos;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class FrmContactos extends javax.swing.JFrame {
public FrmContactos(){
    initComponents();
    MostrarDatosDB();
//MostrarDatosEnTabla();
}/**
     * Creates new form FrmContactos
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblId = new javax.swing.JLabel();
        LblNombre = new javax.swing.JLabel();
        LblEdad = new javax.swing.JLabel();
        LblEmail = new javax.swing.JLabel();
        LblNumeroTele = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtEdad = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtNumeroDeTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblDatosDeBD = new javax.swing.JTable();
        BtnInsert = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        TxtId = new javax.swing.JTextField();
        LblInsert = new javax.swing.JLabel();
        LblUpdate = new javax.swing.JLabel();
        LblDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LblId.setText("IdContactos :");

        LblNombre.setText("Nombre :");

        LblEdad.setText("Edad :");

        LblEmail.setText("Email :");

        LblNumeroTele.setText("Numero de telefono :");

        TxtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmailActionPerformed(evt);
            }
        });

        TblDatosDeBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "IdContactos", "Nombre", "Edad", "Email", "NumeroDeTelefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblDatosDeBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblDatosDeBDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblDatosDeBD);
        if (TblDatosDeBD.getColumnModel().getColumnCount() > 0) {
            TblDatosDeBD.getColumnModel().getColumn(1).setResizable(false);
            TblDatosDeBD.getColumnModel().getColumn(2).setResizable(false);
            TblDatosDeBD.getColumnModel().getColumn(3).setResizable(false);
            TblDatosDeBD.getColumnModel().getColumn(4).setResizable(false);
        }

        BtnInsert.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnInsert.setForeground(new java.awt.Color(23, 81, 255));
        BtnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/business_application_addmale_useradd_insert_add_user_client_2312.png"))); // NOI18N
        BtnInsert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnInsert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnInsert.setIconTextGap(6);
        BtnInsert.setMaximumSize(new java.awt.Dimension(11, 31));
        BtnInsert.setMinimumSize(new java.awt.Dimension(111, 111));
        BtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertActionPerformed(evt);
            }
        });

        BtnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/refresh_update_15608.png"))); // NOI18N
        BtnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_delete_deleteusers_delete_male_user_maleclient_2348 (1).png"))); // NOI18N
        BtnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        TxtId.setEditable(false);

        LblInsert.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblInsert.setText("Insert");

        LblUpdate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblUpdate.setText("Update");

        LblDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        LblDelete.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LblEmail)
                            .addComponent(LblNumeroTele)
                            .addComponent(LblEdad)
                            .addComponent(LblId)
                            .addComponent(LblNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtId, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(TxtNombre)
                            .addComponent(TxtEdad)
                            .addComponent(TxtEmail)
                            .addComponent(TxtNumeroDeTelefono)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblInsert))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblUpdate))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDelete)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblId)
                                    .addComponent(TxtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEdad)
                            .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEmail)
                            .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNumeroTele)
                            .addComponent(TxtNumeroDeTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LblInsert)
                                .addComponent(LblUpdate))
                            .addComponent(LblDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnUpdate)
                            .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/////////////////////////////////////////////////////////////////////////////
///////////////////////
    public void MostrarDatosDB() {

        String Title[] = {"idContactos", "Nombre", "Edad", "Email", "NumeroDeTelefono"};
        DefaultTableModel Default = new DefaultTableModel(null, Title);

        ClsContacto contact = new ClsContacto();
        ArrayList<Contactos> listarC = contact.MostarDatosDeBD();
        Iterator iteracion = listarC.iterator();
        String fila[] = new String[5];

        while (iteracion.hasNext()) {
            Contactos cont = (Contactos) iteracion.next();
            fila[0] = Integer.toString(cont.getId());
            fila[1] = cont.getNombre();
            fila[2] = Integer.toString(cont.getEdad());
            fila[3] = cont.getEmail();
            fila[4] = Integer.toString(cont.getNumeroDeTelefono());
            Default.addRow(fila);
        }
        TblDatosDeBD.setModel(Default);
    }
    
    public void CargarLosDatosDeTxt(){
        
        int fila =   TblDatosDeBD.getSelectedRow();
        
        String idContactos = TblDatosDeBD.getValueAt(fila, 0).toString();
        String Nombre = TblDatosDeBD.getValueAt(fila, 1).toString();
        String Edad =  TblDatosDeBD.getValueAt(fila, 2).toString();
        String Email =  TblDatosDeBD.getValueAt(fila, 3).toString();
        String NumeroDeTelefono = TblDatosDeBD.getValueAt(fila, 4).toString();
        
        TxtId.setText(idContactos);
        TxtNombre.setText(Nombre);
        TxtEdad.setText(Edad);
        TxtEmail.setText(Email);
       TxtNumeroDeTelefono.setText(NumeroDeTelefono);

    }

    public void LimpiarDatosDeTxt(){
        
        TxtId.setText("");
        TxtNombre.setText("");
        TxtEdad.setText("");
        TxtEmail.setText("");
        TxtNumeroDeTelefono.setText("");
    }///////////////////////////////////////////////////
    

    private void TxtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmailActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
      Contactos datos = new Contactos();
        ClsContacto contacto = new ClsContacto();

        datos.setId(Integer.parseInt(TxtId.getText()));

        contacto.Delete(datos);
        CargarLosDatosDeTxt();
        LimpiarDatosDeTxt();

    }//GEN-LAST:event_BtnDeleteActionPerformed
                                          
//**
    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed
        
      Contactos conctatoss = new Contactos();
        ClsContacto UpdateContac = new ClsContacto();
        
        conctatoss.setId(Integer.parseInt(TxtId.getText()));
       conctatoss.setNombre(TxtNombre.getText());
        conctatoss.setEdad(Integer.parseInt(TxtEdad.getText()));
        conctatoss.setEmail(TxtEmail.getText());
     conctatoss.setEdad(Integer.parseInt(TxtNumeroDeTelefono.getText()));
        
        UpdateContac.Update(conctatoss);
        MostrarDatosDB();
        LimpiarDatosDeTxt();

    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void BtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertActionPerformed
         Contactos contactoss = new Contactos();
        ClsContacto InsertContac = new ClsContacto();

        contactoss.setNombre(TxtNombre.getText());
        contactoss.setEdad(Integer.parseInt(TxtEdad.getText()));
        contactoss.setEmail(TxtEmail.getText());
        contactoss.setEdad(Integer.parseInt(TxtNumeroDeTelefono.getText()));
    
    
       InsertContac .Insert(contactoss);
        MostrarDatosDB();
        LimpiarDatosDeTxt();



    }//GEN-LAST:event_BtnInsertActionPerformed

    private void TblDatosDeBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblDatosDeBDMouseClicked
        CargarLosDatosDeTxt();
    }//GEN-LAST:event_TblDatosDeBDMouseClicked


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
            java.util.logging.Logger.getLogger(FrmContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmContactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmContactos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnInsert;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JLabel LblDelete;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblId;
    private javax.swing.JLabel LblInsert;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblNumeroTele;
    private javax.swing.JLabel LblUpdate;
    private javax.swing.JTable TblDatosDeBD;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtId;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtNumeroDeTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
