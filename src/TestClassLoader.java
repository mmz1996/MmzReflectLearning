/**
 * @Classname TestClassLoader
 * @Description TODO
 * @Date 2020/12/10 1:11
 * @Created by mmz
 */
public class TestClassLoader {
    public static void main(String[] args) throws ClassNotFoundException {
        // 系统类加载器
        ClassLoader classLoader =  ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        // 获取拓展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

        // 获取根类加载器
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);


        // 测试当前的类是谁加载的
        ClassLoader testClassLoader = Class.forName("TestClassLoader").getClassLoader();
        System.out.println(testClassLoader);


        // 测试jdk内置的类是谁加载的
        testClassLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(testClassLoader);

        // 得到系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
