package com.kuaishou.ax2c.layouts.X2C_Live_Gzone_Scene_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import cw9.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;

public class X2C_Live_Gzone_Scene_Container implements IViewCreator	// class@0010e7
{

    public void X2C_Live_Gzone_Scene_Container(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       layoutParams.addRule(12, -1);
       layoutParams.addRule(11, -1);
       uFrameLayout.setLayoutParams(layoutParams);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(-2, c.b(resources, 0x7f0707ef));
       uFrameLayout1.setId(R.id.live_gzone_feature_pendant_area_root_view);
       layoutParams1.gravity = 85;
       uFrameLayout1.setClipChildren(false);
       uFrameLayout1.setClipToPadding(false);
       uFrameLayout1.setLayoutParams(layoutParams1);
       uFrameLayout.addView(uFrameLayout1);
       ConstraintLayout uConstraintL = new ConstraintLayout(uFrameLayout1.getContext());
       FrameLayout$LayoutParams layoutParams2 = new FrameLayout$LayoutParams(-2, -2);
       uConstraintL.setId(R.id.live_gzone_feature_pendant_area_real_container);
       layoutParams2.topMargin = (int)TypedValue.applyDimension(1, -8.00f, c.c(resources));
       uConstraintL.setClipToPadding(false);
       uConstraintL.setLayoutParams(layoutParams2);
       uFrameLayout1.addView(uConstraintL);
       return uFrameLayout;
    }
}
