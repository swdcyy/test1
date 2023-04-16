package com.yxcorp.gifshow.camera.record.widget.AnimTranslationBgTextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yxcorp.gifshow.camera.record.widget.AnimTranslationBgTextView$a;
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
import android.widget.TextView;
import android.graphics.Paint;
import qrd.l1;
import android.graphics.Canvas;
import android.animation.ValueAnimator;
import android.graphics.Xfermode;
import android.graphics.Bitmap;
import java.lang.Integer;
import android.view.View;

public final class AnimTranslationBgTextView extends AppCompatTextView	// class@000fb4
{
    public Paint f;
    public Bitmap g;
    public Matrix h;
    public ValueAnimator i;
    public final PorterDuffXfermode j;
    public ValueAnimator k;
    public ColorStateList l;
    public final int m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public float r;
    public int s;
    public static final AnimTranslationBgTextView$a t;

    static {
       AnimTranslationBgTextView.t = new AnimTranslationBgTextView$a(null);
    }
    public void AnimTranslationBgTextView(Context p0){
       a.p(p0, "context");
       super(p0, null);
    }
    public void AnimTranslationBgTextView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1, 0x1010084);
    }
    public void AnimTranslationBgTextView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.h = new Matrix();
       this.j = new PorterDuffXfermode(PorterDuff$Mode.SRC_ATOP);
       int i = -1;
       this.m = i;
       if (PatchProxy.applyVoid(null, this, AnimTranslationBgTextView.class, "1")) {
       }else {
          this.p = this.getShadowDx();
          this.q = this.getShadowDy();
          this.r = this.getShadowRadius();
          this.s = this.getShadowColor();
          Paint paint = new Paint();
          paint.setAntiAlias(true);
          paint.setColor(i);
          this.f = paint;
       }
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationBgTextView.class, "3")) {
          return;
       }
       a.p(p0, "canvas");
       AnimTranslationBgTextView ti = this.i;
       if (ti != null && (ti.isRunning() == true && this.g != null)) {
          int i = p0.saveLayer(0, 0, (float)this.getMeasuredWidth(), (float)this.getMeasuredHeight(), null);
          super.onDraw(p0);
          if (this.i == null) {
             this.q();
          }
          AnimTranslationBgTextView tf = this.f;
          String str = "bgBitmapPaint";
          if (tf == null) {
             a.S(str);
          }
          tf.setXfermode(this.j);
          tf = this.g;
          a.m(tf);
          AnimTranslationBgTextView th = this.h;
          AnimTranslationBgTextView tf1 = this.f;
          if (tf1 == null) {
             a.S(str);
          }
          p0.drawBitmap(tf, th, tf1);
          tf = this.f;
          if (tf == null) {
             a.S(str);
          }
          tf.setXfermode(null);
          p0.restoreToCount(i);
       }else {
          super.onDraw(p0);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(AnimTranslationBgTextView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, AnimTranslationBgTextView.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.p(p0, p1);
       return;
    }
    public final void p(int p0,int p1){
       float f;
       if (PatchProxy.isSupport(AnimTranslationBgTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, AnimTranslationBgTextView.class, "5")) {
          return;
       }
       if (!p0 || (p1 && this.n == null)) {
          AnimTranslationBgTextView tg = this.g;
          if (tg == null || (tg.getWidth() && tg.getHeight())) {
             if ((tg.getWidth() / tg.getHeight()) >= (p0 / p1)) {
                f = (float)p1;
                p1 = tg.getHeight();
             }else {
                f = (float)p0;
                p1 = tg.getWidth();
             }
             f = f / (float)p1;
             if (!f - 0x3f800000) {
                return;
             }else {
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.g = Bitmap.createBitmap(tg, 0, 0, tg.getWidth(), tg.getHeight(), matrix, true);
             }
          }
       }
    label_0070 :
       return;
    }
    public final void q(){
       if (PatchProxy.applyVoid(null, this, AnimTranslationBgTextView.class, "12")) {
          return;
       }
       this.o = (float)this.getWidth();
       AnimTranslationBgTextView tg = this.g;
       a.m(tg);
       this.h.reset();
       this.h.postTranslate((float)this.getWidth(), ((- ((float)tg.getHeight() - (float)this.getHeight())) / 2.00f));
       return;
    }
    public final void setTextBackgroundBitmap(Bitmap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AnimTranslationBgTextView.class, "4")) {
          return;
       }
       a.p(p0, "bitmap");
       this.g = p0;
       this.p(this.getWidth(), this.getHeight());
       return;
    }
}
