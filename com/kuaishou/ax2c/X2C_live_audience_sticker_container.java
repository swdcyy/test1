package com.kuaishou.ax2c.X2C_live_audience_sticker_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Sticker_Container;

public class X2C_live_audience_sticker_container implements IViewCreator	// class@001020
{

    public void X2C_live_audience_sticker_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Sticker_Container().createView(p0);
    }
}
