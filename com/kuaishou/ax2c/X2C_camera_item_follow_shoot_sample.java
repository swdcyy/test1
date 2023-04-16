package com.kuaishou.ax2c.X2C_camera_item_follow_shoot_sample;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Item_Follow_Shoot_Sample;

public class X2C_camera_item_follow_shoot_sample implements IViewCreator	// class@000fd8
{

    public void X2C_camera_item_follow_shoot_sample(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Item_Follow_Shoot_Sample().createView(p0);
    }
}
