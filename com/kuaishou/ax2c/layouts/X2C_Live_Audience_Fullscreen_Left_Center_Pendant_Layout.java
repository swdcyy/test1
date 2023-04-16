package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Fullscreen_Left_Center_Pendant_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import android.widget.LinearLayout$LayoutParams;

public class X2C_Live_Audience_Fullscreen_Left_Center_Pendant_Layout implements IViewCreator	// class@0010d9
{

    public void X2C_Live_Audience_Fullscreen_Left_Center_Pendant_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       linearLayout.setId(R.id.live_fullscreen_left_center_pendant_container);
       layoutParams.addRule(15, -1);
       layoutParams.leftMargin = (int)TypedValue.applyDimension(1, 10.00f, c.c(resources));
       linearLayout.setOrientation(1);
       linearLayout.setLayoutParams(layoutParams);
       ViewStub viewStub = new ViewStub(linearLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.live_gzone_lock_screen_view_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0bd1);
       viewStub.setLayoutParams(new LinearLayout$LayoutParams((int)TypedValue.applyDimension(1, 36.00f, c.c(resources)), (int)TypedValue.applyDimension(1, 36.00f, c.c(resources))));
       linearLayout.addView(viewStub);
       return linearLayout;
    }
}
