
/**
 * Es un bot que saluda, segun tu nombre.
 * 
 * @author (Danilo) 
 * @version (1.0)
 */
public class Saludador{ 
    //tipo_de_dato nombre_de_la_variable
    /**
     * Metodo que saluda a una persona.
     * 
     * @param  nombre del usuario
     * @return     un saludo 
     */
    public String saludar(String nombre){
        String respuesta; //declaracion
        respuesta = "HOLA " + nombre;
        return respuesta;
    }
}
