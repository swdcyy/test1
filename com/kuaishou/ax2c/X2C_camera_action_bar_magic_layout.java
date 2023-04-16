package com.kuaishou.ax2c.X2C_camera_action_bar_magic_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Camera_Action_Bar_Magic_Layout;

public class X2C_camera_action_bar_magic_layout implements IViewCreator	// class@000fd0
{

    public void X2C_camera_action_bar_magic_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Camera_Action_Bar_Magic_Layout().createView(p0);
    }
}
