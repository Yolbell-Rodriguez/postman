package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController

public class OfertaController {
    private final List<Oferta> ofertas = new ArrayList<>();

    @GetMapping("/api/ofertas")
    public List<Oferta> lista(){
        return ofertas;
    }

   @PostMapping("/api/ofertas/poner")
    public Oferta add( @RequestBody Oferta oferta){
        ofertas.add(oferta);
        return oferta;
   }

   @PutMapping("api/ofertas/{titulo}/editar")
    Oferta update(@RequestBody Oferta oferta, @PathVariable String titulo) {
       return oferta;
   }

    @DeleteMapping("/api/ofertas/{titulo}")
    Boolean delete(@PathVariable String titulo){
        return true;
    }

}




