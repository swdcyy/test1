package com.yxcorp.gifshow.widget.trimvideo.GraduationRulerView;
import android.view.View;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.content.res.Resources;
import cw9.c;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import com.yxcorp.utility.n;

public class GraduationRulerView extends View	// class@0019da
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public int j;
    public float k;
    public int l;
    public final Paint m;

    public void GraduationRulerView(Context p0){
       super(p0);
       Paint paint = new Paint(7);
       this.m = paint;
       paint.setTextAlign(Paint$Align.CENTER);
       this.f = (int)this.getResources().getDimension(0x7f070c0c);
       int i = (int)this.getResources().getDimension(0x7f070f69);
       this.e = i;
       this.g = (int)this.getResources().getDimension(0x7f070a65);
       this.h = (int)this.getResources().getDimension(0x7f070e8c);
       paint.setTextSize((float)i);
       this.i = c.b(this.getResources(), 0x7f070ee8);
       this.b = this.getContext().getResources().getColor(0x7f061f1e);
       this.c = this.getContext().getResources().getColor(0x7f060c3f);
       this.d = this.getContext().getResources().getColor(0x7f061f8d);
    }
    public void GraduationRulerView(Context p0,AttributeSet p1){
       super(p0, p1);
       Paint paint = new Paint(7);
       this.m = paint;
       paint.setTextAlign(Paint$Align.CENTER);
       this.f = (int)this.getResources().getDimension(0x7f070c0c);
       int i = (int)this.getResources().getDimension(0x7f070f69);
       this.e = i;
       this.g = (int)this.getResources().getDimension(0x7f070a65);
       this.h = (int)this.getResources().getDimension(0x7f070e8c);
       paint.setTextSize((float)i);
       this.i = c.b(this.getResources(), 0x7f070ee8);
       this.b = this.getContext().getResources().getColor(0x7f061f1e);
       this.c = this.getContext().getResources().getColor(0x7f060c3f);
       this.d = this.getContext().getResources().getColor(0x7f061f8d);
    }
    public void GraduationRulerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       Paint paint = new Paint(7);
       this.m = paint;
       paint.setTextAlign(Paint$Align.CENTER);
       this.f = (int)this.getResources().getDimension(0x7f070c0c);
       int i = (int)this.getResources().getDimension(0x7f070f69);
       this.e = i;
       this.g = (int)this.getResources().getDimension(0x7f070a65);
       this.h = (int)this.getResources().getDimension(0x7f070e8c);
       paint.setTextSize((float)i);
       this.i = c.b(this.getResources(), 0x7f070ee8);
       this.b = this.getContext().getResources().getColor(0x7f061f1e);
       this.c = this.getContext().getResources().getColor(0x7f060c3f);
       this.d = this.getContext().getResources().getColor(0x7f061f8d);
    }
    public int a(float p0){
       return (int)((p0 * (float)this.j) / this.k);
    }
    public float b(int p0){
       return ((this.k * (float)p0) / (float)this.j);
    }
    public void c(float p0,int p1){
       if (PatchProxy.isSupport(GraduationRulerView.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Integer.valueOf(p1), this, GraduationRulerView.class, "1")) {
          return;
       }
       this.k = p0;
       this.j = p1;
       this.l = (int)((float)p1 / p0);
       p0.width = this.j + (this.i * 2);
       this.requestLayout();
       return;
    }
    public void draw(Canvas p0){
       float f1;
       float f2;
       float f3;
       if (PatchProxy.applyVoidOneRefs(p0, this, GraduationRulerView.class, "2")) {
          return;
       }
       super.draw(p0);
       p0.save();
       p0.translate((float)this.i, 0);
       int i = 0;
       while ((float)i - this.k <= 0) {
          int i1 = i % 5;
          float f = 0x3f800000;
          if (!i1) {
             Object[] objArray = new Object[]{Integer.valueOf(i)};
             this.m.setColor(this.d);
             int i2 = this.l * i;
             int i3 = this.getHeight() - this.f;
             p0.drawText(String.format("%02d", objArray), (float)i2, (float)i3, this.m);
             this.m.setColor(this.c);
             i1 = this.l * i;
             f1 = (float)i1;
             i1 = this.getHeight() - this.g;
             f2 = (float)i1;
             i1 = this.l * i;
             f3 = (float)i1;
             p0.drawLine(f1, f2, f3, (float)this.getHeight(), this.m);
             i1 = this.l * i;
             f1 = (float)i1;
             i1 = this.getHeight() - this.g;
             f2 = (float)i1;
             i1 = this.l * i;
             i1 = i1 + n.c(this.getContext(), f);
             f3 = (float)i1;
             p0.drawRect(f1, f2, f3, (float)this.getHeight(), this.m);
          }else {
             this.m.setColor(this.c);
             i1 = this.l * i;
             f1 = (float)i1;
             i1 = this.getHeight() - this.h;
             f2 = (float)i1;
             i1 = this.l * i;
             i1 = i1 + n.c(this.getContext(), f);
             f3 = (float)i1;
             p0.drawRect(f1, f2, f3, (float)this.getHeight(), this.m);
          }
          i = i + 1;
       }
       p0.restore();
       return;
    }
    public float getMaxNumber(){
       return this.k;
    }
}
