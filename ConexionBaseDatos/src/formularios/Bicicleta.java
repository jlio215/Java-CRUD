/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import conexionbasedatos.Conection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jlio
 */
public class Bicicleta extends javax.swing.JFrame {

    /**
     * Creates new form Bicicleta
     */
    public Bicicleta() {
        initComponents();
        mostrar();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActulizar = new javax.swing.JButton();
        txtidBicicleta = new javax.swing.JTextField();
        txtanioConstruccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaBicicleta = new javax.swing.JTable();
        btnNuevo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("idBicicleta:");

        jLabel2.setText("anioConstruccion:");

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActulizar.setText("Actualizar");
        btnActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActulizarActionPerformed(evt);
            }
        });

        txtanioConstruccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanioConstruccionActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tablaBicicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaBicicleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaBicicletaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaBicicleta);

        btnNuevo1.setText("Volver al Inicio");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtanioConstruccion, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(txtidBicicleta)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(26, 26, 26)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActulizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnNuevo1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(31, 31, 31)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtidBicicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtanioConstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)
                            .addComponent(btnActulizar))
                        .addGap(36, 36, 36)
                        .addComponent(btnNuevo1)
                        .addGap(320, 320, 320))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCajas();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        crearBicicleta();
        limpiarCajas ();
        mostrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistro();
        limpiarCajas ();
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        Actualizar();
        mostrar();
        limpiarCajas ();
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void txtanioConstruccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanioConstruccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtanioConstruccionActionPerformed

    private void tablaBicicletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaBicicletaMouseClicked

        int filaSeleccionada = tablaBicicleta.rowAtPoint(evt.getPoint());

        txtidBicicleta.setText(tablaBicicleta.getValueAt(filaSeleccionada,0).toString());
        txtanioConstruccion.setText(tablaBicicleta.getValueAt(filaSeleccionada,1).toString());
    }//GEN-LAST:event_tablaBicicletaMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed

    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Bicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bicicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bicicleta().setVisible(true);
            }
        });
    }
    Connection conn = Conection.conectarDB();
    
     public void filtrar(String valor){
        String[] titulos= {"idBicicleta","anioConstruccion"};
        String[] registros = new String[2];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql= "SELECT * FROM Bicicleta WHERE idBicicleta LIKE '%"+valor+"%'";
        
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()){
                registros[0]=rs.getString("idBicicleta");
                registros[1]=rs.getString("anioConstruccion");
                
                modelo.addRow(registros);
            }
            tablaBicicleta.setModel(modelo);
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error Mostrando Bicicleta"+ e.getMessage());
        }
        
    }
    
    public void mostrar(){
        String[] titulos= {"idBicicleta","anioConstruccion"};
        String[] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql= "SELECT * FROM Bicicleta";
        
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()){
                registros[0]=rs.getString("idBicicleta");
                registros[1]=rs.getString("anioConstruccion");
                
                modelo.addRow(registros);
            }
            tablaBicicleta.setModel(modelo);
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error Mostrando Bicicleta"+ e.getMessage());
        }
        
    }
    
     public void limpiarCajas (){
        txtidBicicleta.setText("");
        txtanioConstruccion.setText("");       
    }
     
    public void Actualizar(){
        try{
            int filaSeleccionada = tablaBicicleta.getSelectedRow();
            String dao = (String)tablaBicicleta.getValueAt(filaSeleccionada,0);
                
            String sql = "UPDATE Bicicleta SET  anioConstruccion=? WHERE idBicicleta=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1 , txtanioConstruccion.getText());
            
            statement.setString(2, dao);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Bicicleta Editada");
            
            int rowsInserted = statement.executeUpdate();            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Editando Bicicleta"+ ex);
        }
    }
    
     public void crearBicicleta(){
        try{
     String sql = "INSERT INTO Bicicleta (idBicicleta, anioConstruccion) VALUES (?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString (1 , txtidBicicleta.getText());
            statement.setString(2 , txtanioConstruccion.getText());
            
            statement.execute();
            JOptionPane.showMessageDialog(null, "Bicicleta insertada");
                      
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error insertando Bicicleta"+ ex.getMessage());
        }
    }
     
    public void eliminarRegistro(){
        int filaSeleccionada = tablaBicicleta.getSelectedRow();
        
        try{
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM Bicicleta WHERE idBicicleta LIKE '%"+tablaBicicleta.getValueAt(filaSeleccionada,0)+"%'";
            int n = statement.executeUpdate(sql);
            if (n>=0){
                JOptionPane.showMessageDialog(null,"Bicicleta  Eliminado");
            }
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Bicicleta no Eliminado"+e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaBicicleta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtanioConstruccion;
    private javax.swing.JTextField txtidBicicleta;
    // End of variables declaration//GEN-END:variables
}
