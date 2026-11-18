public class Leprechaun extends Duende {
    private int monedasOro;

    public Leprechaun(String nombre, int edad, int energia, int monedasOro) {
        super(nombre, edad, energia);
        this.monedasOro = monedasOro;
    }

    public void encontrarMoneda() {
        if (gastarEnergia(10)) {
            monedasOro++;
            System.out.println(getNombre() + " encuentra una moneda. Ahora tiene " + monedasOro + ".");
        }
    }

    @Override
    public void realizarActividad() {
        encontrarMoneda();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", monedas de oro: " + monedasOro;
    }
}
