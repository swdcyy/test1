package com.kuaishou.ax2c.X2C_lite_sidebar_simple_bottom_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Simple_Bottom_Item;

public class X2C_lite_sidebar_simple_bottom_item implements IViewCreator	// class@001006
{

    public void X2C_lite_sidebar_simple_bottom_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Sidebar_Simple_Bottom_Item().createView(p0);
    }
}
