
package Interface;

import conexao.Conexao;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author a
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    Color corEntrada = new Color(204, 204, 204);       
    Color corSaida= new Color(255, 255, 255);       

       
    public TelaLogin() {
        URL url = this.getClass().getClassLoader().getResource("imagens/peopleIcon.png");//pega o caminho da imagem
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);//trata como icone
        this.setIconImage(iconeTitulo);
    
        initComponents();
       
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_pwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de gerenciamento hospitalar");
        setBackground(new java.awt.Color(0, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLogo.setBackground(new java.awt.Color(0, 153, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/hospital.png"))); // NOI18N

        login.setBackground(new java.awt.Color(0, 0, 0));

        txt_usuario.setBackground(new java.awt.Color(0, 0, 0));
        txt_usuario.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_usuario.setText("usuario");
        txt_usuario.setBorder(null);
        txt_usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txt_usuario.setNextFocusableComponent(txt_pwd);
        txt_usuario.setSelectionColor(new java.awt.Color(0, 102, 255));
        txt_usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usuarioFocusGained(evt);
            }
        });
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_usuarioMouseEntered(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        txt_pwd.setBackground(new java.awt.Color(0, 0, 0));
        txt_pwd.setForeground(new java.awt.Color(255, 255, 255));
        txt_pwd.setText("jPasswordField1");
        txt_pwd.setBorder(null);
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Login");

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrar");
        btnLogin.add(jLabel1);

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel6)
                .addGap(97, 97, 97)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   int  limpasenha =0;
    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        if (limpasenha ==0) {
            txt_pwd.setText("");
            limpasenha++;
        }
    }//GEN-LAST:event_txt_pwdFocusGained
    int limpatexto =0;
    
    private void txt_usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usuarioFocusGained
         limpatexto++;
    }//GEN-LAST:event_txt_usuarioFocusGained

    private void txt_usuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMouseEntered
        if (limpatexto == 1) {
            txt_usuario.setText("");
        }   
    }//GEN-LAST:event_txt_usuarioMouseEntered

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        btnLogin.setBackground(corEntrada);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        btnLogin.setBackground(corSaida);
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed

            Conexao c = new Conexao();
            System.out.println(""+c);
    }//GEN-LAST:event_btnLoginMousePressed
   
    public static void main(String args[]) {
       new TelaLogin().setVisible(true);
              
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel login;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPasswordField txt_pwd;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
