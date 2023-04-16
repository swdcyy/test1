package com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView;
import android.view.View;
import com.yxcorp.gifshow.magic.ui.magicemoji.search.widget.AnimTranslationDrawableView$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.util.AttributeSet;
import android.graphics.Matrix;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import qrd.l1;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.graphics.Bitmap;
import android.animation.ValueAnimator;
import android.graphics.Xfermode;
import android.view.ViewGroup$LayoutParams;

public final class AnimTranslationDrawableView extends View	// class@001c04
{
    public Paint b;
    public Bitmap c;
    public Matrix d;
    public ValueAnimator e;
    public final PorterDuffXfermode f;
    public ValueAnimator g;
    public Drawable h;
    public Drawable i;
    public int j;
    public int k;
    public boolean l;
    public float m;
    public static final AnimTranslationDrawableView$a n;

    static {
       AnimTranslationDrawableView.n = new AnimTranslationDrawableView$a(null);
    }
    public void AnimTranslationDrawableView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void AnimTranslationDrawableView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0x1010084);
    }
    public void AnimTranslationDrawableView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.d = new Matrix();
       this.f = new PorterDuffXfermode(PorterDuff$Mode.SRC_ATOP);
       this.j = 255;
       if (PatchProxy.applyVoid(null, this, AnimTranslationDrawableView.class, "1")) {
       }else {
          Paint paint = new Paint();
          paint.setAntiAlias(true);
          paint.setColor(-1);
          this.b = paint;
       }
       return;
    }
    public final void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationDrawableView.class, "8")) {
          return;
       }
       AnimTranslationDrawableView ti = this.i;
       if (ti != null) {
          ti.setAlpha(this.k);
       }
       ti = this.i;
       if (ti != null) {
          ti.draw(p0);
       }
       ti = this.h;
       if (ti != null) {
          ti.setAlpha(this.j);
       }
       ti = this.h;
       if (ti != null) {
          ti.draw(p0);
       }
       return;
    }
    public final void b(int p0,int p1){
       float f;
       if (PatchProxy.isSupport(AnimTranslationDrawableView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AnimTranslationDrawableView.class, "6")) {
          return;
       }
       if (!p0 || (p1 && this.l == null)) {
          AnimTranslationDrawableView tc = this.c;
          if (tc == null || (tc.getWidth() && tc.getHeight())) {
             if ((tc.getWidth() / tc.getHeight()) >= (p0 / p1)) {
                f = (float)p1;
                p1 = tc.getHeight();
             }else {
                f = (float)p0;
                p1 = tc.getWidth();
             }
             f = f / (float)p1;
             if (!f - 0x3f800000) {
                return;
             }else {
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.c = Bitmap.createBitmap(tc, 0, 0, tc.getWidth(), tc.getHeight(), matrix, true);
             }
          }
       }
    label_0070 :
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, AnimTranslationDrawableView.class, "10")) {
          return;
       }
       this.m = (float)this.getWidth();
       this.d.reset();
       this.d.postTranslate((float)this.getWidth(), 0);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationDrawableView.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       AnimTranslationDrawableView te = this.e;
       if (te != null && (te.isRunning() == true && this.c != null)) {
          int i = p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null);
          super.onDraw(p0);
          this.a(p0);
          if (this.e == null) {
             this.c();
          }
          AnimTranslationDrawableView tb = this.b;
          String str = "bgBitmapPaint";
          if (tb == null) {
             a.S(str);
          }
          tb.setXfermode(this.f);
          tb = this.c;
          a.m(tb);
          AnimTranslationDrawableView td = this.d;
          AnimTranslationDrawableView tb1 = this.b;
          if (tb1 == null) {
             a.S(str);
          }
          p0.drawBitmap(tb, td, tb1);
          tb = this.b;
          if (tb == null) {
             a.S(str);
          }
          tb.setXfermode(null);
          p0.restoreToCount(i);
       }else {
          super.onDraw(p0);
          this.a(p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AnimTranslationDrawableView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AnimTranslationDrawableView.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.b(p0, p1);
       return;
    }
    public final void setDrawableBounds(Drawable p0){
       int intrinsicWid;
       int intrinsicHei;
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationDrawableView.class, "11")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
       layoutParams = (layoutParams != null)? layoutParams.height: p0.getIntrinsicHeight();
       ViewGroup$LayoutParams layoutParams1 = this.getLayoutParams();
       layoutParams1 = (layoutParams1 != null)? layoutParams1.width: p0.getIntrinsicWidth();
       p0.setBounds(0, 0, layoutParams, layoutParams1);
       return;
    }
    public final void setTextBackgroundBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationDrawableView.class, "5")) {
          return;
       }
       a.p(p0, "bitmap");
       this.c = p0;
       this.b(this.getWidth(), this.getHeight());
       return;
    }
}
