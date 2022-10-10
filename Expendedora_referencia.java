import java.util.ArrayList;

public class P43 {
    public static void main(String args[]) {
        Expendedor e = new Expendedor(2);
        Moneda m1 = new Moneda();
        Moneda m2 = new Moneda();
        Moneda m3 = new Moneda();
        
        Bebida b1 = e.comprarBebida(m1, 1);
        System.out.println(b1.getSerie());
        System.out.println(b1.beber());
        
        Bebida b2 = e.comprarBebida(m2, 1);
        System.out.println(b2.getSerie());
        System.out.println(b2.beber());
        
        Bebida b3 = e.comprarBebida(m3, 1);
        
    }
}

class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    
    public Expendedor(int cant){
        coca = new Deposito();
        sprite = new Deposito();
        
        for(int i=0; i<cant; i=i+1){
            Bebida aux_coca = new CocaCola(100 + i);
            Bebida aux_sprite = new Sprite(200 + i);
            
            coca.addBebida(aux_coca);
            sprite.addBebida(aux_sprite);
        }
    }
    public Bebida comprarBebida(Moneda m, int tipo){
        if(tipo == 1){
            return coca.getBebida();
        }
        if(tipo == 2){
            return sprite.getBebida();
        }
        else{
            return null;
        }
    }
}

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

class Moneda{
    public Moneda(){
    }
}

abstract class Bebida{
    private int serie;
    
    public Bebida(int num){
        serie = num;
    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
        return "sabor: ";
    }
    
}

class Sprite extends Bebida{
    public Sprite(int num){
        super(num);
    }
    public String beber(){
        return super.beber() + "sprite";
    }
}

class CocaCola extends Bebida{
    public CocaCola(int num){
        super(num);
    }
    public String beber(){
        return super.beber() + "cocacola";
    }
}