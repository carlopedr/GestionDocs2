/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDAO;

import Basicos.Persona;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IPersonaDAO {
    //Obtener todos los registros de Persona desde la BD
    public List<Persona> listPersona();
    //Obtener la persona con el id del parametro
    public Persona obtenerPersona(double id);

    public void insertarPersona(Persona persona);
    
    public void actualizarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
