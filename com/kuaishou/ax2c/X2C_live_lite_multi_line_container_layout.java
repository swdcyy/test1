package com.kuaishou.ax2c.X2C_live_lite_multi_line_container_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Lite_Multi_Line_Container_Layout;

public class X2C_live_lite_multi_line_container_layout implements IViewCreator	// class@00103a
{

    public void X2C_live_lite_multi_line_container_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Lite_Multi_Line_Container_Layout().createView(p0);
    }
}