package study.study02;

public class Cat extends Animal{
    public Cat (String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("동물 이름: " + name);
        System.out.println("소리: 야옹");
    }
}
