package com.yxcorp.gifshow.topic.c$b;
import android.text.style.ImageSpan;
import android.graphics.drawable.Drawable;
import java.lang.String;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import android.graphics.Rect;
import android.graphics.Canvas;
import java.lang.CharSequence;
import java.lang.Integer;
import java.lang.Float;
import android.text.TextPaint;
import java.lang.Number;

public class c$b extends ImageSpan	// class@001da4
{
    public boolean b;
    public Rect c;
    public Paint$FontMetricsInt d;
    public Object e;
    public int f;
    public WeakReference g;

    public void c$b(Drawable p0,String p1){
       super(p0, p1, 1);
       this.b = true;
       this.d = new Paint$FontMetricsInt();
    }
    public final Drawable a(Paint p0){
       c$b obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g;
       Paint$FontMetricsInt uFontMetrics = null;
       Drawable uDrawable = (obj != null)? obj.get(): uFontMetrics;
       if (uDrawable == null) {
          uDrawable = this.getDrawable();
          if (this.b != null) {
             uDrawable.setBounds(0, 0, p0.getFontMetricsInt(uFontMetrics), p0.getFontMetricsInt(uFontMetrics));
          }else {
             c$b tc = this.c;
             if (tc != null) {
                uDrawable.setBounds(tc);
             }
          }
          this.g = new WeakReference(uDrawable);
       }
       return uDrawable;
    }
    public void draw(Canvas p0,CharSequence p1,int p2,int p3,float p4,int p5,int p6,int p7,Paint p8){
       if (PatchProxy.isSupport(c$b.class)) {
          Object[] objArray = new Object[9];
          objArray[0] = p0;
          objArray[1] = p1;
          objArray[2] = Integer.valueOf(p2);
          objArray[3] = Integer.valueOf(p3);
          objArray[4] = Float.valueOf(p4);
          objArray[5] = Integer.valueOf(p5);
          objArray[6] = Integer.valueOf(p6);
          objArray[7] = Integer.valueOf(p7);
          objArray[8] = p8;
          if (PatchProxy.applyVoid(objArray, this, c$b.class, "3")) {
             return;
          }
       }
       Drawable uDrawable = this.a(p8);
       if (p8 instanceof TextPaint) {
          uDrawable.setState(p8.drawableState);
       }
       p0.save();
       p0.translate(p4, (float)((p6 + this.d.ascent) + ((p8.getFontMetricsInt(this.d) - (uDrawable.getBounds().bottom - uDrawable.getBounds().top)) / 2)));
       uDrawable.draw(p0);
       p0.restore();
       return;
    }
    public int getSize(Paint p0,CharSequence p1,int p2,int p3,Paint$FontMetricsInt p4){
       if (PatchProxy.isSupport(c$b.class)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          p1 = PatchProxy.apply(objArray, this, c$b.class, "2");
          if (p1 != PatchProxyResult.class) {
             return p1.intValue();
          }
       }
       Rect bounds = this.a(p0).getBounds();
       if (p4 != null) {
          p0.getFontMetricsInt(p4);
          p4.ascent = p4.ascent;
          p4.descent = p4.descent;
          p4.top = p4.top;
          p4.bottom = p4.bottom;
       }
       return (bounds.right + this.f);
    }
}
