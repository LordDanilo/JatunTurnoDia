
/**
 * Write a description of class ejercicio1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio1
{
    public String verificar(int num){
        String respuesta;
        
        int ultimoDig = num%10;
        int primerDig = num/100;
        
        if(ultimoDig == primerDig){
            respuesta = "Si";
        }else{
            respuesta = "No";
        }
        
        return respuesta;
    }
}
