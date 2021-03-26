/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio6{
    public String calcularTiempo(){
        int horaDormir = 2;
        int minutosDormir = 45;
        
        int horaDespertar = 11;
        int minutosDespertar = 25;
        
        int minutosRes = (25+60)-45;
        int horasRes   = horaDespertar - (horaDormir+1);
        
        String res = horasRes + ":" + minutosRes;
        return res;
    }
}
