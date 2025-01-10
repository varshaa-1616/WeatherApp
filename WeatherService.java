import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import org.json.JSONObject;

public class WeatherService {
    private static final String API_KEY = "84f7de8f15e825261518a6daa7ca687d";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather?q=";
    public static String getWeather(String city) {
        try {
            String urlString = API_URL + city + "&appid=" + API_KEY + "&units=metric";
            URI uri = new URI(urlString);
            URL url = uri.toURL();       
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String response = reader.lines().reduce("", String::concat);
                JSONObject jsonResponse = new JSONObject(response);
                JSONObject main = jsonResponse.getJSONObject("main");
                Double temperature = main.getDouble("temp");
                int humidity = main.getInt("humidity");
                String weatherDescription = jsonResponse.getJSONArray("weather")
                        .getJSONObject(0).getString("description");
                return "Temperature: " + temperature + "°C\n" +
                       "Humidity: " + humidity + "%\n" +
                       "Description: " + weatherDescription;
            }
        } catch (Exception e) {
            return "Error: " + "Please enter a valid city name... "+e.getMessage();
        }
    }
}
