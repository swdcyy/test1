package com.yxcorp.gifshow.widget.ConnerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.content.res.Resources;
import cw9.c;
import ekd.r;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Path;
import java.lang.Boolean;
import android.graphics.Canvas;
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;
import android.graphics.Path$Direction;
import android.graphics.Path$FillType;

public class ConnerFrameLayout extends FrameLayout	// class@001808
{
    public Paint b;
    public int c;
    public RectF d;
    public Path e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    public void ConnerFrameLayout(Context p0){
       super(p0);
       this.f = true;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = true;
       this.a(p0, null);
    }
    public void ConnerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.f = true;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = true;
       this.a(p0, p1);
    }
    public void ConnerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.f = true;
       this.g = true;
       this.h = true;
       this.i = true;
       this.j = true;
       this.a(p0, p1);
    }
    public final void a(Context p0,AttributeSet p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ConnerFrameLayout.class, "1")) {
          return;
       }
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.Y);
       this.c = typedArray.getDimensionPixelOffset(3, c.a(this.getResources(), 0x7f07017d));
       int color = typedArray.getColor(0, r.b(p0, R.color.arg_RES_7f061b13));
       this.g = typedArray.getBoolean(5, true);
       this.h = typedArray.getBoolean(4, true);
       this.i = typedArray.getBoolean(2, true);
       this.j = typedArray.getBoolean(true, true);
       typedArray.recycle();
       Paint paint = new Paint(true);
       this.b = paint;
       paint.setColor(color);
       this.d = new RectF();
       this.e = new Path();
       return;
    }
    public void b(boolean p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(ConnerFrameLayout.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, ConnerFrameLayout.class, "3")) {
          return;
       }
       if (p0 == this.i && (p1 == this.g && (p2 == this.j && p3 == this.h))) {
          return;
       }
       this.i = p0;
       this.g = p1;
       this.j = p2;
       this.h = p3;
       this.invalidate();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConnerFrameLayout.class, "5")) {
          return;
       }
       super.dispatchDraw(p0);
       if (this.f != null) {
          p0.drawPath(this.e, this.b);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       ConnerFrameLayout tc;
       if (PatchProxy.isSupport(ConnerFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ConnerFrameLayout.class, "4")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.d.set(0, 0, (float)p0, (float)p1);
       this.e.reset();
       float[] uofloatArray = new float[8];
       if (this.i != null) {
          tc = this.c;
          uofloatArray[0] = (float)tc;
          uofloatArray[1] = (float)tc;
       }
       if (this.g != null) {
          tc = this.c;
          uofloatArray[2] = (float)tc;
          uofloatArray[3] = (float)tc;
       }
       if (this.h != null) {
          tc = this.c;
          uofloatArray[4] = (float)tc;
          uofloatArray[5] = (float)tc;
       }
       if (this.j != null) {
          tc = this.c;
          uofloatArray[6] = (float)tc;
          uofloatArray[7] = (float)tc;
       }
       this.e.addRoundRect(this.d, uofloatArray, Path$Direction.CCW);
       this.e.addRect(this.d, Path$Direction.CW);
       this.e.setFillType(Path$FillType.WINDING);
       return;
    }
    public void setEnableConner(boolean p0){
       if (PatchProxy.isSupport(ConnerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ConnerFrameLayout.class, "2")) {
          return;
       }
       if (this.f != p0) {
          this.f = p0;
          this.invalidate();
       }
       return;
    }
}
