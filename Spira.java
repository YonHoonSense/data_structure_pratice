import java.util.Scanner;

class Spira {
    public static void main(String[] args){
        
        Scanner stdIn = new Scanner(System.in);
        System.out.print("n단의 피라미드 출력 , n을 입력하세요. ");

        int a = stdIn.nextInt();
        stdIn.close();

        for(int i=0; i<=a; i++){
            for (int j = 1; j <= a - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
        }
    }
}

