package com.kuaishou.ax2c.X2C_audio_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Audio_Layout;

public class X2C_audio_layout implements IViewCreator	// class@000fcc
{

    public void X2C_audio_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Audio_Layout().createView(p0);
    }
}
