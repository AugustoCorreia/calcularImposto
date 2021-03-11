package com.calcular.validator;

import com.calcular.enums.Aliguota;
import com.calcular.model.CalculoRq;
import com.calcular.model.CalculoRs;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;

import java.util.Arrays;

public class CalculoValidator {

    public static ResponseEntity<CalculoRs> validarCamposCalculoRq(CalculoRq calculoRq)  {
        if(ObjectUtils.isEmpty(calculoRq)) return  ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        if(calculoRq.getTipo().isEmpty())return  ResponseEntity.status(HttpStatus.PARTIAL_CONTENT).build();
        if(calculoRq.getSalario() ==null || calculoRq.getSalario() < 0 ) return  ResponseEntity.status(HttpStatus.PARTIAL_CONTENT).build();
        if(!Arrays.stream(Aliguota.values()).anyMatch(aliguota -> aliguota.getTipo().equalsIgnoreCase(calculoRq.getTipo()))) return ResponseEntity.status(HttpStatus.PARTIAL_CONTENT).build();
        return null;
    }

}
