/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiofinalventurus;

/**
 *
 * @author Helder Kennedy
 */
public class RegraGame {

    public RegraGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dadosInseridos[i][j] = "";
            }
        }
    }

    private String dadosInseridos[][] = new String[3][3];
    private String posWin;

    public String getPosWin() {
        return posWin;
    }

    public void setDadosInseridos(String[][] dadosInseridos) {
        this.dadosInseridos = dadosInseridos;
    }

    public boolean ValidaGame() {
        boolean win = false;
        if (ValidaLinha1()) {
            win = true;
            posWin = "Win_Esq.png";
        } else if (ValidaLinha2()) {
            win = true;
            posWin = "Win_Cen.png";
        } else if (ValidaLinha3()) {
            win = true;
            posWin = "Win_Dir.png";
        } else if (ValidaColuna1()) {
            win = true;
            posWin = "Win_Sup.png";
        } else if (ValidaColuna2()) {
            win = true;
            posWin = "Win_Hor.png";
        } else if (ValidaColuna3()) {
            win = true;
            posWin = "Win_Inf.png";
        } else if (ValidaDiagonal1()) {
            win = true;
            posWin = "Win_Diag1.png";
        } else if (ValidaDiagonal2()) {
            win = true;
            posWin = "Win_Diag2.png";
        }
        return win;
    }

    private boolean ValidaLinha1() {
        String pos1 = this.dadosInseridos[0][0];
        String pos2 = this.dadosInseridos[1][0];
        String pos3 = this.dadosInseridos[2][0];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaLinha2() {
        String pos1 = this.dadosInseridos[0][1];
        String pos2 = this.dadosInseridos[1][1];
        String pos3 = this.dadosInseridos[2][1];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaLinha3() {
        String pos1 = this.dadosInseridos[0][2];
        String pos2 = this.dadosInseridos[1][2];
        String pos3 = this.dadosInseridos[2][2];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaColuna1() {
        String pos1 = this.dadosInseridos[0][0];
        String pos2 = this.dadosInseridos[0][1];
        String pos3 = this.dadosInseridos[0][2];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaColuna2() {
        String pos1 = this.dadosInseridos[1][0];
        String pos2 = this.dadosInseridos[1][1];
        String pos3 = this.dadosInseridos[1][2];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaColuna3() {
        String pos1 = this.dadosInseridos[2][0];
        String pos2 = this.dadosInseridos[2][1];
        String pos3 = this.dadosInseridos[2][2];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaDiagonal1() {
        String pos1 = this.dadosInseridos[0][0];
        String pos2 = this.dadosInseridos[1][1];
        String pos3 = this.dadosInseridos[2][2];
        return teste(pos1, pos2, pos3);
    }

    private boolean ValidaDiagonal2() {
        String pos1 = this.dadosInseridos[0][2];
        String pos2 = this.dadosInseridos[1][1];
        String pos3 = this.dadosInseridos[2][0];
        return teste(pos1, pos2, pos3);
    }
    private boolean teste(String pos1, String pos2, String pos3){
        boolean valida = false;
        try {
           valida = !pos1.equals("") && pos1.equals(pos2) && pos1.equals(pos3); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return valida;
    }
}
