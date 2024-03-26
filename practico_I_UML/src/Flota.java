import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Avion> aviones;
    private int id;

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
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
