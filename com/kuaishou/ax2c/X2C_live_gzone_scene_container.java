package com.kuaishou.ax2c.X2C_live_gzone_scene_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Gzone_Scene_Container;

public class X2C_live_gzone_scene_container implements IViewCreator	// class@001028
{

    public void X2C_live_gzone_scene_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Gzone_Scene_Container().createView(p0);
    }
}
