public class Fenix extends Criatura {
    private final boolean puedeResurgir;
    private final String colorPlumas;

    public Fenix(String nombre, int edad, int energia, boolean puedeResurgir, String colorPlumas) {
        super(nombre, edad, energia);
        this.puedeResurgir = puedeResurgir;
        this.colorPlumas = colorPlumas;
    }

    public void volar() {
        if (gastarEnergia(20)) {
            System.out.println(getNombre() + " vuela sobre el parque.");
        }
    }

    @Override
    public void realizarActividad() {
        volar();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", puede resurgir: " + puedeResurgir
                + ", color de plumas: " + colorPlumas;
    }
}
