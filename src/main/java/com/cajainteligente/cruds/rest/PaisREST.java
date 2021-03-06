package com.cajainteligente.cruds.rest;

import com.cajainteligente.cruds.model.Pais;
import com.cajainteligente.cruds.service.PaisService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping ("/pais/")
public class PaisREST {
    @Autowired
    private PaisService paisService;
    
    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises() {
        return ResponseEntity.ok(paisService.findAll());
    }
}
