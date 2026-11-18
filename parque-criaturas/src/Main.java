public class Main {
    public static void main(String[] args) {
        Parque parque = new Parque();
        Dragon dragon = new Dragon("Brasa", 20, 70, 850, true);
        Pixie pixie = new Pixie("Luz", 4, 5, "violeta");

        parque.agregarCriatura(dragon);
        parque.agregarCriatura(new Unicornio("Luna", 8, 65, "Curación", 1));
        parque.agregarCriatura(new Fenix("Sol", 15, 60, true, "rojo"));
        parque.agregarCriatura(new Leprechaun("Trébol", 30, 55, 12));
        parque.agregarCriatura(pixie);
        parque.agregarCriatura(new Trasgo("Grumo", 12, 50, "metal"));

        dragon.alimentarse();
        pixie.descansar();

        System.out.println("Criaturas del parque");
        parque.listarCriaturas();
        System.out.println("\nActividades");
        parque.realizarActividades();
        System.out.println("\nEnergía final");
        parque.mostrarEnergia();
    }
}
