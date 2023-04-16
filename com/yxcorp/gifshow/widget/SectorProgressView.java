package com.yxcorp.gifshow.widget.SectorProgressView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.content.res.Resources$Theme;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.RectF;
import java.lang.Boolean;
import java.lang.Float;

public class SectorProgressView extends View	// class@0018c2
{
    public int b;
    public Paint c;
    public RectF d;
    public RectF e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;

    public void SectorProgressView(Context p0){
       super(p0, null);
    }
    public void SectorProgressView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SectorProgressView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.j = 2.50f;
       if (!PatchProxy.isSupport(SectorProgressView.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, SectorProgressView.class, "1")) {
          TypedArray typedArray = p0.getTheme().obtainStyledAttributes(p1, c$b.W4, p2, 0);
          this.b = typedArray.getColor(0, 0xffffff);
          this.g = typedArray.getFloat(1, 0);
          this.h = typedArray.getFloat(2, 0) + 270.00f;
          typedArray.recycle();
          Paint paint = new Paint();
          this.c = paint;
          paint.setColor(this.b);
          this.c.setAntiAlias(1);
       }
       return;
    }
    public int getColor(){
       return this.b;
    }
    public float getPercent(){
       return this.g;
    }
    public float getStartAngle(){
       return this.h;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SectorProgressView.class, "3")) {
          return;
       }
       super.onDraw(p0);
       boolean b = true;
       this.c.setAntiAlias(b);
       this.c.setStyle(Paint$Style.STROKE);
       this.c.setStrokeWidth(this.f);
       if (this.d != null) {
          SectorProgressView te = this.e;
          if (te != null) {
             p0.drawArc(te, 0, 360.00f, false, this.c);
             this.c.reset();
             this.c.setColor(this.b);
             this.c.setAntiAlias(b);
             p0.drawArc(this.d, this.h, (this.g * 3.60f), true, this.c);
          }
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       float f;
       if (PatchProxy.isSupport(SectorProgressView.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SectorProgressView.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       p3 = p3 - p1;
       if (!PatchProxy.isSupport(SectorProgressView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p3), this, SectorProgressView.class, "4")) {
          f = 0;
          if (p3 <= 0) {
             this.f = f;
          }else {
             SectorProgressView ti = this.i;
             this.f = (ti - f > 0)? ti: ((float)p3 - (float)(this.getPaddingLeft() + this.getPaddingRight())) * 0.05f;
          }
       }
       if (!PatchProxy.applyVoid(null, this, SectorProgressView.class, "5")) {
          f = (float)(this.getPaddingLeft() + this.getPaddingRight());
          float f1 = (float)(this.getPaddingBottom() + this.getPaddingTop());
          this.d = new RectF(((float)this.getPaddingLeft() + (this.j * this.f)), ((float)this.getPaddingTop() + (this.j * this.f)), (((float)this.getPaddingLeft() + ((float)this.getWidth() - f)) - (this.j * this.f)), (((float)this.getPaddingTop() + ((float)this.getHeight() - f1)) - (this.j * this.f)));
          this.e = new RectF(((float)this.getPaddingLeft() + this.f), ((float)this.getPaddingTop() + this.f), (((float)this.getPaddingLeft() + ((float)this.getWidth() - f)) - this.f), (((float)this.getPaddingTop() + ((float)this.getHeight() - f1)) - this.f));
       }
       return;
    }
    public void setColor(int p0){
       if (PatchProxy.isSupport(SectorProgressView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SectorProgressView.class, "6")) {
          return;
       }
       this.b = p0;
       this.invalidate();
       return;
    }
    public void setCustomStrokeWidth(float p0){
       this.i = p0;
    }
    public void setOvalSpaceScale(float p0){
       this.j = p0;
    }
    public void setPercent(float p0){
       if (PatchProxy.isSupport(SectorProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SectorProgressView.class, "8")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setStartAngle(float p0){
       if (PatchProxy.isSupport(SectorProgressView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SectorProgressView.class, "7")) {
          return;
       }
       this.h = p0 + 270.00f;
       this.invalidate();
       return;
    }
}
