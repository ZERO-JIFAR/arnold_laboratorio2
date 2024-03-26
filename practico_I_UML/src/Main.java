import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import Avion;
import Pasajero;
import Reserva;
import Vuelo;

public class Main {

    public static void main(String[] args) {


        Avion avion = new Avion();
        avion.setId(1);
        avion.setModelo("Biplano");
        avion.setCapacidad(100);


        Vuelo vuelo = new Vuelo();
        vuelo.setFecha(4/8/20);
        vuelo.setId(454);
        vuelo.setRuta("Por ahi nomas");

        Reserva reserva = new Reserva();
        reserva.setAsiento(true);
        reserva.setId(45);
        reserva.setPasajero(pasajero);
        reserva.setVuelo(vuelo);

        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Carlos");
        pasajero.setId(789);


        Flota flota = new Flota();
        //flota.setAviones(List<Avion>);
        flota.setId(485);

        System.out.println("Vuelo " + avion.getId() + " con destino a " + vuelo.getRuta() + ", Pasajero " + reserva.getPasajero());

    }

}