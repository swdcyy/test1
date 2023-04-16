package com.yxcorp.gifshow.widget.TabTripleImageRotateView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedList;
import com.yxcorp.gifshow.widget.l0;
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

public class TabTripleImageRotateView extends FrameLayout	// class@0018d3
{
    public LinkedList b;
    public KwaiImageView c;
    public KwaiImageView d;
    public KwaiImageView e;
    public int f;
    public boolean g;
    public ValueAnimator h;
    public Runnable i;
    public static final int j;

    public void TabTripleImageRotateView(Context p0){
       super(p0, null);
    }
    public void TabTripleImageRotateView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void TabTripleImageRotateView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new LinkedList();
       this.i = new l0(this);
       a.c(LayoutInflater.from(p0), R.layout.arg_RES_7f0d1638, this, true);
       if (PatchProxy.applyVoid(null, this, TabTripleImageRotateView.class, "1")) {
       }else {
          this.c = this.findViewById(0x7f0a134e);
          this.d = this.findViewById(0x7f0a134f);
          this.e = this.findViewById(0x7f0a1350);
          this.setChildrenDrawingOrderEnabled(true);
       }
       return;
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TabTripleImageRotateView.class, "2")) {
          return;
       }
       this.g();
       this.b.clear();
       this.b.add(this.c);
       this.b.add(this.d);
       this.b.add(this.e);
       if (this.h != null) {
          this.c();
       }
       if (!q.f(p0)) {
          Integer[] integerArray = new Integer[]{Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(2)};
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
    public void b(View p0,int p1){
       if (PatchProxy.isSupport(TabTripleImageRotateView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, TabTripleImageRotateView.class, "10")) {
          return;
       }
       p0.setZ((float)p1);
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, TabTripleImageRotateView.class, "7")) {
          return;
       }
       this.b(this.c, 1);
       this.b(this.d, 2);
       this.b(this.e, 0);
       this.d(this.c, this.d, this.e);
       return;
    }
    public void d(KwaiImageView p0,KwaiImageView p1,KwaiImageView p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, TabTripleImageRotateView.class, "6")) {
          return;
       }
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       p0.setAlpha(0.40f);
       p0.setTranslationX(0);
       p1.setScaleX(0x3f9c6a7f);
       p1.setScaleY(0x3f9c6a7f);
       p1.setAlpha(0x3f800000);
       p1.setTranslationX((float)this.getStageLength());
       p2.setScaleX(0x3f800000);
       p2.setScaleY(0x3f800000);
       p2.setAlpha(0.40f);
       p2.setTranslationX((float)(this.getStageLength() * 2));
       return;
    }
    public final void e(View p0,float p1){
       if (PatchProxy.isSupport(TabTripleImageRotateView.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, TabTripleImageRotateView.class, "8")) {
          return;
       }
       p0.setScaleX(p1);
       p0.setScaleY(p1);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, TabTripleImageRotateView.class, "3")) {
          return;
       }
       this.g = false;
       this.f = 0;
       this.removeCallbacks(this.i);
       this.postDelayed(this.i, 500);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, TabTripleImageRotateView.class, "4")) {
          return;
       }
       TabTripleImageRotateView th = this.h;
       if (th != null && th.isRunning()) {
          this.h.cancel();
          this.g = true;
       }
       this.removeCallbacks(this.i);
       return;
    }
    public final int getStageLength(){
       Object obj = PatchProxy.apply(null, this, TabTripleImageRotateView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a1.e(9.00f);
    }
}
