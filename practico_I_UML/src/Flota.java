public class Flota {
    private List<Avion> aviones;

    public Flota() {
        this.aviones = new ArrayList<>();
    }

    public void addAvion(Avion avion) {
        aviones.add(avion);
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
    }
}
