package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Bottom_Bar_Task_Center_View;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.basic.widget.LiveLottieAnimationView;
import android.widget.LinearLayout$LayoutParams;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.ImageView;

public class X2C_Live_Audience_Bottom_Bar_Task_Center_View implements IViewCreator	// class@0010d4
{

    public void X2C_Live_Audience_Bottom_Bar_Task_Center_View(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setClipChildren(false);
       linearLayout.setGravity(17);
       linearLayout.setOrientation(false);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(c.b(resources, R.dimen.arg_RES_7f0705e4), c.b(resources, R.dimen.arg_RES_7f0705e4)));
       LiveLottieAnimationView liveLottieAn = new LiveLottieAnimationView(linearLayout.getContext());
       liveLottieAn.setId(R.id.live_bottom_bar_anim_view);
       liveLottieAn.setVisibility(false);
       liveLottieAn.setLayoutParams(new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 50.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 50.00f, c.c(resources))));
       linearLayout.addView(liveLottieAn);
       return linearLayout;
    }
}
