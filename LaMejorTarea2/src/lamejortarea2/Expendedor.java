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
    
    public Bebida comprarBebida(int idBebida, Moneda m) throws
            NoHayBebidaException, PagoInsuficienteException,
            PagoIncorrectoException {
        try {
            if(m == null){
                throw new PagoIncorrectoException("No se acepta Null como pago.");
            }
            if(m.getValor() >= precio){
                switch (idBebida){
                    // 0 siendo coca; 1 siendo sprite; 2 siendo fanta.
                    case 0:
                        if(coca.getSize() == 0){
                            throw new NoHayBebidaException("No queda Coca-cola.");
                        }
                        Expendedor.this.crearVuelto(m);
                        return coca.getBebida();

                    case 1:
                        if(sprite.getSize() == 0){
                            throw new NoHayBebidaException("No queda Sprite.");
                        }
                        Expendedor.this.crearVuelto(m);
                        return sprite.getBebida();

                    case 2:
                        if(fanta.getSize() == 0){
                            throw new NoHayBebidaException("No queda Fanta.");
                        }
                        Expendedor.this.crearVuelto(m);
                        return fanta.getBebida();
                    
                    default:
                        throw new NoHayBebidaException("ID equivocado.");
                }
            } else {
                throw new PagoInsuficienteException("Dinero insuficiente.");
            }
        }
        catch (PagoIncorrectoException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoIncorrectoException.");
            System.out.println(ex.getMessage());
            return null;
        }
        catch (NoHayBebidaException ex){
            System.out.println("Exception in thread \"main\" "
                    + "NoHayBebidaException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            vuelto.add(m);
            return null;
        }
        catch (PagoInsuficienteException ex){
            System.out.println("Exception in thread \"main\" "
                    + "PagoInsuficienteException.");
            System.out.println(ex.getMessage() + "\nSu moneda ha sido devuelta.");
            vuelto.add(m);
            return null;
        }
    }
    
    private void crearVuelto(Moneda coin_aux){
        // Un método privado, ya que solo el Expendedor puede crear vuelto.
        if (coin_aux.getValor() > precio) {
            for (int i = 0; i < (coin_aux.getValor()-precio)/100; i++){
                Moneda100 m100_aux = new Moneda100();
                vuelto.add(m100_aux);
            }
            System.out.println("Hay vuelto disponible.");
        }
    }
    
    public Moneda getVuelto(){
        if(vuelto.isEmpty()){
            System.out.println("Ya no queda vuelto que dar.");
            return null;
        } else {
            System.out.println("Quedan " + (vuelto.size() - 1) + 
                    " monedas en el deposito.");
            return vuelto.remove(0);
        }
    }
    
    public int getPrecio(){
        return precio;
    }
}