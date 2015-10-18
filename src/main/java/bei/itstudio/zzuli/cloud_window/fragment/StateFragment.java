package bei.itstudio.zzuli.cloud_window.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import bei.itstudio.zzuli.cloud_window.R;
import bei.itstudio.zzuli.cloud_window.model.StateInformation;

/**
 * Created by LUKE on 2015/10/17.
 */
public class StateFragment extends Fragment {

    private TextView temperatureValue;
    private TextView humidityValue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.state_fragment,container,false);
        return  view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        temperatureValue = (TextView) getView().findViewById(R.id.state_fragment_temperatureValue);
        humidityValue = (TextView) getView().findViewById(R.id.state_fragment_humidityValue);
    }

    public void updateState(StateInformation stateInformation){
        String temperature = stateInformation.getTemperature();
        String humidity = stateInformation.getHumidity();
        temperatureValue.setText(temperature);
        humidityValue.setText(humidity);
    }
}
