package com.kwai.live.gzone.widget.LiveGzoneProgressBallView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import com.kwai.live.gzone.widget.LiveGzoneProgressBallView$a;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.Xfermode;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Integer;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.lang.Float;

public class LiveGzoneProgressBallView extends View	// class@000e7e
{
    public Paint b;
    public float c;
    public float d;
    public float e;
    public Path f;
    public final RectF g;
    public int h;
    public int i;
    public LinearGradient j;
    public PorterDuffXfermode k;
    public Runnable l;

    public void LiveGzoneProgressBallView(Context p0){
       super(p0, null);
    }
    public void LiveGzoneProgressBallView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGzoneProgressBallView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.c = 0;
       this.d = 0;
       this.e = 0;
       this.f = new Path();
       this.g = new RectF();
       this.k = new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
       this.l = new LiveGzoneProgressBallView$a(this);
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(true);
       this.b.setColor(0xff000000);
       this.b.setStyle(Paint$Style.FILL);
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneProgressBallView.class, "4")) {
          return;
       }
       super.onAttachedToWindow();
       this.postOnAnimation(this.l);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LiveGzoneProgressBallView.class, "5")) {
          return;
       }
       super.onDetachedFromWindow();
       this.removeCallbacks(this.l);
       return;
    }
    public void onDraw(Canvas p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveGzoneProgressBallView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       int i = p0.saveLayer(0, 0, (float)this.getWidth(), (float)this.getHeight(), null, 31);
       obj.b.setShader(obj.j);
       obj1.drawOval(obj.g, obj.b);
       obj.b.setXfermode(obj.k);
       float f = 0x3f800000;
       if (!PatchProxy.applyVoidOneRefs(obj1, obj, LiveGzoneProgressBallView.class, "2")) {
          float f1 = (obj.d * 0x3f666666) + 0.10f;
          if (obj.i <= null || (f1 > 0 && f1 - f <= 0)) {
             float f2 = (float)this.getPaddingTop();
             float f3 = ((f - f1) * (float)obj.i) + f2;
             float f4 = (float)this.getPaddingLeft() - obj.e;
             float f5 = f4 + (float)(obj.h * 2);
             float f6 = (f4 + f5) / 2.00f;
             f1 = Math.min(10.00f, (f1 * (float)obj.i));
             obj.f.reset();
             obj.f.moveTo(f4, f3);
             float f7 = f6 * 0x3f000000;
             float f8 = (f4 * 0x3f000000) + f7;
             float f9 = f3 - f1;
             float f10 = f9;
             float f11 = f1 + f3;
             f = f5;
             obj.f.cubicTo(f8, f10, f8, f11, f6, f3);
             f8 = f7 + (f * 0x3f000000);
             obj.f.cubicTo(f8, f10, f8, f11, f, f3);
             obj.f.lineTo(f, f2);
             obj.f.lineTo(f4, f2);
             obj.f.lineTo(f4, f3);
             obj1.drawPath(obj.f, obj.b);
          }
       }
       obj.b.setXfermode(null);
       obj1.restoreToCount(i);
       LiveGzoneProgressBallView d = obj.d;
       if (obj.c - d || (d > 0 && d - 0x3f800000 < 0)) {
          obj.postOnAnimationDelayed(obj.l, 10);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(LiveGzoneProgressBallView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, LiveGzoneProgressBallView.class, "1")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.h = (this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight();
       this.i = (this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom();
       this.g.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getPaddingLeft() + this.h), (float)(this.getPaddingTop() + this.i));
       LinearGradient linearGradie = new LinearGradient((((float)this.getWidth() * 0x3f000000) - ((float)this.getHeight() * 0.13f)), 0, (((float)this.getWidth() * 0x3f000000) + ((float)this.getHeight() * 0.13f)), (float)this.getHeight(), -28402, -1027027, Shader$TileMode.CLAMP);
       this.j = this.g;
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(LiveGzoneProgressBallView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGzoneProgressBallView.class, "6")) {
          return;
       }
       this.c = p0;
       this.d = p0;
       if (!this.getVisibility()) {
          this.postInvalidate();
       }
       return;
    }
    public void setProgressSmooth(float p0){
       if (PatchProxy.isSupport(LiveGzoneProgressBallView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveGzoneProgressBallView.class, "7")) {
          return;
       }
       this.c = p0;
       this.postInvalidate();
       return;
    }
}
