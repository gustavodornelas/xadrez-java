/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;
import java.awt.Button;
import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author gustavo
 */
public class Application extends javax.swing.JFrame {

    private ChessPosition origem;
    private ChessPosition destino;
    private JButton botaoOrigem;
    private JButton botaoDestino;
    private ChessMatch chessMatch;
    private List<ChessPiece> captured;
    private boolean[][] possibleMoves;
    protected String promocaoSelecionada;

    /**
     * Creates new form Application
     */
    public Application() {
        comecarJogo();
    }

    public void setPromocaoSelecionada(String promocaoSelecionada) {
        this.promocaoSelecionada = promocaoSelecionada;
    }

    private void comecarJogo() {

        if (painelTabuleiro != null) {
            this.remove(painelTabuleiro);
            this.remove(backgroundImage);
        }

        initComponents();
        chessMatch = new ChessMatch();
        captured = new ArrayList<>();
    }

    private void moverIcone(JButton origem, JButton destino) {
        destino.setIcon(origem.getIcon());
        origem.setIcon(null);
    }

    private void mostrarPossiveisMovimentos() {

        //Coluna A
        if (possibleMoves[0][0]) {
            botaoA8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][0]) {
            botaoA7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][0]) {
            botaoA6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][0]) {
            botaoA5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][0]) {
            botaoA4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][0]) {
            botaoA3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][0]) {
            botaoA2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][0]) {
            botaoA1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna B
        if (possibleMoves[0][1]) {
            botaoB8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][1]) {
            botaoB7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][1]) {
            botaoB6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][1]) {
            botaoB5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][1]) {
            botaoB4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][1]) {
            botaoB3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][1]) {
            botaoB2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][1]) {
            botaoB1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna C
        if (possibleMoves[0][2]) {
            botaoC8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][2]) {
            botaoC7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][2]) {
            botaoC6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][2]) {
            botaoC5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][2]) {
            botaoC4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][2]) {
            botaoC3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][2]) {
            botaoC2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][2]) {
            botaoC1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna D
        if (possibleMoves[0][3]) {
            botaoD8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][3]) {
            botaoD7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][3]) {
            botaoD6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][3]) {
            botaoD5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][3]) {
            botaoD4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][3]) {
            botaoD3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][3]) {
            botaoD2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][3]) {
            botaoD1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna E
        if (possibleMoves[0][4]) {
            botaoE8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][4]) {
            botaoE7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][4]) {
            botaoE6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][4]) {
            botaoE5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][4]) {
            botaoE4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][4]) {
            botaoE3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][4]) {
            botaoE2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][4]) {
            botaoE1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna F
        if (possibleMoves[0][5]) {
            botaoF8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][5]) {
            botaoF7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][5]) {
            botaoF6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][5]) {
            botaoF5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][5]) {
            botaoF4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][5]) {
            botaoF3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][5]) {
            botaoF2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][5]) {
            botaoF1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna G
        if (possibleMoves[0][6]) {
            botaoG8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][6]) {
            botaoG7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][6]) {
            botaoG6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][6]) {
            botaoG5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][6]) {
            botaoG4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][6]) {
            botaoG3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][6]) {
            botaoG2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][6]) {
            botaoG1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        //Coluna H
        if (possibleMoves[0][7]) {
            botaoH8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[1][7]) {
            botaoH7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[2][7]) {
            botaoH6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[3][7]) {
            botaoH5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[4][7]) {
            botaoH4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[5][7]) {
            botaoH3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[6][7]) {
            botaoH2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }

        if (possibleMoves[7][7]) {
            botaoH1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        }
    }

    private void limparPossiveisMovimentos() {
        botaoA8.setBorder(null);
        botaoA7.setBorder(null);
        botaoA6.setBorder(null);
        botaoA5.setBorder(null);
        botaoA4.setBorder(null);
        botaoA3.setBorder(null);
        botaoA2.setBorder(null);
        botaoA1.setBorder(null);
        botaoB8.setBorder(null);
        botaoB7.setBorder(null);
        botaoB6.setBorder(null);
        botaoB5.setBorder(null);
        botaoB4.setBorder(null);
        botaoB3.setBorder(null);
        botaoB2.setBorder(null);
        botaoB1.setBorder(null);
        botaoB8.setBorder(null);
        botaoC7.setBorder(null);
        botaoC6.setBorder(null);
        botaoC5.setBorder(null);
        botaoC4.setBorder(null);
        botaoC3.setBorder(null);
        botaoC2.setBorder(null);
        botaoC1.setBorder(null);
        botaoD8.setBorder(null);
        botaoD7.setBorder(null);
        botaoD6.setBorder(null);
        botaoD5.setBorder(null);
        botaoD4.setBorder(null);
        botaoD3.setBorder(null);
        botaoD2.setBorder(null);
        botaoD1.setBorder(null);
        botaoE8.setBorder(null);
        botaoE7.setBorder(null);
        botaoE6.setBorder(null);
        botaoE5.setBorder(null);
        botaoE4.setBorder(null);
        botaoE3.setBorder(null);
        botaoE2.setBorder(null);
        botaoE1.setBorder(null);
        botaoF8.setBorder(null);
        botaoF7.setBorder(null);
        botaoF6.setBorder(null);
        botaoF5.setBorder(null);
        botaoF4.setBorder(null);
        botaoF3.setBorder(null);
        botaoF2.setBorder(null);
        botaoF1.setBorder(null);
        botaoG8.setBorder(null);
        botaoG7.setBorder(null);
        botaoG6.setBorder(null);
        botaoG5.setBorder(null);
        botaoG4.setBorder(null);
        botaoG3.setBorder(null);
        botaoG2.setBorder(null);
        botaoG1.setBorder(null);
        botaoH8.setBorder(null);
        botaoH7.setBorder(null);
        botaoH6.setBorder(null);
        botaoH5.setBorder(null);
        botaoH4.setBorder(null);
        botaoH3.setBorder(null);
        botaoH2.setBorder(null);
        botaoH1.setBorder(null);
    }

    private void acaoBotao(JButton botao, ChessPosition posicao) {

        try {
            if (origem == null) {
                origem = posicao;
                botaoOrigem = botao;
                botaoOrigem.setBorder(BorderFactory.createLineBorder(Color.CYAN));
                possibleMoves = chessMatch.possibleMoves(origem);

                if (checkBoxPossiveisMovimentos.isSelected()) {
                    mostrarPossiveisMovimentos();
                }

            } else {
                destino = posicao;
                botaoDestino = botao;

                ChessPiece pecaCapturada = chessMatch.performChessMove(origem, destino);

                if (pecaCapturada != null) {
                    captured.add(pecaCapturada);
                }

                moverIcone(botaoOrigem, botaoDestino);
                
                String pecaPromocao = "";

                if (chessMatch.getPromoted() != null) {

                    if (chessMatch.getCurrentPlayer() == chess.Color.BLACK) {
                        if (radioBispo.isSelected()) {
                            pecaPromocao = "/gui/img/white-bishop.png";
                            promocaoSelecionada = "B";
                        }

                        if (radioCavalo.isSelected()) {
                            pecaPromocao = "/gui/img/white-knight.png";
                            promocaoSelecionada = "N";
                        }

                        if (radioRainha.isSelected()) {
                            pecaPromocao = "/gui/img/white-queen.png";
                            System.out.println("OK");
                            promocaoSelecionada = "Q";
                        }

                        if (radioTorre.isSelected()) {
                            pecaPromocao = "/gui/img/white-rook.png";
                            promocaoSelecionada = "R";
                        }

                    } else if (chessMatch.getCurrentPlayer() == chess.Color.WHITE) {

                        if (radioBispo.isSelected()) {
                            pecaPromocao = "/gui/img/black-bishop.png";
                            promocaoSelecionada = "B";
                        }

                        if (radioCavalo.isSelected()) {
                            pecaPromocao = "/gui/img/black-knight.png";
                            promocaoSelecionada = "N";
                        }

                        if (radioRainha.isSelected()) {
                            pecaPromocao = "/gui/img/black-queen.png";
                            promocaoSelecionada = "Q";
                        }

                        if (radioTorre.isSelected()) {
                            pecaPromocao = "/gui/img/black-rook.png";
                            promocaoSelecionada = "R";
                        }
                    }

                    botaoDestino.setIcon(new javax.swing.ImageIcon(getClass().getResource(pecaPromocao)));
                    chessMatch.replacePromotedPiece(promocaoSelecionada);
                } //fim da promoção

                botaoOrigem.setBorder(null);
                origem = null;
                limparPossiveisMovimentos();

                if (chessMatch.getCheckMate()) {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "CHECK-MATE!");
                    comecarJogo();
                }

            } //fim da ação de destino
        } catch (ChessException e) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, e.getMessage());
            botaoOrigem.setBorder(null);
            origem = null;
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

        GrupoPecasPromocao = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        botaoCodigoFonte = new javax.swing.JButton();
        painelTabuleiro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botaoA8 = new javax.swing.JButton();
        botaoB8 = new javax.swing.JButton();
        botaoC8 = new javax.swing.JButton();
        botaoD8 = new javax.swing.JButton();
        botaoE8 = new javax.swing.JButton();
        botaoF8 = new javax.swing.JButton();
        botaoG8 = new javax.swing.JButton();
        botaoH8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        botaoA7 = new javax.swing.JButton();
        botaoB7 = new javax.swing.JButton();
        botaoC7 = new javax.swing.JButton();
        botaoD7 = new javax.swing.JButton();
        botaoE7 = new javax.swing.JButton();
        botaoF7 = new javax.swing.JButton();
        botaoG7 = new javax.swing.JButton();
        botaoH7 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        botaoA6 = new javax.swing.JButton();
        botaoB6 = new javax.swing.JButton();
        botaoC6 = new javax.swing.JButton();
        botaoD6 = new javax.swing.JButton();
        botaoE6 = new javax.swing.JButton();
        botaoF6 = new javax.swing.JButton();
        botaoG6 = new javax.swing.JButton();
        botaoH6 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        botaoA5 = new javax.swing.JButton();
        botaoB5 = new javax.swing.JButton();
        botaoC5 = new javax.swing.JButton();
        botaoD5 = new javax.swing.JButton();
        botaoE5 = new javax.swing.JButton();
        botaoF5 = new javax.swing.JButton();
        botaoG5 = new javax.swing.JButton();
        botaoH5 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        botaoA4 = new javax.swing.JButton();
        botaoB4 = new javax.swing.JButton();
        botaoC4 = new javax.swing.JButton();
        botaoD4 = new javax.swing.JButton();
        botaoE4 = new javax.swing.JButton();
        botaoF4 = new javax.swing.JButton();
        botaoG4 = new javax.swing.JButton();
        botaoH4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        botaoA3 = new javax.swing.JButton();
        botaoB3 = new javax.swing.JButton();
        botaoC3 = new javax.swing.JButton();
        botaoD3 = new javax.swing.JButton();
        botaoE3 = new javax.swing.JButton();
        botaoF3 = new javax.swing.JButton();
        botaoG3 = new javax.swing.JButton();
        botaoH3 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        botaoA2 = new javax.swing.JButton();
        botaoB2 = new javax.swing.JButton();
        botaoC2 = new javax.swing.JButton();
        botaoD2 = new javax.swing.JButton();
        botaoE2 = new javax.swing.JButton();
        botaoF2 = new javax.swing.JButton();
        botaoG2 = new javax.swing.JButton();
        botaoH2 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        botaoA1 = new javax.swing.JButton();
        botaoB1 = new javax.swing.JButton();
        botaoC1 = new javax.swing.JButton();
        botaoD1 = new javax.swing.JButton();
        botaoE1 = new javax.swing.JButton();
        botaoF1 = new javax.swing.JButton();
        botaoG1 = new javax.swing.JButton();
        botaoH1 = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuReiniciar = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        checkBoxPossiveisMovimentos = new javax.swing.JCheckBoxMenuItem();
        jMenu3 = new javax.swing.JMenu();
        radioBispo = new javax.swing.JRadioButtonMenuItem();
        radioCavalo = new javax.swing.JRadioButtonMenuItem();
        radioRainha = new javax.swing.JRadioButtonMenuItem();
        radioTorre = new javax.swing.JRadioButtonMenuItem();

        jMenuItem1.setText("jMenuItem1");

        Sobre.setMaximumSize(new java.awt.Dimension(400, 200));
        Sobre.setMinimumSize(new java.awt.Dimension(400, 200));
        Sobre.setPreferredSize(new java.awt.Dimension(400, 200));
        Sobre.setResizable(false);

        jLabel1.setText("Jogo desenvolvido por: Gustavo Dornelas");

        jLabel21.setText("Análise e Desenvolvimento de Sistemas");

        jLabel22.setText("IFTM - Campus Patrocínio");

        jLabel23.setText("4º Período");

        botaoCodigoFonte.setText("Acessar código fonte");
        botaoCodigoFonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCodigoFonteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SobreLayout = new javax.swing.GroupLayout(Sobre.getContentPane());
        Sobre.getContentPane().setLayout(SobreLayout);
        SobreLayout.setHorizontalGroup(
            SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SobreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addGroup(SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoCodigoFonte)
                        .addComponent(jLabel21)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        SobreLayout.setVerticalGroup(
            SobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SobreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(botaoCodigoFonte)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new ImageIcon("imagem.png").getImage());
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setResizable(false);
        getContentPane().setLayout(null);

        painelTabuleiro.setOpaque(false);
        painelTabuleiro.setPreferredSize(new java.awt.Dimension(600, 600));
        painelTabuleiro.setLayout(new java.awt.GridLayout(9, 9));
        painelTabuleiro.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("A");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("B");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("C");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("D");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel6);

        jLabel7.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("E");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("F");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel8);

        jLabel9.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("G");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel9);

        jLabel10.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("H");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        painelTabuleiro.add(jLabel10);

        jLabel11.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("8");
        painelTabuleiro.add(jLabel11);

        botaoA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-rook.png"))); // NOI18N
        botaoA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA8);

        botaoB8.setBackground(new java.awt.Color(51, 51, 51));
        botaoB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-knight.png"))); // NOI18N
        botaoB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB8);

        botaoC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-bishop.png"))); // NOI18N
        botaoC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC8);

        botaoD8.setBackground(new java.awt.Color(51, 51, 51));
        botaoD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-queen.png"))); // NOI18N
        botaoD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD8);

        botaoE8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-king.png"))); // NOI18N
        botaoE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE8);

        botaoF8.setBackground(new java.awt.Color(51, 51, 51));
        botaoF8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-bishop.png"))); // NOI18N
        botaoF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF8);

        botaoG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-knight.png"))); // NOI18N
        botaoG8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG8);

        botaoH8.setBackground(new java.awt.Color(51, 51, 51));
        botaoH8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-rook.png"))); // NOI18N
        botaoH8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH8ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH8);

        jLabel12.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("7");
        painelTabuleiro.add(jLabel12);

        botaoA7.setBackground(new java.awt.Color(51, 51, 51));
        botaoA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA7);

        botaoB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB7);

        botaoC7.setBackground(new java.awt.Color(51, 51, 51));
        botaoC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC7);

        botaoD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD7);

        botaoE7.setBackground(new java.awt.Color(51, 51, 51));
        botaoE7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE7);

        botaoF7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF7);

        botaoG7.setBackground(new java.awt.Color(51, 51, 51));
        botaoG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoG7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG7);

        botaoH7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/black-pawn.png"))); // NOI18N
        botaoH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH7ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH7);

        jLabel13.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("6");
        painelTabuleiro.add(jLabel13);

        botaoA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA6);

        botaoB6.setBackground(new java.awt.Color(51, 51, 51));
        botaoB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB6);

        botaoC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC6);

        botaoD6.setBackground(new java.awt.Color(51, 51, 51));
        botaoD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD6);

        botaoE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE6);

        botaoF6.setBackground(new java.awt.Color(51, 51, 51));
        botaoF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF6);

        botaoG6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG6);

        botaoH6.setBackground(new java.awt.Color(51, 51, 51));
        botaoH6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH6ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH6);

        jLabel14.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("5");
        painelTabuleiro.add(jLabel14);

        botaoA5.setBackground(new java.awt.Color(51, 51, 51));
        botaoA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA5);

        botaoB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB5);

        botaoC5.setBackground(new java.awt.Color(51, 51, 51));
        botaoC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC5);

        botaoD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD5);

        botaoE5.setBackground(new java.awt.Color(51, 51, 51));
        botaoE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE5);

        botaoF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF5);

        botaoG5.setBackground(new java.awt.Color(51, 51, 51));
        botaoG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG5);

        botaoH5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH5ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH5);

        jLabel15.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("4");
        painelTabuleiro.add(jLabel15);

        botaoA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA4);

        botaoB4.setBackground(new java.awt.Color(51, 51, 51));
        botaoB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB4);

        botaoC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC4);

        botaoD4.setBackground(new java.awt.Color(51, 51, 51));
        botaoD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD4);

        botaoE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE4);

        botaoF4.setBackground(new java.awt.Color(51, 51, 51));
        botaoF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF4);

        botaoG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG4);

        botaoH4.setBackground(new java.awt.Color(51, 51, 51));
        botaoH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH4ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH4);

        jLabel16.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("3");
        painelTabuleiro.add(jLabel16);

        botaoA3.setBackground(new java.awt.Color(51, 51, 51));
        botaoA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA3);

        botaoB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB3);

        botaoC3.setBackground(new java.awt.Color(51, 51, 51));
        botaoC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC3);

        botaoD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD3);

        botaoE3.setBackground(new java.awt.Color(51, 51, 51));
        botaoE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE3);

        botaoF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF3);

        botaoG3.setBackground(new java.awt.Color(51, 51, 51));
        botaoG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG3);

        botaoH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH3ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH3);

        jLabel17.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("2");
        painelTabuleiro.add(jLabel17);

        botaoA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA2);

        botaoB2.setBackground(new java.awt.Color(51, 51, 51));
        botaoB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB2);

        botaoC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC2);

        botaoD2.setBackground(new java.awt.Color(51, 51, 51));
        botaoD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD2);

        botaoE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE2);

        botaoF2.setBackground(new java.awt.Color(51, 51, 51));
        botaoF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF2);

        botaoG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG2);

        botaoH2.setBackground(new java.awt.Color(51, 51, 51));
        botaoH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-pawn.png"))); // NOI18N
        botaoH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH2ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH2);

        jLabel18.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("1");
        painelTabuleiro.add(jLabel18);

        botaoA1.setBackground(new java.awt.Color(51, 51, 51));
        botaoA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-rook.png"))); // NOI18N
        botaoA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoA1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoA1);

        botaoB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-knight.png"))); // NOI18N
        botaoB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoB1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoB1);

        botaoC1.setBackground(new java.awt.Color(51, 51, 51));
        botaoC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-bishop.png"))); // NOI18N
        botaoC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoC1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoC1);

        botaoD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-queen.png"))); // NOI18N
        botaoD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoD1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoD1);

        botaoE1.setBackground(new java.awt.Color(51, 51, 51));
        botaoE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-king.png"))); // NOI18N
        botaoE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoE1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoE1);

        botaoF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-bishop.png"))); // NOI18N
        botaoF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoF1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoF1);

        botaoG1.setBackground(new java.awt.Color(51, 51, 51));
        botaoG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-knight.png"))); // NOI18N
        botaoG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoG1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoG1);

        botaoH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/white-rook.png"))); // NOI18N
        botaoH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoH1ActionPerformed(evt);
            }
        });
        painelTabuleiro.add(botaoH1);

        getContentPane().add(painelTabuleiro);
        painelTabuleiro.setBounds(5, 5, 700, 700);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/img/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 800, 810);

        jMenu1.setText("Arquivo");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        menuReiniciar.setText("Reiniciar");
        menuReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReiniciarActionPerformed(evt);
            }
        });
        jMenu1.add(menuReiniciar);

        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenu1.add(menuSobre);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        menuOpcoes.setText("Opções");

        checkBoxPossiveisMovimentos.setSelected(true);
        checkBoxPossiveisMovimentos.setText("Mostrar movimentos Possíveis");
        menuOpcoes.add(checkBoxPossiveisMovimentos);

        jMenu3.setText("Escolher Peça Padrão para Promoção");

        GrupoPecasPromocao.add(radioBispo);
        radioBispo.setText("Bispo");
        jMenu3.add(radioBispo);

        GrupoPecasPromocao.add(radioCavalo);
        radioCavalo.setText("Cavalo");
        jMenu3.add(radioCavalo);

        GrupoPecasPromocao.add(radioRainha);
        radioRainha.setSelected(true);
        radioRainha.setText("Rainha");
        jMenu3.add(radioRainha);

        GrupoPecasPromocao.add(radioTorre);
        radioTorre.setText("Torre");
        jMenu3.add(radioTorre);

        menuOpcoes.add(jMenu3);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA8, new ChessPosition('a', 8));
    }//GEN-LAST:event_botaoA8ActionPerformed

    private void botaoA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA7, new ChessPosition('a', 7));
    }//GEN-LAST:event_botaoA7ActionPerformed

    private void botaoA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA6, new ChessPosition('a', 6));
    }//GEN-LAST:event_botaoA6ActionPerformed

    private void botaoA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA5, new ChessPosition('a', 5));
    }//GEN-LAST:event_botaoA5ActionPerformed

    private void botaoA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA4, new ChessPosition('a', 4));
    }//GEN-LAST:event_botaoA4ActionPerformed

    private void botaoA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA3, new ChessPosition('a', 3));
    }//GEN-LAST:event_botaoA3ActionPerformed

    private void botaoA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA2, new ChessPosition('a', 2));
    }//GEN-LAST:event_botaoA2ActionPerformed

    private void botaoA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoA1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoA1, new ChessPosition('a', 1));
    }//GEN-LAST:event_botaoA1ActionPerformed

    private void botaoB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB8, new ChessPosition('b', 8));
    }//GEN-LAST:event_botaoB8ActionPerformed

    private void botaoB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB7, new ChessPosition('b', 7));
    }//GEN-LAST:event_botaoB7ActionPerformed

    private void botaoB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB6, new ChessPosition('b', 6));
    }//GEN-LAST:event_botaoB6ActionPerformed

    private void botaoB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB5, new ChessPosition('b', 5));
    }//GEN-LAST:event_botaoB5ActionPerformed

    private void botaoB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB4, new ChessPosition('b', 4));
    }//GEN-LAST:event_botaoB4ActionPerformed

    private void botaoB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB3, new ChessPosition('b', 3));
    }//GEN-LAST:event_botaoB3ActionPerformed

    private void botaoB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB2, new ChessPosition('b', 2));
    }//GEN-LAST:event_botaoB2ActionPerformed

    private void botaoB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoB1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoB1, new ChessPosition('b', 1));
    }//GEN-LAST:event_botaoB1ActionPerformed

    private void botaoC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC8, new ChessPosition('c', 8));
    }//GEN-LAST:event_botaoC8ActionPerformed

    private void botaoC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC7, new ChessPosition('c', 7));
    }//GEN-LAST:event_botaoC7ActionPerformed

    private void botaoC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC6, new ChessPosition('c', 6));
    }//GEN-LAST:event_botaoC6ActionPerformed

    private void botaoC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC5, new ChessPosition('c', 5));
    }//GEN-LAST:event_botaoC5ActionPerformed

    private void botaoC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC4, new ChessPosition('c', 4));
    }//GEN-LAST:event_botaoC4ActionPerformed

    private void botaoC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC3, new ChessPosition('c', 3));
    }//GEN-LAST:event_botaoC3ActionPerformed

    private void botaoC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC2, new ChessPosition('c', 2));
    }//GEN-LAST:event_botaoC2ActionPerformed

    private void botaoC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoC1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoC1, new ChessPosition('c', 1));
    }//GEN-LAST:event_botaoC1ActionPerformed

    private void botaoD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD8, new ChessPosition('d', 8));
    }//GEN-LAST:event_botaoD8ActionPerformed

    private void botaoD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD7, new ChessPosition('d', 7));
    }//GEN-LAST:event_botaoD7ActionPerformed

    private void botaoD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD6, new ChessPosition('d', 6));
    }//GEN-LAST:event_botaoD6ActionPerformed

    private void botaoD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD5, new ChessPosition('d', 5));
    }//GEN-LAST:event_botaoD5ActionPerformed

    private void botaoD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD4, new ChessPosition('d', 4));
    }//GEN-LAST:event_botaoD4ActionPerformed

    private void botaoD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD3, new ChessPosition('d', 3));
    }//GEN-LAST:event_botaoD3ActionPerformed

    private void botaoD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD2, new ChessPosition('d', 2));
    }//GEN-LAST:event_botaoD2ActionPerformed

    private void botaoD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoD1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoD1, new ChessPosition('d', 1));
    }//GEN-LAST:event_botaoD1ActionPerformed

    private void botaoE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE8, new ChessPosition('e', 8));
    }//GEN-LAST:event_botaoE8ActionPerformed

    private void botaoE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE7, new ChessPosition('e', 7));
    }//GEN-LAST:event_botaoE7ActionPerformed

    private void botaoE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE6, new ChessPosition('e', 6));
    }//GEN-LAST:event_botaoE6ActionPerformed

    private void botaoE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE5, new ChessPosition('e', 5));
    }//GEN-LAST:event_botaoE5ActionPerformed

    private void botaoE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE4, new ChessPosition('e', 4));
    }//GEN-LAST:event_botaoE4ActionPerformed

    private void botaoE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE3, new ChessPosition('e', 3));
    }//GEN-LAST:event_botaoE3ActionPerformed

    private void botaoE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE2, new ChessPosition('e', 2));
    }//GEN-LAST:event_botaoE2ActionPerformed

    private void botaoE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoE1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoE1, new ChessPosition('e', 1));
    }//GEN-LAST:event_botaoE1ActionPerformed

    private void botaoF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF8, new ChessPosition('f', 8));
    }//GEN-LAST:event_botaoF8ActionPerformed

    private void botaoF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF7, new ChessPosition('f', 7));
    }//GEN-LAST:event_botaoF7ActionPerformed

    private void botaoF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF6, new ChessPosition('f', 6));
    }//GEN-LAST:event_botaoF6ActionPerformed

    private void botaoF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF5, new ChessPosition('f', 5));
    }//GEN-LAST:event_botaoF5ActionPerformed

    private void botaoF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF4, new ChessPosition('f', 4));
    }//GEN-LAST:event_botaoF4ActionPerformed

    private void botaoF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF3, new ChessPosition('f', 3));
    }//GEN-LAST:event_botaoF3ActionPerformed

    private void botaoF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF2, new ChessPosition('f', 2));
    }//GEN-LAST:event_botaoF2ActionPerformed

    private void botaoF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoF1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoF1, new ChessPosition('f', 1));
    }//GEN-LAST:event_botaoF1ActionPerformed

    private void botaoG8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG8, new ChessPosition('g', 8));
    }//GEN-LAST:event_botaoG8ActionPerformed

    private void botaoG7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG7, new ChessPosition('g', 7));
    }//GEN-LAST:event_botaoG7ActionPerformed

    private void botaoG6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG6, new ChessPosition('g', 6));
    }//GEN-LAST:event_botaoG6ActionPerformed

    private void botaoG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG5, new ChessPosition('g', 5));
    }//GEN-LAST:event_botaoG5ActionPerformed

    private void botaoG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG4, new ChessPosition('g', 4));
    }//GEN-LAST:event_botaoG4ActionPerformed

    private void botaoG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG3, new ChessPosition('g', 3));
    }//GEN-LAST:event_botaoG3ActionPerformed

    private void botaoG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG2, new ChessPosition('g', 2));
    }//GEN-LAST:event_botaoG2ActionPerformed

    private void botaoG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoG1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoG1, new ChessPosition('g', 1));
    }//GEN-LAST:event_botaoG1ActionPerformed

    private void botaoH8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH8ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH8, new ChessPosition('h', 8));
    }//GEN-LAST:event_botaoH8ActionPerformed

    private void botaoH7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH7ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH7, new ChessPosition('h', 7));
    }//GEN-LAST:event_botaoH7ActionPerformed

    private void botaoH6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH6ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH6, new ChessPosition('h', 6));
    }//GEN-LAST:event_botaoH6ActionPerformed

    private void botaoH5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH5ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH5, new ChessPosition('h', 5));
    }//GEN-LAST:event_botaoH5ActionPerformed

    private void botaoH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH4ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH4, new ChessPosition('h', 4));
    }//GEN-LAST:event_botaoH4ActionPerformed

    private void botaoH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH3ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH3, new ChessPosition('h', 3));
    }//GEN-LAST:event_botaoH3ActionPerformed

    private void botaoH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH2ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH2, new ChessPosition('h', 2));
    }//GEN-LAST:event_botaoH2ActionPerformed

    private void botaoH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoH1ActionPerformed
        // TODO add your handling code here:
        acaoBotao(botaoH1, new ChessPosition('h', 1));
    }//GEN-LAST:event_botaoH1ActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReiniciarActionPerformed
        // TODO add your handling code here:
        comecarJogo();
    }//GEN-LAST:event_menuReiniciarActionPerformed

    private void botaoCodigoFonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCodigoFonteActionPerformed
        // TODO add your handling code here:
        try{
            URI link = new URI("https://github.com/gustavodornelas/xadrez-java");
            Desktop.getDesktop().browse(link);
        }catch(Exception erro){
            System.out.println(erro);
        }
    }//GEN-LAST:event_botaoCodigoFonteActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        Sobre.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoPecasPromocao;
    private javax.swing.JDialog Sobre;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton botaoA1;
    private javax.swing.JButton botaoA2;
    private javax.swing.JButton botaoA3;
    private javax.swing.JButton botaoA4;
    private javax.swing.JButton botaoA5;
    private javax.swing.JButton botaoA6;
    private javax.swing.JButton botaoA7;
    private javax.swing.JButton botaoA8;
    private javax.swing.JButton botaoB1;
    private javax.swing.JButton botaoB2;
    private javax.swing.JButton botaoB3;
    private javax.swing.JButton botaoB4;
    private javax.swing.JButton botaoB5;
    private javax.swing.JButton botaoB6;
    private javax.swing.JButton botaoB7;
    private javax.swing.JButton botaoB8;
    private javax.swing.JButton botaoC1;
    private javax.swing.JButton botaoC2;
    private javax.swing.JButton botaoC3;
    private javax.swing.JButton botaoC4;
    private javax.swing.JButton botaoC5;
    private javax.swing.JButton botaoC6;
    private javax.swing.JButton botaoC7;
    private javax.swing.JButton botaoC8;
    private javax.swing.JButton botaoCodigoFonte;
    private javax.swing.JButton botaoD1;
    private javax.swing.JButton botaoD2;
    private javax.swing.JButton botaoD3;
    private javax.swing.JButton botaoD4;
    private javax.swing.JButton botaoD5;
    private javax.swing.JButton botaoD6;
    private javax.swing.JButton botaoD7;
    private javax.swing.JButton botaoD8;
    private javax.swing.JButton botaoE1;
    private javax.swing.JButton botaoE2;
    private javax.swing.JButton botaoE3;
    private javax.swing.JButton botaoE4;
    private javax.swing.JButton botaoE5;
    private javax.swing.JButton botaoE6;
    private javax.swing.JButton botaoE7;
    private javax.swing.JButton botaoE8;
    private javax.swing.JButton botaoF1;
    private javax.swing.JButton botaoF2;
    private javax.swing.JButton botaoF3;
    private javax.swing.JButton botaoF4;
    private javax.swing.JButton botaoF5;
    private javax.swing.JButton botaoF6;
    private javax.swing.JButton botaoF7;
    private javax.swing.JButton botaoF8;
    private javax.swing.JButton botaoG1;
    private javax.swing.JButton botaoG2;
    private javax.swing.JButton botaoG3;
    private javax.swing.JButton botaoG4;
    private javax.swing.JButton botaoG5;
    private javax.swing.JButton botaoG6;
    private javax.swing.JButton botaoG7;
    private javax.swing.JButton botaoG8;
    private javax.swing.JButton botaoH1;
    private javax.swing.JButton botaoH2;
    private javax.swing.JButton botaoH3;
    private javax.swing.JButton botaoH4;
    private javax.swing.JButton botaoH5;
    private javax.swing.JButton botaoH6;
    private javax.swing.JButton botaoH7;
    private javax.swing.JButton botaoH8;
    private javax.swing.JCheckBoxMenuItem checkBoxPossiveisMovimentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuReiniciar;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JPanel painelTabuleiro;
    private javax.swing.JRadioButtonMenuItem radioBispo;
    private javax.swing.JRadioButtonMenuItem radioCavalo;
    private javax.swing.JRadioButtonMenuItem radioRainha;
    private javax.swing.JRadioButtonMenuItem radioTorre;
    // End of variables declaration//GEN-END:variables
}
