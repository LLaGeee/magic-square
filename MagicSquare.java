import java.util.*;

class MagicSquare{


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        do{
            System.out.print("Enter an odd number from 3 to 11: ");
            size = input.nextInt();
        }while(size % 2 == 0);
    }
}