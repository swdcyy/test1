package com.kuaishou.ax2c.X2C_live_audience_loading_view_container_perf;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Loading_View_Container_Perf;

public class X2C_live_audience_loading_view_container_perf implements IViewCreator	// class@00101e
{

    public void X2C_live_audience_loading_view_container_perf(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Loading_View_Container_Perf().createView(p0);
    }
}
