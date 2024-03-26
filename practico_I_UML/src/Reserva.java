public class Reserva {
    private int id;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private String asiento;

    public Reserva(int id, Vuelo vuelo, Pasajero pasajero, String asiento) {
        this.id = id;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.asiento = asiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}
