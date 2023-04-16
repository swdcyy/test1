package com.yxcorp.gifshow.music.UpLoadingCoverView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.RectF;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.Paint$FontMetricsInt;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import java.lang.Math;
import java.lang.StringBuilder;

public class UpLoadingCoverView extends View	// class@001fd8
{
    public int b;
    public int c;
    public float d;
    public float e;
    public Paint f;
    public Paint g;
    public Paint h;
    public RectF i;
    public RectF j;
    public float k;
    public PorterDuffXfermode l;

    public void UpLoadingCoverView(Context p0){
       super(p0, null);
    }
    public void UpLoadingCoverView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void UpLoadingCoverView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.S5, p2, 0);
       this.b = typedArray.getColor(0, -436240384);
       this.c = typedArray.getColor(2, -1);
       int i = 1;
       this.d = typedArray.getDimension(i, 0);
       this.e = typedArray.getDimension(3, 14.00f);
       typedArray.recycle();
       if (PatchProxy.applyVoid(null, this, UpLoadingCoverView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.f = paint;
          paint.setAntiAlias(i);
          this.f.setColor(this.b);
          paint = new Paint();
          this.g = paint;
          paint.setAntiAlias(i);
          this.g.setColor(this.c);
          this.g.setTextSize(this.e);
          this.g.setTextAlign(Paint$Align.CENTER);
          paint = new Paint();
          this.h = paint;
          paint.setColor(0);
          this.i = new RectF(0, 0, 0, 0);
          this.j = new RectF(0, 0, 0, 0);
          this.l = new PorterDuffXfermode(PorterDuff$Mode.CLEAR);
       }
       return;
    }
    public void onDraw(Canvas p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, UpLoadingCoverView.class, "2")) {
          return;
       }
       super.onDraw(p0);
       p0.drawColor(0);
       float f = 0;
       float f1 = (float)p0.getWidth();
       float f2 = (float)p0.getHeight();
       this.i.set(f, f, f1, f2);
       p0.drawRoundRect(this.i, this.d, this.d, this.f);
       this.j.set(f, f, f1, (f2 * (0x3f800000 - this.k)));
       this.h.setXfermode(this.l);
       p0.drawRect(this.j, this.h);
       this.h.setXfermode(null);
       p0.restoreToCount(p0.saveLayer(0, f, f1, f2, null, 31));
       Paint$FontMetricsInt fontMetricsI = this.g.getFontMetricsInt();
       UpLoadingCoverView ti = this.i;
       float f3 = (((ti.bottom + ti.top) - (float)fontMetricsI.bottom) - (float)fontMetricsI.top) / 2.00f;
       UpLoadingCoverView tk = this.k;
       if (PatchProxy.isSupport(UpLoadingCoverView.class)) {
          str = PatchProxy.applyOneRefs(Float.valueOf(tk), this, UpLoadingCoverView.class, "5");
          if (str != PatchProxyResult.class) {
          label_00ad :
             p0.drawText(str, this.i.centerX(), f3, this.g);
             return;
          }
       }
       str = Math.min(Math.round((tk * 100.00f)), 100)+"%";
       goto label_00ad ;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(UpLoadingCoverView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, UpLoadingCoverView.class, "3")) {
          return;
       }
       this.k = p0;
       this.invalidate();
       return;
    }
}
