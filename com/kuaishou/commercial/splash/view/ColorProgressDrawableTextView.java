package com.kuaishou.commercial.splash.view.ColorProgressDrawableTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Path;
import android.graphics.RectF;
import lnc.a1;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.Path$Direction;
import android.graphics.Region$Op;
import android.view.View;
import java.lang.Float;

public class ColorProgressDrawableTextView extends TextView	// class@00162c
{
    public Drawable b;
    public Drawable c;
    public int d;
    public float e;
    public final Path f;
    public final RectF g;
    public final int h;

    public void ColorProgressDrawableTextView(Context p0){
       super(p0, null);
    }
    public void ColorProgressDrawableTextView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void ColorProgressDrawableTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = new Path();
       this.g = new RectF();
       this.h = a1.e(8.00f);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ColorProgressDrawableTextView.class, "2")) {
          return;
       }
       int i = (int)((float)this.getWidth() * this.e);
       ColorProgressDrawableTextView tc = this.c;
       int i1 = 0;
       if (tc != null) {
          if (tc.getBounds().width() != this.getWidth()) {
             this.c.setBounds(i1, i1, i, this.getHeight());
          }
          p0.save();
          p0.clipRect(i1, i1, (i - (this.d / 2)), this.getHeight());
          this.c.draw(p0);
          p0.restore();
       }
       int width = (i > this.getWidth())? this.getWidth(): i;
       this.g.set((float)(i - this.d), 0, (float)this.getWidth(), (float)this.getHeight());
       this.f.reset();
       this.f.addRect(this.g, Path$Direction.CCW);
       p0.save();
       p0.clipPath(this.f, Region$Op.DIFFERENCE);
       super.draw(p0);
       p0.restore();
       if (this.b != null && this.d > null) {
          p0.save();
          p0.clipRect((i - this.d), i1, width, this.getHeight());
          this.f.reset();
          this.g.set(0, 0, (float)(this.getWidth() + this.d), (float)this.getHeight());
          ColorProgressDrawableTextView th = this.h;
          float f = (float)th;
          this.f.addRoundRect(this.g, f, (float)th, Path$Direction.CCW);
          p0.clipPath(this.f, Region$Op.INTERSECT);
          this.b.draw(p0);
          p0.restore();
       }
       return;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(ColorProgressDrawableTextView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, ColorProgressDrawableTextView.class, "1")) {
          return;
       }
       this.e = p0;
       int i = (int)((float)this.getWidth() * this.e);
       ColorProgressDrawableTextView tb = this.b;
       if (tb != null) {
          tb.setBounds((i - this.d), 0, i, this.getHeight());
       }
       this.invalidate();
       return;
    }
}
