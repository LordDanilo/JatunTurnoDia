
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio2{
    public int calcularValorMinimo(int a, int b, int c){
        int respuesta;
        
        int suma1 = a+b;
        int suma2 = a+c;
        int suma3 = b+c;
        
        if(suma1 < suma2){
            if(suma1 < suma3){
                respuesta = suma1;
            }else{
                respuesta = suma3;
            }
        }else{
            if(suma2 < suma3){
                respuesta = suma2;
            }else{
                respuesta = suma3;
            }
        }
        return respuesta;
    }
}
