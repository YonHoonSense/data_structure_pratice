package Algo_practice;

class GenericTest { 

    static class GenericClass<T> {
        private T xyz; // 자료형 T 변수 xyz
        
        GenericClass(T t){
            this.xyz = t;
        }

        T getXyz() {
            return xyz;
        }

    }

    public static void main(String[] args){

        GenericClass<String> s = new GenericClass<String>("ABC");
        GenericClass<Integer> n = new GenericClass<Integer>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());
    }
}