package com.kuaishou.ax2c.X2C_breakpoint_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Breakpoint_Layout;

public class X2C_breakpoint_layout implements IViewCreator	// class@000fcd
{

    public void X2C_breakpoint_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Breakpoint_Layout().createView(p0);
    }
}
