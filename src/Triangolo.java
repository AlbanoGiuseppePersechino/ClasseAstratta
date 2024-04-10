class Triangolo extends Forma {
    // Attributi per la base e l'altezza del triangolo
    private double base;
    private double altezza;

    // Costruttore del triangolo
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo astratto calcolaArea per calcolare l'area del triangolo
    @Override
    public double calcolaArea() {
        return (base * altezza) / 2;
    }
}