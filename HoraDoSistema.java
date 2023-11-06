package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Maisa
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        Locale idioma = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(idioma.getDisplayLanguage());
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension wh = tela.getScreenSize();
        System.out.print("A resolução do seu sistema é " + wh.width + "x" + wh.height);
    }
    
}
