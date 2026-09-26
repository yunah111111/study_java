package study.study02;

public class Tiger extends Animal{
    public Tiger (String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("동물 이름: " + name);
        System.out.println("소리: 어흥");
    }
}
