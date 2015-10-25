package bei.itstudio.zzuli.cloud_window.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import bei.itstudio.zzuli.cloud_window.R;
import bei.itstudio.zzuli.cloud_window.adapter.ControlListViewAdapter;
import bei.itstudio.zzuli.cloud_window.model.ControlListViewItem;

/**
 * Created by LUKE on 2015/10/19.
 */
public class VedioFragment extends Fragment implements AdapterView.OnItemClickListener {

    private View view;
    private ControlListViewAdapter adapter;
    private List<ControlListViewItem> colList = new ArrayList<ControlListViewItem>();
    private ListView vedioColListView;


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(colList.isEmpty()){
            initVedioColListViewData();
        }
        adapter = new ControlListViewAdapter(activity,R.layout.control_listview_item,colList);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        view = inflater.inflate(R.layout.control_fragrment,container,false);
        vedioColListView = (ListView) view.findViewById(R.id.vedio_listview);
        vedioColListView.setAdapter(adapter);
        vedioColListView.setOnItemClickListener(this);
        return view;
    }


    private void initVedioColListViewData() {
        colList.clear();
        ControlListViewItem col1 = new ControlListViewItem("全部打开",0);
        colList.add(col1);
        ControlListViewItem col3 = new ControlListViewItem("实时状态",2);
        colList.add(col3);
        ControlListViewItem col4 = new ControlListViewItem("监控1", 2);
        colList.add(col4);
        ControlListViewItem col5 = new ControlListViewItem("监控2", 2);
        colList.add(col5);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        ControlListViewItem controlListViewItem = colList.get(position);
        ImageView switchOn = (ImageView) view.findViewById(R.id.switch_on);
        ImageView switchOff = (ImageView) view.findViewById(R.id.switch_off);
        view.refreshDrawableState();
        if (controlListViewItem.getType() == ControlListViewItem.TYPE_RIGHT_GUIDE) {
            //Intent intent = new Intent(this,)
        } else if (controlListViewItem.getType() == ControlListViewItem.TYPE_SWITCH_OFF) {
            switchOff.setVisibility(View.INVISIBLE);
            switchOn.setVisibility(View.VISIBLE);
            controlListViewItem.setType(1);
        } else if (controlListViewItem.getType() == ControlListViewItem.TYPE_SWITCH_ON) {
            switchOff.setVisibility(View.VISIBLE);
            switchOn.setVisibility(View.INVISIBLE);
            controlListViewItem.setType(0);
        }
    }

}
