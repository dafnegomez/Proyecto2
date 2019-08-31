package Proyecto2;

import java.util.Scanner;
import Numeros.numeros;

public class proyecto {
   
    static int x,y,z;
  
    static numeros l  = new numeros ();
 
       static int[][] matriz = l.rellenar();
       
       
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int op;
       boolean n = true;
      
      do{
      
       l.mostrar(matriz);
       op = s.nextInt();
       switch(op){
          case 1:
              DERECHA();
            break;
          case 2:
              ABAJO();
                break;
          case 3:
              IZQUIERDA();
                break;
          case 4:
              ARRIBA();
                break;

                
          default:
              break;
       };
      
      if(matriz[l.getX()][l.getY()]==1) {
             n = false;
               l.mostrar(matriz);
         }
      }
      
      while(n);
      
      System.out.print(" \033[31m FELICIDADES, \033[34m ENCONTRASTE \033[32m EL NUMERO \n ");
       }
    
       static public void DERECHA(){
        if(y<matriz.length-1){
    
            int busc = matriz[x][y];
            matriz[x][y]=z;
            y++;
            matriz[x][y]=busc;
        }
    }
   
       static public void ABAJO(){
       if(x<matriz.length-1){
           int busc = matriz[x][y];
           matriz[x][y]=z;
           x++;
           matriz[x][y]=busc;
    }
       }
  
       static public void IZQUIERDA(){
       if(y>0){  
           int busc = matriz[x][y];
           matriz[x][y]=z;
           y--;
           matriz[x][y]=busc;
    }
   }
   
       static public void ARRIBA(){
       if(x>0){
           int busc = matriz[x][y];
           matriz[x][y]=z;
           x--;
           matriz[x][y]=busc;
    }
       }
}

