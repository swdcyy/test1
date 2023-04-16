package com.kuaishou.ax2c.X2C_live_play_top_bar_popup_head;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Play_Top_Bar_Popup_Head;

public class X2C_live_play_top_bar_popup_head implements IViewCreator	// class@00104f
{

    public void X2C_live_play_top_bar_popup_head(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Play_Top_Bar_Popup_Head().createView(p0);
    }
}
