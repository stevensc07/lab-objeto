/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaescrituraarchivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class Main extends javax.swing.JFrame {

    File archivo;
    File archivo2;

    public Main() {
        initComponents();
    }

    void mostrarError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(this,mensaje, titulo,JOptionPane.ERROR_MESSAGE);
    }

    void guardarArchivo() {
        // Crear un nuevo escritor
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter(archivo))) {
            // Hallamos el numero de filas
            int filas = datosTable.getRowCount();

            // Tomamos el modelo
            DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

            for (int i = 0; i < filas; ++i) {
                Object codigo = model.getValueAt(i, 0);
                Object nombre = model.getValueAt(i, 1);
                Object promedio = model.getValueAt(i, 2);

                bw.write(codigo + "," + nombre + "," + promedio);
                bw.newLine();
            }
        } catch (IOException ex) {
            mostrarError("Error con archivo", "No se puede escribir en el archivo.");
        } catch (NullPointerException ex) {
            mostrarError("Datos faltantes", "Los datos en la tabla no están completos");
        } catch (NumberFormatException ex) {
            mostrarError("Formato equivocado", "Los números en la tabla no tienen el formato correcto");
        } catch (Exception ex) {
            mostrarError("Error", "Algo inesperado ocurrió");
            ex.printStackTrace();
        }
    }

    void limpiarTabla(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fc = new javax.swing.JFileChooser();
        agregarFrame = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        codigoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        promedioTextField = new javax.swing.JTextField();
        agregarNuevoButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombreArchivoTextField = new javax.swing.JTextField();
        seleccionarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datosTable = new javax.swing.JTable();
        agregarButton = new javax.swing.JButton();
        guardarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        ordenar = new javax.swing.JButton();

        agregarFrame.setMinimumSize(new java.awt.Dimension(240, 200));

        jLabel2.setText("Nuevo estudiante:");

        jLabel3.setText("Código:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Prmedio:");

        agregarNuevoButton.setText("Agregar");
        agregarNuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarNuevoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarFrameLayout = new javax.swing.GroupLayout(agregarFrame.getContentPane());
        agregarFrame.getContentPane().setLayout(agregarFrameLayout);
        agregarFrameLayout.setHorizontalGroup(
            agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarFrameLayout.createSequentialGroup()
                .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(agregarFrameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, agregarFrameLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(promedioTextField))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, agregarFrameLayout.createSequentialGroup()
                                    .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(14, 14, 14)
                                    .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(agregarFrameLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(agregarNuevoButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        agregarFrameLayout.setVerticalGroup(
            agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(promedioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregarNuevoButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Archivo:");

        seleccionarButton.setText("Seleccionar");
        seleccionarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleccionarButtonActionPerformed(evt);
            }
        });

        datosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Promedio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        datosTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                datosTableInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(datosTable);
        if (datosTable.getColumnModel().getColumnCount() > 0) {
            datosTable.getColumnModel().getColumn(0).setResizable(false);
            datosTable.getColumnModel().getColumn(1).setResizable(false);
            datosTable.getColumnModel().getColumn(2).setResizable(false);
        }

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        ordenar.setText("Ordenar por Promedio");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreArchivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seleccionarButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(guardarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreArchivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleccionarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarButton)
                    .addComponent(guardarButton)
                    .addComponent(eliminarButton)
                    .addComponent(ordenar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seleccionarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleccionarButtonActionPerformed
        // Agregar filtro a FileChooser
        FileNameExtensionFilter filter
                = new FileNameExtensionFilter("Archivos .txt", "txt", "texto");
        fc.setFileFilter(filter);

        // Mostrar el FileChooser
        int opcion = fc.showOpenDialog(this);

        // Si el usuario escogió abrir
        if (opcion == JFileChooser.APPROVE_OPTION) {
            // Asignar archivo y nombre.
            archivo2 = fc.getSelectedFile();
            nombreArchivoTextField.setText(archivo2.getAbsolutePath());

            // Tomar el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

            try (Scanner lector = new Scanner(archivo2)) {
                // Mientras el archivo tenga otra línea.
                while (lector.hasNextLine()) {
                    // Pedir la linea
                    String linea = lector.nextLine();

                    // Separar los datos
                    String[] datos = linea.split(",");

                    // Convertir los datos
                    long codigo = Long.parseLong(datos[0]);
                    String nombre = datos[1];
                    double promedio = Double.parseDouble(datos[2]);

                    // Agregamos datos a la tabla
                    model.addRow(new Object[]{codigo, nombre, promedio});

                }
            } catch (FileNotFoundException ex) {
                mostrarError("Archivo no existe", "No se pudo encontrar el archivo");
            } catch (NullPointerException ex) {
                mostrarError("Formato equivocado", "El archivo no tiene el formato correcto");
                limpiarTabla(datosTable);
            } catch (NumberFormatException ex) {
                mostrarError("Formato equivocado", "Los tipos de datos no coinciden");
                limpiarTabla(datosTable);
            } catch (Exception ex) {
                mostrarError("Error", "Algo inesperado ocurrió");
                limpiarTabla(datosTable);
                ex.printStackTrace();
            }
        }


    }//GEN-LAST:event_seleccionarButtonActionPerformed

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        // Reset valores
        codigoTextField.setText("");
        nombreTextField.setText("");
        promedioTextField.setText("");

        // Mostrar frame
        agregarFrame.setVisible(true);
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void agregarNuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarNuevoButtonActionPerformed
        // Tomar el modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        long codigo = Long.parseLong(codigoTextField.getText());
        String nombre = nombreTextField.getText();
        double promedio = Double.parseDouble(promedioTextField.getText());

        model.addRow(new Object[]{codigo, nombre, promedio});

        agregarFrame.setVisible(false);
    }//GEN-LAST:event_agregarNuevoButtonActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // Hallar fila
        int fila = datosTable.getSelectedRow();

        // Tomar modelo de la tabla
        DefaultTableModel model = (DefaultTableModel) datosTable.getModel();

        // Eliminar fila
        model.removeRow(fila);

        // Si queremos guardar el archivo.
        //guardarArchivo();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void datosTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_datosTableInputMethodTextChanged
        // guardarArchivo();
    }//GEN-LAST:event_datosTableInputMethodTextChanged

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        Object [][] m= new Object[100][100];
        double tem;
        String str;
        double [] prom = new double[100];
        int filas = datosTable.getRowCount();
         DefaultTableModel model = (DefaultTableModel) datosTable.getModel();
         for (int i = 0; i < filas; i++) {
            m[i][0] =  model.getValueAt(i,0);
            m[i][1] = model.getValueAt(i, 1);
            m[i][2] = model.getValueAt(i, 2);
            str = (m[i][2]).toString();
            prom[i] = Double.parseDouble(str);
        }
        
        for (int i = 0; i < filas; i++) {
          
            for (int j = i+1; j < filas; j++) {
                if (prom[i] > prom[j]) {
                    tem = prom[i];
                    prom[i] = prom[j];
                    prom[j] = tem;
                }
            }
        }
        
        for (int i = 0; i < filas; i++) {
            System.out.println(prom[i]);
        }
    }//GEN-LAST:event_ordenarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JFrame agregarFrame;
    private javax.swing.JButton agregarNuevoButton;
    private javax.swing.JTextField codigoTextField;
    private javax.swing.JTable datosTable;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JFileChooser fc;
    private javax.swing.JButton guardarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreArchivoTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JButton ordenar;
    private javax.swing.JTextField promedioTextField;
    private javax.swing.JButton seleccionarButton;
    // End of variables declaration//GEN-END:variables
}
