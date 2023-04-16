package com.kuaishou.ax2c.layouts.X2C_Live_Voice_Party_Bg_Layout_Perf;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;

public class X2C_Live_Voice_Party_Bg_Layout_Perf implements IViewCreator	// class@001115
{

    public void X2C_Live_Voice_Party_Bg_Layout_Perf(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.voice_party_background);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       return uFrameLayout;
    }
}
