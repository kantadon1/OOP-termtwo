public class Triangle{
    public static void main(String[] args){
        for(int i=1; i <= 5; i++){
            for(int j=0; j <= 5+i-1; j++){
              if(j >= 5 - i+1){
                System.out.print("0");
              }
              else{
                System.out.print(" ");
              }
            }
            System.out.println();
        }
    }
}

