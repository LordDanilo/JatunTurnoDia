public class Ejercicio6{
    public String verificarEdades(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3){
        String res;
        
        String nombreMayor;
        String nombreMedio;
        String nombreMenor;
        
        if(edad1>edad2 && edad1>edad3){
            nombreMayor = nombre1;
            if(edad2>edad3){
                nombreMedio = nombre2;
                nombreMenor = nombre3;
            }else{
                nombreMedio = nombre3;
                nombreMenor = nombre2;
            }
        }else{
            if(edad2>edad3){
                nombreMayor = nombre2;
                if(edad1<edad3){
                    nombreMenor = nombre1;
                    nombreMedio = nombre3;
                }else{
                    nombreMenor = nombre3;
                    nombreMedio = nombre1;
                }
            }else{
                nombreMayor = nombre3;
                if(edad1<edad2){
                    nombreMenor = nombre1;
                    nombreMedio = nombre2;
                }else{
                    nombreMenor = nombre2;
                    nombreMedio = nombre1;
                }
            }
        }
        res = "El hermano mayor es "+nombreMayor+"\n"+" El hermano del medio es "+nombreMedio+"\n"+" El hermano menor es "+nombreMenor;
        return res;
    }
}
