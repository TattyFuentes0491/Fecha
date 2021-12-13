/*
7.  Cree una clase llamada Fecha, que incluya tres piezas de información como variables de instancia 
—un mes(tipo int), un día (tipo int) y un año (tipo int). Su clase debe tener un constructor que 
inicialice las tres variables de instancia, y debe asumir que los valores que se proporcionan son correctos. 
Proporcione un método establecer y un método obtener para cada variable de instancia. 
Proporcione un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/). 
Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
 */
package fecha;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class Prueba_Fecha extends javax.swing.JFrame {
    
    Fecha fch = new Fecha();

    public Prueba_Fecha() {
        initComponents();
        jBtnActualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuFecha = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTxtFldDia = new javax.swing.JTextField();
        jTxtFldMes = new javax.swing.JTextField();
        jTxtFldAno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBtnMostrarFecha = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFecha = new javax.swing.JTable();
        jBtnExportar = new javax.swing.JButton();
        jLblFechaCompleta = new javax.swing.JLabel();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.setToolTipText("");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        jPopupMenuFecha.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        jPopupMenuFecha.add(jMenuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                      Fecha");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("    Día");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("   Mes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("   Año");

        jLabel5.setText("/");

        jLabel6.setText("/");

        jBtnMostrarFecha.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnMostrarFecha.setText("Mostrar Fceha");
        jBtnMostrarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMostrarFechaActionPerformed(evt);
            }
        });

        jBtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jBtnActualizar.setText("Actualizar");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });

        jTableFecha.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableFecha.setComponentPopupMenu(jPopupMenuFecha);
        jScrollPane1.setViewportView(jTableFecha);

        jBtnExportar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBtnExportar.setText("Exportar");
        jBtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtnExportar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBtnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jBtnMostrarFecha))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtFldDia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtFldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTxtFldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jLblFechaCompleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFldMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLblFechaCompleta, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnMostrarFecha)
                    .addComponent(jBtnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnExportar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExportarActionPerformed
        //exportar datos a un archivo de texto
        fch.crearArchivo(jTableFecha);
    }//GEN-LAST:event_jBtnExportarActionPerformed

    private void jBtnMostrarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMostrarFechaActionPerformed
        // añadimos registro a la tabla  
        String fechaCompleta;
        int d,m,a;
        d=Integer.parseInt(jTxtFldDia.getText());
        m=Integer.parseInt(jTxtFldMes.getText());
        a=Integer.parseInt(jTxtFldAno.getText());
        fch.llenarTabla(d, m, a, "", jTableFecha);
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnMostrarFechaActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        //fecha
        String fechArr;
        //instanciamos la tabla
        DefaultTableModel tb = (DefaultTableModel) jTableFecha.getModel();
        if (jTableFecha.getSelectedRow()>=0){ // nos paramos ne la fila seleccionada
            //reasignamos en las cajas de texto los valores de la tabla
            jLblFechaCompleta.setText(jTableFecha.getValueAt(jTableFecha.getSelectedRow(), 0).toString());
            //distribuimos la fecha a sus campos correspondientes
            fechArr=jLblFechaCompleta.getText();
            String[] prtfecha = fechArr.split("\\/");
            jTxtFldDia.setText(prtfecha[0]);
            jTxtFldMes.setText(prtfecha[1]);
            jTxtFldAno.setText(prtfecha[2]);            
        } 
        jBtnActualizar.setVisible(true);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActualizarActionPerformed
        //creamos atributos
        int d,m,a;
        d=Integer.parseInt(jTxtFldDia.getText());
        m=Integer.parseInt(jTxtFldMes.getText());
        a=Integer.parseInt(jTxtFldAno.getText());
        //guaradr datos modificados
        int filaSelec=0;
        filaSelec= jTableFecha.getSelectedRow();
        fch.guardarDatosModificados(jTableFecha, filaSelec,d,m,a,"");
        limpiarCajaTexto();
    }//GEN-LAST:event_jBtnActualizarActionPerformed

    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // eliminar un registro
        fch.eliminaRegistro(jTableFecha);
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

     private void limpiarCajaTexto(){
        //limpiamos las cajas de texto
        jTxtFldDia.setText(null);
        jTxtFldMes.setText(null);
        jTxtFldAno.setText(null);
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
            java.util.logging.Logger.getLogger(Prueba_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_Fecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_Fecha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnExportar;
    private javax.swing.JButton jBtnMostrarFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLblFechaCompleta;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenuFecha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFecha;
    private javax.swing.JTextField jTxtFldAno;
    private javax.swing.JTextField jTxtFldDia;
    private javax.swing.JTextField jTxtFldMes;
    // End of variables declaration//GEN-END:variables
}
