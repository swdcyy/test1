package com.kuaishou.ax2c.layouts.X2C_Live_Audience_Loading_View_Container_Perf;
import com.kuaishou.ax2c.IViewCreator;
import java.lang.Object;
import android.content.Context;
import android.view.View;
import android.content.res.Resources;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import android.widget.ImageView$ScaleType;
import com.kuaishou.live.common.core.component.loading.LoopBackgroundView;
import android.util.DisplayMetrics;
import cw9.c;
import android.util.TypedValue;

public class X2C_Live_Audience_Loading_View_Container_Perf implements IViewCreator	// class@0010dd
{

    public void X2C_Live_Audience_Loading_View_Container_Perf(){
       super();
    }
    public View createView(Context p0){
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setId(R.id.live_loading_view_container);
       uFrameLayout.setVisibility(4);
       uFrameLayout.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       KwaiImageView kwaiImageVie = new KwaiImageView(uFrameLayout.getContext());
       kwaiImageVie.setId(R.id.cover_view);
       kwaiImageVie.getHierarchy().x(0);
       kwaiImageVie.setVisibility(8);
       kwaiImageVie.setScaleType(ImageView$ScaleType.CENTER_CROP);
       kwaiImageVie.setLayoutParams(new FrameLayout$LayoutParams(-1, -1));
       uFrameLayout.addView(kwaiImageVie);
       LoopBackgroundView loopBackgrou = new LoopBackgroundView(uFrameLayout.getContext());
       loopBackgrou.setId(R.id.live_loading_view);
       loopBackgrou.setBackgroundResource(R.drawable.arg_RES_7f081366);
       loopBackgrou.setVisibility(8);
       loopBackgrou.setLayoutParams(new FrameLayout$LayoutParams(-1, (int)TypedValue.applyDimension(1, 325.50f, c.c(p0.getResources()))));
       uFrameLayout.addView(loopBackgrou);
       return uFrameLayout;
    }
}
