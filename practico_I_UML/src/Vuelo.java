public class Vuelo {
    private int id;
    private Date fecha;
    private String ruta;
    private Avion avion;

    public Vuelo(int id, Date fecha, String ruta, Avion avion) {
        this.id = id;
        this.fecha = fecha;
        this.ruta = ruta;
        this.avion = avion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
