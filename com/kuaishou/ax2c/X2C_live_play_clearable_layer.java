package com.kuaishou.ax2c.X2C_live_play_clearable_layer;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Play_Clearable_Layer;

public class X2C_live_play_clearable_layer implements IViewCreator	// class@00104a
{

    public void X2C_live_play_clearable_layer(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Play_Clearable_Layer().createView(p0);
    }
}
