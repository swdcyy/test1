package com.kuaishou.ax2c.layouts.X2C_Camera_Scale_Layout;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.record.ArcScaleView;
import android.widget.FrameLayout$LayoutParams;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;

public class X2C_Camera_Scale_Layout implements IViewCreator	// class@00109f
{

    public void X2C_Camera_Scale_Layout(){
       super();
    }
    public View createView(Context p0){
       Resources resources = p0.getResources();
       ArcScaleView uArcScaleVie = new ArcScaleView(p0);
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 263.00f, c.c(resources)));
       uArcScaleVie.setId(R.id.arc_scaleview);
       layoutParams.gravity = 80;
       uArcScaleVie.setVisibility(4);
       uArcScaleVie.setDrawLineSpace(1);
       uArcScaleVie.setDrawTextSpace(5);
       uArcScaleVie.setEvenyScaleValue(0x3f800000);
       uArcScaleVie.setIndicatorColor(resources.getColor(R.color.arg_RES_7f0606d4));
       uArcScaleVie.setScaleLineColor(resources.getColor(R.color.arg_RES_7f0606d1));
       uArcScaleVie.setScaleMin(180);
       uArcScaleVie.setScaleNum(30);
       uArcScaleVie.setScaleSpace(1);
       uArcScaleVie.setScaleTextColor(resources.getColor(R.color.arg_RES_7f0606d2));
       uArcScaleVie.setScaleUnit("x");
       uArcScaleVie.setSelectTextColor(resources.getColor(R.color.arg_RES_7f0606d2));
       uArcScaleVie.setLayoutParams(layoutParams);
       return uArcScaleVie;
    }
}
