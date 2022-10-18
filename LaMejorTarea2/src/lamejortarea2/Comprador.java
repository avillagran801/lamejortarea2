package lamejortarea2;

class Comprador {
    private String sabor;
    private int vuelto;
    
    public Comprador(int idBebida, Moneda moneda, Expendedor expendedor){
        vuelto = 0;
        
        Bebida aux_bebida = expendedor.comprarBebida(idBebida, moneda);
        if (aux_bebida != null){
            sabor = aux_bebida.beber();
            System.out.println(sabor);
        }
        
        Boolean vuelto_fin = false;
                
        // Esto hace que el vuelto termine de entregarse ya sea cuando 
        // se entregue la misma moneda o cuando terminen las monedas de
        // $100 para la diferencia
        
        while(!vuelto_fin){
            Moneda vuelto_aux = expendedor.getVuelto();
            if(vuelto_aux != null){
                vuelto = vuelto + vuelto_aux.getValor();
            } else {
                vuelto_fin = true;
            }
        }

        if (moneda != null){
            System.out.println("Precio bebida: $" + expendedor.getPrecio() + 
                    "\nMonto abonado: $" + moneda.getValor() + "\nVuelto: $" + 
                    vuelto);
        }
    }
}
