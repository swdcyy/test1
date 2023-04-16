package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Like_Effect_Container_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;

public class X2C_Live_Lite_Like_Effect_Container_Layout implements IViewCreator	// class@0010f6
{

    public void X2C_Live_Lite_Like_Effect_Container_Layout(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_like_effect_container);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       return uFrameLayout;
    }
}
