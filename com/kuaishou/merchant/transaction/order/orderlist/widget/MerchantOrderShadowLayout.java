package com.kuaishou.merchant.transaction.order.orderlist.widget.MerchantOrderShadowLayout;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import lnc.a1;
import cm4.a;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import java.lang.Float;

public class MerchantOrderShadowLayout extends View	// class@0008ea
{
    public int[] b;
    public float[] c;
    public int d;
    public Paint e;
    public LinearGradient f;
    public ValueAnimator g;
    public Matrix h;
    public RectF i;
    public int j;
    public ValueAnimator$AnimatorUpdateListener k;
    public static final int l;

    public void MerchantOrderShadowLayout(Context p0){
       super(p0, null);
    }
    public void MerchantOrderShadowLayout(Context p0,AttributeSet p1){
       super(p0, p1, -1);
    }
    public void MerchantOrderShadowLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       int[] ointArray = new int[]{0,a1.a(0x7f061e54),a1.a(0x7f061e5a),a1.a(0x7f061e54),0};
       this.b = ointArray;
       this.c = new float[5]{0x3e99999a,0x3eb33333,0x3f000000,0x3f266666,0x3f333333};
       this.d = 30;
       this.j = 1;
       this.k = new a(this);
       Paint paint = new Paint();
       this.e = paint;
       paint.setAntiAlias(1);
       this.h = new Matrix();
       this.i = new RectF();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderShadowLayout.class, "4")) {
          return;
       }
       MerchantOrderShadowLayout tg = this.g;
       if (tg != null && tg.isRunning()) {
          this.g.cancel();
          this.invalidate();
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, MerchantOrderShadowLayout.class, "1")) {
          return;
       }
       super.onDetachedFromWindow();
       MerchantOrderShadowLayout tg = this.g;
       if (tg != null) {
          tg.removeAllUpdateListeners();
          if (this.g.isRunning()) {
             this.g.end();
          }
       }
       this.g = null;
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantOrderShadowLayout.class, "2")) {
          return;
       }
       super.onDraw(p0);
       if (this.f == null) {
          LinearGradient linearGradie = new LinearGradient(0, 0, (float)this.getWidth(), 0, this.b, this.c, Shader$TileMode.CLAMP);
          this.f = v0;
          this.e.setShader(v0);
       }
       MerchantOrderShadowLayout tg = this.g;
       if (tg == null || !tg.isRunning()) {
          this.h.reset();
          this.h.postTranslate((float)this.getWidth(), 0);
          this.e.getShader().setLocalMatrix(this.h);
       }else {
          this.h.reset();
          this.h.setRotate((float)this.d, ((float)this.getWidth() / 2.00f), ((float)this.getHeight() / 2.00f));
          this.h.postTranslate(this.g.getAnimatedValue().floatValue(), 0);
          this.e.getShader().setLocalMatrix(this.h);
       }
       this.i.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       p0.drawRoundRect(this.i, 0, 0, this.e);
       return;
    }
    public void setRepeatCount(int p0){
       this.j = p0;
    }
}
