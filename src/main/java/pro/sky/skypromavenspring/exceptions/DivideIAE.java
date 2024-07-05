package pro.sky.skypromavenspring.exceptions;

public class DivideIAE extends IllegalArgumentException {

    public DivideIAE(String s) {
        super(s);
    }

    public DivideIAE() {
        super();
    }
}
