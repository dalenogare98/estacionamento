/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import aplicacao.telas.SaidaCarro;



/**
 *
 * @author pedro
 */
public class Calculador{
    
    private int tolerancia = 15;
    private float horaDeEntrada;
    private float horaDeSaida;
    private float valorInicial = 10;
    private float valorAdicional = 25;
    private int periodoInicial = 1;
    private int periodoAdicional = 2;
    private SaidaCarro tela;
    
    public Calculador(){
        
    }
    
    public void setTela(SaidaCarro tela){
        this.tela = tela;
    }
    
    public int getTolerancia() {
        return tolerancia;
    }

    public void setTolerancia(int tolerancia) {
        this.tolerancia = tolerancia;
    }

    public float getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(float horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public float getHoraDeSaida() {
        return horaDeSaida;
    }

    public void setHoraDeSaida(float horaDeSaida) {
        this.horaDeSaida = horaDeSaida;
    }

    public float getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(float valorInicial) {
        this.valorInicial = valorInicial;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(int periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public int getPeriodoAdicional() {
        return periodoAdicional;
    }

    public void setPeriodoAdicional(int periodoAdicional) {
        this.periodoAdicional = periodoAdicional;
    }

    public float calculaPreco(Integer horaDeEntrada, Integer horaDeSaida) {
        Integer var = horaDeSaida - horaDeEntrada;
        float valor = 0;
        if(var <= tolerancia){
            return 0;
        }
        
        else if(var <= periodoInicial*60){
            return valorInicial;
        }
        
        else{
            valor = valor + valorInicial + valorAdicional;
            var = var - periodoInicial*60;
            while(var > periodoAdicional*60){
                valor = valor + valorAdicional;
                var = var - periodoAdicional*60;
            }
        }
        return valor;   
    }
    
    
    
    
}
