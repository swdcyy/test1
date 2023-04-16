package com.kuaishou.ax2c.X2C_camera_item_stability;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Stability;

public class X2C_camera_item_stability implements IViewCreator	// class@000fdd
{

    public void X2C_camera_item_stability(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Stability().createView(p0);
    }
}
