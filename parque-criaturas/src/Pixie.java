public class Pixie extends Duende {
    private final String colorPolvo;

    public Pixie(String nombre, int edad, int energia, String colorPolvo) {
        super(nombre, edad, energia);
        this.colorPolvo = colorPolvo;
    }

    public void esparcirPolvo() {
        if (gastarEnergia(12)) {
            System.out.println(getNombre() + " esparce polvo mágico de color " + colorPolvo + ".");
        }
    }

    @Override
    public void realizarActividad() {
        esparcirPolvo();
    }

    @Override
    public String toString() {
        return super.toString()
                + ", color del polvo: " + colorPolvo;
    }
}
