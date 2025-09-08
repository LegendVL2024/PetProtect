package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.Adocao;

public class AdocaoController {
    public List<Adocao> listarAdocoes() {
        List<Adocao> lista = new ArrayList<>();

        Adocao adocao = new Adocao(20230905, "Aprovado", "Sem observações");
        lista.add(adocao);

        return lista;
    }
}
