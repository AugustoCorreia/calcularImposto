package com.calcular.service;

import com.calcular.mapper.CalcularMapper;
import com.calcular.model.CalculoRq;
import com.calcular.model.CalculoRs;
import com.calcular.validator.CalculoValidator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CalcularServiceImpl implements ICalcularService{

    @Override
    public ResponseEntity<CalculoRs> calcularImpostoDeRenda(CalculoRq calcularRequest) {
        ResponseEntity response = CalculoValidator.validarCamposCalculoRq(calcularRequest);
        return (response == null) ? CalcularMapper.CalcularRequestToResponse(calcularRequest) : response;
    }
}
