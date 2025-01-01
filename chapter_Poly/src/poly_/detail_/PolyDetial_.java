package poly_.detail_;

/**
 * @author:Sam Zeng
 * @version:1.0
 */
public class PolyDetial_ {
    public static void main(String[] args) {
        //多态的前提是:两个类或者对象有继承关系
        //向上转型:父类的引用指向子类的对象
        //可以调用父类的所有成员(遵守访问权限),不能调用子类的特有成员
        Animal animal = new Cat();
        animal.eat();//最终运行效果看子类的具体实现
        animal.sleep();//ok
       // animal.walk();//wrong
    }
}
