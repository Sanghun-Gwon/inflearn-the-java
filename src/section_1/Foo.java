package section_1;

public class Foo {


    public static void main(String[] args) {
        // 익명 내부 클래스
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Foo doIt");
            }
        };

        RunSomething runSomething_ramda = () -> System.out.println("Foo doIt(ramda)");


        runSomething.doIt();
        runSomething_ramda.doIt();
    }
}
