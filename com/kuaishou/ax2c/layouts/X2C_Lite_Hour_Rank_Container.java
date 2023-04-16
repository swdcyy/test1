package com.kuaishou.ax2c.layouts.X2C_Lite_Hour_Rank_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.kuaishou.live.common.core.basic.widget.LiveViewFlipper;
import android.view.ViewGroup$MarginLayoutParams;
import cw9.c;
import android.widget.ViewFlipper;
import android.view.ViewGroup$LayoutParams;

public class X2C_Lite_Hour_Rank_Container implements IViewCreator	// class@0010bd
{

    public void X2C_Lite_Hour_Rank_Container(){
       super();
    }
    public View createView(Context p0){
       LiveViewFlipper liveViewFlip = new LiveViewFlipper(p0);
       liveViewFlip.setId(R.id.live_lite_pendant_hourly_rank_pendant_container);
       liveViewFlip.setAutoStart(false);
       liveViewFlip.setInAnimation(p0, R.anim.arg_RES_7f010074);
       liveViewFlip.setOutAnimation(p0, R.anim.arg_RES_7f010075);
       liveViewFlip.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, c.b(p0.getResources(), R.dimen.arg_RES_7f0708a3)));
       return liveViewFlip;
    }
}
