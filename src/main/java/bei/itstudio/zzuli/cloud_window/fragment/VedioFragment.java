package bei.itstudio.zzuli.cloud_window.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bei.itstudio.zzuli.cloud_window.R;

/**
 * Created by LUKE on 2015/10/19.
 */
public class VedioFragment extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.vedio_fragrment,container,false);
        return view;
    }

}
