package lamejortarea2;

class Comprador {
    private String sabor;
    private int vuelto;
    
    public Comprador(int idBebida, Moneda moneda, Expendedor expendedor){
        vuelto = 0;
        
        expendedor.comprarBebida(idBebida, moneda);
        
        // AQUÍ HAY QUE HACER ALGO EN CASO DE QUE SALGA NULL EN LA COMPRA
        // PARA QUE SALGA ESE ERROR Y NO EL DE NullPointerException        
        
        // sabor = expendedor.comprarBebida(idBebida, moneda).beber();
        // System.out.println(sabor);
        
        // Esto hace que el vuelto termine de entregarse ya sea cuando se
        // entregue la misma moneda o cuando terminen las monedas de $100 para
        // la diferencia
        
        Boolean vuelto_fin = false;
        
        while(!vuelto_fin){
            Moneda vuelto_aux = expendedor.getVuelto();
            if(vuelto_aux != null){
                vuelto = vuelto + vuelto_aux.getValor();
            }
            else {
                vuelto_fin = true;
            }
        }

        System.out.println("Precio bebida: $" + expendedor.getPrecio() + "\nMonto abonado: $" + moneda.getValor() + "\nDevolución: $" + vuelto);
    }
}
