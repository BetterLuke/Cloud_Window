package bei.itstudio.zzuli.cloud_window.model;

/**
 * Created by LUKE on 2015/10/18.
 */
public class StateInformation {

    private String temperature;
    private String humidity;

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
