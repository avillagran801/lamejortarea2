package lamejortarea2;

/**
 *
 * @author ana
 */
abstract class Moneda {        
    /*
    ¿CÓMO DEVUELVO LA DIRECCIÓN EN RAM DE ESTO?
    
    public Moneda getSerie(){
        return 
    }
    */
    public abstract int getValor();
    
    public String toString(){
        return "PRUEBA";
    }
}

class Moneda1500 extends Moneda {
    public Moneda1500(){
        super();
    }
    
    public int getValor(){
        return 1500;
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
    }
    
    public int getValor(){
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    
    public int getValor(){
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }
    
    public int getValor(){
        return 100;
    }
}