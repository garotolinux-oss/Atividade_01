public class Main {
    public static void main(String[] args) {
        Condicionador c = new Condicionador("Arno");
        c.alterarTemp(16.2);
        c.dimTemp();
        c.aumTemp();
        c.dimTemp();
        System.out.println(c);
        c.desligar_ar();
        System.out.println(c);

    }
}
