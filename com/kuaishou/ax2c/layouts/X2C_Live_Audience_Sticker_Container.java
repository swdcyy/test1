package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Sticker_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;

public class X2C_Live_Audience_Sticker_Container implements IViewCreator	// class@0010df
{

    public void X2C_Live_Audience_Sticker_Container(){
       super();
    }
    public View createView(Context p0){
       p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_audience_sticker_layout);
       uFrameLayout.setVisibility(4);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       return uFrameLayout;
    }
}
