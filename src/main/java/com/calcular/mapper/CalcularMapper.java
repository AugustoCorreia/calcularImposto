package com.calcular.mapper;

import com.calcular.business.CalcularBusiness;
import com.calcular.model.CalculoRq;
import com.calcular.model.CalculoRs;
import org.springframework.http.ResponseEntity;

public class CalcularMapper {

    public static ResponseEntity<CalculoRs> CalcularRequestToResponse(CalculoRq calculoRq){
        CalculoRs calculoRs = new CalculoRs();
        calculoRs.setId(calculoRq.getId());
        calculoRs.setTipo(calculoRq.getTipo());
        calculoRs.setSalario(calculoRq.getSalario());
        calculoRs.setResultado(CalcularBusiness.calcularImposto(calculoRq));

        return ResponseEntity.ok(calculoRs);
    }
}
