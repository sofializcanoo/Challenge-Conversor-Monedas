import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscarMoneda(String base, String target) {
        // SUSTITUYE "TU-API-KEY" por tu clave real
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/TU-API-KEY/pair/" + base + "/" + target);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            throw new RuntimeException("No se pudo realizar la conversión: " + e.getMessage());
        }
    }
}
