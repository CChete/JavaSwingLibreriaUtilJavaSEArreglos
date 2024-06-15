/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginproyectop1b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 *
 * @author crcg
 */
public class CrearProfesor extends javax.swing.JFrame {

    /**
     * Creates new form CrearProfesor
     */
    public CrearProfesor() {
        initComponents();
    }

    
     public void validarCampos(){
        boolean condicionMayus;
        boolean condicionMinus;
        boolean condicionDigito; 
        boolean condicionCaracter;
                
                
        condicionMayus = jTextFieldContraseña.getText().contains("A")
                || jTextFieldContraseña.getText().contains("B")
                || jTextFieldContraseña.getText().contains("C")
                || jTextFieldContraseña.getText().contains("D")
                || jTextFieldContraseña.getText().contains("E")
                || jTextFieldContraseña.getText().contains("F")
                || jTextFieldContraseña.getText().contains("G")
                || jTextFieldContraseña.getText().contains("H")
                || jTextFieldContraseña.getText().contains("I")
                || jTextFieldContraseña.getText().contains("J")
                || jTextFieldContraseña.getText().contains("K")
                || jTextFieldContraseña.getText().contains("L")
                || jTextFieldContraseña.getText().contains("M")
                || jTextFieldContraseña.getText().contains("N")
                || jTextFieldContraseña.getText().contains("Ñ")
                || jTextFieldContraseña.getText().contains("O")
                || jTextFieldContraseña.getText().contains("P")
                || jTextFieldContraseña.getText().contains("Q")
                || jTextFieldContraseña.getText().contains("R")
                || jTextFieldContraseña.getText().contains("S")
                || jTextFieldContraseña.getText().contains("T")
                || jTextFieldContraseña.getText().contains("U")
                || jTextFieldContraseña.getText().contains("V")
                || jTextFieldContraseña.getText().contains("W")
                || jTextFieldContraseña.getText().contains("X")
                || jTextFieldContraseña.getText().contains("Y")
                || jTextFieldContraseña.getText().contains("Z");
        
        condicionMinus = jTextFieldContraseña.getText().contains("a")
                || jTextFieldContraseña.getText().contains("b")
                || jTextFieldContraseña.getText().contains("c")
                || jTextFieldContraseña.getText().contains("d")
                || jTextFieldContraseña.getText().contains("e")
                || jTextFieldContraseña.getText().contains("f")
                || jTextFieldContraseña.getText().contains("g")
                || jTextFieldContraseña.getText().contains("h")
                || jTextFieldContraseña.getText().contains("i")
                || jTextFieldContraseña.getText().contains("j")
                || jTextFieldContraseña.getText().contains("k")
                || jTextFieldContraseña.getText().contains("l")
                || jTextFieldContraseña.getText().contains("m")
                || jTextFieldContraseña.getText().contains("n")
                || jTextFieldContraseña.getText().contains("ñ")
                || jTextFieldContraseña.getText().contains("o")
                || jTextFieldContraseña.getText().contains("p")
                || jTextFieldContraseña.getText().contains("q")
                || jTextFieldContraseña.getText().contains("r")
                || jTextFieldContraseña.getText().contains("s")
                || jTextFieldContraseña.getText().contains("t")
                || jTextFieldContraseña.getText().contains("u")
                || jTextFieldContraseña.getText().contains("v")
                || jTextFieldContraseña.getText().contains("w")
                || jTextFieldContraseña.getText().contains("x")
                || jTextFieldContraseña.getText().contains("y")
                || jTextFieldContraseña.getText().contains("z");
        
        condicionDigito = jTextFieldContraseña.getText().contains("0")
                ||jTextFieldContraseña.getText().contains("1")
                || jTextFieldContraseña.getText().contains("2")
                || jTextFieldContraseña.getText().contains("3")
                || jTextFieldContraseña.getText().contains("4")
                || jTextFieldContraseña.getText().contains("5")
                || jTextFieldContraseña.getText().contains("6")
                || jTextFieldContraseña.getText().contains("7")
                || jTextFieldContraseña.getText().contains("8")
                || jTextFieldContraseña.getText().contains("9")
                || jTextFieldContraseña.getText().contains("0");
        
        condicionCaracter = jTextFieldContraseña.getText().contains("#")
                || jTextFieldContraseña.getText().contains("@")
                || jTextFieldContraseña.getText().contains("#")
                || jTextFieldContraseña.getText().contains("%")
                || jTextFieldContraseña.getText().contains("&")
                || jTextFieldContraseña.getText().contains("/")
                || jTextFieldContraseña.getText().contains("(")
                || jTextFieldContraseña.getText().contains(")")
                || jTextFieldContraseña.getText().contains("+")
                || jTextFieldContraseña.getText().contains("*");
        
        if(condicionMayus && condicionMinus && condicionDigito && condicionCaracter){
            jLabelContraseñaAviso1.setText("");
        }else{
            jLabelContraseñaAviso1.setText("debe contener 1 mayuscula 1 minuscula 1 numero y un caracter esepcial");
        }
        if(jTextFieldContraseña.getText().length() >= 8){
            jLabelContraseñaAviso2.setText("");
        }else{
            jLabelContraseñaAviso2.setText("contraseña demasiado corta");
        }
                
        if(jLabelContraseñaAviso1.getText().equals("")
         && jLabelContraseñaAviso2.getText().equals("")){
            jButton2.setEnabled(true);
        }
                
    }
     public void leerArchivo(String rutaNombre){
          try{
            File f = new File(rutaNombre);
            FileReader fr = new FileReader(f);
            
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while((linea=br.readLine())!=null){
                String[] contenidoLinea = linea.split(",");
                profesor n = new profesor();
                n.setUsuario(contenidoLinea[0]);
                n.setNombre(contenidoLinea[1]);
                n.setApellido(contenidoLinea[2]);
                n.setPassword(contenidoLinea[3]);
                
                LoginProyectoP1B.profesor.add(n);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelContraseñaAviso2 = new javax.swing.JLabel();
        jLabelContraseñaAviso1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Contraseña");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextFieldContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraseñaActionPerformed(evt);
            }
        });
        jTextFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaKeyReleased(evt);
            }
        });

        jLabel5.setText("Creacion de Profesores");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CargaProfesoresCsv");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelContraseñaAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabelContraseñaAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(76, 76, 76)
                                        .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(96, 96, 96)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(97, 97, 97)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jLabelContraseñaAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelContraseñaAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextFieldContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraseñaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:Profesor p = new Profesor();
      profesor p = new profesor();
        p.setUsuario(jTextField1.getText()); 
        p.setNombre(jTextField2.getText());
        p.setApellido(jTextField3.getText());
        p.setPassword(jTextFieldContraseña.getText());
        
        LoginProyectoP1B.profesor.add(p);
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextFieldContraseña.setText("");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaKeyReleased
        // TODO add your handling code here:
        validarCampos();
    }//GEN-LAST:event_jTextFieldContraseñaKeyReleased

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContraseñaAviso1;
    private javax.swing.JLabel jLabelContraseñaAviso2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldContraseña;
    // End of variables declaration//GEN-END:variables
}
