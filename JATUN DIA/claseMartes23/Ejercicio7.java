/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio7{
    public int calcularBateria(){
        int bateriaActual = 55;
        int gastoJuego    = (30*20)/60;
        int gastoRedes    = (15*10)/60;
        int gastoYoutube  = (40*15)/60;
        int gastoTotal = gastoJuego+gastoRedes+gastoYoutube;
        int res = bateriaActual-gastoTotal;
        return res;
    }
}
