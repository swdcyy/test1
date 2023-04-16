package com.kuaishou.ax2c.X2C_live_audience_basic_play_layout_perf;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Basic_Play_Layout_Perf;

public class X2C_live_audience_basic_play_layout_perf implements IViewCreator	// class@00100f
{

    public void X2C_live_audience_basic_play_layout_perf(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Basic_Play_Layout_Perf().createView(p0);
    }
}
