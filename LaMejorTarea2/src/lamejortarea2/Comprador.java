package lamejortarea2;

class Comprador {
    private String sabor;
    private int vuelto;
    
    public Comprador(int idBebida, Moneda moneda, Expendedor expendedor){
        vuelto = 0;
        sabor = expendedor.comprarBebida(idBebida, moneda).beber();
        System.out.println(sabor);
    }
}
