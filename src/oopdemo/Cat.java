package oopdemo;
public class Cat {
    public String name;
    public int age;
    public boolean cins;

    public Cat(String name, int age, boolean cins) {
        this.name = name;
        this.age = age;
        this.cins = cins;


    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cins=" + cins +
                '}';
    }
}


