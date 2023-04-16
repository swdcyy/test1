package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;

public class X2C_Live_Lite_Container_Layout implements IViewCreator	// class@0010ef
{

    public void X2C_Live_Lite_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_lite_container);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_lite_cover_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_lite_extension_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_lite_player_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.live_lite_slide_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       return uFrameLayout;
    }
}
