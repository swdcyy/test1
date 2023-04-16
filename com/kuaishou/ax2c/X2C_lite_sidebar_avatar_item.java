package com.kuaishou.ax2c.X2C_lite_sidebar_avatar_item;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Sidebar_Avatar_Item;

public class X2C_lite_sidebar_avatar_item implements IViewCreator	// class@001003
{

    public void X2C_lite_sidebar_avatar_item(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Sidebar_Avatar_Item().createView(p0);
    }
}
