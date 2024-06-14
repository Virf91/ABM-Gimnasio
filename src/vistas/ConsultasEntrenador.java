/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entities.Clase;
import entities.Entrenador;
import enums.Especialidad;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistence.EntrenadorData;

public class ConsultasEntrenador extends javax.swing.JInternalFrame {

    private List<Entrenador> entrenadores;
    private List<Especialidad> especialidades;
    private EntrenadorData ed;
    private Entrenador entrenador;
    String[] columnNames = {"Nombre", "Apellido", "Espeialidad"};
    DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

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

    public ConsultasEntrenador() {
        entrenadores = new ArrayList<>();
        especialidades = new ArrayList<>();
        ed = new EntrenadorData();
        entrenador = new Entrenador();
        llenarEspe();
        initComponents();
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jBVerTodos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBEspecialidad = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jBPorNombre = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTEntrenadores = new javax.swing.JTable();
        jBSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("CONSULTAS ENTRENADOR");

        jBVerTodos.setText("Ver todos");
        jBVerTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVerTodosActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione la especialidad para filtrar ");

        jBEspecialidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBEspecialidad.setText("Buscar por especialidad");
        jBEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEspecialidadActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese nombre y apellido del entrenador");

        jTNombre.setText("Nombre");

        jBPorNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBPorNombre.setText("Buscar");
        jBPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPorNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Para ver todos los Entrenadores presione:");

        jTApellido.setText("Apellido");

        jTEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTEntrenadores);

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTApellido))
                                        .addComponent(jLabel3))
                                    .addGap(158, 158, 158))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jCEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(151, 151, 151)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(151, 151, 151)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBVerTodos)
                            .addComponent(jBPorNombre)
                            .addComponent(jBEspecialidad)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVerTodos)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEspecialidad)
                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPorNombre)
                    .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jBSalir)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBVerTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVerTodosActionPerformed
        entrenadores = ed.listarEntrenadores();
        String[] columnNames = {"Nombre de la clase", "Entrenador", "Horario"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

        for (Entrenador e1 : entrenadores) {
            Vector renglon = new Vector<>();
            renglon.add(e1.getNombreEntrenador());
            renglon.add(e1.getApellidoEntrenador());
            renglon.add(e1.getEspecialidad());
            model.addRow(renglon);
        }
        jTEntrenadores.setModel(model);
    }//GEN-LAST:event_jBVerTodosActionPerformed

    private void jBPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPorNombreActionPerformed
        if (jTNombre.getText().isEmpty() || jTApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        entrenador = ed.listarEntrenadoresPorNombreyApellido(jTNombre.getText(), jTApellido.getText());
        String[] columnNames = {"Nombre de la clase", "Entrenador", "Horario"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

        Vector renglon = new Vector<>();
        renglon.add(entrenador.getNombreEntrenador());
        renglon.add(entrenador.getApellidoEntrenador());
        renglon.add(entrenador.getEspecialidad());
        model.addRow(renglon);

        jTEntrenadores.setModel(model);
    }//GEN-LAST:event_jBPorNombreActionPerformed

    private void jBEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEspecialidadActionPerformed
        if (jCEspecialidad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar la especialidad", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String[] columnNames = {"Nombre de la clase", "Entrenador", "Horario"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
        Especialidad enume =  (Especialidad) jCEspecialidad.getSelectedItem();
        try {
            entrenadores = ed.listarEntrenadoresPorEspecialidad(enume.name());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasEntrenador.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (Entrenador e1 : entrenadores) {
            Vector renglon = new Vector<>();
            renglon.add(e1.getNombreEntrenador());
            renglon.add(e1.getApellidoEntrenador());
            renglon.add(e1.getEspecialidad());
            model.addRow(renglon);
        }
        jTEntrenadores.setModel(model);
    }//GEN-LAST:event_jBEspecialidadActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEspecialidad;
    private javax.swing.JButton jBPorNombre;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBVerTodos;
    private javax.swing.JComboBox<Especialidad> jCEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTable jTEntrenadores;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
