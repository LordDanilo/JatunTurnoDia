public class EjemploCiclo{
    public int contarDigitos(int num){
        int res=0;
        while(num>0){
            res++;
            num = num/10;
        }
        return res;
    }
    public int factorial(int num){
        int res=1;
        //variableDeControlLocal; condicion(en base a la variable de control local; variacion)
        for(int n=1; n<=num; n++){
            res = res*n;
        }
        return res;
    }
}
