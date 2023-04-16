package com.kuaishou.ax2c.X2C_live_audience_player_float_element_container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Audience_Player_Float_Element_Container;

public class X2C_live_audience_player_float_element_container implements IViewCreator	// class@00101f
{

    public void X2C_live_audience_player_float_element_container(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Audience_Player_Float_Element_Container().createView(p0);
    }
}
