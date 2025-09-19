/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import Controllers.ControllerPersona;
import Models.ModelPersona;
import Controllers.ControllerRoles;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class JFramePersona extends javax.swing.JFrame {
    private String Nombre, Apellidos, Correo, Pais, Profesion;
    
    public JFramePersona() {
        initComponents();
        //cargarRolesEnCombo();
        listarTabla();
        jTextFieldId.setVisible(false); // ✅ Oculta el campo ID

        
        Controllers.ControllerRoles rolControl = new Controllers.ControllerRoles();
        List<Models.ModelRoles> listaRoles = rolControl.ObtenerRoles();
        for (Models.ModelRoles rol : listaRoles) {
            jComboBoxRol.addItem(rol.getNombre());
            System.out.println("Roles Traídos: " + rol.getNombre());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldPais = new javax.swing.JTextField();
        jDateChooserFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldProfesion = new javax.swing.JTextField();
        jComboBoxRol = new javax.swing.JComboBox<>();
        jTextFieldConsultar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonas = new javax.swing.JTable();
        jTextFieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos de la Persona"));

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Correo");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Pais");

        jLabel7.setText("Profesion");

        jLabel8.setText("Rol");

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });

        jTextFieldPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPaisActionPerformed(evt);
            }
        });

        jTextFieldApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidosActionPerformed(evt);
            }
        });

        jComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRolActionPerformed(evt);
            }
        });

        jTextFieldConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultarActionPerformed(evt);
            }
        });

        jLabel9.setText("Consultar");

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Eliminar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Actualizar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jComboBoxRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(119, 119, 119))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonLimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jDateChooserFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jTextFieldProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jComboBoxRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonLimpiar))
                .addGap(18, 18, 18))
        );

        jTablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTablePersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePersonas);

        jTextFieldId.setText("jTextField1");
        jTextFieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdActionPerformed(evt);
            }
        });

        jLabel1.setText("CRUD con JAVA-MVC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(525, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // Validaciones rápidas
        if (jTextFieldNombre.getText().isEmpty() ||
            jTextFieldApellidos.getText().isEmpty() ||
            jTextFieldCorreo.getText().isEmpty() ||
            jDateChooserFechaNacimiento.getDate() == null ||
            jTextFieldPais.getText().isEmpty() ||
            jTextFieldProfesion.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                "Por favor complete todos los campos.",
                "Validación",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crear objeto persona
        ModelPersona p = new ModelPersona();
        p.setNombre(jTextFieldNombre.getText().trim());
        p.setApellidos(jTextFieldApellidos.getText().trim());
        p.setCorreo(jTextFieldCorreo.getText().trim());
        p.setFechaNacimiento(jDateChooserFechaNacimiento.getDate());
        p.setPais(jTextFieldPais.getText());
        p.setProfesion(jTextFieldProfesion.getText().trim());
        p.setRol_id(jComboBoxRol.getSelectedIndex() + 1); // 1=Admin, 2=Usuario, 3=Invitado

        // Llamar al controlador
        ControllerPersona ctrl = new ControllerPersona();
        if (ctrl.insertar(p)) {
            JOptionPane.showMessageDialog(this, "Persona registrada correctamente.");
            limpiarCampos();
            listarTabla(); // Actualiza la JTable si la tienes
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar en la base de datos.");
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        String idText = jTextFieldId.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione una persona de la tabla o ingrese un ID válido.",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "El ID debe ser un número válido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (jTextFieldId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Seleccione una persona de la tabla.");
            return;
        }

        ModelPersona p = new ModelPersona();
        p.setId(Integer.parseInt(jTextFieldId.getText()));
        p.setNombre(jTextFieldNombre.getText());
        p.setApellidos(jTextFieldApellidos.getText());
        p.setCorreo(jTextFieldCorreo.getText());
        p.setFechaNacimiento(jDateChooserFechaNacimiento.getDate());
        p.setPais(jTextFieldPais.getText());
        p.setProfesion(jTextFieldProfesion.getText());
        p.setRol_id(jComboBoxRol.getSelectedIndex() + 1);

        ControllerPersona ctrl = new ControllerPersona();
        if (ctrl.actualizar(p)) {
            JOptionPane.showMessageDialog(this, "Persona actualizada.");
            limpiarCampos();
            listarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al actualizar.");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        String idText = jTextFieldId.getText().trim();

        if (idText.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione una persona de la tabla o ingrese un ID válido.",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "El ID debe ser un número válido.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, 
                "¿Está seguro de eliminar esta persona?", 
                "Confirmar", 
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            ControllerPersona ctrl = new ControllerPersona();
            if (ctrl.eliminar(id)) {
                JOptionPane.showMessageDialog(this, "Persona eliminada.");
                limpiarCampos();
                listarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar.");
            }
        }
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
            // TODO add your handling code here:
            String nomBuscado = jTextFieldConsultar.getText().trim();
        if (nomBuscado.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Escriba el nombre a buscar.",
                    "Validación",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        ControllerPersona ctrl = new ControllerPersona();
        ModelPersona p = ctrl.buscarPorNombre(nomBuscado);

        if (p == null) {
            JOptionPane.showMessageDialog(this,
                    "No se encontró persona con nombre: " + nomBuscado,
                    "Sin resultados",
                    JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();          // opcional
            return;
        }

        // ---- Cargar datos en el formulario ----
        jTextFieldId.setText(String.valueOf(p.getId()));
        jTextFieldNombre.setText(p.getNombre());
        jTextFieldApellidos.setText(p.getApellidos());
        jTextFieldCorreo.setText(p.getCorreo());
        jDateChooserFechaNacimiento.setDate(p.getFechaNacimiento());
        jTextFieldPais.setText(p.getPais());
        jTextFieldProfesion.setText(p.getProfesion());
        jComboBoxRol.setSelectedIndex(p.getRol_id() - 1);
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jComboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRolActionPerformed

    private void jTextFieldApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidosActionPerformed

    private void jTextFieldPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPaisActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

    private void jTextFieldConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdActionPerformed
        // TODO add your handling code here:
        jTextFieldId.setVisible(false);
    }//GEN-LAST:event_jTextFieldIdActionPerformed

    private void jTablePersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonasMouseClicked
        // TODO add your handling code here:
        int fila = jTablePersonas.getSelectedRow(); // ✅ DECLARAR PRIMERO
        if (fila >= 0) {
            // Obtener valores de la fila seleccionada
            int id = (int) jTablePersonas.getValueAt(fila, 0);
            String nombre = (String) jTablePersonas.getValueAt(fila, 1);
            String apellidos = (String) jTablePersonas.getValueAt(fila, 2);
            String correo = (String) jTablePersonas.getValueAt(fila, 3);
            java.util.Date fecha = (java.util.Date) jTablePersonas.getValueAt(fila, 4);
            String pais = (String) jTablePersonas.getValueAt(fila, 5);
            String profesion = (String) jTablePersonas.getValueAt(fila, 6);
            String rolNombre = (String) jTablePersonas.getValueAt(fila, 7);

            // Cargar en el formulario
            jTextFieldId.setText(String.valueOf(id));
            jTextFieldNombre.setText(nombre);
            jTextFieldApellidos.setText(apellidos);
            jTextFieldCorreo.setText(correo);
            jDateChooserFechaNacimiento.setDate(fecha);
            jTextFieldPais.setText(pais);
            jTextFieldProfesion.setText(profesion);
            jComboBoxRol.setSelectedItem(rolNombre); // Selecciona por nombre;
        }
    }//GEN-LAST:event_jTablePersonasMouseClicked
    
    private void limpiarCampos() {
        jTextFieldId.setText("");
        jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldCorreo.setText("");
        jDateChooserFechaNacimiento.setDate(null);
        jTextFieldPais.setText("");
        jTextFieldProfesion.setText("");
        jComboBoxRol.setSelectedIndex(0);
        jTextFieldConsultar.setText("");
    }

    private void listarTabla() {
        ControllerPersona ctrl = new ControllerPersona();
        List<ModelPersona> lista = ctrl.listar();

        String[] columnas = {
            "ID", "Nombres", "Apellidos", "Correo", 
            "Fecha de Nacimiento", "Pais", "Profesion", "Rol"
        };
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        jTablePersonas.setModel(modelo);
        modelo.setRowCount(0); // limpia tabla

        for (ModelPersona p : lista) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNombre(),
                p.getApellidos(),
                p.getCorreo(),
                p.getFechaNacimiento(),
                p.getPais(),
                p.getProfesion(),
                new ControllerRoles().obtenerNombrePorId(p.getRol_id())
            });
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
            java.util.logging.Logger.getLogger(JFramePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxRol;
    private com.toedter.calendar.JDateChooser jDateChooserFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonas;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldConsultar;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPais;
    private javax.swing.JTextField jTextFieldProfesion;
    // End of variables declaration//GEN-END:variables
}
