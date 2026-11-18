public abstract class Criatura {
    private final String nombre;
    private final int edad;
    private int energia;

    public Criatura(String nombre, int edad, int energia) {
        this.nombre = nombre;
        this.edad = edad;
        this.energia = Math.max(0, Math.min(100, energia));
    }

    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void alimentarse() {
        energia = Math.min(100, energia + 20);
    }

    public void descansar() {
        energia = Math.min(100, energia + 10);
    }

    protected boolean gastarEnergia(int cantidad) {
        if (energia < cantidad) {
            System.out.println(nombre + " no tiene suficiente energía.");
            return false;
        }
        energia -= cantidad;
        return true;
    }

    public abstract void realizarActividad();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " | " + nombre + ", edad: " + edad
                + ", energía: " + energia;
    }
}
