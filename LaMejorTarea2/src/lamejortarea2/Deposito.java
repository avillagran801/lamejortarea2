package lamejortarea2;
import java.util.ArrayList;

/**
 *
 * @author ana
 */
class Deposito{
    private ArrayList<Bebida> d;
    
    public Deposito(){
        d = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        d.add(b);
    }
    public Bebida getBebida(){
        if(d.size() == 0){
            return null;
        }
        else{
            return d.remove(0);
        }
    }
}