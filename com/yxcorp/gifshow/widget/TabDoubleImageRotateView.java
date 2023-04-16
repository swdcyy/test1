package com.yxcorp.gifshow.widget.TabDoubleImageRotateView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedList;
import com.yxcorp.gifshow.widget.k0;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.Integer;
import com.facebook.imagepipeline.request.ImageRequest;
import ub.b;
import pb.d;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import ac.a;
import android.graphics.drawable.Drawable;
import lnc.a1;
import android.widget.ImageView;
import java.lang.Float;
import java.lang.Runnable;
import android.animation.ValueAnimator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class TabDoubleImageRotateView extends FrameLayout	// class@0018d2
{
    public LinkedList b;
    public KwaiImageView c;
    public KwaiImageView d;
    public KwaiImageView e;
    public boolean f;
    public ValueAnimator g;
    public Runnable h;
    public static final int i;

    public void TabDoubleImageRotateView(Context p0){
       super(p0, null);
    }
    public void TabDoubleImageRotateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TabDoubleImageRotateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new LinkedList();
       this.h = new k0(this);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d0315, this, true);
       if (PatchProxy.applyVoid(null, this, TabDoubleImageRotateView.class, "1")) {
       }else {
          this.c = this.findViewById(0x7f0a134e);
          this.d = this.findViewById(0x7f0a134f);
          this.e = this.findViewById(0x7f0a1350);
          this.setChildrenDrawingOrderEnabled(true);
       }
       return;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabDoubleImageRotateView.class, "2")) {
          return;
       }
       this.f();
       this.b.clear();
       this.b.add(this.c);
       this.b.add(this.d);
       this.b.add(this.e);
       this.b();
       if (!q.f(p0)) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(2)};
          List list = q.a(integerArray);
          int i = 0;
          while (i < list.size()) {
             if (i < p0.size()) {
                KwaiImageView kwaiImageVie = this.b.get(list.get(i).intValue());
                ImageRequest[] imageRequest = new ImageRequest[]{ImageRequest.c(p0.get(i))};
                b uob = null;
                d uod = kwaiImageVie.g0(uob, uob, imageRequest);
                if (uod != null) {
                   uob = uod.e();
                }
                kwaiImageVie.setController(uob);
                kwaiImageVie.setFailureImage(a1.f(R.drawable.detail_avatar_secret));
             }
             i = i + 1;
          }
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, TabDoubleImageRotateView.class, "7")) {
          return;
       }
       this.c(this.c, this.d, this.e);
       return;
    }
    public void c(KwaiImageView p0,KwaiImageView p1,KwaiImageView p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TabDoubleImageRotateView.class, "6")) {
          return;
       }
       p0.setScaleX(0x3f99999a);
       p0.setScaleY(0x3f99999a);
       p0.setAlpha(0x3f800000);
       p0.setTranslationX((float)this.getStageLength());
       p1.setScaleX(0x3f800000);
       p1.setScaleY(0x3f800000);
       p1.setAlpha(0);
       p1.setTranslationX((float)this.getStageLength());
       p2.setScaleX(0x3f800000);
       p2.setScaleY(0x3f800000);
       p2.setAlpha(0);
       p2.setTranslationX((float)this.getStageLength());
       return;
    }
    public final void d(View p0,float p1){
       if (PatchProxy.isSupport(TabDoubleImageRotateView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, TabDoubleImageRotateView.class, "8")) {
          return;
       }
       p0.setScaleX(p1);
       p0.setScaleY(p1);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, TabDoubleImageRotateView.class, "3")) {
          return;
       }
       this.f = false;
       this.removeCallbacks(this.h);
       this.postDelayed(this.h, 2000);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, TabDoubleImageRotateView.class, "4")) {
          return;
       }
       TabDoubleImageRotateView tg = this.g;
       if (tg != null && tg.isRunning()) {
          this.g.cancel();
          this.f = true;
       }
       this.removeCallbacks(this.h);
       return;
    }
    public final int getStageLength(){
       Object obj = PatchProxy.apply(null, this, TabDoubleImageRotateView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(12.00f);
    }
}
