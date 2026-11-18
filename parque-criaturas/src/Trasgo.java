public class Trasgo extends Duende {
    private final String materialTrampa;

    public Trasgo(String nombre, int edad, int energia, String materialTrampa) {
        super(nombre, edad, energia);
        this.materialTrampa = materialTrampa;
    }

    public void armarTrampa() {
        if (gastarEnergia(18)) {
            System.out.println(getNombre() + " arma una trampa de " + materialTrampa + ".");
        }
    }

    @Override
    public void realizarActividad() {
        armarTrampa();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", material de la trampa: " + materialTrampa;
    }
}
