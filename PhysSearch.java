import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class PhysSearch {
    static class PhyscData { // name, height, vision을 가지는 객체 정의
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision){ // 객체 생성자
            this.name = name; 
            this.height = height;
            this.vision = vision;
        }

        public String toString() { // 객체의 정보들을 String으로 변환하여 출력한다. 
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator(); //클래스의 인스턴스 생성

        private static class HeightOrderComparator implements Comparator<PhyscData> { //comparator 인터페이스, compare 메서드 구현
            public int compare(PhyscData d1, PhyscData d2) { // comparator을 정의하는 부분
                return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0; // 두 height 값을 비교하여 d1의 값이 더 클 경우, 1을 반환하고, 더 작을 경우 -1, 같을 경우 0을 반환한다.

            }
        }


    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        PhyscData[] x = {
            new PhyscData("이나령", 162, 0.3),
            new PhyscData("유지훈", 168, 0.4),
            new PhyscData("김한결", 169, 0.8),
            new PhyscData("홍준기", 171, 1.5),
            new PhyscData("전서현", 173, 0.7),
            new PhyscData("이호연", 174, 1.2),
            new PhyscData("이수민", 175, 2.0),
        };

        System.out.print("찾으려고 하는 사람의 키를 입력하세요 : ");
        int height = stdIn.nextInt();
        
        int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER); // 배열 x에서, 키가 height인 요소를, HEIGHT_ORDER에 따라서 검색

        if (idx < 0)
            System.out.println("해당하는 요소가 없습니다.");

        else {
            System.out.println("x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]); // x[idx] 호출 시 자동으로 toString 메서드가 호출된다.
        }




    }
}