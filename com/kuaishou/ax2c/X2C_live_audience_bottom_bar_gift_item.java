package com.kuaishou.ax2c.X2C_live_audience_bottom_bar_gift_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Gift_Item;

public class X2C_live_audience_bottom_bar_gift_item implements IViewCreator	// class@001012
{

    public void X2C_live_audience_bottom_bar_gift_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Bottom_Bar_Gift_Item().createView(p0);
    }
}
