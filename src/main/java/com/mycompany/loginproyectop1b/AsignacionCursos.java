/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginproyectop1b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author crcg
 */
public class AsignacionCursos extends javax.swing.JFrame {

    /**
     * Creates new form AsignacionCursos
     */
    public AsignacionCursos() {
        initComponents();
        for(Curso e : LoginProyectoP1B.cursos){//for que llena el combobox con las secciones de los cursos del arrayList de cursos
            jComboBox3.addItem(e.getSeccion());
        }
        for(Curso e : LoginProyectoP1B.cursos){//for que llena el combobox con los nombres de los cursos del arrayList de cursos
            jComboBox2.addItem(e.getNombre());
        }
        
        for(Alumno e : LoginProyectoP1B.Alumno){//for que llena el combobox con los nombres de los alumnos del arrayList de alumnos
            jComboBox1.addItem(e.getNombre());
        }
    }
    
    
     public void leerArchivo(String rutaNombre){
          try{
            File f = new File(rutaNombre);
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while((linea=br.readLine())!=null){
                String[] contenidoLinea = linea.split("#");
                String curso;
                String alumno;
                curso = contenidoLinea[0];
                alumno = contenidoLinea[1];
                
                
                Alumno alumnoSeleccionado = null;// se crea el alumnoSeleccionado que contendra el alumno elegido 
        Curso cursoSeleccionado = null;// se crea el cursoSeleccionado que contendra el curso elegido 
        
          for(Alumno e : LoginProyectoP1B.Alumno){//for que ubica el alumno con el nombre del combobox y lo guarda en alumnoSeleccionado
            if(e.getCarne().equals(alumno)){
                alumnoSeleccionado = e;
                break;
            }        
        
       }
          for(Curso g : LoginProyectoP1B.cursos){//for que ubica el curso seleccionado y lo guarda en cursoSeeleccionado
              
               if(g.getId() == Integer.parseInt(curso)){// en la sentencia del if se compara el codigo del archivo con el del arrayList de cursos
                cursoSeleccionado = g;
                break;
            } 
              
          }
          
         if(alumnoSeleccionado!=null && cursoSeleccionado!=null){
            alumnoSeleccionado.cursos.add(cursoSeleccionado);
            cursoSeleccionado.alumnos.add(alumnoSeleccionado);
        }
                
                
            }
        
        }catch(Exception e){
            e.printStackTrace();
        }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Asignación de cursos");

        jLabel2.setText("alumno");

        jLabel3.setText("cursos");

        jButton1.setText("salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("asignar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("nombre");

        jLabel5.setText("seccion");

        jButton3.setText("AsignacionMasivaProgra1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5)))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(203, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(51, 51, 51)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String alumno= jComboBox1.getSelectedItem().toString();//String que guarda el nombre del alumno seleccionado en el combobox
        String cursoN= jComboBox2.getSelectedItem().toString();//String que guarda el  nombre del curso seleccionado en el combobox
        String cursoS= jComboBox3.getSelectedItem().toString();//String que guarda la seccion del curso seleccionado en el combobox
        
        
        
        Alumno alumnoSeleccionado = null;// se crea el alumnoSeleccionado que contendra el alumno elegido en el combobox
        Curso cursoSeleccionado = null;// se crea el cursoSeleccionado que contendra el curso elegido en los combobox de nombre y seccion
        
          for(Alumno e : LoginProyectoP1B.Alumno){//for que ubica el alumno con el nombre del combobox y lo guarda en alumnoSeleccionado
            if(e.getNombre().equals(alumno)){
                alumnoSeleccionado = e;
                break;
            }        
        
       }
          for(Curso f : LoginProyectoP1B.cursos){//for que ubica el curso seleccionado y lo guarda en cursoSeeleccionado
              
               if(f.getNombre().equals(cursoN)&& f.getSeccion().equals(cursoS)){// en la sentencia del if se compara el nombre y la seccion ya que los 2 deben ser iguales
                cursoSeleccionado = f;
                break;
            } 
              
          }
          
         if(alumnoSeleccionado!=null && cursoSeleccionado!=null){
         if(cursoSeleccionado.alumnos.size()<10){
             if(alumnoSeleccionado.cursos.size()<5){
            alumnoSeleccionado.cursos.add(cursoSeleccionado);
            cursoSeleccionado.alumnos.add(alumnoSeleccionado);
            JOptionPane.showMessageDialog(this, "curso asignado exitosamente");     
             }else{
            JOptionPane.showMessageDialog(this, "ha superado la cantidad maxima de 5 cursos asignados a el alumno seleccionado");     
                 
             }
             
         }else{
             JOptionPane.showMessageDialog(this, "ha superado la cantidad maxima de 10 alumnos en le curso seleccionado");
         }
            
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Cargar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            leerArchivo(archivo.getSelectedFile().toPath().toString());
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}