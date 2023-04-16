package com.kuaishou.ax2c.X2C_live_play_side_bar_container_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Play_Side_Bar_Container_Layout;

public class X2C_live_play_side_bar_container_layout implements IViewCreator	// class@00104e
{

    public void X2C_live_play_side_bar_container_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Play_Side_Bar_Container_Layout().createView(p0);
    }
}
