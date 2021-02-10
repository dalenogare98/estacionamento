package aplicacao.entidade;

import java.io.Serializable;






public class Carro implements Serializable{
    private String placa;
    private Integer horaDeEntrada;
    private Integer horaDeSaida;
    
    public Carro(String placa, Integer horaDeEntrada){
        this.placa = placa;
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(Integer horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public Integer getHoraDeSaida() {
        return horaDeSaida;
    }

    public void setHoraDeSaida(Integer horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }
    
    
}
