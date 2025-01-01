package poly_.objectpoly_;

/**
 * @author:Sam Zeng
 * @version:1.0
 */
public class PolyObject_ {
    public static void main(String[] args) {
        //等号左边是编译类型，右边是运行类型
        Animal animal = new Dog();
        //结果是什么？看运行类型
        animal.cry();
        //运行类型可以修改，但编译类型不可以
        //运行类型修改为cat
        animal = new Cat();
        animal.cry();
    }
}
