package com.yxcorp.gifshow.detail.slideplay.SlidePlayMarqueeV2TextView;
import android.widget.TextView;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import ekd.y0;
import android.graphics.Canvas;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import android.graphics.Paint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.IllegalStateException;
import d6a.q;
import java.lang.Runnable;

public class SlidePlayMarqueeV2TextView extends TextView	// class@001718
{
    public int b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public CharSequence g;
    public float h;
    public float i;
    public float j;
    public y0 k;
    public static final int l;

    static {
       SlidePlayMarqueeV2TextView.l = n.c(a.b(), 18.00f);
    }
    public void SlidePlayMarqueeV2TextView(Context p0){
       super(p0, null);
    }
    public void SlidePlayMarqueeV2TextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 30;
       this.c = 16;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlidePlayMarqueeV2TextView.class, "3")) {
          return;
       }
       this.d = ((float)this.c * ((float)this.b * c.c(this.getContext().getResources()).density)) / 1000.00f;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SlidePlayMarqueeV2TextView.class, "9")) {
          return;
       }
       SlidePlayMarqueeV2TextView tk = this.k;
       if (tk != null) {
          tk.e();
       }
       return;
    }
    public boolean getEnableMarquee(){
       return this.f;
    }
    public final float getScrollInitialValue(){
       return (- this.j);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMarqueeV2TextView.class, "5")) {
          return;
       }
       super.onDraw(p0);
       int measuredWidt = this.getMeasuredWidth();
       if (!TextUtils.x(this.g) && (this.h > 0 && measuredWidt > 0)) {
          float f = - this.i;
          while (f - (float)measuredWidt < 0) {
             SlidePlayMarqueeV2TextView tg = this.g;
             p0.drawText(tg, 0, tg.length(), f, this.e, this.getPaint());
             float f1 = this.h + (float)SlidePlayMarqueeV2TextView.l;
             f = f + f1;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SlidePlayMarqueeV2TextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayMarqueeV2TextView.class, "4")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.e = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
       return;
    }
    public void setEnableMarquee(boolean p0){
       this.f = p0;
    }
    public void setFrameIntervalScale(float p0){
       if (PatchProxy.isSupport(SlidePlayMarqueeV2TextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayMarqueeV2TextView.class, "2")) {
          return;
       }
       if (p0 - 0x3f800000 < 0) {
          throw new IllegalStateException("只支持降低帧数，所以时间间隔只能放大");
       }
       this.c = (int)(p0 * 16.00f);
       this.a();
       return;
    }
    public void setMarqueeText(CharSequence p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMarqueeV2TextView.class, "6")) {
          return;
       }
       String str = "";
       if (this.f == null) {
          this.g = str;
          super.setText(p0);
          return;
       }else {
          super.setText(str);
          if (TextUtils.x(p0)) {
             this.g = str;
             return;
          }else {
             this.g = p0;
             SlidePlayMarqueeV2TextView tg = this.g;
             this.h = this.getPaint().measureText(tg, 0, tg.length());
             if (!PatchProxy.applyVoid(null, this, SlidePlayMarqueeV2TextView.class, "12") && this.k == null) {
                this.k = new y0((long)this.c, new q(this));
             }
             this.postInvalidate();
             return;
          }
       }
    }
}
