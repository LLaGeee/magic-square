import java.util.*;

class MagicSquare{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do{
            System.out.print("Enter an odd number from 3 to 11: ");
            size = input.nextInt();
        }while(size % 2 == 0);

        square(size);

        

    }

    public static void square(int s){
        int[][] ms = new int[s][s];
        int count = 1;

        for(int i = 0; i < s; i++){
            for(int j = 0; j < s; j++){
                ms[i][j] = count;
                count++;
            }
        }

        for(int r = 0; r < s; r++){
            for(int c = 0; c < s; c++){
                System.out.print(ms[r][c] + "  ");
            }
            System.out.println("");
        }
    }

}