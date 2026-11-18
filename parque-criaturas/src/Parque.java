import java.util.ArrayList;

public class Parque {
    private final ArrayList<Criatura> criaturas = new ArrayList<>();

    public void agregarCriatura(Criatura criatura) {
        criaturas.add(criatura);
    }

    public void listarCriaturas() {
        for (Criatura criatura : criaturas) {
            System.out.println(criatura);
        }
    }

    public void realizarActividades() {
        for (Criatura criatura : criaturas) {
            criatura.realizarActividad();
        }
    }

    public void mostrarEnergia() {
        for (Criatura criatura : criaturas) {
            System.out.println(criatura.getNombre() + ": " + criatura.getEnergia() + "/100");
        }
    }
}
