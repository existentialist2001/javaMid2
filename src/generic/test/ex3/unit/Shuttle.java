package generic.test.ex3.unit;

public class Shuttle<B extends BioUnit> {

    private B b;

    public void in(B b) {
        this.b = b;
    }

    public void showInfo() {
        System.out.println("이름: " + b.getName() + ", HP: " + b.getHp());
    }
}

