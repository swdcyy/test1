package com.yxcorp.gifshow.detail.slideplay.SlidePlayMarqueeTextView;
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
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.text.TextPaint;
import android.graphics.Paint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Float;
import java.lang.IllegalStateException;
import ekd.y0;
import d6a.p;
import java.lang.Runnable;

public class SlidePlayMarqueeTextView extends TextView	// class@001717
{
    public float b;
    public float c;
    public float d;
    public boolean e;
    public int f;
    public String g;
    public float h;
    public float i;
    public float j;
    public y0 k;
    public static final int l;

    static {
       SlidePlayMarqueeTextView.l = n.c(a.b(), 20.00f);
    }
    public void SlidePlayMarqueeTextView(Context p0){
       super(p0, null);
    }
    public void SlidePlayMarqueeTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = 0x3f800000;
       this.a();
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, SlidePlayMarqueeTextView.class, "2")) {
          return;
       }
       this.b = ((float)this.getActualMarqueeInterval() * (c.c(this.getContext().getResources()).density * 0x41f00000)) / 1000.00f;
       return;
    }
    public final int getActualMarqueeInterval(){
       return (int)(this.d * 16.00f);
    }
    public boolean getEnableMarquee(){
       return this.e;
    }
    public final float getScrollInitialValue(){
       return (- this.j);
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMarqueeTextView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       if (this.f <= null) {
          this.f = this.getLayoutParams().width;
       }
       if (!TextUtils.x(this.g) && (this.h - null > 0 && this.f > null)) {
          float f = - this.i;
          while (f - (float)this.f < 0) {
             p0.drawText(this.g, f, this.c, this.getPaint());
             float f1 = this.h + (float)SlidePlayMarqueeTextView.l;
             f = f + f1;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SlidePlayMarqueeTextView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayMarqueeTextView.class, "3")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.c = (float)(int)((float)(this.getHeight() / 2) - ((this.getPaint().descent() + this.getPaint().ascent()) / 2.00f));
       return;
    }
    public void setEnableMarquee(boolean p0){
       this.e = p0;
    }
    public void setFrameIntervalScale(float p0){
       if (PatchProxy.isSupport(SlidePlayMarqueeTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayMarqueeTextView.class, "1")) {
          return;
       }
       if (p0 - 0x3f800000 < 0) {
          throw new IllegalStateException("只支持降低帧数，所以时间间隔只能放大");
       }
       this.d = p0;
       this.a();
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayMarqueeTextView.class, "5")) {
          return;
       }
       if (this.e == null) {
          super.setText(p0);
          return;
       }else if(TextUtils.x(p0)){
          return;
       }else {
          this.g = p0;
          this.h = this.getPaint().measureText(this.g);
          this.f = this.getLayoutParams().width;
          if (!PatchProxy.applyVoid(null, this, SlidePlayMarqueeTextView.class, "11") && this.k == null) {
             this.k = new y0((long)this.getActualMarqueeInterval(), new p(this));
          }
          this.postInvalidate();
          return;
       }
    }
}
