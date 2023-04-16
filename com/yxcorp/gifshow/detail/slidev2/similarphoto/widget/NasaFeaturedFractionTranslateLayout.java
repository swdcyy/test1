package com.yxcorp.gifshow.detail.slidev2.similarphoto.widget.NasaFeaturedFractionTranslateLayout;
import com.yxcorp.gifshow.detail.slideplay.NestedParentRelativeLayout;
import android.content.Context;
import tyc.p;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.widget.RelativeLayout;
import android.view.View;

public class NasaFeaturedFractionTranslateLayout extends NestedParentRelativeLayout	// class@0019fe
{
    public final p mBezierInterpolator;

    public void NasaFeaturedFractionTranslateLayout(Context p0){
       super(p0);
       this.mBezierInterpolator = new p(0, 0x3f19999a, 0.30f, 0x3f800000);
    }
    public void NasaFeaturedFractionTranslateLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.mBezierInterpolator = new p(0, 0x3f19999a, 0.30f, 0x3f800000);
    }
    public void NasaFeaturedFractionTranslateLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.mBezierInterpolator = new p(0, 0x3f19999a, 0.30f, 0x3f800000);
    }
    public void setInY(float p0){
       if (PatchProxy.isSupport(NasaFeaturedFractionTranslateLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, NasaFeaturedFractionTranslateLayout.class, "1")) {
          return;
       }
       p0 = this.mBezierInterpolator.getInterpolation(p0);
       if ((double)p0 - 0x3f847ae147ae147b < 0) {
          this.setAlpha(0);
       }else {
          this.setAlpha(0x3f800000);
       }
       int height = this.getHeight();
       int i = 0;
       if (this.getChildCount() > 0) {
          height = this.getChildAt(i).getHeight();
       }
       this.setTranslationY(((float)height + (p0 * (float)(i - height))));
       return;
    }
}
