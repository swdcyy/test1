package com.kuaishou.ax2c.X2C_lite_sidebar_like_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Like_Item;

public class X2C_lite_sidebar_like_item implements IViewCreator	// class@001005
{

    public void X2C_lite_sidebar_like_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Sidebar_Like_Item().createView(p0);
    }
}
