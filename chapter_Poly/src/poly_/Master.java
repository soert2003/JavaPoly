package poly_;

/**
 * @author:Sam Zeng
 * @version:1.0
 */
public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void feed(Animal animal,Food food){
        System.out.println(name + " feeds " + animal.getName() + " with " + food.getName());
    }
}
