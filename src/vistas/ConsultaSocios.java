/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entities.Socio;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistence.SocioData;

/**
 *
 * @author carba
 */
public class ConsultaSocios extends javax.swing.JInternalFrame {

    private List<Socio> socios;
    private DefaultTableModel tabla = new DefaultTableModel();

    /**
     * Creates new form ConsultaSocios
     */
    public ConsultaSocios() {
        initComponents();
        jTCorreo.setEditable(false);
        jTEdad.setEditable(false);
        jTTelefono.setEditable(false);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTId_Socio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBNuevaBusqueda = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

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
        jScrollPane1.setViewportView(jTable1);

        setTitle("CONSULTA SOCIOS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTA DE SOCIOS");

        jLabel3.setText("Nombre");

        jLabel4.setText("Por Nro Socio");

        jLabel5.setText("Apellido");

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevaBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jBNuevaBusqueda.setText("Limpar campos");
        jBNuevaBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevaBusquedaActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jBEliminar.setText(" Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("DNI");

        jLabel6.setText("Edad");

        jLabel7.setText("Correo");

        jLabel8.setText("Telefono");

        jRBEstado.setText("Estado");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(170, 170, 170)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTEdad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTId_Socio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTApellido)
                                .addComponent(jTCorreo)
                                .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jRBEstado))
                        .addGap(115, 115, 115))
                    .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jBBuscar)
                .addGap(59, 59, 59)
                .addComponent(jBNuevaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel9))
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTId_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jRBEstado)))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBNuevaBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241)
                .addComponent(jBSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        SocioData socioData = new SocioData();
        try {
            String nroSocio = jTId_Socio.getText();
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            String dni = jTDni.getText();

            if (nombre.isEmpty() && apellido.isEmpty() && nroSocio.isEmpty()&& dni.isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Debe ingresar al menos un criterio de búsqueda", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
//busco socio por id socio, cdo nombre y apellido socio vacio y dni vacio 
            if (!nroSocio.isEmpty()&&nombre.isEmpty() && apellido.isEmpty()&& dni.isEmpty()) {
                int id_socio = Integer.parseInt(nroSocio);
                Socio socio = socioData.buscarSocio(id_socio);
                llenarCampos(socio);
                 
                // busco socio por nombre y apellido
            } else if(nroSocio.isEmpty()&&!nombre.isEmpty() && !apellido.isEmpty()&& dni.isEmpty()){ // busco socio por nombre y apellido
                Socio socio1 = socioData.buscarSociosPorNombreyApellido(nombre, apellido);
                llenarCampos(socio1);
                jTId_Socio.setText(String.valueOf(socio1.getIdSocio()));
            }else{
                // busco socio por dni
                Socio socio2 = socioData.buscarSocioPorDni(dni);
                llenarCampos(socio2);
                jTId_Socio.setText(String.valueOf(socio2.getIdSocio()));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el Nro a número: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBuscarActionPerformed
private void llenarCampos(Socio socio){
                if (socio != null) {
                    jTCorreo.setText(socio.getCorreoSocio());
                    jTDni.setText(socio.getDniSocio());
                    jTEdad.setText(String.valueOf(socio.getEdadSocio()));
                    jTNombre.setText(socio.getNombreSocio());
                    jTApellido.setText(socio.getApellidoSocio());
                    jTTelefono.setText(socio.getTelefonoSocio());                  
                    
                // busco estado para cambiar JRB
                    if (socio.getEstado() == 1) {
                        jRBEstado.setSelected(true);
                    } else {
                        jRBEstado.setSelected(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "--Socio no encontrado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }

}
    

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        try {
            String nroSocio = jTId_Socio.getText();

            if (!jTId_Socio.getText().isEmpty() || !jTApellido.getText().isEmpty() || !jTNombre.getText().isEmpty()) {
                String dniText = jTId_Socio.getText();

                if (dniText.isEmpty()) {
                    throw new IllegalArgumentException("El campo DNI no puede estar vacío.");
                }

                int id_socio = Integer.parseInt(nroSocio); // Convertir el texto a un número entero

                // Llamar al método 
                SocioData socioData = new SocioData();
                socioData.eliminarSocioPorId(id_socio);

                // Limpiar los campos
                limpiarCampos();

                JOptionPane.showMessageDialog(null, "Socio eliminado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            } else {
                throw new IllegalArgumentException("Debe llenar al menos uno de los campos: DNI, Apellido o Nombre.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El DNI debe ser un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBNuevaBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevaBusquedaActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jBNuevaBusquedaActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    private boolean validaEntero(String texto) {
        try {
            if (!texto.matches("^\\d+$")) {
// no es un numero entero
                return false;
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
            return false;
        }
    }

    private void limpiarCampos() {
        jTId_Socio.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jTTelefono.setText("");
        jTDni.setText("");
        jTCorreo.setText("");
        jTEdad.setText("");
        jRBEstado.setSelected(false);
       
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBNuevaBusqueda;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTEdad;
    private javax.swing.JTextField jTId_Socio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
