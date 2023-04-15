package desafiofinalventurus;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

/**
 *
 * @author Helder Kennedy
 */
public class FXMLDocumentController implements Initializable {

    boolean x = true;
    String url = "";
    boolean dadosInseridos[][] = new boolean[3][3];
    String figurasInseridos[][] = new String[3][3];
    List<String> lstAdd = new ArrayList<>();
    TrataInsersao objInsere = new TrataInsersao();
    RegraGame objRegra = new RegraGame();

    @FXML
    private ImageView im_1X1, im_1X2, im_1X3, im_2X1, im_2X2, im_2X3, im_3X1, im_3X2, im_3X3, im_win;

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
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
}
