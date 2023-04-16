package com.kuaishou.ax2c.X2C_live_subscribe_pendant_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Subscribe_Pendant_Item;

public class X2C_live_subscribe_pendant_item implements IViewCreator	// class@001052
{

    public void X2C_live_subscribe_pendant_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Subscribe_Pendant_Item().createView(p0);
    }
}
