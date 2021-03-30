/**
 * Write a description of class Ejemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo{
    public String verificarEdad(int edad){
        String res;
        if(edad>=18){
            res = "Eres mayor de edad, puedes ingresar";
        }else{
            res = "Eres menor de edad, no puedes ingresar";
        }
        return res;
    }
}
