package com.yxcorp.gifshow.widget.EditSpectrumView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.widget.EditSpectrumView$a;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Paint;
import java.util.ArrayList;
import java.lang.Runnable;
import android.graphics.Canvas;
import java.util.List;
import java.lang.Float;
import java.lang.Math;
import java.lang.Boolean;
import java.lang.Integer;

public class EditSpectrumView extends View	// class@001821
{
    public Paint b;
    public int c;
    public int d;
    public int e;
    public List f;
    public float g;
    public int h;
    public int i;
    public float j;
    public RectF k;
    public Handler l;
    public Runnable m;

    public void EditSpectrumView(Context p0){
       super(p0, null);
    }
    public void EditSpectrumView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void EditSpectrumView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k = new RectF();
       this.l = new Handler(Looper.getMainLooper());
       this.m = new EditSpectrumView$a(this);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.t0);
       this.h = typedArray.getColor(3, -45056);
       this.c = typedArray.getInt(0, 4);
       this.d = typedArray.getDimensionPixelSize(2, 1);
       this.e = typedArray.getDimensionPixelSize(1, 0);
       this.i = typedArray.getInt(4, 100);
       typedArray.recycle();
       if (PatchProxy.applyVoid(null, this, EditSpectrumView.class, "1")) {
       }else {
          Paint paint = new Paint();
          this.b = paint;
          paint.setAntiAlias(1);
          this.b.setColor(this.h);
          this.f = new ArrayList();
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, EditSpectrumView.class, "4")) {
          return;
       }
       this.setVisibility(0);
       this.l.removeCallbacks(this.m);
       this.j = 0;
       this.l.post(this.m);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, EditSpectrumView.class, "5")) {
          return;
       }
       this.j = 0;
       this.l.removeCallbacks(this.m);
       this.setVisibility(4);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, EditSpectrumView.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       this.l.removeCallbacks(this.m);
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditSpectrumView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       float f = (float)this.getPaddingLeft() + 0;
       float f1 = (float)(this.getHeight() - this.getPaddingBottom());
       int i = (this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop();
       for (int i1 = 0; i1 < this.c; i1 = i1 + 1) {
          float f2 = this.f.get(i1).floatValue() + this.j;
          float f3 = (float)i * (float)Math.abs(Math.sin((double)f2));
          f2 = f1 - f3;
          f3 = (float)this.d + f;
          this.k.set(f, f2, f3, f1);
          EditSpectrumView te = this.e;
          f3 = (float)te;
          p0.drawRoundRect(this.k, f3, (float)te, this.b);
          f2 = (float)this.d + this.g;
          f = f + f2;
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int i = 0;
       if (PatchProxy.isSupport(EditSpectrumView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, EditSpectrumView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       this.f.clear();
       int i1 = (this.getWidth() - this.getPaddingRight()) - this.getPaddingLeft();
       EditSpectrumView tc = this.c;
       while (i < tc) {
          tc = i % 2;
          if (!tc) {
             this.f.add(Float.valueOf(0x3f490fdb));
          }else {
             this.f.add(Float.valueOf(0x3fc90fdb));
          }
          i = i + 1;
       }
       this.g = (float)((i1 - (this.d * tc)) / (tc - 1));
       return;
    }
    public void setSpectrumViewBarNum(int p0){
       if (PatchProxy.isSupport(EditSpectrumView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditSpectrumView.class, "8")) {
          return;
       }
       this.c = p0;
       this.invalidate();
       return;
    }
    public void setSpectrumViewBarRadius(int p0){
       if (PatchProxy.isSupport(EditSpectrumView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditSpectrumView.class, "10")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
    public void setSpectrumViewBarWidth(int p0){
       if (PatchProxy.isSupport(EditSpectrumView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditSpectrumView.class, "9")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setSpectrumViewColor(int p0){
       if (PatchProxy.isSupport(EditSpectrumView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditSpectrumView.class, "7")) {
          return;
       }
       this.h = p0;
       this.b.setColor(p0);
       this.invalidate();
       return;
    }
    public void setSpectrumViewFrequence(int p0){
       if (PatchProxy.isSupport(EditSpectrumView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, EditSpectrumView.class, "11")) {
          return;
       }
       this.i = p0;
       this.invalidate();
       return;
    }
}
