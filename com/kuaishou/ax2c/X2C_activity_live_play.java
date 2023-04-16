package com.kuaishou.ax2c.X2C_activity_live_play;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Activity_Live_Play;

public class X2C_activity_live_play implements IViewCreator	// class@000fc9
{

    public void X2C_activity_live_play(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Activity_Live_Play().createView(p0);
    }
}
