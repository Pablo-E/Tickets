/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Beans.Ticket;
import hbm.HibernateUtil;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Martin
 */
public class ticketDAO {
    Session session;
    
    public ticketDAO(Session session){
     this.session  = session;   
    }
    
    public ticketDAO(){
        session = HibernateUtil.getLocalSession();
    }
    
    
    
    public boolean savePersona( String correo,String modelo, String problema, 
           String descripcion, String imagen, Date fechacompra,
           Date fecha_ticket, String falla) {
        Ticket t = new Ticket();

       t.setCorreo(correo);
       t.setModelo(modelo);
       t.setDescripcion(descripcion);
       t.setFechacompra(fechacompra);
       t.setFecha_ticket(fecha_ticket);
       t.setFalla(falla);
       t.setImagen(imagen);
       
        System.out.println("estoy aqui");
      

        try {
            Transaction transaccion = session.beginTransaction();
            session.save(t);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
    }
    
    
    public List<Ticket> getAll(){
        return (List<Ticket>) session.createCriteria(Ticket.class).list();
    }
    
}
