package com.kuaishou.ax2c.layouts.X2C_Lite_Tempplay_Container;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.live.lite.tempplay.LiteTempPlayRootLayout;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.LinearLayout;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import cw9.c;

public class X2C_Lite_Tempplay_Container implements IViewCreator	// class@0010c9
{

    public void X2C_Lite_Tempplay_Container(){
       super();
    }
    public View createView(Context p0){
       Context uContext = p0;
       Resources resources = p0.getResources();
       RelativeLayout relativeLayo = new RelativeLayout(uContext);
       relativeLayo.setId(R.id.live_lite_temp_play_container_view);
       relativeLayo.setClipChildren(false);
       relativeLayo.setClipToPadding(false);
       relativeLayo.setLayoutParams(new ViewGroup$MarginLayoutParams(-1, -2));
       LiteTempPlayRootLayout liteTempPlay = new LiteTempPlayRootLayout(relativeLayo.getContext());
       RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       liteTempPlay.setId(R.id.lite_temp_play_left_container);
       layoutParams.addRule(16, R.id.lite_temp_play_right_container);
       layoutParams.addRule(15, -1);
       layoutParams.addRule(20, -1);
       liteTempPlay.setOrientation(false);
       liteTempPlay.setShowDividers(2);
       liteTempPlay.setDividerDrawable(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081094));
       liteTempPlay.setClipChildren(false);
       liteTempPlay.setClipToPadding(false);
       liteTempPlay.setPadding(c.b(resources, R.dimen.pv), c.b(resources, R.dimen.arg_RES_7f070595), c.b(resources, R.dimen.arg_RES_7f070271), c.b(resources, R.dimen.arg_RES_7f070595));
       liteTempPlay.setLayoutParams(layoutParams);
       relativeLayo.addView(liteTempPlay);
       LinearLayout linearLayout = new LinearLayout(relativeLayo.getContext());
       layoutParams = new RelativeLayout$LayoutParams(-2, -2);
       linearLayout.setId(R.id.lite_temp_play_right_container);
       linearLayout.setOrientation(false);
       layoutParams.addRule(21, -1);
       layoutParams.addRule(15, -1);
       linearLayout.setShowDividers(2);
       linearLayout.setDividerDrawable(ContextCompat.getDrawable(uContext, R.drawable.arg_RES_7f081094));
       int i = c.b(resources, R.dimen.arg_RES_7f070271);
       int i1 = c.b(resources, R.dimen.arg_RES_7f070595);
       int i2 = c.b(resources, R.dimen.pv);
       linearLayout.setPadding(i, i1, i2, c.b(resources, R.dimen.arg_RES_7f070595));
       linearLayout.setLayoutParams(layoutParams);
       relativeLayo.addView(linearLayout);
       return relativeLayo;
    }
}
