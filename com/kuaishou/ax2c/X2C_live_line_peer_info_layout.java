package com.kuaishou.ax2c.X2C_live_line_peer_info_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Line_Peer_Info_Layout;

public class X2C_live_line_peer_info_layout implements IViewCreator	// class@001029
{

    public void X2C_live_line_peer_info_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Line_Peer_Info_Layout().createView(p0);
    }
}
