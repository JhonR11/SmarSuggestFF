package Logica;

import Entidades.TarjetaGrafica;
import java.util.ArrayList;
import Persistencia.ITarjeta;
import Persistencia.TXTCreate.TXTTarjetas;

public class LogicaTarjeta {

    private ITarjeta data;

    public LogicaTarjeta() {
        this.data = new TXTTarjetas();
    }

    public void registrarTarjeta(TarjetaGrafica tg) {
        this.data.agregarTarjeta(tg);
    }

    public ArrayList<TarjetaGrafica> consultarTarjetas() {
        return this.data.obtenerTarjetas();
    }

    public TarjetaGrafica buscarTarjeta(String nom) {
        TarjetaGrafica pos = this.data.buscarTarjeta(nom);
        return pos;
    }

    public TarjetaGrafica crearTarjeta(int ID, String nombre, String modelo, String VRam, String tipoMemoria, int consumo, boolean alimentacionExterna, String pines, String puerto, int procesador, String gama) {
        TarjetaGrafica nuevaTarjeta = new TarjetaGrafica(ID, nombre, modelo, VRam, tipoMemoria, consumo, alimentacionExterna, pines, puerto, procesador, gama);
        return nuevaTarjeta;
    }

    public void reemplazarTarjeta(int ID, TarjetaGrafica tg) {
        this.data.reemplazarTarjeta(ID, tg);
    }

    public void eliminarTarjeta(int ID) {
        this.data.eliminarTarjeta(ID);
    }
}
