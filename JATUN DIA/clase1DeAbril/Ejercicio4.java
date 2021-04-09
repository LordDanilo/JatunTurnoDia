public class Ejercicio4{
    public String verificarEstado(String colorActual, int cambios){
        String respuesta;
        cambios = cambios%3;
        
        int estadoVerde    = 0;
        int estadoAmarillo = 1;
        int estadoRojo     = 2;
        
        int estadoActual;
        if(colorActual.equals("verde")){
            estadoActual = 0;
        }else{
            if(colorActual.equals("amarillo")){
                estadoActual = 1;
            }else{
                estadoActual = 2;
            }
        }
        
        int estadoFinal = (estadoActual+cambios)%3;
        
        if(estadoFinal == 0){
            respuesta = "verde";
        }else{
            if(estadoFinal == 1){
                respuesta = "amarillo";
            }else{
                respuesta = "rojo";
            }
        }
        
        return respuesta;
    }
}
