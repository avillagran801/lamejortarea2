package lamejortarea2;

// getSerie() funciona como el toString() de esta clase. toString(), por su
// parte, nos devuelve la dirección de memoria para usarla de serie.

abstract class Moneda {        
    
    public abstract String getSerie();     // A diferencia del prototipo del pdf,
                                        // el método getSerie() será abstracto.
                                        // No se puede devolver un valor 
                                        // estático en un objeto dinámico
    public abstract int getValor();     // (en este caso, abstracto)
                                        // toString() estará por individual en
                                        // cada objeto heredado de moneda
                                        // para no hacer múltiples Overrides.
}

class Moneda1500 extends Moneda {
    public Moneda1500(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 1500.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 1500;
    }   
}

class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 1000.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 500.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }
    
    public String getSerie(){
        return "Moneda de 100.\nNúmero de serie: " + this.toString();
    }
    
    public int getValor(){
        return 100;
    }
}