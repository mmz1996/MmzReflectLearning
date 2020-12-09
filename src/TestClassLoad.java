/**
 * @Classname TestClassLoad
 * @Description TODO
 * @Date 2020/12/9 14:45
 * @Created by mmz
 */
public class TestClassLoad {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }


}

class A{
    static int m = 100;
    static {
        System.out.println("A类静态代码块初始化");
        m = 300;
    }


    public A(){
        System.out.println("A类的无参构造初始化");
    }
}