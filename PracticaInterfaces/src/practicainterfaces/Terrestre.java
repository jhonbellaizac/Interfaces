package practicainterfaces;
public class Terrestre extends Vehiculo implements Motor{
    
    private int cantidadLlantas;
    private String uso;

    public Terrestre(int cantidadLlantas, String uso, int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        this.cantidadLlantas = cantidadLlantas;
        this.uso = uso;
    }
    
    
    public int calcularRevolucionesMotor (int fuerza, int radio){
        return fuerza * radio;
    }

    
    }
    

