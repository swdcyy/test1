package com.yxcorp.gifshow.corona.common.utils.ClickHolidayEggView;
import android.widget.RelativeLayout;
import android.content.Context;
import java.util.LinkedList;
import com.yxcorp.gifshow.corona.common.utils.ResourceUrlType;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.corona.common.utils.ClickHolidayEggView$a;
import java.lang.Enum;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.facebook.drawee.view.SimpleDraweeView;
import uq9.a;
import java.lang.Runnable;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.RenderMode;
import uq9.b;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;

public class ClickHolidayEggView extends RelativeLayout	// class@00126b
{
    public String b;
    public final LinkedList c;
    public final LinkedList d;
    public int e;

    public void ClickHolidayEggView(Context p0){
       super(p0);
       this.c = new LinkedList();
       this.d = new LinkedList();
       this.e = 120;
    }
    public void a(float p0,float p1,ResourceUrlType p2){
       if (PatchProxy.isSupport(ClickHolidayEggView.class) && PatchProxy.applyVoidThreeRefs(Float.valueOf(p0), Float.valueOf(p1), p2, this, ClickHolidayEggView.class, "2")) {
          return;
       }
       int i = ClickHolidayEggView$a.a[p2.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i == 2) {
             KwaiImageView kwaiImageVie = this.d.pollFirst();
             if (kwaiImageVie == null) {
                kwaiImageVie = new KwaiImageView(this.getContext());
                kwaiImageVie.setScaleType(ImageView$ScaleType.FIT_XY);
                this.addView(kwaiImageVie, new RelativeLayout$LayoutParams(a1.e((float)this.e), a1.e((float)this.e)));
             }
             kwaiImageVie.setTranslationX((p0 - ((float)a1.e((float)this.e) / 2.00f)));
             kwaiImageVie.setTranslationY((p1 - ((float)a1.e((float)this.e) / 2.00f)));
             if (!PatchProxy.applyVoidOneRefs(kwaiImageVie, this, ClickHolidayEggView.class, "3")) {
                kwaiImageVie.bringToFront();
                kwaiImageVie.setVisibility(0);
                kwaiImageVie.setImageURI(this.b);
                kwaiImageVie.postDelayed(new a(this, kwaiImageVie), 500);
             }
          }
       }else {
          LottieAnimationView lottieAnimat = this.c.pollFirst();
          if (lottieAnimat == null) {
             lottieAnimat = new LottieAnimationView(this.getContext());
             lottieAnimat.setRenderMode(RenderMode.HARDWARE);
             lottieAnimat.k(b);
             this.addView(lottieAnimat, new RelativeLayout$LayoutParams(a1.e((float)this.e), a1.e((float)this.e)));
          }
          lottieAnimat.setTranslationX((p0 - ((float)a1.e((float)this.e) / 2.00f)));
          lottieAnimat.setTranslationY((p1 - ((float)a1.e((float)this.e) / 2.00f)));
          if (!PatchProxy.applyVoidOneRefs(lottieAnimat, this, ClickHolidayEggView.class, "4")) {
             lottieAnimat.f();
             lottieAnimat.setVisibility(4);
             ClickHolidayEggView tb = this.b;
             if (tb != null) {
                lottieAnimat.setAnimationFromUrl(tb);
             }
             lottieAnimat.setScaleType(ImageView$ScaleType.CENTER_CROP);
             lottieAnimat.a(new b(this, lottieAnimat));
             lottieAnimat.s();
          }
       }
    label_010e :
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ClickHolidayEggView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeAllViews();
       this.c.clear();
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClickHolidayEggView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       if (!PatchProxy.applyVoid(objArray, this, ClickHolidayEggView.class, "5")) {
          int i = 0;
          while (i < this.getChildCount()) {
             View childAt = this.getChildAt(i);
             if (childAt instanceof LottieAnimationView && childAt.p()) {
                childAt.f();
             }
             i = i + 1;
          }
          this.removeAllViews();
       }
       return;
    }
    public void setHolidayEggResUrl(String p0){
       this.b = p0;
    }
}
