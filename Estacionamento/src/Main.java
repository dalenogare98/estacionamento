
import aplicacao.controlador.ControladorCarro;
import calculador.Calculador;
import aplicacao.telas.TelaMenu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorCarro controlador = new ControladorCarro();
        Calculador calculador = new Calculador();
        TelaMenu tela = new TelaMenu(controlador,calculador);
        tela.setVisible(true);
        System.out.println("Iniciando o programa");
    }
    
}
