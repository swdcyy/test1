package com.kuaishou.ax2c.X2C_camera_fullscreen_v3;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Fullscreen_V3;

public class X2C_camera_fullscreen_v3 implements IViewCreator	// class@000fd5
{

    public void X2C_camera_fullscreen_v3(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Fullscreen_V3().createView(p0);
    }
}
