package com.kuaishou.ax2c.X2C_camera_item_record_frame;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Record_Frame;

public class X2C_camera_item_record_frame implements IViewCreator	// class@000fdc
{

    public void X2C_camera_item_record_frame(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Record_Frame().createView(p0);
    }
}
