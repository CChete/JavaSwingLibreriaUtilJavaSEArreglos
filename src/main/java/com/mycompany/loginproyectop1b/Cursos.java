/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginproyectop1b;

import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author crcg
 */
public class Cursos extends javax.swing.JFrame {

    /**
     * Creates new form Cursos
     */
    public Cursos() {
        initComponents();
        //agrego un for que recorre los profesores y agrega el nombre a el combobox
         for(profesor e : LoginProyectoP1B.profesor){
            jComboBox1.addItem(e.getNombre());
        }
         
       llenarTabla();
       
        
    }
    
    public  void llenarTabla(){
         //modelo de tabla que consulta los cursos del arraylist de cursos
         DefaultTableModel data = new DefaultTableModel(new String[]{"IdCurso","Nombre","secc"
                    ,"inicio","fin","HoraInicio","HoraFin","profesor"},LoginProyectoP1B.cursos.size());
            jTable1.setModel(data);

            int row = 0;

            for(Curso e : LoginProyectoP1B.cursos){
                jTable1.setValueAt(e.getId(), row, 0);
                jTable1.setValueAt(e.getNombre(), row, 1);
                jTable1.setValueAt(e.getSeccion(), row, 2);
                jTable1.setValueAt(e.getFechainicio(), row, 3);
                jTable1.setValueAt(e.getFechaFin(), row, 4);
                jTable1.setValueAt(e.getHoraInicio(), row, 5);
                jTable1.setValueAt(e.getHoraFin(), row, 6);
                jTable1.setValueAt(e.Profesor, row, 7);//agregue un String que facilita la busqueda y visualización de los profesores
                
                row ++;
            }
    }
    
        public static void leer(String rutaConNombre){
        JSONParser jp = new JSONParser();
        
        try{
            FileReader r = new FileReader(rutaConNombre);
            Object obj = jp.parse(r);
            
            JSONArray cursosList = (JSONArray) obj;
           
            
            for(Object p:cursosList){
                
                JSONObject curso = (JSONObject) p;
              
                JSONObject datosPersona = (JSONObject) curso;
                
                //System.out.println("--------------------------------------------------");
                //System.out.println("Persona dentro del archivo:");
                
                
                
                long id = (long) datosPersona.get("id");
                int idEntero = (int) id;
                String nombre = (String) datosPersona.get("nombre");
                String seccion = (String) datosPersona.get("seccion");
                String fecha_inicio = (String) datosPersona.get("fecha_inicio");
                String fecha_fin = (String) datosPersona.get("fecha_fin");
                String hora_inicio = (String) datosPersona.get("hora_inicio");
                String hora_fin = (String) datosPersona.get("hora_fin");
                String profesor = (String) datosPersona.get("profesor");
                   
                         
          
                
                
              Curso c = new Curso();
              c.setId(idEntero);
              c.setNombre(nombre);
              c.setSeccion(seccion);
              c.setFechainicio(fecha_inicio);
              c.setFechaFin(fecha_fin);
              c.setHoraInicio(hora_inicio);
              c.setHoraFin(hora_fin);
              c.Profesor = profesor;
              LoginProyectoP1B.cursos.add(c);                 
              
              
                  
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
        
                public static void asignarProfesor(String rutaConNombre){
        JSONParser jp = new JSONParser();
        
        try{
            FileReader r = new FileReader(rutaConNombre);
            Object obj = jp.parse(r);
            
            JSONArray cursosList = (JSONArray) obj;
           
            
            for(Object p:cursosList){
                
                JSONObject curso = (JSONObject) p;
              
                JSONObject datosPersona = (JSONObject) curso;
                
                //System.out.println("--------------------------------------------------");
                //System.out.println("Persona dentro del archivo:");
                
                
                
                long id = (long) datosPersona.get("id");
                int idEntero = (int) id;
                String nombre = (String) datosPersona.get("nombre");
                String seccion = (String) datosPersona.get("seccion");
                String fecha_inicio = (String) datosPersona.get("fecha_inicio");
                String fecha_fin = (String) datosPersona.get("fecha_fin");
                String hora_inicio = (String) datosPersona.get("hora_inicio");
                String hora_fin = (String) datosPersona.get("hora_fin");
                String profesor = (String) datosPersona.get("profesor");
                   
                         
          
                
                
              Curso c = new Curso();
              c.setId(idEntero);
              c.setNombre(nombre);
              c.setSeccion(seccion);
              c.setFechainicio(fecha_inicio);
              c.setFechaFin(fecha_fin);
              c.setHoraInicio(hora_inicio);
              c.setHoraFin(hora_fin);
              c.Profesor = profesor;
        profesor profesorSeleccionado = null;
        Curso cursoSeleccionado = null;
        
          for(profesor e : LoginProyectoP1B.profesor){
            if(e.getUsuario().equals(profesor)){
                profesorSeleccionado = e;
                break;
            }        
        
       }
          for(Curso f : LoginProyectoP1B.cursos){
              
               if(f.getId() == idEntero){
                cursoSeleccionado = f;
                break;
            } 
              
          }
          
         if(profesorSeleccionado!=null && cursoSeleccionado!=null){
            profesorSeleccionado.cursos.add(cursoSeleccionado);
            cursoSeleccionado.profesor.add(profesorSeleccionado);
            
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("AsignarCursos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar estudiantes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

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

        jButton5.setText("ModificarCursos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setText("seleccionar uno para modificar");

        jButton4.setText("BuscarC.Profesor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("CargaCursosJSON");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton5)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(7, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 231, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(61, 61, 61))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AsignacionCursos a = new AsignacionCursos();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        EstudiantesAsignados e = new EstudiantesAsignados();
        e.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         ModificarCurso m = new ModificarCurso(jTable1.getSelectedRow());
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String nombreProfesor = jComboBox1.getSelectedItem().toString();
        profesor profesorBuscado = null;
        
        for(profesor p: LoginProyectoP1B.profesor){
            if(p.getNombre().equals(nombreProfesor)){
                profesorBuscado = p;
                break;
            }
        }
        if(profesorBuscado != null){
             DefaultTableModel data = new DefaultTableModel(new String[]{"IdCurso","Nombre","secc"
                    ,"inicio","fin","HoraInicio","HoraFin","profesor"},profesorBuscado.cursos.size());
            jTable1.setModel(data);

            int row = 0;

            for(Curso e : profesorBuscado.cursos){
                jTable1.setValueAt(e.getId(), row, 0);
                jTable1.setValueAt(e.getNombre(), row, 1);
                jTable1.setValueAt(e.getSeccion(), row, 2);
                jTable1.setValueAt(e.getFechainicio(), row, 3);
                jTable1.setValueAt(e.getFechaFin(), row, 4);
                jTable1.setValueAt(e.getHoraInicio(), row, 5);
                jTable1.setValueAt(e.getHoraFin(), row, 6);
                jTable1.setValueAt(e.Profesor, row, 7);
                row ++;
            }
        }
        
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          JFileChooser archivo = new JFileChooser("");
        int seleccionado = archivo.showDialog(this,"Cargar");
        if(seleccionado==JFileChooser.APPROVE_OPTION){
            leer(archivo.getSelectedFile().toPath().toString());
            asignarProfesor(archivo.getSelectedFile().toPath().toString());
            llenarTabla();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
