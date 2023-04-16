package androidx.constraintlayout.utils.widget.MockView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Color;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.String;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import java.lang.Math;
import android.graphics.Canvas;

public class MockView extends View	// class@0006ac
{
    public Paint b;
    public Paint c;
    public Paint d;
    public boolean e;
    public boolean f;
    public String g;
    public Rect h;
    public int i;
    public int j;
    public int k;
    public int l;

    public void MockView(Context p0){
       super(p0);
       this.b = new Paint();
       this.c = new Paint();
       this.d = new Paint();
       this.e = true;
       this.f = true;
       this.g = null;
       this.h = new Rect();
       this.i = Color.argb(255, 0, 0, 0);
       this.j = Color.argb(255, 200, 200, 200);
       this.k = Color.argb(255, 50, 50, 50);
       this.l = 4;
       this.a(p0, null);
    }
    public void MockView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new Paint();
       this.c = new Paint();
       this.d = new Paint();
       this.e = true;
       this.f = true;
       this.g = null;
       this.h = new Rect();
       this.i = Color.argb(255, 0, 0, 0);
       this.j = Color.argb(255, 200, 200, 200);
       this.k = Color.argb(255, 50, 50, 50);
       this.l = 4;
       this.a(p0, p1);
    }
    public void MockView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new Paint();
       this.c = new Paint();
       this.d = new Paint();
       this.e = true;
       this.f = true;
       this.g = null;
       this.h = new Rect();
       this.i = Color.argb(255, 0, 0, 0);
       this.j = Color.argb(255, 200, 200, 200);
       this.k = Color.argb(255, 50, 50, 50);
       this.l = 4;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       boolean b = true;
       if (p1 != null) {
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.w3);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             int index = typedArray.getIndex(i);
             if (index == b) {
                this.g = typedArray.getString(index);
             }else if(index == 4){
                this.e = typedArray.getBoolean(index, this.e);
             }else if(!index){
                this.i = typedArray.getColor(index, this.i);
             }else if(index == 2){
                this.k = typedArray.getColor(index, this.k);
             }else if(index == 3){
                this.j = typedArray.getColor(index, this.j);
             }else if(index == 5){
                this.f = typedArray.getBoolean(index, this.f);
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       try{
          if (this.g == null) {
             this.g = p0.getResources().getResourceEntryName(this.getId());
          }
          this.b.setColor(this.i);
          this.b.setAntiAlias(e0);
          this.c.setColor(this.j);
          this.c.setAntiAlias(e0);
          this.d.setColor(this.k);
          this.l = Math.round(((float)this.l * (c.c(this.getResources()).xdpi / 160.00f)));
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void onDraw(Canvas p0){
       super.onDraw(p0);
       int width = this.getWidth();
       int height = this.getHeight();
       if (this.e != null) {
          width = width - 1;
          height = height - 1;
          float f = (float)width;
          float f1 = (float)height;
          p0.drawLine(0, 0, f, f1, this.b);
          Canvas uCanvas = p0;
          float f2 = f;
          uCanvas.drawLine(0, f1, f2, 0, this.b);
          uCanvas.drawLine(0, 0, f2, 0, this.b);
          float f3 = f;
          float f4 = f1;
          uCanvas.drawLine(f3, 0, f2, f4, this.b);
          float f5 = f1;
          uCanvas.drawLine(f3, f5, 0, f4, this.b);
          uCanvas.drawLine(0, f5, 0, 0, this.b);
       }
       MockView tg = this.g;
       if (tg != null && this.f != null) {
          this.c.getTextBounds(tg, 0, tg.length(), this.h);
          float f6 = (float)(width - this.h.width()) / 2.00f;
          float f7 = ((float)(height - this.h.height()) / 2.00f) + (float)this.h.height();
          this.h.offset((int)f6, (int)f7);
          tg = this.h;
          MockView tl = this.l;
          tg.set((tg.left - tl), (tg.top - tl), (tg.right + tl), (tg.bottom + tl));
          p0.drawRect(this.h, this.d);
          p0.drawText(this.g, f6, f7, this.c);
       }
       return;
    }
}
