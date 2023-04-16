package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Layout_Manager_Decor_Layer;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public class X2C_Live_Lite_Layout_Manager_Decor_Layer implements IViewCreator	// class@0010f5
{

    public void X2C_Live_Lite_Layout_Manager_Decor_Layer(){
       super();
    }
    public View createView(Context p0){
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -1));
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       uFrameLayout1.setId(R.id.dialog_container);
       uFrameLayout1.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(uFrameLayout1);
       uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       uFrameLayout1.setId(R.id.send_gift_button_container);
       layoutParams.gravity = 80;
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 48.00f, c.c(p0.getResources()));
       uFrameLayout1.setLayoutParams(layoutParams);
       uFrameLayout.addView(uFrameLayout1);
       return uFrameLayout;
    }
}
