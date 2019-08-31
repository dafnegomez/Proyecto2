package Numeros;

public class numeros {
    public numeros(){
      
         x = num();
         y = num();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

      private final int x;
      private final int y;
      int num(){
      
          int nume = (int) (Math.random() * 8);
    return nume;
}

      
      public int[][] rellenar(){
    int matriz[][] = new int[4][4];
   
    matriz[ getX()][getY()]= 3;
    matriz[0][0]=1;

    return matriz;
}

 public void mostrar(int matriz[][]){
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz1.length; j++) {
                int c = matriz1[j];
                System.out.print(c);
            }
            System.out.println();
        }
 }
}

 
