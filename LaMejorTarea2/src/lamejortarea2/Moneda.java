package lamejortarea2;

abstract class Moneda {        
    
    public abstract int getSerie();     // A diferencia del prototipo del pdf,
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
    
    public int getSerie(){
        return Moneda1500.this.hashCode();
    }
    
    public int getValor(){
        return 1500;
    }
    
    public String toString(){
        return "Moneda de $1500\nNúmero de serie: " + Moneda1500.this.getSerie();
    }
}

class Moneda1000 extends Moneda {
    public Moneda1000(){
        super();
    }
    
    public int getSerie(){
        return Moneda1000.this.hashCode();
    }
    
    public int getValor(){
        return 1000;
    }
    
    public String toString(){
        return "Moneda de $1000\nNúmero de serie: " + Moneda1000.this.getSerie();
    }
}

class Moneda500 extends Moneda {
    public Moneda500(){
        super();
    }
    
    public int getSerie(){
        return Moneda500.this.hashCode();
    }
    
    public int getValor(){
        return 500;
    }
    
    public String toString(){
        return "Moneda de $500\nNúmero de serie: " + Moneda500.this.getSerie();
    }
}

class Moneda100 extends Moneda {
    public Moneda100(){
        super();
    }
    
    public int getSerie(){
        return Moneda100.this.hashCode();
    }
    
    public int getValor(){
        return 100;
    }
    
    public String toString(){
        return "Moneda de $100\nNúmero de serie: " + Moneda100.this.getSerie();
    }
}