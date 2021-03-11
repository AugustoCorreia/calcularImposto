package com.calcular.controller;


import com.calcular.model.CalculoRq;
import com.calcular.model.CalculoRs;
import com.calcular.service.ICalcularService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "/calcular")
public class CalculoController {


    ICalcularService calcularService;

    public CalculoController (ICalcularService calcularService1){
        this.calcularService = calcularService1;
    }

    @PostMapping
    public ResponseEntity<CalculoRs> calcular (@RequestBody CalculoRq calcularRequest ) {
        return calcularService.calcularImpostoDeRenda(calcularRequest);
    }

}