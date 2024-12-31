package poly_;

/**
 * @author:Sam Zeng
 * @version:1.0
 */
public class poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog = new Dog("Dog");
        Cat cat = new Cat("Cat");
        Bone bone = new Bone("Bone");
        Fish fish = new Fish("Fish");

        tom.feed(dog,bone);
        tom.feed(cat,fish);
    }
}
