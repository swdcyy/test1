package com.kuaishou.ax2c.X2C_live_play_preload;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Play_Preload;

public class X2C_live_play_preload implements IViewCreator	// class@00104c
{

    public void X2C_live_play_preload(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Play_Preload().createView(p0);
    }
}
