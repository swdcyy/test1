package com.kuaishou.ax2c.X2C_lite_sidebar_simple_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Simple_Item;

public class X2C_lite_sidebar_simple_item implements IViewCreator	// class@001007
{

    public void X2C_lite_sidebar_simple_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Sidebar_Simple_Item().createView(p0);
    }
}
