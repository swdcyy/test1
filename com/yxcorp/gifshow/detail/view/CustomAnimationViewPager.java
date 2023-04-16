package com.yxcorp.gifshow.detail.view.CustomAnimationViewPager;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import th0.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n9a.b;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import java.lang.Number;
import x1a.c;
import e0a.j;

public class CustomAnimationViewPager extends KwaiGrootViewPager	// class@001a3e
{
    public b g2;
    public static final Interpolator h2;

    static {
       CustomAnimationViewPager.h2 = new n();
    }
    public void CustomAnimationViewPager(Context p0){
       super(p0);
    }
    public void CustomAnimationViewPager(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public Interpolator getInterpolator(){
       CustomAnimationViewPager obj = PatchProxy.apply(null, this, CustomAnimationViewPager.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g2;
       if (obj != null && obj.a()) {
          return CustomAnimationViewPager.h2;
       }
       return super.getInterpolator();
    }
    public int getMaxSettleDuration(){
       CustomAnimationViewPager obj = PatchProxy.apply(null, this, CustomAnimationViewPager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g2;
       if (obj != null && (obj.a() && (this.g2.b() && j.r() != null))) {
          return j.r().mAnimDuration;
       }
       return super.getMaxSettleDuration();
    }
    public void setCustomAnimPagerInterceptor(b p0){
       this.g2 = p0;
    }
}
