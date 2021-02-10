package aplicacao.Interface;

import aplicacao.entidade.Carro;
import java.util.ArrayList;






public interface InterfaceControladorCarro{
    
    public void cadastrarCarro(String placa, Integer horarioDeEntrada);
    public Integer getHoraDeEntrada(String placa);
    public boolean jaPossuiCarro(String placa);
    public String getHoraDeEntradaEmHoras(String placa);
    public ArrayList<Carro> getCarros();
    public void removerCarro(String placa);
    
}
