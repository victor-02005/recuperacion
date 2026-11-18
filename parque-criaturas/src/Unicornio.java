public class Unicornio extends Criatura {
    private final String poderMagico;
    private final int numeroCuernos;

    public Unicornio(String nombre, int edad, int energia, String poderMagico, int numeroCuernos) {
        super(nombre, edad, energia);
        this.poderMagico = poderMagico;
        this.numeroCuernos = numeroCuernos;
    }

    public void usarMagia() {
        if (gastarEnergia(15)) {
            System.out.println(getNombre() + " usa su magia de " + poderMagico + ".");
        }
    }

    @Override
    public void realizarActividad() {
        usarMagia();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", poder mágico: " + poderMagico
                + ", número de cuernos: " + numeroCuernos;
    }
}
