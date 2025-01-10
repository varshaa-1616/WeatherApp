import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WeatherApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Weather App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel cityLabel = new JLabel("Enter City:");
        JTextField cityField = new JTextField(25);
        JButton getWeatherButton = new JButton("Get Weather");
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        JPanel panel = new JPanel();
        panel.add(cityLabel);
        panel.add(cityField);
        panel.add(getWeatherButton);
        panel.add(new JScrollPane(resultArea));
        frame.add(panel);
        frame.setVisible(true);
        getWeatherButton.addActionListener(e -> {
            String city = cityField.getText();
            if (!city.isEmpty()) {
                String weatherData = WeatherService.getWeather(city);
                resultArea.setText(weatherData);
            } else {
                resultArea.setText("Please enter a valid city name.");
            }
        });
    }
}
