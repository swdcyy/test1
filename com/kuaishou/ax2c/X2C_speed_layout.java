package com.kuaishou.ax2c.X2C_speed_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Speed_Layout;

public class X2C_speed_layout implements IViewCreator	// class@00107a
{

    public void X2C_speed_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Speed_Layout().createView(p0);
    }
}
