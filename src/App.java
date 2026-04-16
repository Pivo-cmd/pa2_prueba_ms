import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Caso 1 (pago mayor a 120)
        Pedido pedido = new Pedido("Miguel Soria", "Coca Cola", 130.0, "miguel_soria@temporal0.com");
        PedidoService service = new PedidoService();
        service.registrar(pedido);
        System.out.println();
        
        //Caso 2 (pago entre 50 y 120)
        Pedido pedido2 = new Pedido("Maria Perez", "Pepsi", 80.0, "maria_perez@temporal0.com");
        service.registrar(pedido2);
        System.out.println();

        //Caso 3 (pago menor a 50)
        Pedido pedido3 = new Pedido("Juan Gomez", "Fanta", 30.0, "juan_gomez@temporal0.com");
        service.registrar(pedido3);
        System.out.println();


    }
}
