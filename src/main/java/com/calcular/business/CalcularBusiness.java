package com.calcular.business;

import com.calcular.enums.Aliguota;
import com.calcular.model.CalculoRq;

public class CalcularBusiness {
    public static Double calcularImposto( CalculoRq calculoRq){

        return (calculoRq.getSalario() * Aliguota.getPorcentagemPeloTipo(calculoRq.getTipo()))/100;

    }
}
