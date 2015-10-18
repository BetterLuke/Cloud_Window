package bei.itstudio.zzuli.cloud_window.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bei.itstudio.zzuli.cloud_window.R;

/**
 * Created by LUKE on 2015/10/18.
 */
public class SelecterFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.selecter_fragment,container,false);
        return  view;
    }
}
