package com.calcular.enums;

import java.util.Arrays;

public enum Aliguota {
    CNPJ ("CNPJ", 27.5),
    CPF ("CPF", 22.5);
    
    private final String tipo;
    private final Double porcentagem;

    Aliguota(String tipo, Double porcentagem){
        this.tipo = tipo;
        this.porcentagem = porcentagem;
    }
    public static Double getPorcentagemPeloTipo(String tipo){
      for (final Aliguota aliguota:Aliguota.values()){
          if (aliguota.getTipo().equalsIgnoreCase(tipo)){
              return aliguota.getPorcentagem();
          }
        }
      return 0.0;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }
}
