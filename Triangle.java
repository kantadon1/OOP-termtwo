public class Triangle{
    public static void main(String[] args){
        for(int i=0; i < 5; i++){
            for(int j=0; j <= 5+i; j++){
              if(j >= 5 - i){
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

