package poly_;

/**
 * @author:Sam Zeng
 * @version:1.0
 */
public class PolyMethod_ {
    public static void main(String[] args) {
        A a = new A();
        a.sum(1,2);
        a.sum(1,2,3);
        //方法重写体现多态
        B b = new B();
        a.test();
        b.test();
    }
}

class A{
    public void sum(int a, int b){
        System.out.println(a + b);
    }
    public void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }
    public void test(){
        System.out.println("A test");
    }
}

class B extends A{
    @Override
    public void test(){
        System.out.println("B test");
    }
}
