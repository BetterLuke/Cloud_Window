package bei.itstudio.zzuli.cloud_window.model;

import android.widget.ImageView;

/**
 * Created by LUKE on 2015/10/19.
 */
public class ControlListViewItem {
    public static final int TYPE_SWITCH_OFF = 0;
    public static final int TYPE_SWITCH_ON = 1;
    public static final int TYPE_RIGHT_GUIDE = 2;
    private int type;
    private String attributeName;

    public void setType(int type) {
        this.type = type;
    }

    private ImageView attributeImg;

    public ControlListViewItem(String attributeName, int type) {
        this.attributeName = attributeName;
        this.type = type;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public int getType() {
        return type;
    }
}
