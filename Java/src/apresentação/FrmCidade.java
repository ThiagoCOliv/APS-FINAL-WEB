package apresentação;

import javax.swing.JOptionPane;
import modelo.Controle;
import modelo.Regiao;

public class FrmCidade extends javax.swing.JDialog {

    public FrmCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    Controle controle = new Controle();
    String regiaoNumero = "";
    String regiaoNome = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnNoroeste = new javax.swing.JButton();
        btnNorte = new javax.swing.JButton();
        btnNordeste = new javax.swing.JButton();
        btnOeste = new javax.swing.JButton();
        btnCentro = new javax.swing.JButton();
        btnLeste = new javax.swing.JButton();
        btnSudoeste = new javax.swing.JButton();
        btnSul = new javax.swing.JButton();
        btnSudeste = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txfQtdDistribuicaoAreasVerdes = new javax.swing.JTextField();
        txfEstadoConservacaoManutencao = new javax.swing.JTextField();
        txfAcessibilidade = new javax.swing.JTextField();
        txfBiodiversidadeSustentabilidade = new javax.swing.JTextField();
        txfUsoSatisfacaoPublico = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setForeground(java.awt.Color.blue);

        jLabel1.setText("Regiões:");

        btnNoroeste.setText("Noroeste");
        btnNoroeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoroesteActionPerformed(evt);
            }
        });

        btnNorte.setText("Norte");
        btnNorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNorteActionPerformed(evt);
            }
        });

        btnNordeste.setText("Nordeste");
        btnNordeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNordesteActionPerformed(evt);
            }
        });

        btnOeste.setText("Oeste");
        btnOeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOesteActionPerformed(evt);
            }
        });

        btnCentro.setText("Centro");
        btnCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentroActionPerformed(evt);
            }
        });

        btnLeste.setText("Leste");
        btnLeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLesteActionPerformed(evt);
            }
        });

        btnSudoeste.setText("Sudoeste");
        btnSudoeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSudoesteActionPerformed(evt);
            }
        });

        btnSul.setText("Sul");
        btnSul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSulActionPerformed(evt);
            }
        });

        btnSudeste.setText("Sudeste");
        btnSudeste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSudesteActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setText("Quantidade e Distribuição de Áreas Verdes");

        jLabel3.setText("Estado de Conservação e Manutenção");

        jLabel4.setText("Acessibilidade");

        jLabel5.setText("Biodiversidade e Sustentabilidade");

        jLabel6.setText("Uso e Satisfação do Público");

        txfQtdDistribuicaoAreasVerdes.setEditable(false);

        txfEstadoConservacaoManutencao.setEditable(false);

        txfAcessibilidade.setEditable(false);

        txfBiodiversidadeSustentabilidade.setEditable(false);

        txfUsoSatisfacaoPublico.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txfUsoSatisfacaoPublico, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txfBiodiversidadeSustentabilidade, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(txfAcessibilidade)
                        .addComponent(txfEstadoConservacaoManutencao)
                        .addComponent(txfQtdDistribuicaoAreasVerdes)))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfQtdDistribuicaoAreasVerdes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txfEstadoConservacaoManutencao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfAcessibilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfBiodiversidadeSustentabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfUsoSatisfacaoPublico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNordeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNoroeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnOeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCentro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSudoeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSudeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(16, 16, 16)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNoroeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNorte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNordeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCentro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSudoeste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSudeste)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        zerarBotoes();
        
        Regiao regiao = new Regiao();
        regiao.setRegiaoCidade(regiaoNome);
        regiao.setAcessibilidade(txfAcessibilidade.getText());
        regiao.setBiodiversidadeSustentabilidade(txfBiodiversidadeSustentabilidade.getText());
        regiao.setEstadoConservacaoManutencao(txfEstadoConservacaoManutencao.getText());
        regiao.setQtdDistribuicaoAreasVerdes(txfQtdDistribuicaoAreasVerdes.getText());
        regiao.setUsoSatisfacaoPublico(txfUsoSatisfacaoPublico.getText());
        controle.setRegiao(regiaoNumero, regiao);
        
        if(controle.mensagem == "")
        {
            regiaoNumero = "";
            txfAcessibilidade.setEditable(false);
            txfAcessibilidade.setText("");
            txfBiodiversidadeSustentabilidade.setEditable(false);
            txfBiodiversidadeSustentabilidade.setText("");
            txfEstadoConservacaoManutencao.setEditable(false);
            txfEstadoConservacaoManutencao.setText("");
            txfQtdDistribuicaoAreasVerdes.setEditable(false);
            txfQtdDistribuicaoAreasVerdes.setText("");
            txfUsoSatisfacaoPublico.setEditable(false);
            txfUsoSatisfacaoPublico.setText("");
            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNoroesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoroesteActionPerformed
        zerarBotoes();
        btnNoroeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("0");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "0";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnNoroesteActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(true);
        
        txfAcessibilidade.setEditable(true);
        txfBiodiversidadeSustentabilidade.setEditable(true);
        txfEstadoConservacaoManutencao.setEditable(true);
        txfQtdDistribuicaoAreasVerdes.setEditable(true);
        txfUsoSatisfacaoPublico.setEditable(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNorteActionPerformed
        zerarBotoes();
        btnNorte.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("1");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "1";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnNorteActionPerformed

    private void btnNordesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNordesteActionPerformed
        zerarBotoes();
        btnNordeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("2");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "2";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnNordesteActionPerformed

    private void btnOesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOesteActionPerformed
        zerarBotoes();
        btnOeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("3");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "3";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnOesteActionPerformed

    private void btnCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentroActionPerformed
        zerarBotoes();
        btnCentro.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("4");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "4";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnCentroActionPerformed

    private void btnLesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLesteActionPerformed
        zerarBotoes();
        btnLeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("5");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "5";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnLesteActionPerformed

    private void btnSudoesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSudoesteActionPerformed
        zerarBotoes();
        btnSudoeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("6");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "6";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnSudoesteActionPerformed

    private void btnSulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSulActionPerformed
        zerarBotoes();
        btnSul.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("7");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "7";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnSulActionPerformed

    private void btnSudesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSudesteActionPerformed
        zerarBotoes();
        btnSudeste.setEnabled(false);
        btnEditar.setEnabled(true);
        
        Regiao regiao = controle.getRegiao("8");
        
        if("".equals(controle.mensagem)){
            regiaoNumero = "8";
            regiaoNome = regiao.getRegiaoCidade();
            txfAcessibilidade.setText(regiao.getAcessibilidade());
            txfBiodiversidadeSustentabilidade.setText(regiao.getBiodiversidadeSustentabilidade());
            txfEstadoConservacaoManutencao.setText(regiao.getEstadoConservacaoManutencao());
            txfQtdDistribuicaoAreasVerdes.setText(regiao.getQtdDistribuicaoAreasVerdes());
            txfUsoSatisfacaoPublico.setText(regiao.getUsoSatisfacaoPublico());
        }
        else
        {
            JOptionPane.showMessageDialog(this, controle.mensagem);
        }
    }//GEN-LAST:event_btnSudesteActionPerformed

    private void zerarBotoes()
    {
        btnNoroeste.setEnabled(true);
        btnNorte.setEnabled(true);
        btnNordeste.setEnabled(true);
        btnOeste.setEnabled(true);
        btnCentro.setEnabled(true);
        btnLeste.setEnabled(true);
        btnSudoeste.setEnabled(true);
        btnSul.setEnabled(true);
        btnSudeste.setEnabled(true);
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
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmCidade dialog = new FrmCidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentro;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLeste;
    private javax.swing.JButton btnNordeste;
    private javax.swing.JButton btnNoroeste;
    private javax.swing.JButton btnNorte;
    private javax.swing.JButton btnOeste;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSudeste;
    private javax.swing.JButton btnSudoeste;
    private javax.swing.JButton btnSul;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txfAcessibilidade;
    private javax.swing.JTextField txfBiodiversidadeSustentabilidade;
    private javax.swing.JTextField txfEstadoConservacaoManutencao;
    private javax.swing.JTextField txfQtdDistribuicaoAreasVerdes;
    private javax.swing.JTextField txfUsoSatisfacaoPublico;
    // End of variables declaration//GEN-END:variables
}
