package com.example.Actividad.Controlador;

import com.example.Actividad.Entidades.Estidiantes;
import com.example.Actividad.Servicio.Servicioestudiantes;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins= "*",maxAge=3600)

@RestController
public class ControladorEstu {
        Servicioestudiantes servicio= new Servicioestudiantes();

@GetMapping("/listar")
public ArrayList<Estidiantes>listar(){
    return servicio.listar();
}
@PostMapping("/agregar")
public String agregar(@RequestBody Estidiantes  estidiantenew){
    return servicio.agregar(estidiantenew);
}

@GetMapping("/Buscar/{curso}")
    public ArrayList<Estidiantes>buscar(@PathVariable("curso")String curso){
    return servicio.buscar(curso);
}
}
