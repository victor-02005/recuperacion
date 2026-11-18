public class Dragon extends Criatura {
    private final int temperaturaFuego;
    private final boolean puedeVolar;

    public Dragon(String nombre, int edad, int energia, int temperaturaFuego, boolean puedeVolar) {
        super(nombre, edad, energia);
        this.temperaturaFuego = temperaturaFuego;
        this.puedeVolar = puedeVolar;
    }

    public void lanzarFuego() {
        if (gastarEnergia(25)) {
            System.out.println(getNombre() + " lanza fuego a " + temperaturaFuego + " grados.");
        }
    }

    @Override
    public void realizarActividad() {
        lanzarFuego();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", temperatura del fuego: " + temperaturaFuego
                + ", puede volar: " + puedeVolar;
    }
}
