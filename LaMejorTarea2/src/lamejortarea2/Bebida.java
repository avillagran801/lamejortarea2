package lamejortarea2;

abstract class Bebida{
    public abstract String beber();
}

class Sprite extends Bebida{
    public Sprite(){
        super();
    }
    public String beber(){
        System.out.println("Gluglu");
        return "sprite";
    }
}

class CocaCola extends Bebida{
    public CocaCola(){
        super();
    }
    public String beber(){
        System.out.println("Gluglu");
        return "cocacola";
    }
}

class Fanta extends Bebida{
    public Fanta(){
        super();
    }
    public String beber(){
        System.out.println("Gluglu");
        return "fanta";
    }
}