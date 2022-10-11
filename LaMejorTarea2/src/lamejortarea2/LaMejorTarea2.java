package lamejortarea2;

public class LaMejorTarea2 {

    public static void main(String[] args) {
        Expendedor e1 = new Expendedor(10, 900);
        Moneda1000 m1 = new Moneda1000();
        
        Comprador Juan = new Comprador(0, m1, e1);
    }
    
}
