package com.coderef.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coderef.delivery.model.Pessoa;

@RestController
@RequestMapping(value = "/api/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @RequestMapping(value = "/{nome}", method = RequestMethod.GET)
    public ResponseEntity<Pessoa> findById(@PathVariable("nome") String nome){
    	Pessoa pessoa = new Pessoa();
    	pessoa.setNome(nome);
        return ResponseEntity.ok(pessoa);
    }

}
