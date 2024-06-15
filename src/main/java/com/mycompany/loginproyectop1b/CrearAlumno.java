/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginproyectop1b;


/**
 *
 * @author crcg
 */
public class CrearAlumno extends javax.swing.JFrame {

    /**
     * Creates new form CrearAlumno
     */
    public CrearAlumno() {
        initComponents();
        jButton2.setEnabled(false);
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
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextFieldContraseña = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelContraseñaAviso1 = new javax.swing.JLabel();
        jLabelContraseñaAviso2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carne");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Constraseña");

        jLabel5.setText("Creación de Alumnos");

        jTextFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldContraseñaKeyReleased(evt);
            }
        });

        jButton1.setText("salir");
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "femenino" }));

        jLabel6.setText("genero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4))
                                    .addGap(67, 67, 67)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextFieldContraseña)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelContraseñaAviso1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelContraseñaAviso2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContraseñaAviso1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelContraseñaAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Alumno a = new Alumno();
        a.setCarne(jTextField1.getText()); 
        a.setNombre(jTextField2.getText());
        a.setApellido(jTextField3.getText());
        a.setPassword(jTextFieldContraseña.getText());
        a.genero = jComboBox1.getSelectedItem().toString();
        
        LoginProyectoP1B.Alumno.add(a);
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextFieldContraseña.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldContraseñaKeyReleased
        // TODO add your handling code here:
        validarCampos();
    }//GEN-LAST:event_jTextFieldContraseñaKeyReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelContraseñaAviso1;
    private javax.swing.JLabel jLabelContraseñaAviso2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldContraseña;
    // End of variables declaration//GEN-END:variables
}
