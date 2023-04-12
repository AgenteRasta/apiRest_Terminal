package com.estiven.manejoterminal.repository;

import com.estiven.manejoterminal.repository.models.Bus;
import com.estiven.manejoterminal.repository.models.Destino;
import com.estiven.manejoterminal.repository.models.Pasajero;
import com.estiven.manejoterminal.repository.models.Viaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class TerminalTransporte {

    private String nombre;
    private List<Destino> destinos;
    private List<Bus> buses;
    private Bus busViaje;
    private List<Pasajero> pasajeros;
    private List<Pasajero> pasajerosBus;
    private int indexId;


    private int c=0;

    public TerminalTransporte() {
        this.nombre = "Terminal";
        destinos=new ArrayList<>(List.of(new Destino("1","Bogota",60),
                new Destino("2","Cali",30),
                new Destino("3","Medellin",80),
                new Destino("4","Buga",90)));
        buses=new ArrayList<>(List.of(
                new Bus("1","Mazda",new Destino("1","Bogota",60),"7:00AM",20,pasajerosBus),
                new Bus("2","Honda",new Destino("2","Cali",30),"9:00AM",15,pasajerosBus),
                new Bus("3","Yamaha",new Destino("3","Medellin",80),"10:00AM",10,pasajerosBus),
                new Bus("4","Chino",new Destino("4","Buga",90),"11:00AM",4,pasajerosBus)
        ));
        pasajeros=new ArrayList<Pasajero>(List.of(
                new Pasajero("1","Carlos",123,313),
                new Pasajero("2","Fabio",456,313),
                new Pasajero("3","Mario",789,313),
                new Pasajero("4","Vanessa",147,313),
                new Pasajero("5","Isabella",369,313),
                new Pasajero("6","Estiven",852,313),
                new Pasajero("7","Juan",951,313),
                new Pasajero("8","David",753,313),
                new Pasajero("9","Luisa",145,313)
        ));
    }

//__________________________________________DESTINO_______________________________________
    public void agregarDestino(Destino destino){
        destinos.add(destino);
    }

    public List<Destino> getDestinos() {
        return destinos;
    }
//__________________________________________FIN DESTINO_______________________________________
//__________________________________________PASAJERO__________________________________________
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void sacarPasajeros(){

        List<Pasajero> pasajerosAux=new ArrayList<>();

        List<Pasajero> resultado=pasajeros.stream().map(pasajero ->{
            List<Pasajero> resultadoB=pasajerosBus.stream().map(pasajeroB -> {
                if(Integer.parseInt(pasajero.getId())==Integer.parseInt(pasajeroB.getId())){
                    c=1;
                }
                return pasajeroB;
            }).collect(Collectors.toList());
            if(c==0){
                pasajerosAux.add(pasajero);
            }
            c=0;
            return pasajero;
        }).collect(Collectors.toList());
        /*for(Pasajero pasajeroT:pasajeros){
            for(Pasajero pasajeroB:pasajerosBus){
                if(Integer.parseInt(pasajeroT.getId())==Integer.parseInt(pasajeroB.getId())){
                    c=1;
                }
            }
            if(c==0){
                pasajerosAux.add(pasajeroT);
            }
            c=0;
        }*/
        pasajeros=pasajerosAux;

    }

//__________________________________________FIN PASAJERO__________________________________________
//__________________________________________BUS___________________________________________________
    public void sacarBus(){
        List<Bus> busesAux=new ArrayList<>();

        List<Bus> resultado=buses.stream().map(bus -> {
            if(Integer.parseInt(bus.getId())!=Integer.parseInt(busViaje.getId())){
                busesAux.add(bus);
            }
            return bus;
        }).collect(Collectors.toList());
        /*for(Bus b:buses){
            if(Integer.parseInt(b.getId())!=Integer.parseInt(busViaje.getId())){
                busesAux.add(b);
            }
        }*/
        buses=busesAux;



    }
    public void agregarBus(Bus bus){
        buses.add(bus);
    }

    public List<Bus> getBuses(){
        return buses;
    }

//__________________________________________FIN BUS__________________________________________
//__________________________________________PASAJERO BUS______________________________________________

    public void setPasajerosBus(List<Pasajero> pasajerosBus){
        this.pasajerosBus=pasajerosBus;
    }
//__________________________________________FIN PASAJERO BUS__________________________________________
//__________________________________________BUS VIAJE______________________________________________

    public void setBusViaje(Bus busViaje){
        this.busViaje=busViaje;
    }


}