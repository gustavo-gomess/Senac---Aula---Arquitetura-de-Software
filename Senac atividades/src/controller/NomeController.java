package controller;

import model.NomeModel;
import view.NomeView;

public class NomeController {
    private NomeModel model;
    private NomeView view;

    public NomeController(NomeModel model, NomeView view) {
        this.model = model;
        this.view = view;
    }

    public void atualizarNome(String novoNome) {
        model.setNome(novoNome);
    }

    public void executarOperacao() {
        view.mostrarNome(model);
    }
}
