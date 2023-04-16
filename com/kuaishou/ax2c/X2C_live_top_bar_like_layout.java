package com.kuaishou.ax2c.X2C_live_top_bar_like_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Top_Bar_Like_Layout;

public class X2C_live_top_bar_like_layout implements IViewCreator	// class@001055
{

    public void X2C_live_top_bar_like_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Top_Bar_Like_Layout().createView(p0);
    }
}
