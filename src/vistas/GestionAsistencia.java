package vistas;

import entities.Asistencia;
import entities.Clase;
import entities.Membresia;
import entities.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistence.AsistenciaData;
import persistence.ClaseData;
import persistence.MembresiaData;
import persistence.SocioData;

public class GestionAsistencia extends javax.swing.JInternalFrame {

    private SocioData socioData = new SocioData();
    private ClaseData claseData = new ClaseData();
    private AsistenciaData asistenciaDAta = new AsistenciaData();
    private Socio socioAsistencia;
    private List<Clase> clases = new ArrayList<>();
    private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }
    };

    public GestionAsistencia() {
        initComponents();
        this.clases = claseData.listarClases();
        socioAsistencia = new Socio();
        llenarCombo();
        llenarComboBoxClases();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTDniSocio = new javax.swing.JTextField();
        jBBuscarSocio = new javax.swing.JButton();
        jTFNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBClase = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jCBHorario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jTFApellido = new javax.swing.JTextField();
        jBBuscarClases = new javax.swing.JButton();
        jBBuscarHorario = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONTROL DE ASISTENCIA");

        jLabelDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDNI.setText("DNI");

        jTDniSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jBBuscarSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBBuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscarSocio.setText("Buscar");
        jBBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarSocioActionPerformed(evt);
            }
        });

        jTFNombre.setEditable(false);
        jTFNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Clase");

        jCBClase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Horario");

        jCBHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTClases);

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTFApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jBBuscarClases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscarClases.setText("Buscar");
        jBBuscarClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarClasesActionPerformed(evt);
            }
        });

        jBBuscarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscarHorario.setText("Buscar");
        jBBuscarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscarClases)
                    .addComponent(jLabelDNI))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jBBuscarSocio))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel5)))
                                .addGap(127, 127, 127)
                                .addComponent(jLabel3))
                            .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(217, 217, 217)
                                        .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jBBuscarHorario)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(52, 52, 52))))
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel1)
                .addGap(242, 242, 242)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI)
                            .addComponent(jTDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarSocio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarClases)
                    .addComponent(jBBuscarHorario))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jBSalir))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarSocioActionPerformed
        String dni = jTDniSocio.getText();
        Boolean socioHabilitado = false;

        try {
            // buscar socio por DNI
            socioAsistencia = socioData.buscarSocioPorDni(dni);

            if (dni.isEmpty()) { // valido el campo
                JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
                return;
            }

            if (socioAsistencia != null) {
                int idsocio = socioAsistencia.getIdSocio();
                jTFNombre.setText(socioAsistencia.getNombreSocio());
                jTFApellido.setText(socioAsistencia.getApellidoSocio());
                llenarComboBoxClases();

                // busco si tiene membresia el socio y la cantidad de pases
                MembresiaData membresiaData = new MembresiaData();
                Membresia membresiaSocio = membresiaData.MembresiaxSocio(socioAsistencia);

                if (membresiaSocio != null) {
                    int cantPases = membresiaSocio.getCantPases();
                    if (cantPases > 0) {
                        socioHabilitado = true;
                        buscarClasesDisponibles();
                    } else {
                        JOptionPane.showMessageDialog(this, "No tiene pases disponibles");
                        socioHabilitado = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No tiene membresia disponible");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el socio.");
        }
    }//GEN-LAST:event_jBBuscarSocioActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarClasesActionPerformed
        try {
            String c = String.valueOf(jCBClase.getSelectedItem());

            clases = asistenciaDAta.obtenerClasesDisponibles(c);

            String[] columnNames = {"Nombre de la clase", "Capacidad", "Horario", "id_clase"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            if (clases == null) {

                JOptionPane.showMessageDialog(null, "La clase esta completa");

            }
            int capacidadActual;
            for (Clase clase1 : clases) {
                capacidadActual = (clase1.getCapacidad() - asistenciaDAta.obtenerCapacidadActual(clase1.getNombreClase()));
                Vector renglon = new Vector<>();
                renglon.add(clase1.getNombreClase());
                renglon.add(capacidadActual);// capacidad de la clase - cantidad de asistencias a esa clase
                renglon.add(clase1.getHorarioClase());
                renglon.add(clase1.getIdClase());

                model.addRow(renglon);
            }
            jTClases.setModel(model);

        } catch (Exception e) {
            // Manejar la excepción de manera adecuada
            e.printStackTrace(); // o muestra un mensaje de error en la interfaz
        }
    }//GEN-LAST:event_jBBuscarClasesActionPerformed

    private void jBBuscarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHorarioActionPerformed

        buscarClasesDisponibles();
    }//GEN-LAST:event_jBBuscarHorarioActionPerformed

    // se selecciona la clase de la lista que viene con las clases 
    //disponibles en esos horarios y que tengan cupo
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
try {
        ClaseData claseSel = new ClaseData();
        Clase clase = new Clase();
        AsistenciaData asistenciaData = new AsistenciaData();

        if (socioAsistencia != null) {
            System.out.println(socioAsistencia.getApellidoSocio());
            String[] valoresSeleccionados = obtenerValoresSeleccionados();
            
            if (valoresSeleccionados.length < 4) {
                throw new IllegalArgumentException("Deberán completarse todos los campos");
            }

            String nombreClase = valoresSeleccionados[0];
            String capacidad = valoresSeleccionados[1];
            String horarioClase = valoresSeleccionados[2];
            int id_clase = Integer.parseInt(valoresSeleccionados[3]);

            if (nombreClase.isEmpty() || capacidad.isEmpty() || horarioClase.isEmpty()) {
                throw new IllegalArgumentException("Deberán completarse todos los campos");
            }

            clase = claseSel.listarClasesPorId(id_clase);

            if (clase != null) {
                Asistencia asistenciaSocio = new Asistencia(socioAsistencia, clase, LocalDate.now());
                asistenciaData.agregarAsistencia(asistenciaSocio);
            } else {
                JOptionPane.showMessageDialog(null, "Clase no encontrada.");
                return;
            }

            MembresiaData membresiaData = new MembresiaData();
            Membresia membresia = membresiaData.MembresiaxSocio(socioAsistencia);
            System.out.println("id membresia del q se va a descontar " + membresia.getIdMembresia());

            if (membresia != null && membresia.getCantPases() > 0) {
                membresia.setCantPases(membresia.getCantPases() - 1);
                membresiaData.actualizarMembresia(membresia);
            } else {
                JOptionPane.showMessageDialog(null, "El socio no tiene pases disponibles.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Socio no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar los datos. Verifique que los campos sean correctos.");
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(null, e.getMessage());
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado: " + e.getMessage());
    }



//        ClaseData claseSel = new ClaseData();
//        Clase clase = new Clase();
//        AsistenciaData asistenciaData = new AsistenciaData();
//        System.out.println(socioAsistencia.getApellidoSocio());
//        if (socioAsistencia != null) {
//            String[] valoresSeleccionados = obtenerValoresSeleccionados();
//            String nombreClase = valoresSeleccionados[0];
//            String capacidad = valoresSeleccionados[1];
//            String horarioClase = valoresSeleccionados[2];
//            int id_clase = Integer.parseInt(valoresSeleccionados[3]);
//
//            clase = claseSel.listarClasesPorId(id_clase);
//
//            if (clase != null) {
//                Asistencia asistenciaSocio = new Asistencia(socioAsistencia, clase, LocalDate.now());
//
//                asistenciaData.agregarAsistencia(asistenciaSocio);
//            } else {
//                JOptionPane.showMessageDialog(null, "Clase no encontrada.");
//            }
//            MembresiaData membresiaData = new MembresiaData();
//            Membresia membresia = membresiaData.MembresiaxSocio(socioAsistencia);
//            System.out.println("id membresia del q se va a descontar " + membresia.getIdMembresia());
//
//            if (membresia != null && membresia.getCantPases() > 0) {
//                membresia.setCantPases(membresia.getCantPases() - 1);
//                membresiaData.actualizarMembresia(membresia);
//            } else {
//                JOptionPane.showMessageDialog(null, "El socio no tiene pases disponibles.");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(null, "Socio no encontrado.");
//        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private String[] obtenerValoresSeleccionados() {
        int selectedRow = jTClases.getSelectedRow();
        String[] valores = new String[4];

        if (selectedRow != -1) {
            valores[0] = jTClases.getValueAt(selectedRow, 0).toString(); // Nombre de la clase en la columna 1
            valores[1] = jTClases.getValueAt(selectedRow, 1).toString(); // capacidad en la columna 2
            valores[2] = jTClases.getValueAt(selectedRow, 2).toString(); // Horario en la columna 3
            valores[3] = jTClases.getValueAt(selectedRow, 3).toString(); // idclase en la columna 4
        }

        return valores;
    }

// busco clases disponibles desde el horario de inicio, ya que las 
    //clases tienen horario de inicio solamente
    private void buscarClasesPorHorario(LocalTime horaInicio) {
        System.out.println("buscando clases");
        clases = claseData.buscarPorHorario(horaInicio);
        String[] columnNames = {"Nombre de la clase", "Capacidad", "Horario", "id_clase"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        int capacidadActual;
        for (Clase clase1 : clases) {
            capacidadActual = (clase1.getCapacidad() - asistenciaDAta.obtenerCapacidadActual(clase1.getNombreClase()));
            if (capacidadActual == 0) {
                JOptionPane.showMessageDialog(null, clase1.getNombreClase() + " esta completa");
            }
            Vector renglon = new Vector<>();
            renglon.add(clase1.getNombreClase());
            renglon.add(capacidadActual);// capacidad de la clase - cantidad de asistencias a esa clase
            renglon.add(clase1.getHorarioClase());
            renglon.add(clase1.getIdClase());
            model.addRow(renglon);
        }
        jTClases.setModel(model);
    }

    private void buscarClasesDisponibles() {
        switch (jCBHorario.getSelectedItem().toString()) {
            case "08:00":
                buscarClasesPorHorario(LocalTime.of(8, 0));
                break;
            case "09:00":
                buscarClasesPorHorario(LocalTime.of(9, 0));
                break;
            case "10:00":
                buscarClasesPorHorario(LocalTime.of(10, 0));
                break;
            case "11:00":
                buscarClasesPorHorario(LocalTime.of(11, 0));
                break;
            case "12:00":
                buscarClasesPorHorario(LocalTime.of(12, 0));
                break;
            case "13:00":
                buscarClasesPorHorario(LocalTime.of(13, 0));
                break;
            case "14:00":
                buscarClasesPorHorario(LocalTime.of(14, 0));
                break;
            case "15:00":
                buscarClasesPorHorario(LocalTime.of(15, 0));
                break;
            case "16:00":
                buscarClasesPorHorario(LocalTime.of(16, 0));
                break;
            case "17:00":
                buscarClasesPorHorario(LocalTime.of(17, 0));
                break;
            case "18:00":
                buscarClasesPorHorario(LocalTime.of(18, 0));
                break;
            case "19:00":
                buscarClasesPorHorario(LocalTime.of(19, 0));
                break;
            case "20:00":
                buscarClasesPorHorario(LocalTime.of(20, 0));
                break;
            case "21:00":
                buscarClasesPorHorario(LocalTime.of(21, 0));
                break;
            default:
                // Manejo de un caso por defecto si es necesario
                break;
        }
    }

    private void llenarComboBoxClases() {
        jCBClase.removeAllItems();
        try {
            // List<Clase> clases = claseData.buscarClasesPorSocio(idSocio);
            for (Clase clase : clases) {
                jCBClase.addItem(clase);
            }
            if (!clases.isEmpty()) {
                llenarComboBoxHorarios(clases.get(0));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar las clases.");
        }
    }

    private void llenarComboBoxHorarios(Clase clase) {
        jCBHorario.removeAllItems();
        jCBHorario.addItem("08:00");
        jCBHorario.addItem("09:00");
        jCBHorario.addItem("10:00");
        jCBHorario.addItem("11:00");
        jCBHorario.addItem("12:00");
        jCBHorario.addItem("13:00");
        jCBHorario.addItem("14:00");
        jCBHorario.addItem("15:00");
        jCBHorario.addItem("16:00");
        jCBHorario.addItem("17:00");
        jCBHorario.addItem("18:00");
        jCBHorario.addItem("19:00");
        jCBHorario.addItem("20:00");
        jCBHorario.addItem("21:00");

    }

    private void llenarCombo() {

        jCBClase.removeAllItems(); // Limpiar ComboBox
        for (Clase clase : clases) {
            jCBClase.addItem(clase);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarClases;
    private javax.swing.JButton jBBuscarHorario;
    private javax.swing.JButton jBBuscarSocio;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox<Clase> jCBClase;
    private javax.swing.JComboBox<String> jCBHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTDniSocio;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
