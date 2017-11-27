/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ticketDAO;
import java.util.Date;
import javax.enterprise.inject.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Martin
 */

@RestController
@RequestMapping("/guardar")
public class Guardar {
        
        @RequestMapping(method = RequestMethod.POST)
    public String recibir(@RequestParam("correo")String correo,@RequestParam("modelos")String modelos,
            @RequestParam("fallas")String fallas,  @RequestParam("descripcion")String descripcion, @RequestParam("imagen")String imagen,
            @RequestParam("fechacompra")Date fechacompra, @RequestParam("fecha_ticket")Date fecha_ticket, Model model){
            System.out.println(""+correo);
        ticketDAO tick = new ticketDAO();
        
        tick.savePersona(correo, modelos, correo, descripcion, imagen, fechacompra, fecha_ticket, fallas);
        
                
            
        return "";
    }
}
