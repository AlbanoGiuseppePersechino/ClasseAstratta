public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(5, 3);
        Triangolo triangolo = new Triangolo(4, 6);

        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());
        System.out.println("L'area del triangolo è: " + triangolo.calcolaArea());
    }
}