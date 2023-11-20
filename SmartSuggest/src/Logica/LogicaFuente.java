package Logica;

import Entidades.Fuente;
import Persistencia.TXTCreate.TXTFuente;
import Persistencia.IFuente;
import java.util.ArrayList;

public class LogicaFuente {

    private IFuente data;

    public LogicaFuente() {
        this.data = new TXTFuente();
    }

    public void registrarFuente(Fuente f) {
        this.data.agregarFuente(f);
    }

    public ArrayList<Fuente> consultarFuentes() {
        return this.data.obtenerFuentes();
    }

    public Fuente buscarFuente(int capacidad) {
        Fuente pos = this.data.buscarFuente(capacidad);
        return pos;
    }

    public Fuente crearFuente(int capacidad) {
        Fuente nuevaFuente = new Fuente(capacidad);
        return nuevaFuente;
    }
}
