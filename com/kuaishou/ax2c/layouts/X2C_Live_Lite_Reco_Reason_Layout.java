package com.kuaishou.ax2c.layouts.X2C_Live_Lite_Reco_Reason_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.LiveCoverIconView;
import android.widget.LinearLayout$LayoutParams;
import cw9.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;

public class X2C_Live_Lite_Reco_Reason_Layout implements IViewCreator	// class@0010fb
{

    public void X2C_Live_Lite_Reco_Reason_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       LinearLayout linearLayout = new LinearLayout(p0);
       linearLayout.setGravity(16);
       linearLayout.setOrientation(0);
       linearLayout.setLayoutParams(new ViewGroup$MarginLayoutParams(-2, -2));
       LiveCoverIconView liveCoverIco = new LiveCoverIconView(linearLayout.getContext());
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, c.b(resources, 0x7f0702a4));
       liveCoverIco.setId(R.id.live_lite_simple_reco_label);
       layoutParams.topMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       layoutParams.bottomMargin = (int)TypedValue.applyDimension(1, 2.00f, c.c(resources));
       liveCoverIco.setLayoutParams(layoutParams);
       linearLayout.addView(liveCoverIco);
       return linearLayout;
    }
}
