/**
 * @Classname TestCreate
 * @Description TODO
 * @Date 2020/12/9 14:19
 * @Created by mmz
 */
/*测试class类的创建方式有几种*/
public class TestCreate {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是" + person.name);

        // 方式一:通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        // 方式二:通过forName获得
        Class c2 = Class.forName("Student");
        System.out.println(c2.hashCode());

        // 方式三:通过类获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        // 方式四:基本内置类型的包装类都有一个Type属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);

        // 获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}
class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }

}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}