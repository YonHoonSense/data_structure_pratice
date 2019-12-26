package Algo_practice;

public class Multi{
    public static void main(String[] args) {

        System.out.print("   |");
        for(int i=1; i<=9; i++) {
            System.out.printf("%3d", i); //숫자를 강제로 3자리로 칸을 맞춰줌
        }
        System.out.print("\n---+--------------------------\n");

        for (int i=1; i<=9; i++) {
            System.out.printf("%2d |" , i); //숫자를 강제로 2자리로 칸을 맞춰줌
            for(int j=1; j<=9; j++){
                System.out.printf("%3d", i*j);   //3자리 맞춤
            }
            System.out.println();
        }
    }
}

