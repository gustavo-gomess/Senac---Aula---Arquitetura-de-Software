package view;

import model.NomeModel;

public class NomeView {
    public void mostrarNome(NomeModel model) {
        System.out.println("Nome: " + model.getNome());
    }
}
