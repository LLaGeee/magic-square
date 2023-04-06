import java.util.*;

class MagicSquare{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do{
            System.out.print("Enter an odd number from 3 to 11: ");
            size = input.nextInt();
        }while(size % 2 == 0 || size < 3 || size > 11);

        square(size);

        
        input.close();
    }

    public static void square(int s){
        int[][] ms = new int[s][s];
        int row = (s / 2) + 1, column = (s / 2) + 1;

        ms[row][column] = 1;

        for(int count = 2; count <= s*s; count++){

            //Want the next number to go up one row and to the right one column, so that should be minus a row and plus a column
            //Once the row or column are out of index, you want the row to go to the bottom or the column to go to the far left

            row--;
            column++;

            /*if(ms[row][column] != 0){
                //column -=2;
                row += 1;
            }*/

            if(row < 0){
                row = s - 1;
            }

            if(column == s){
                column = 0;
            }

            

            ms[row][column] = count;
        }

        for(int r = 0; r < s; r++){
            for(int c = 0; c < s; c++){
                System.out.print(ms[r][c] + "\t");
            }
            System.out.println("");
        }
    }

}