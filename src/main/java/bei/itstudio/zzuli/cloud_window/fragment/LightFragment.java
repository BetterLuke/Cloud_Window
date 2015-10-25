package bei.itstudio.zzuli.cloud_window.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import bei.itstudio.zzuli.cloud_window.R;
import bei.itstudio.zzuli.cloud_window.adapter.ControlListViewAdapter;
import bei.itstudio.zzuli.cloud_window.model.ControlListViewItem;

/**
 * Created by LUKE on 2015/10/19.
 */
public class LightFragment extends Fragment  {
    private View view;
    private ControlListViewAdapter adapter;
    private List<ControlListViewItem> colList = new ArrayList<ControlListViewItem>();
    private ListView vedioColListView;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (colList.isEmpty()){
            initVedioColListViewData();
        }
        adapter = new ControlListViewAdapter(activity, R.layout.control_listview_item,colList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.control_fragrment,container,false);
        vedioColListView = (ListView) view.findViewById(R.id.vedio_listview);
        vedioColListView.setAdapter(adapter);
        return view;
    }


    /**
     * 初始化控制区选项信息
     */
    private void initVedioColListViewData() {
        colList.clear();
        ControlListViewItem col1 = new ControlListViewItem("全部打开",0);
        colList.add(col1);
        ControlListViewItem col2 = new ControlListViewItem("灯光模式",0);
        colList.add(col2);
    }

}
