package lamejortarea2;

public class LaMejorTarea2 {

    public static void main(String[] args) {
        Expendedor e1 = new Expendedor(3, 700);
        Moneda1000 m1 = new Moneda1000();
        Moneda500 m2 = new Moneda500();
        
        System.out.println("\n*** COMPRA N°1 ***\n");
        Comprador Juan = new Comprador(0, m1, e1);
        
        System.out.println("\n*** COMPRA N°2 ***\n");
        Comprador Pedrito = new Comprador(0, m2, e1);
    }
    
}
