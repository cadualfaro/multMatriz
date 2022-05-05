/*
Quebra-Cabeça 2: Calcular multiplicação de matrizes
 */
package quebracabeca2;
import java.util.Arrays;
import java.util.Random;
public class QuebraCabeca2 {
    public static void main(String[] args) {
        Random rand = new Random();
        
        int linha = 3;
        int coluna = 3;
            int matriz[][] = new int [linha][coluna];
        int linha2 = 3;
        int coluna2 = 3;
            int Matriz[][] = new int [linha2][coluna2];
                int matrizC[][] = new int [linha][coluna2];
        
            for(int i=0;i<linha;i++)
                for(int j=0;j<coluna;j++){
                    matriz [i][j] = rand.nextInt(15);
                }
            
            System.out.println("Matriz 1");
            for(int i=0; i<matriz.length;i++){
                    System.out.println(Arrays.toString(matriz[i]));
                }

            for(int i=0;i<linha2;i++)
                for(int j=0;j<coluna2;j++){
                    Matriz [i][j] = rand.nextInt(15);
                }
            
            System.out.println("Matriz 2");
            for(int i=0; i<Matriz.length;i++){
                    System.out.println(Arrays.toString(Matriz[i]));
                }
            
            for (int i=0;i<linha;i++){
                for (int j=0;j<coluna2;j++){
                    for (int k=0;k<linha2;k++){
                matrizC[i][j] += matriz[i][k]*Matriz[k][j];
                }
                }
            }
            System.out.println("Matriz 3");
            for(int i=0; i<linha;i++){
                    System.out.println(Arrays.toString(matrizC[i]));
                }
    }
    
}
