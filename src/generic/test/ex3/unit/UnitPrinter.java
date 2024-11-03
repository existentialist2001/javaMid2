package generic.test.ex3.unit;

public class UnitPrinter {

    static void printV2(Shuttle<? extends BioUnit> s) {
        s.showInfo();
    }

    static <U extends BioUnit> void printV1(Shuttle<U> s) {
        s.showInfo();
    }
}
