/**
 * @Classname TestReflection
 * @Description TODO
 * @Date 2020/12/9 10:57
 * @Created by mmz
 */
public class TestReflection {
    // 反射获取类的class对象
    public static void main(String[] args) throws ClassNotFoundException {
        Class user = Class.forName("User");
        System.out.println(user);

        // 一个类在内存中只有一个class对象
        // 一个类在加载之后，类的整个结构都会被封装在class对象中
        Class user1 = Class.forName("User");
        Class user2 = Class.forName("User");
        System.out.println(user1 == user2);

    }
}

// 实体类 pojo Entity
class User{
    private String name;
    private int id;
    private int age;

    public User(){

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    private void test(){
        System.out.println("我是test");
    }
}
