/**
 * @Classname TestClassInit
 * @Description TODO
 * @Date 2020/12/9 15:00
 * @Created by mmz
 */
public class TestClassInit {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        // 主动引用
//        Son son = new Son();
//
//        // 反射 也是主动引用
//        Class.forName("Son");

//        // 不会产生类的引用的方法
//        System.out.println(Son.b);

//        Son[] array = new Son[10];

        System.out.println(Son.M);
    }
}

class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
    }

    static int m = 300;
    static final int M = 1;
}