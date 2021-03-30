public class Criba{
    public String numerosPrimos(){
        boolean[] arr = new boolean[100];
        for(int pos=2; pos<arr.length; pos++){
            if(arr[pos]==false){
                int multi=2;
                while(multi*pos <arr.length){
                    arr[multi*pos] = true;
                    multi++;
                }
            }
        }
        String res = generarCadenaRes(arr);
        return res;
    }
    private String generarCadenaRes(boolean[] arr){
        String res = "";
        for(int i=2; i<arr.length; i++){
            if(arr[i] == false){
                res = res + i +" ";
            }
        }
        return res;
    }
}
