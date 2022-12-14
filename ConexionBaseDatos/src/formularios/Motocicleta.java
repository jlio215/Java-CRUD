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
public class Motocicleta extends javax.swing.JFrame {

    /**
     * Creates new form Motocicleta
     */
    public Motocicleta() {
        initComponents();
        mostrar();
    }

     Connection conn = Conection.conectarDB();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActulizar = new javax.swing.JButton();
        txtidMotocicleta = new javax.swing.JTextField();
        txtautonomia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtidProveedor = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMotocicleta = new javax.swing.JTable();
        btnNuevo1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(100, 100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1417, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("idMotocicleta:");

        jLabel2.setText("autonomia:");

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

        txtautonomia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtautonomiaActionPerformed(evt);
            }
        });

        jLabel8.setText("Buscar");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel3.setText("idProveedor:");

        tablaMotocicleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaMotocicleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMotocicletaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaMotocicleta);

        btnNuevo1.setText("Volver al Inicio");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtautonomia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidMotocicleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txtidProveedor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar)
                        .addGap(22, 22, 22)
                        .addComponent(btnActulizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(btnNuevo1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidMotocicleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtautonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtidProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnActulizar)
                            .addComponent(btnGuardar)
                            .addComponent(btnNuevo))
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo1)
                        .addGap(451, 451, 451))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtautonomiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtautonomiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtautonomiaActionPerformed

    private void btnActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActulizarActionPerformed
        Actualizar();
        mostrar();
        limpiarCajas ();
    }//GEN-LAST:event_btnActulizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistro();
        limpiarCajas ();
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        crearMotocicleta();
        limpiarCajas ();
        mostrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCajas();        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaMotocicletaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMotocicletaMouseClicked
        int filaSeleccionada = tablaMotocicleta.rowAtPoint(evt.getPoint());

        txtidMotocicleta.setText(tablaMotocicleta.getValueAt(filaSeleccionada,0).toString());
        txtautonomia.setText(tablaMotocicleta.getValueAt(filaSeleccionada,1).toString());
        txtidProveedor.setText(tablaMotocicleta.getValueAt(filaSeleccionada,2).toString());
    }//GEN-LAST:event_tablaMotocicletaMouseClicked

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        Inicio a = new Inicio();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

     public void limpiarCajas (){
        txtidMotocicleta.setText("");
        txtautonomia.setText("");
        txtidProveedor.setText("");
    }
     
      public void Actualizar(){
        try{
            int filaSeleccionada = tablaMotocicleta.getSelectedRow();
            String dao = (String)tablaMotocicleta.getValueAt(filaSeleccionada,0);
                
            String sql = "UPDATE Motocicleta SET  autonomia=?, idProveedor=? WHERE idMotocicleta=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1 , txtautonomia.getText());
            statement.setString(2 , txtidProveedor.getText());
            statement.setString(3, dao);
            statement.execute();
            JOptionPane.showMessageDialog(null, "motocicleta Editada");
            
            int rowsInserted = statement.executeUpdate();            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error Editando motocicleta"+ ex);
        }
    }
      
       public void filtrar(String valor){
        String[] titulos= {"idMotocicleta", "autonomia", "idProveedor"};
        String[] registros = new String[3];
        
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql= "SELECT * FROM Motocicleta WHERE idMotocicleta LIKE '%"+valor+"%'";
        
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()){
                registros[0]=rs.getString("idMotocicleta");
                registros[1]=rs.getString("autonomia");
                registros[2]=rs.getString("idProveedor");
                
                modelo.addRow(registros);
            }
            tablaMotocicleta.setModel(modelo);
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error Mostrando Motocicleta"+ e.getMessage());
        }
        
    }
    
        public void mostrar(){
        String[] titulos= {"idMotocicleta", "autonomia", "idProveedor"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel (null,titulos);
        String sql= "SELECT * FROM Motocicleta";
        
        try {
            Statement statement= conn.createStatement();
            ResultSet rs= statement.executeQuery(sql);
            while (rs.next()){
                registros[0]=rs.getString("idMotocicleta");
                registros[1]=rs.getString("autonomia");
                registros[2]=rs.getString("idProveedor");
                modelo.addRow(registros);
            }
            tablaMotocicleta.setModel(modelo);
        }catch (Exception e){
             JOptionPane.showMessageDialog(null, "Error Mostrando Motocicleta"+ e.getMessage());
        }
        
    }
      
     public void crearMotocicleta(){
        try{
     String sql = "INSERT INTO Motocicleta (idMotocicleta, autonomia, idProveedor) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString (1 , txtidMotocicleta.getText());
            statement.setString(2 , txtautonomia.getText());
            statement.setString(3 , txtidProveedor.getText());
            
            statement.execute();
            JOptionPane.showMessageDialog(null, "Motocicleta insertada");
                      
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error insertando Motocicleta"+ ex.getMessage());
        }
    }
     
    public void eliminarRegistro(){
        int filaSeleccionada = tablaMotocicleta.getSelectedRow();
        
        try{
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM Motocicleta WHERE idMotocicleta LIKE '%"+tablaMotocicleta.getValueAt(filaSeleccionada,0)+"%'";
            int n = statement.executeUpdate(sql);
            if (n>=0){
                JOptionPane.showMessageDialog(null,"Motocicleta  Eliminado");
            }
        }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Motocicleta no Eliminado"+e.getMessage());
        }
    }
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
            java.util.logging.Logger.getLogger(Motocicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Motocicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Motocicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Motocicleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Motocicleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActulizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaMotocicleta;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtautonomia;
    private javax.swing.JTextField txtidMotocicleta;
    private javax.swing.JTextField txtidProveedor;
    // End of variables declaration//GEN-END:variables
}
