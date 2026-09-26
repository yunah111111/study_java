package study.study02;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("고양이"),
                new Dog("강아지"),
                new Tiger("호랑이")
        };

        for (Animal animal : animals) {
            animal.sound();
        }

    }
}
