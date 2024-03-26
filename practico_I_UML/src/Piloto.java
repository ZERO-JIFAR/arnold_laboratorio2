public class Piloto {
    private int id;
    private int hs_vuelo;


    public Piloto(int id, int hs_vuelo) {
        this.id = id;
        this.hs_vuelo = hs_vuelo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getHs_vuelo() {
        return hs_vuelo;
    }

    public void setHs_vuelo(int hs_vuelo) {
        this.hs_vuelo = hs_vuelo;
    }

}
