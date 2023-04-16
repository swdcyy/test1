package com.kuaishou.ax2c.X2C_lite_background_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Background_Layout;

public class X2C_lite_background_layout implements IViewCreator	// class@000ffa
{

    public void X2C_lite_background_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Background_Layout().createView(p0);
    }
}
