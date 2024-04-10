class Rettangolo extends Forma {
    private final double base;
    private final double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
