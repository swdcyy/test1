package com.kuaishou.ax2c.X2C_lite_player_debuginfo_view;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Lite_Player_Debuginfo_View;

public class X2C_lite_player_debuginfo_view implements IViewCreator	// class@001001
{

    public void X2C_lite_player_debuginfo_view(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Lite_Player_Debuginfo_View().createView(p0);
    }
}
