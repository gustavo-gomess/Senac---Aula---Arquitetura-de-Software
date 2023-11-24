package facade;

import controller.NomeController;
import model.NomeModel;
import view.NomeView;

public class NomeFacade {
    private NomeController controller;

    public NomeFacade() {
        NomeModel model = new NomeModel();
        NomeView view = new NomeView();
        this.controller = new NomeController(model, view);
    }

    public void executarOperacao() {
        controller.executarOperacao();
    }
}
