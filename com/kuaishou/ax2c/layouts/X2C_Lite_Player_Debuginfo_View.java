package com.kuaishou.ax2c.layouts.X2C_Lite_Player_Debuginfo_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kwai.debugtools.plugin.wrapper.HostKwaiPlayerDebugInfoView;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Player_Debuginfo_View implements IViewCreator	// class@0010c0
{

    public void X2C_Lite_Player_Debuginfo_View(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       HostKwaiPlayerDebugInfoView hostKwaiPlay = new HostKwaiPlayerDebugInfoView(p0);
       hostKwaiPlay.setId(R.id.kwai_player_debug_info_view);
       hostKwaiPlay.setVisibility(0);
       hostKwaiPlay.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       return hostKwaiPlay;
    }
}
