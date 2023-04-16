package com.kuaishou.ax2c.layouts.X2C_Camera_Scroll_Tab_With_Indicator_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewStub;
import cw9.c;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.yxcorp.gifshow.camera.record.tab.CameraScrollTabViewGroup;
import android.view.ViewGroup;
import java.lang.String;

public class X2C_Camera_Scroll_Tab_With_Indicator_Layout implements IViewCreator	// class@0010a0
{

    public void X2C_Camera_Scroll_Tab_With_Indicator_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.camera_tab_container);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       ViewStub viewStub = new ViewStub(uFrameLayout.getContext());
       viewStub.setInflatedId(-1);
       viewStub.setId(R.id.camera_tab_bottom_background_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d0191);
       viewStub.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(viewStub);
       FrameLayout uFrameLayout1 = new FrameLayout(uFrameLayout.getContext());
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, c.b(resources, 0x7f07031a));
       uFrameLayout1.setId(R.id.camera_tab_scroll_container);
       layoutParams.gravity = 80;
       uFrameLayout1.setClickable(true);
       uFrameLayout1.setVisibility(8);
       uFrameLayout1.setLayoutParams(layoutParams);
       uFrameLayout.addView(uFrameLayout1);
       View view = new View(uFrameLayout1.getContext());
       FrameLayout$LayoutParams layoutParams1 = new FrameLayout$LayoutParams(c.b(resources, 0x7f0702b8), c.b(resources, 0x7f0702e3));
       view.setId(R.id.radio_indicator);
       layoutParams1.bottomMargin = c.b(resources, 0x7f07033f);
       layoutParams1.gravity = 81;
       view.setBackgroundResource(R.drawable.arg_RES_7f08044d);
       view.setLayoutParams(layoutParams1);
       uFrameLayout1.addView(view);
       view = new View(uFrameLayout1.getContext());
       layoutParams1 = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(true, 9.00f, c.c(resources)));
       layoutParams1.gravity = 80;
       view.setClickable(true);
       view.setLayoutParams(layoutParams1);
       uFrameLayout1.addView(view);
       CameraScrollTabViewGroup uCameraScrol = new CameraScrollTabViewGroup(uFrameLayout1.getContext());
       uCameraScrol.setId(R.id.camera_tab_scroll_group);
       uCameraScrol.setItemSelectedTextSize(17);
       uCameraScrol.setLayoutGravity("center_vertical");
       uCameraScrol.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout1.addView(uCameraScrol);
       return uFrameLayout;
    }
}
