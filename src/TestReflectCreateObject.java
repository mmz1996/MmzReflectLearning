import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Classname TestReflectCreateObject
 * @Description TODO
 * @Date 2020/12/10 1:35
 * @Created by mmz
 */
/*动态的创建对象，通过反射*/
public class TestReflectCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("User");

        // 构造一个对象
        User user =(User)c1.newInstance();
        System.out.println(user);

        // 通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);

        User mmz =(User)declaredConstructor.newInstance("mmz", 1, 18);
        System.out.println(mmz);


        // 通过反射调用普通方法
        User user1 = (User)c1.newInstance();

        // 通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        // invoke方法 (对象,方法的值)

        setName.invoke(user1,"mmz1996");
        System.out.println(user1.getName());

        // 通过反射操作属性
        User user2 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");

        // 不能直接操作私有属性，通过方法的setAccessible
        name.setAccessible(true);
        name.set(user2,"mmz19960224");
        System.out.println(user2.getName());
    }

}
