package com.kuaishou.ax2c.layouts.X2C_Live_New_Wish_List_Pendant_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import android.widget.ViewFlipper;

public class X2C_Live_New_Wish_List_Pendant_Layout implements IViewCreator	// class@001103
{

    public void X2C_Live_New_Wish_List_Pendant_Layout(){
       super();
    }
    public View createView(Context p0){
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setId(R.id.live_wish_list_pendant_container);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       LiveViewFlipper liveViewFlip = new LiveViewFlipper(linearLayout.getContext());
       liveViewFlip.setId(R.id.live_wish_list_filpper_view);
       liveViewFlip.setAutoStart(0);
       liveViewFlip.setFlipInterval(2700);
       liveViewFlip.setInAnimation(p0, R.anim.arg_RES_7f0100ac);
       liveViewFlip.setMeasureAllChildren(0);
       liveViewFlip.setOutAnimation(p0, R.anim.arg_RES_7f0100ad);
       liveViewFlip.setLayoutParams(new LinearLayout$LayoutParams(-2, c.b(p0.getResources(), R.dimen.arg_RES_7f07030d)));
       linearLayout.addView(liveViewFlip);
       return linearLayout;
    }
}
