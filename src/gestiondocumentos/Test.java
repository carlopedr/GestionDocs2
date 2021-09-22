package gestiondocumentos;

import Basicos.Organizacion;
import Basicos.Persona;
import DAO.OrganizacionDAO;
import DAO.PersonaDAO;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        LocalDate f = LocalDate.parse("23/11/1995", DateTimeFormatter.ofPattern("d/M/yyyy"));
        Persona rl = null;
        Organizacion eps1 = new Organizacion(501, "Exito", rl, "Zona Industrial", "contacto@exito.com", f, "COM");
        Organizacion eps2 = new Organizacion(502, "Bancolombia", rl, "Medellin Alpujarra", "correspondencia@bancolombia.com.co", f, "FIN");
        //Organizacion eps3 = new Organizacion(203, "Nueva EPS", rl, "Centro Empresarial", "director@nuevaeps.org", f, "EPS");
        OrganizacionDAO orgdao=new OrganizacionDAO();
        orgdao.insertarOrganizacion(eps1);
        orgdao.insertarOrganizacion(eps2);
        //orgdao.insertarOrganizacion(eps3);
        //Persona p = new Persona(0, "Esther Rodríguez", "erod01@gmail.com", f, "Plaza Mayor", eps2);
        //PersonaDAO perdao = new PersonaDAO();
        //Persona p1= new Persona();
        //p1.setNombre("Carlos1");
        //p1.setEmail("carlos1@gmail.com");
        //Test insertarPersona
       //perdao.insertarPersona(p1);
        //Test listaPersona()
       /* List<Persona> list = perdao.listPersona();
        Iterator<Persona> iter = list.iterator();
        Persona pl;
        System.out.println("Listado Personas");
        while (iter.hasNext()) {
            pl = iter.next();
            System.out.println(pl.toString());
        }*/
        
        //Test buscar persona por id
        /*
        try {
            Persona p1 = perdao.obtenerPersona(7.0);
            System.out.println("Persona: " + p1.toString());
        } catch (Exception e) {
            System.out.println("Error");
        }*/
        //Test actualizarPersona
        /*System.out.println("Antes de actualizar");
        Persona pAct = new Persona(7, "Rocio Dueñas", "rocio1234@yahoo.com", f, "Centro Histórico", eps1);
        perdao.actualizarPersona(pAct);
        System.out.println("Despes de actualizar");
        try {
            Persona p1 = perdao.obtenerPersona(7.0);
            System.out.println("Persona: " + p1.toString());
        } catch (Exception e) {
            System.out.println("Error");
        }*/
        //Test borrarPersona
        //Persona pDel = new Persona(2, "Camila Ruiz", "cami.ruiz@mail.com", f, "Torres del Prado ", eps2);
        //perdao.eliminarPersona(pDel);
        //System.out.println("Persona: " + p.toString()); */
    }
}
