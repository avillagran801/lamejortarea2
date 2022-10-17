package lamejortarea2;
import java.util.ArrayList;

class Deposito{
    private ArrayList<Bebida> d;
    
    public Deposito(){
        d = new ArrayList<Bebida>();
    }
    public void addBebida(Bebida b){
        d.add(b);
    }
    public Bebida getBebida(){
        if(d.isEmpty()){
            return null;
        }
        else{
            return d.remove(d.size()-1);
        }
    }
    public int getSize(){
        return d.size();
    }
}