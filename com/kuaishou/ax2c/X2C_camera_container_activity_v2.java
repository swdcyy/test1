package com.kuaishou.ax2c.X2C_camera_container_activity_v2;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Container_Activity_V2;

public class X2C_camera_container_activity_v2 implements IViewCreator	// class@000fd4
{

    public void X2C_camera_container_activity_v2(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Container_Activity_V2().createView(p0);
    }
}
