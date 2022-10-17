package lamejortarea2;

class Comprador {
    private String sabor;
    private int vuelto;
    
    public Comprador(int idBebida, Moneda moneda, Expendedor expendedor){
        vuelto = 0;
        sabor = expendedor.comprarBebida(idBebida, moneda).beber();
        System.out.println(sabor);
        
        while(expendedor.getVuelto() != null){
            vuelto = vuelto + 100;
        }

        
        System.out.println("Precio bebida: $" + expendedor.getPrecio() + "\nMonto abonado: $" + moneda.getValor() + "\nVuelto: $" + vuelto);
    }
}
