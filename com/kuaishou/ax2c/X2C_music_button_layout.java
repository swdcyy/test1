package com.kuaishou.ax2c.X2C_music_button_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Music_Button_Layout;

public class X2C_music_button_layout implements IViewCreator	// class@001059
{

    public void X2C_music_button_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Music_Button_Layout().createView(p0);
    }
}
