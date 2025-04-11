package practicainterfaces;
public class Acuatico extends Vehiculo implements Vela{
    
    private String tipo;
    private int cantidadPasajeros;

    public Acuatico(String tipo, int cantidadPasajeros, int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
        this.tipo = tipo;
        this.cantidadPasajeros = cantidadPasajeros;
    }
    @Override
    public int recomendarVelocidad (int velocidadViento){
    if(velocidadViento > 80){
        System.out.println("Viento muy fuerte, no se recomienda navegar");
        velocidadActual = 0;
        return  0;
    }else if (velocidadViento < 10){
        System.out.println("Viento muy debil, no se recomienda navegar");
        return 0;
    }else {
        System.out.println("Condiciones adecuadas para navegar");
        return velocidadActual;
    }
}
     
    
}
