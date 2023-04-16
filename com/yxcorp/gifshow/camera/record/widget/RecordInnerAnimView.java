package com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.animation.ValueAnimator;
import kotlin.jvm.internal.Ref$BooleanRef;
import com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.camera.record.widget.RecordInnerAnimView$c;
import android.view.ViewOutlineProvider;
import android.view.ViewGroup;
import java.lang.Integer;

public final class RecordInnerAnimView extends FrameLayout	// class@000fd6
{
    public ValueAnimator b;

    public void RecordInnerAnimView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RecordInnerAnimView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RecordInnerAnimView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.a();
    }
    public void RecordInnerAnimView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = -1;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, RecordInnerAnimView.class, "1")) {
          return;
       }
       Drawable drawable = this.getResources().getDrawable(R.drawable.arg_RES_7f081e02);
       ImageView imageView = new ImageView(this.getContext());
       imageView.setScaleType(ImageView$ScaleType.CENTER);
       imageView.setImageDrawable(drawable);
       a.o(drawable, "drawable");
       int intrinsicWid = drawable.getIntrinsicWidth();
       this.addView(imageView, new FrameLayout$LayoutParams(intrinsicWid, drawable.getIntrinsicHeight()));
       this.getViewTreeObserver().addOnGlobalLayoutListener(new RecordInnerAnimView$b(this, imageView));
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0xc3b40000});
       this.b = valueAnimato;
       if (valueAnimato != null) {
          valueAnimato.setDuration(0x2710);
          valueAnimato.setRepeatCount(-1);
          Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
          uBooleanRef.element = true;
          valueAnimato.addUpdateListener(new RecordInnerAnimView$a(uBooleanRef, imageView));
       }
       this.setOutlineProvider(new RecordInnerAnimView$c());
       this.setClipToOutline(true);
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, RecordInnerAnimView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       RecordInnerAnimView tb = this.b;
       if (tb != null && (!this.getVisibility() && !tb.isRunning())) {
          tb.start();
       }
    label_0022 :
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, RecordInnerAnimView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       RecordInnerAnimView tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(RecordInnerAnimView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RecordInnerAnimView.class, "4")) {
          return;
       }
       a.p(p0, "changedView");
       super.onVisibilityChanged(p0, p1);
       RecordInnerAnimView tb = this.b;
       if (tb != null) {
          if (!p1) {
             if (!tb.isRunning()) {
                tb.start();
             }
          }else {
             tb.cancel();
          }
       }
       return;
    }
}
