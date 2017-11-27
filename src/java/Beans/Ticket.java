/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Martin
 */


@Entity
@Table(name="ticket")
public class Ticket {
    
    
    //declaramos nuestra variable key igual como en Mysql
    
    @Id @GeneratedValue
    @Column(name="idticket")
    private int idticket;
    
    
    @Column(name="correo")
    private String correo;
    
    @Column(name="modelo")
    private String modelo;
    
    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="imagen")
    private String imagen;
    
    @Column(name="fechacompra")
    private Date fechacompra;
    
   @Column(name="fecha_ticket")
    private Date fecha_ticket;
   
   
    @Column(name="falla")
    private String falla;
   
   public  Ticket(){
       
   }
   
   
   public  Ticket(int idticket, String correo, String modelo, 
           String descripcion, String imagen, Date fechacompra,
           Date fecha_ticket, String falla){
       
       this.idticket = idticket;
       this.correo = correo;
       this.descripcion = descripcion;
       this.fecha_ticket = fecha_ticket;
       this.fechacompra = fechacompra;
       this.imagen = imagen;
       this.modelo = modelo;
       this.falla = falla;
       
   }

    /**
     * @return the idticket
     */
    public int getIdticket() {
        return idticket;
    }

    /**
     * @param idticket the idticket to set
     */
    public void setIdticket(int idticket) {
        this.idticket = idticket;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * @return the fechacompra
     */
    public Date getFechacompra() {
        return fechacompra;
    }

    /**
     * @param fechacompra the fechacompra to set
     */
    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    /**
     * @return the fecha_ticket
     */
    public Date getFecha_ticket() {
        return fecha_ticket;
    }

    /**
     * @param fecha_ticket the fecha_ticket to set
     */
    public void setFecha_ticket(Date fecha_ticket) {
        this.fecha_ticket = fecha_ticket;
    }

    /**
     * @return the falla
     */
    public String getFalla() {
        return falla;
    }

    /**
     * @param falla the falla to set
     */
    public void setFalla(String falla) {
        this.falla = falla;
    }
   
   

   
    
    
}
