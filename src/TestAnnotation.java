import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @Classname TestAnnotation
 * @Description TODO
 * @Date 2020/12/10 2:12
 * @Created by mmz
 */
/*反射操作注解*/
public class TestAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Student2");
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        // 获取注解value的值
        Mmz mmz  =(Mmz)c1.getDeclaredAnnotation(Mmz.class);
        String value = mmz.value();
        System.out.println(value);

        // 获得类指定的注解
        Field name = c1.getDeclaredField("name");
        Fieldmmz annotation = name.getAnnotation(Fieldmmz.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());
    }

}
@Mmz("db_student")
class Student2{
    @Fieldmmz(columnName = "db_id",type = "int",length = 10)
    private int id ;
    @Fieldmmz(columnName = "db_age",type = "int",length = 10)
    private int age;
    @Fieldmmz(columnName = "db_name",type = "varchar",length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

// 类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Mmz{
    String value();
}

// 属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Fieldmmz{
    String columnName();
    String type();
    int length();
}
