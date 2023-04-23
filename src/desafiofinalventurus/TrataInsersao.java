/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafiofinalventurus;

/**
 *
 * @author Helder Kennedy
 */
public class TrataInsersao {

    public String RetornaFigura(boolean x) {
        String url;
        if (x) {
            url = "xizinho_110x110.png";
        } else {
            url = "Bolinha_110x110.png";
        }
        return url;
    }
    public String RetornaFigura() {
        String url = "BaseJogo_512x512.png";
        return url;
    }
    public Boolean TrocaX(Boolean x){
        x = !x;
        return x;
    }
}
