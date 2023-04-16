package com.kuaishou.ax2c.X2C_live_audience_bottom_bar_comment_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Comment_Layout;

public class X2C_live_audience_bottom_bar_comment_layout implements IViewCreator	// class@001010
{

    public void X2C_live_audience_bottom_bar_comment_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Bottom_Bar_Comment_Layout().createView(p0);
    }
}
