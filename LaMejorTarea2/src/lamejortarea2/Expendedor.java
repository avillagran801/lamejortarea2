package lamejortarea2;
import java.util.ArrayList;

public class Expendedor {
    private int precio;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    private ArrayList<Moneda> vuelto;
    
    public Expendedor(int cant, int precio_aux){
        precio = precio_aux;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        vuelto = new ArrayList<Moneda>();
        
        for(int i=0; i<cant; i++){
            Bebida aux_coca = new CocaCola();
            Bebida aux_sprite = new Sprite();
            Bebida aux_fanta = new Fanta();
            
            coca.addBebida(aux_coca);
            sprite.addBebida(aux_sprite);
            fanta.addBebida(aux_fanta);
        }
    }
    
    public Bebida comprarBebida(int idBebida, Moneda m){
        if(m.getValor() >= precio){
            if (m.getValor() > precio) {
                for (int i = 0; i < (m.getValor()-precio)/100; i++){
                    Moneda100 m100_aux = new Moneda100();
                    vuelto.add(m100_aux);
                }
                System.out.println("Hay vuelto disponible.");
            }
            switch (idBebida){
                // 0 siendo coca; 1 siendo sprite; 2 siendo fanta.
                case 0:
                    return coca.getBebida();
                    
                case 1:
                    return sprite.getBebida();
                    
                case 2:
                    return fanta.getBebida();
                    
                default:
                    System.out.println("Hubo un error!\nID de bebida erróneo");
                    return null;
            }
        }
        return null;
    }
}
