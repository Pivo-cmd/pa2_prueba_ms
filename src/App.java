import com.edu.uce.negocio.Pedido;
import com.edu.uce.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Miguel Soria", "Coca Cola", 10.0, "miguel_soria@temporal0.com");
        
        PedidoService service = new PedidoService();
        service.registrar(pedido);

    }
}
