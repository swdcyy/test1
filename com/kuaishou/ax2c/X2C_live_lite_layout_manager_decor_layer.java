package com.kuaishou.ax2c.X2C_live_lite_layout_manager_decor_layer;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Lite_Layout_Manager_Decor_Layer;

public class X2C_live_lite_layout_manager_decor_layer implements IViewCreator	// class@001036
{

    public void X2C_live_lite_layout_manager_decor_layer(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Lite_Layout_Manager_Decor_Layer().createView(p0);
    }
}
