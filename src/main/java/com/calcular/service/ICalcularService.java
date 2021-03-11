package com.calcular.service;

import com.calcular.model.CalculoRq;
import com.calcular.model.CalculoRs;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface ICalcularService {
    public ResponseEntity<CalculoRs> calcularImpostoDeRenda(CalculoRq calcularRequest) ;
}
