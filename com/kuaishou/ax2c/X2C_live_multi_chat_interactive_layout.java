package com.kuaishou.ax2c.X2C_live_multi_chat_interactive_layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import com.kuaishou.ax2c.layouts.X2C_Live_Multi_Chat_Interactive_Layout;

public class X2C_live_multi_chat_interactive_layout implements IViewCreator	// class@001040
{

    public void X2C_live_multi_chat_interactive_layout(){
       super();
    }
    public View createView(Context p0){
       return new X2C_Live_Multi_Chat_Interactive_Layout().createView(p0);
    }
}
