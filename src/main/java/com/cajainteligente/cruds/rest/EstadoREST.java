package com.cajainteligente.cruds.rest;

import com.cajainteligente.cruds.model.Estado;
import com.cajainteligente.cruds.service.EstadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping ("/estado/")
public class EstadoREST {
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping ("{id}")
    private ResponseEntity<List<Estado>> getAllEstadosByPais (@PathVariable("id") int idPais) {
        return ResponseEntity.ok(estadoService.findAllByPais(idPais));
    }
}
