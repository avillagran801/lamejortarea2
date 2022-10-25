package lamejortarea2;

// NO HAY JERARQUÍA DE ERRORES.
// La primera exception que haga try-catch será la devuelta.

public class LaMejorTarea2 {

    public static void main(String[] args) {
        Expendedor e1 = new Expendedor(1, 700);
        Moneda1000 m1 = new Moneda1000();
        Moneda500 m2 = new Moneda500();
        Moneda1500 m3 = new Moneda1500();
        
        System.out.println("\n*** COMPRA N°1 ***\n");
        Comprador Pedro = new Comprador(0, m1, e1);
        
        System.out.println("\n*** COMPRA N°2 ***\n");
        Comprador Juan = new Comprador(0, m1, e1);
        
        System.out.println("\n*** COMPRA N°3 ***\n");
        Comprador Diego = new Comprador(1, m2, e1);
        
        System.out.println("\n*** COMPRA N°4 ***\n");
        Comprador Maria = new Comprador(0, null, e1);
        
        System.out.println("\n*** COMPRA N°5 ***\n");
        Comprador Julia = new Comprador(3, m1, e1);
        
        System.out.println("\n*** COMPRA N°5 ***\n");
        Comprador Marta = new Comprador(2, m3, e1);
        
        System.out.println(m3.getSerie());
    }
    
}
