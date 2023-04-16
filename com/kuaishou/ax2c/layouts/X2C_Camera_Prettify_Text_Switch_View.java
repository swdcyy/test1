package com.kuaishou.ax2c.layouts.X2C_Camera_Prettify_Text_Switch_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.prettify.widget.PrettifyTextSwitcherView;

public class X2C_Camera_Prettify_Text_Switch_View implements IViewCreator	// class@00109e
{

    public void X2C_Camera_Prettify_Text_Switch_View(){
       super();
    }
    public View createView(Context p0){
       FrameLayout uFrameLayout = new FrameLayout(p0);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       layoutParams.gravity = 16;
       uFrameLayout.setClipChildren(true);
       uFrameLayout.setPadding(0, 0, 0, (int)TypedValue.applyDimension(true, 112.00f, c.c(p0.getResources())));
       uFrameLayout.setLayoutParams(layoutParams);
       PrettifyTextSwitcherView prettifyText = new PrettifyTextSwitcherView(uFrameLayout.getContext());
       prettifyText.setId(R.id.prettify_name_container);
       prettifyText.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       uFrameLayout.addView(prettifyText);
       return uFrameLayout;
    }
}
