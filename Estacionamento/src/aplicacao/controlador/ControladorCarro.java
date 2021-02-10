package aplicacao.controlador;

import serializador.Mapeador;
import aplicacao.Interface.InterfaceControladorCarro;
import aplicacao.entidade.Carro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.Entry;



public class ControladorCarro implements InterfaceControladorCarro {
    
    private HashMap<String, Integer> carrosRegistrados = new HashMap();
    private Mapeador mapeadorCarro;
    
    
    public ControladorCarro(){
        this.mapeadorCarro = new Mapeador("carros");
        carregarCarros();
    }
    
    public ArrayList<Carro> getCarros(){
        ArrayList<Carro> carros = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : carrosRegistrados.entrySet()){
    String placa = entry.getKey();
    Integer horaDeEntrada = entry.getValue();
    carros.add(new Carro(placa,horaDeEntrada));
        }
        return carros;
    }
    
    public void cadastrarCarro(String placa, Integer horarioDeEntrada){

        carrosRegistrados.put(placa, horarioDeEntrada);
        salvarCarros();
        JOptionPane.showMessageDialog(null, " VEÍCULO REGISTRADO COM SUCESSO ");
    }
    
    public void removerCarro(String placa){
        if(this.jaPossuiCarro(placa)){
            carrosRegistrados.remove(placa);
            salvarCarros();
        }
    }
    
    public void salvarCarros(){
        mapeadorCarro.setCache(carrosRegistrados);
        mapeadorCarro.persist();
    }
    
    public void carregarCarros(){
        mapeadorCarro.load();
        carrosRegistrados = mapeadorCarro.getCache();
    }
   
    
    public Integer getHoraDeEntrada(String placa){
        return carrosRegistrados.get(placa);
    }
    
    
    public String getHoraDeEntradaEmHoras(String placa){
        Integer temp = this.getHoraDeEntrada(placa);
        Integer temp2 = 0;

        while(temp >= 60){
            temp2++;
            temp = temp - 60;
        }
 
        if(temp2 == 0){
            if(temp < 10){
                return "00:"+"0"+temp;
            }            
            else{
                return "00:"+temp;
            }
        }
        else if(temp2 < 10){
            if(temp < 10){
                return "0"+temp2+":0"+temp;
            }
            if(temp > 10){
                return "0"+temp2+":"+temp;
            }
        }
        else if(temp2 >= 10){
            if(temp < 10){
                return temp2+":"+"0"+temp;
            }
        }
        return temp2+":"+temp;
    }
   
    public boolean jaPossuiCarro(String placa){
        return this.getHoraDeEntrada(placa) != null;
    }
}
