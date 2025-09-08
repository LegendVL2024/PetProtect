package View;

package View;


import java.util.List;
import Model.Adocao;

public class AdocaoView {
    public void mostrarAdocoes(List<Adocao> adocoes) {
        for (Adocao adocao : adocoes) {
            System.out.println("Data: " + adocao.getDataAdocao());
            System.out.println("Status: " + adocao.getStatus());
            System.out.println("Observações: " + adocao.getObservacoes());
            System.out.println("-----------");
        }
    }
}
