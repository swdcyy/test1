package com.kuaishou.ax2c.X2C_lite_watching_audience_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Watching_Audience_Layout;

public class X2C_lite_watching_audience_layout implements IViewCreator	// class@00100b
{

    public void X2C_lite_watching_audience_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Watching_Audience_Layout().createView(p0);
    }
}