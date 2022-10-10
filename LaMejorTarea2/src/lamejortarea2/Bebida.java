package lamejortarea2;

/**
 *
 * @author ana
 */
abstract class Bebida{
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(){
        super();
    }
    public String beber(){
        return "sprite";
    }
}

class CocaCola extends Bebida{
    public CocaCola(){
        super();
    }
    public String beber(){
        return "cocacola";
    }
}

class Fanta extends Bebida{
    public Fanta(){
        super();
    }
    public String beber(){
        return "fanta";
    }
}