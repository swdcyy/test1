package com.kwai.library.widget.specific.misc.SpectrumView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Handler;
import android.os.Looper;
import android.graphics.RectF;
import com.kwai.library.widget.specific.misc.SpectrumView$a;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import java.util.ArrayList;
import java.lang.Runnable;
import android.graphics.Canvas;
import java.util.List;
import java.lang.Object;
import java.lang.Float;
import java.lang.Math;

public class SpectrumView extends View	// class@000a1a
{
    public Paint b;
    public int c;
    public int d;
    public List e;
    public float f;
    public int g;
    public int h;
    public float i;
    public int j;
    public Handler k;
    public RectF l;
    public Runnable m;

    public void SpectrumView(Context p0){
       super(p0, null);
    }
    public void SpectrumView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SpectrumView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = new Handler(Looper.getMainLooper());
       this.l = new RectF();
       this.m = new SpectrumView$a(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.o5);
       this.g = typedArray.getColor(3, -45056);
       this.c = typedArray.getInt(0, 4);
       this.d = typedArray.getDimensionPixelSize(1, 1);
       this.h = typedArray.getInt(4, 100);
       this.j = typedArray.getDimensionPixelSize(2, 0);
       this.f = (float)typedArray.getDimensionPixelSize(5, 0);
       typedArray.recycle();
       Paint paint = new Paint();
       this.b = paint;
       paint.setAntiAlias(1);
       this.b.setColor(this.g);
       this.e = new ArrayList();
    }
    public void a(){
       this.setVisibility(0);
       this.k.removeCallbacks(this.m);
       this.i = 0;
       this.k.post(this.m);
    }
    public void b(){
       this.k.removeCallbacks(this.m);
       this.setVisibility(4);
    }
    public void onDetachedFromWindow(){
       super.onDetachedFromWindow();
       this.k.removeCallbacks(this.m);
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.e.size() && this.c <= this.e.size()) {
          float f = (float)this.getPaddingLeft() + 0;
          float f1 = (float)(this.getHeight() - this.getPaddingBottom());
          int i = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
          for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
             float f2 = this.e.get(i1).floatValue() + this.i;
             float f3 = (float)i * (float)Math.abs(Math.sin((double)f2));
             float f4 = f1 - f3;
             float f5 = f + (float)this.d;
             this.l.setEmpty();
             this.l.set(f, f4, f5, f1);
             SpectrumView tj = this.j;
             if (tj > null) {
                p0.drawRoundRect(this.l, (float)tj, (float)tj, this.b);
             }else {
                p0.drawRect(f, f4, f5, f1, this.b);
             }
             f2 = (float)this.d + this.f;
             f = f + f2;
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.e.clear();
       int i = (this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft();
       p1 = 0;
       SpectrumView tc = this.c;
       while (p1 < tc) {
          tc = p1 % 2;
          if (!tc) {
             this.e.add(Float.valueOf(0x3f490fdb));
          }else {
             this.e.add(Float.valueOf(0x3fc90fdb));
          }
          p1++;
       }
       if (!this.f) {
          tc--;
          this.f = (float)((i - (this.d * tc)) / tc);
       }
       return;
    }
}
