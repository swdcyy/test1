package com.kuaishou.ax2c.X2C_live_audience_basic_play_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Basic_Play_Layout;

public class X2C_live_audience_basic_play_layout implements IViewCreator	// class@00100e
{

    public void X2C_live_audience_basic_play_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Basic_Play_Layout().createView(p0);
    }
}
