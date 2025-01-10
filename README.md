# Weather App

This is a simple Java-based Weather App that fetches and displays weather data for a specified location using APIs. It is a lightweight command-line application designed for quick and easy access to weather information.

## Features
- Fetch current weather data for any city.
- Display temperature, humidity, and weather conditions.
- Built using Java with third-party libraries for JSON handling and HTTP requests.

---

## Requirements
To run this project, ensure you have the following installed:

1. **Java Development Kit (JDK)** (version 8 or higher).
2. **VS Code** or any other Java-compatible IDE (optional).
3. The following JAR libraries:
   - `json-20210307.jar`
   - `okhttp-3.0.0-RC1.jar`
   - `okio-1.0.0.jar`

---

## Running the Application

### Steps to Run in VS Code:
1. Open your project folder in VS Code.
2. Ensure the required JAR libraries are placed in the `lib` directory within the project.
3. Compile the project using the following command:

   ```bash
   javac -cp ".;C:/your/path/to/folder/lib/json-20210307.jar;C:/your/path/to/folder/lib/okhttp-3.0.0-RC1.jar;C:/your/path/to/folder/lib/okio-1.0.0.jar" WeatherService.java WeatherApp.java
   ```

4. Run the compiled application:

   ```bash
   java -cp ".;C:/your/path/to/folder/lib/json-20210307.jar;C:/your/path/to/folder/lib/okhttp-3.0.0-RC1.jar;C:/your/path/to/folder/lib/okio-1.0.0.jar" WeatherApp.java
   ```

### General Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/varshaa-1616/WeatherApp.git
   cd WeatherApp
   ```
2. Ensure all dependencies (JAR files) are in the `lib` folder.
3. Compile and run as instructed above.

---

## Project Structure
- `WeatherApp.java`: Entry point of the application.
- `WeatherService.java`: Contains the logic to fetch weather data using APIs.
- `lib/`: Contains external libraries (JAR files) for JSON parsing and HTTP requests.

---

## Notes
- Make sure to replace the paths to JAR files in the compile and run commands with the correct paths on your system.
- If any dependencies are missing, download them from reliable sources or Maven Central Repository.

---

## Future Enhancements
- Add a graphical user interface (GUI).
- Support for more detailed weather data (e.g., forecast, wind speed).
- Error handling for invalid input or API issues.

---

Feel free to contribute to this project or suggest improvements!
