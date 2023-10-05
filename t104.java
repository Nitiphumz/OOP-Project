import java.util.Scanner;
public class t104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int Leon [][] = new int[row][column];
        for (int i = 0;i< row;i++){
            for (int j =0;j< column;j++){
                Leon[i][j] = sc.nextInt();
            }
        }
        int max =Leon[0][0];
        for(int i=0;i<row;i++){
        for(int j=0;j<column;j++){
            if(Leon[i][j]>max){
                max=Leon[i][j];
            }
        }
    }
    System.out.print(max);
    }
}
