public class Ejercicio3{
    public String verificarNumero(int dia){
        String respuesta;
        if(dia<10){
            respuesta = "Dia Normal";
        }else{
            int ultimoDig = dia%10;
            int primerDig = dia/10;
            if((ultimoDig%2 == 0) && (primerDig%2 != 0)){
                respuesta = "Cruz de Dariel";
            }else{
                if((ultimoDig%2 != 0) && (primerDig%2 == 0)){
                    respuesta = "Cruz de Dariel";
                }else{
                    respuesta = "Dia Normal";
                }
            }
        }

        return respuesta;
    }
}
