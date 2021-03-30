/**
 * Write a description of class Ejemplo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo2{
    public String verificarNumero(int numero){
        String res;
        if(numero%2 == 0){
            res = "El Numero es Par";
        }else{
            res = "El Numero es Impar";
        }
        return res; 
    }
}
