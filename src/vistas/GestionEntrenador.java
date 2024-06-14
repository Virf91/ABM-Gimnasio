/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entities.Entrenador;
import enums.Especialidad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistence.EntrenadorData;

/**
 *
 * @author carba
 */
public class GestionEntrenador extends javax.swing.JInternalFrame {

    private List<Especialidad> especialidades;
    private EntrenadorData ed;
    private Entrenador entrenador;
    private List<Entrenador> entrenadores;

    public GestionEntrenador() {
        ed = new EntrenadorData();
        entrenador = new Entrenador();
        entrenadores = ed.listarEntrenadores();
        especialidades = new ArrayList<>();
        llenarEspe();
        initComponents();
        llenarCombo();
    }

    private void llenarCombo() {
        if (especialidades.isEmpty()) {
            System.out.println("lista de entrenadores vacia");
        } else {
            for (Especialidad esp : especialidades) {
                jCEspecialidad.addItem(esp);
            }
        }
    }

    private void llenarEspe() {
        for (Especialidad especialidad : Especialidad.values()) {
            especialidades.add(especialidad);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDatosEntrenador = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLEspecialidad = new javax.swing.JLabel();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jRBEstado = new javax.swing.JRadioButton();
        jLEstado = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLDatosEntrenador.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLDatosEntrenador.setText("DATOS ENTRENADOR");

        jLNombre.setText("Nombre");

        jLApellido.setText("Apellido");

        jLDNI.setText("DNI");

        jLEspecialidad.setText("Especialidad");

        jRBEstado.setSelected(true);
        jRBEstado.setText("Habiliado");

        jLEstado.setText("Estado");

        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(216, 216, 216)
                                .addComponent(jLDatosEntrenador))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLNombre)
                                                    .addComponent(jLApellido))
                                                .addGap(46, 46, 46)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTNombre)
                                                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLEspecialidad)
                                                    .addComponent(jLEstado))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jRBEstado)
                                                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLDNI)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jBGuardar))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLDatosEntrenador)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLDNI)
                    .addComponent(jLNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEspecialidad)
                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEstado)
                    .addComponent(jLEstado))
                .addGap(67, 67, 67)
                .addComponent(jBGuardar)
                .addGap(0, 329, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTNombre.getText().isEmpty()
                || jTApellido.getText().isEmpty()
                || jTDni.getText().isEmpty()
                || jCEspecialidad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ed.buscarPorDni(jTDni.getText()) == null) {
            String nombreEntrenador = jTNombre.getText();
            String apellidoEntrenador = jTApellido.getText();
            String dniEntrenador = jTDni.getText();
            Especialidad enume =  (Especialidad) jCEspecialidad.getSelectedItem();
            String especialidad = enume.name();
            boolean estado = jRBEstado.isSelected();
            Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, dniEntrenador, especialidad, estado);
            ed.agregarEntrenador(entrenador);
        } else {
            JOptionPane.showMessageDialog(this, "ya existe un entrenador con ese dni");
        }
        limpiarCampos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void limpiarCampos() {
        jTNombre.setText("");
        jCEspecialidad.setSelectedIndex(0);
        jTApellido.setText("");
        jTDni.setText("");
        jRBEstado.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Especialidad> jCEspecialidad;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDatosEntrenador;
    private javax.swing.JLabel jLEspecialidad;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
