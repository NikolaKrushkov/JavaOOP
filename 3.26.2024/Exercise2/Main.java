package Exercise2;

public class Main {
    public static void main(String[] args){
        try{
            test1();
        } catch ( Exception ex) {
            System.out.println(ex.getMessage());
        }


    }

    public static void test1() {
        test2();
    }

    public static void test2() {
        test3();
    }
    public static void test3() {
        throw new IllegalArgumentException();
    }
}
