/**
 * Write a description of class Ejemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejemplo{
    //sintaxis para crear un metodo
    //modificadorDeAcceso tipoDeRetorno nombreDelMetodo (Parametros)
    //parametro = tipo de variable, dato que llega de otro lado.
    
    //sitaxis de la declaracion de una variable.
    //tipoDeDato nombreDeLaVariable
    int id;
    public int sumar(int num1, int num2){
        int res; //declaracion de variable
        res = num1+num2; //asignacion de valor.
        return res; //retorno
    }
    
    public void asignarValorId(int valor){
        id = valor;
    }
}
