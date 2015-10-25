package bei.itstudio.zzuli.cloud_window.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import bei.itstudio.zzuli.cloud_window.R;
import bei.itstudio.zzuli.cloud_window.model.ControlListViewItem;

/**
 * Created by LUKE on 2015/10/19.
 */
public class ControlListViewAdapter extends ArrayAdapter<ControlListViewItem>{

    private int resourceId;
    private TextView attributeName;
    private ImageView rightGuide;
    private ImageView switchOn;
    private ImageView switchOff;


    public ControlListViewAdapter(Context context, int resource, List<ControlListViewItem> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ControlListViewItem controlListViewItem = getItem(position);
        View view;
        if (convertView == null){
            view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        } else {
            view = convertView;
        }
        attributeName= (TextView) view.findViewById(R.id.attribute_name);
        rightGuide = (ImageView) view.findViewById(R.id.right_guide);
        switchOn = (ImageView) view.findViewById(R.id.switch_on);
        switchOff = (ImageView) view.findViewById(R.id.switch_off);

        //初始化每一个ControlListView中item的状态
        attributeName.setText(controlListViewItem.getAttributeName());
        if (controlListViewItem.getType() == ControlListViewItem.TYPE_SWITCH_ON){
            //如果是开的状态，则显示开关为开的图标，隐藏开关为关的图标与右导航图标
            switchOn.setVisibility(View.VISIBLE);
            switchOff.setVisibility(View.INVISIBLE);
            rightGuide.setVisibility(View.INVISIBLE);
            switchOn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switchOn.setVisibility(View.INVISIBLE);
                    switchOff.setVisibility(View.VISIBLE);
                    controlListViewItem.setType(ControlListViewItem.TYPE_SWITCH_OFF);
                }
            });
        } else if (controlListViewItem.getType() == ControlListViewItem.TYPE_SWITCH_OFF){
            //如果是关的状态，则显示开关为关的图标，隐藏开关为开的图标与右导航图标
            switchOn.setVisibility(View.INVISIBLE);
            switchOff.setVisibility(View.VISIBLE);
            rightGuide.setVisibility(View.INVISIBLE);
            switchOff.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switchOn.setVisibility(View.VISIBLE);
                    switchOff.setVisibility(View.INVISIBLE);
                    controlListViewItem.setType(ControlListViewItem.TYPE_SWITCH_ON);
                }
            });
        } else if (controlListViewItem.getType() == ControlListViewItem.TYPE_RIGHT_GUIDE){
            //如果是右导航，则显示右导航图标，隐藏开关为关的图标与开关为开的图标
            switchOn.setVisibility(View.INVISIBLE);
            switchOff.setVisibility(View.INVISIBLE);
            rightGuide.setVisibility(View.VISIBLE);
        }



        return view;
    }

}
