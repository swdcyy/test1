package com.kwai.component.homepage_interface.widget.EmptyItemView;
import android.view.View;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Canvas;

public class EmptyItemView extends View	// class@000984
{
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Paint h;
    public Paint i;
    public Rect j;
    public RectF k;

    public void EmptyItemView(Context p0){
       super(p0);
       this.b = 500;
       this.c = 0xa9a9a9;
       this.d = 50;
       this.e = 200;
       this.g = 20;
       this.j = new Rect();
       this.k = new RectF();
       this.a(null, 0);
    }
    public void EmptyItemView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 500;
       this.c = 0xa9a9a9;
       this.d = 50;
       this.e = 200;
       this.g = 20;
       this.j = new Rect();
       this.k = new RectF();
       this.a(p1, 0);
    }
    public void EmptyItemView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 500;
       this.c = 0xa9a9a9;
       this.d = 50;
       this.e = 200;
       this.g = 20;
       this.j = new Rect();
       this.k = new RectF();
       this.a(p1, p2);
    }
    public final void a(AttributeSet p0,int p1){
       if (PatchProxy.isSupport(EmptyItemView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, EmptyItemView.class, "1")) {
          return;
       }
       TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, c$b.x0, p1, 0);
       this.c = typedArray.getColor(0, -16776961);
       this.d = (int)typedArray.getDimension(2, 50.00f);
       this.e = (int)typedArray.getDimension(5, 50.00f);
       this.f = typedArray.getColor(4, -1);
       this.g = (int)typedArray.getDimension(1, 50.00f);
       typedArray.recycle();
       Paint paint = new Paint();
       this.h = paint;
       paint.setColor(this.c);
       this.h.setAntiAlias(1);
       paint = new Paint();
       this.i = paint;
       paint.setColor(this.f);
       this.i.setAntiAlias(1);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EmptyItemView.class, "4")) {
          return;
       }
       super.onDraw(p0);
       p0.drawRect(this.j, this.i);
       p0.drawOval(this.k, this.h);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(EmptyItemView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, EmptyItemView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (!PatchProxy.applyVoid(null, this, EmptyItemView.class, "2")) {
          p0 = this.getMeasuredHeight();
          int i = p0 - this.e;
          this.b = i;
          int i1 = this.d >> 1;
          this.j.set(0, i, this.getMeasuredWidth(), p0);
          EmptyItemView tg = this.g;
          float f = (float)tg;
          EmptyItemView tb = this.b;
          this.k.set(f, (float)(tb - i1), (float)(tg + this.d), (float)(tb + i1));
       }
       return;
    }
}
