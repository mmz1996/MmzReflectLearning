import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Classname TestInfoClass
 * @Description TODO
 * @Date 2020/12/10 1:21
 * @Created by mmz
 */
/*获取类的信息*/
public class TestInfoClass {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class user = Class.forName("User");

        User users = new User();
        // 获得类的名字
        System.out.println(user.getName()); // 可以得到包名

        // 获得类的简单名字
        System.out.println(user.getSimpleName());

        // 获得类的属性
        Field[] fields = user.getFields(); // 只能找到public属性
        for (Field field : fields) {
            System.out.println(field);
        }

        fields = user.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-----");
        // 获得指定的名字
        System.out.println(user.getDeclaredField("name"));

        // 获得类的方法，以及父类的所有方法

        Method[] methods = user.getMethods();
        for (Method method : methods) {
            System.out.println("正常的"+method);
        }

        // 只获得本类的方法
        methods = user.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("私有的"+method);
        }

        // 获得指定方法
        System.out.println(user.getMethod("getName", null));

        System.out.println(user.getMethod("setName", String.class));

        // 获得指定的构造器
        Constructor[] declaredConstructors = user.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

    }
}
