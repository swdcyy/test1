package com.kuaishou.ax2c.X2C_live_audience_bottom_bar_guide_gift_view;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Guide_Gift_View;

public class X2C_live_audience_bottom_bar_guide_gift_view implements IViewCreator	// class@001013
{

    public void X2C_live_audience_bottom_bar_guide_gift_view(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Bottom_Bar_Guide_Gift_View().createView(p0);
    }
}