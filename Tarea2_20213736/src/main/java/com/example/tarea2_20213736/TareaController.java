package com.example.tarea2_20213736;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class TareaController {
    ArrayList<Persona> lista = new ArrayList<>();

    @GetMapping(value = "")
    public String Formulario(){
        return "formulario";
    }

    //Usamos la manera estándar para traer datos del html
    @PostMapping(value = "/guardarEstandar")
    public String guardarEstandar(@RequestParam("nombre") String nombre,
                                  @RequestParam("apellido") String apellido,
                                  @RequestParam("dni") String dni,
                                  @RequestParam("codigo") String codigo,
                                  @RequestParam("direccion") String direccion, Model model){
        Persona p = new Persona(nombre, apellido, dni, codigo, direccion);

        System.out.println("Nombre: " + p.getNombre() + "\n" + "Apellido: " + p.getApellido() + "\n" +
                            "DNI: " + p.getDni() + "\n" + "Codigo PUCP: " + p.getCodigo());
        lista.add(p);
        return "formulario";
    }

    //Ahora guardaremos usando databinding y usando el objeto Persona
    @PostMapping(value = "/guardar")
    public String guardarDatabinding(Persona p){
        System.out.println("Nombre: " + p.getNombre() + "\n" + "Apellido: " + p.getApellido() + "\n" +
                "DNI: " + p.getDni() + "\n" + "Codigo PUCP: " + p.getCodigo());
        lista.add(p);
        return "formulario";
    }

    @PostMapping(value = "/MostrarLista")
    public String MostrarLista(Model model){
        model.addAttribute("lista", lista);
        return "lista";

    }
}
