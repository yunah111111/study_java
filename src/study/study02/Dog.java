package study.study02;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("동물 이름: " + name);
        System.out.println("소리: 멍멍");
    }
}
