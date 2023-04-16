package com.kuaishou.ax2c.X2C_camera_item_ultra;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Ultra;

public class X2C_camera_item_ultra implements IViewCreator	// class@000fde
{

    public void X2C_camera_item_ultra(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Ultra().createView(p0);
    }
}
