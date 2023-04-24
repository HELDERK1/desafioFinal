package desafiofinalventurus;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Helder Kennedy
 */
public class FXMLDocumentController implements Initializable {

    boolean x = true;
    boolean fim = false;
    boolean btEscolha = false;
    String url = "";
    boolean dadosInseridos[][] = new boolean[3][3];
    String figurasInseridos[][] = new String[3][3];
    List<String> lstAdd = new ArrayList<>();
    TrataInsersao objInsere = new TrataInsersao();
    RegraGame objRegra = new RegraGame();
    int winX = 0;
    int winO = 0;

    @FXML
    private ImageView im_1X1, im_1X2, im_1X3, im_2X1, im_2X2, im_2X3, im_3X1, im_3X2, im_3X3, im_win, win;
    @FXML
    AnchorPane TelaGame;
    @FXML
    Button bt_1X1, bt_1X2, bt_1X3, bt_2X1, bt_2X2, bt_2X3, bt_3X1, bt_3X2, bt_3X3, btReiniciar;
    @FXML
    Label lbEscolha, lbResult, lbWinX, lbWinO;

    @FXML
    private void BT_EscolhaO(ActionEvent event) {
        if (!btEscolha) {
            x = false;
            lbEscolha.setText("O - foi excolhido");
            btEscolha = true;
            AtivaDesativaBotoes(false);
        }
    }

    @FXML
    private void BT_EscolhaX(ActionEvent event) {
        if (!btEscolha) {
            x = true;
            lbEscolha.setText("X - foi excolhido");
            btEscolha = true;
            AtivaDesativaBotoes(false);
        }
    }

    @FXML
    private void BT_1x1(ActionEvent event) {
        int i = 1, j = 1;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_1X1.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_1x2(ActionEvent event) {
        int i = 1, j = 2;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_1X2.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_1x3(ActionEvent event) {
        int i = 1, j = 3;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_1X3.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_2x1(ActionEvent event) {
        int i = 2, j = 1;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_2X1.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_2x2(ActionEvent event) {
        int i = 2, j = 2;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_2X2.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_2x3(ActionEvent event) {
        int i = 2, j = 3;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_2X3.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_3x1(ActionEvent event) {
        int i = 3, j = 1;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_3X1.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_3x2(ActionEvent event) {
        int i = 3, j = 2;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_3X2.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @FXML
    private void BT_3x3(ActionEvent event) {
        int i = 3, j = 3;
        AcoesBotao(i, j);
        if (!url.equals("")) {
            lstAdd.add(url);
            im_3X3.setImage(RetornaImage());
            if (objRegra.ValidaGame()) {
                AdicionaBarraWin();
                System.out.println("Win");
            } else {
                ValidaVelha();
            }
        }
    }

    @Override
    public void initialize(URL urlIn, ResourceBundle rb) {
        AtivaDesativaBotoes(true);
    }

    private Image RetornaImage() {
        Image image = new Image(getClass().getResourceAsStream(url));
        url = "";
        return image;
    }

    private void AdicionaBarraWin() {
        String urlWin = objRegra.getPosWin();
        Image image = new Image(getClass().getResourceAsStream(urlWin));
        im_win.setImage(image);
        AtivaDesativaBotoes(true);

        url = objInsere.RetornaFigura(!x);
        Image imageWin = new Image(getClass().getResourceAsStream(url));
        win.setImage(imageWin);
        lbResult.setText("Ganhou!");
        fim = true;
        btEscolha = false;
        url = "";
        
        if (!x) {
            winX++;
        }else{
            winO++;
        }
        lbWinX.setText("Win = " + winX);
        lbWinO.setText("Win = " + winO);
        btReiniciar.setText("Denovo");
    }

    private void AcoesBotao(int i, int j) {
        i--;
        j--;
        if (!dadosInseridos[i][j]) {
            dadosInseridos[i][j] = true;
            url = objInsere.RetornaFigura(x);
            figurasInseridos[i][j] = url;
            objRegra.setDadosInseridos(figurasInseridos);
            x = objInsere.TrocaX(x);
            i++;
            j++;
            System.out.println(url + " = " + i + ", " + j);
        } else {
            System.out.println("Botao já clicado");
        }
    }

    private void AtivaDesativaBotoes(Boolean active) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dadosInseridos[i][j] = active;
            }
        }
    }

    private void ValidaVelha() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!dadosInseridos[i][j]) {
                    return;
                }
            }
        }
        AtivaDesativaBotoes(true);
        url = objInsere.RetornaFigura();
        Image imageWin = new Image(getClass().getResourceAsStream(url));
        win.setImage(imageWin);
        lbResult.setText("Empate!");
        fim = true;
        btEscolha = false;
        url = "";
        btReiniciar.setText("Denovo");
    }

    private void LimpaImmagem() {
        Image image = new Image(getClass().getResourceAsStream(""));
        im_1X1.setImage(image);
        im_1X2.setImage(image);
        im_1X3.setImage(image);
        im_2X1.setImage(image);
        im_2X2.setImage(image);
        im_2X3.setImage(image);
        im_3X1.setImage(image);
        im_3X2.setImage(image);
        im_3X3.setImage(image);
        im_win.setImage(image);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                figurasInseridos[i][j] = "";
            }
        }
        lbEscolha.setText("Escolha X ou O");
    }
    
    @FXML
    private void Reiniciar(ActionEvent event){
        
        if (fim) {
            LimpaImmagem();
            fim = false;
            btEscolha = false;
        }
        btReiniciar.setText("");
    }
}
