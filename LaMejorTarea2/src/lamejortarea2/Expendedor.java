package lamejortarea2;

/**
 *
 * @author ana
 */
public class Expendedor {
    private int precio;
    private Deposito coca;
    private Deposito sprite;
    private Deposito fanta;
    
    public Expendedor(int cant, int precio_aux){
        precio = precio_aux;
        coca = new Deposito();
        sprite = new Deposito();
        fanta = new Deposito();
        
        for(int i=0; i<cant; i++){
            Bebida aux_coca = new CocaCola();
            Bebida aux_sprite = new Sprite();
            Bebida aux_fanta = new Fanta();
            
            coca.addBebida(aux_coca);
            sprite.addBebida(aux_sprite);
            fanta.addBebida(aux_fanta);
        }
    }
    /*
    public Bebida comprarBebida(int idBebida, Moneda m){
        if(m.getValor() <= precio){
            if(idBebida == 0){ // 0 es Coca-Cola
                return coca.getBebida();
            }
            if(idBebida == 1){ // 1 es Sprite
                return sprite.getBebida();
            }
            if(idBebida == 2){ // 2 es Fanta
                return fanta.getBebida();
            }            
        }
        
    }
    */
}
