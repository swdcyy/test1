package com.yxcorp.gifshow.widget.RoundCornerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ll8.c$b;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import gq.a;
import q87.c;
import android.view.ViewGroup;
import java.lang.Integer;
import tyc.k4;
import java.lang.StringBuilder;

public class RoundCornerFrameLayout extends FrameLayout	// class@0018b9
{
    public Path b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void RoundCornerFrameLayout(Context p0){
       super(p0, null);
    }
    public void RoundCornerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundCornerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.c = b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RoundCornerFrameLayout.class, "1")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.E4);
          this.c = typedArray.getBoolean(3, b);
          int dimensionPix = typedArray.getDimensionPixelSize(b, b);
          this.d = typedArray.getDimensionPixelSize(4, dimensionPix);
          this.e = typedArray.getDimensionPixelSize(5, dimensionPix);
          this.g = typedArray.getDimensionPixelSize(1, dimensionPix);
          this.f = typedArray.getDimensionPixelSize(2, dimensionPix);
          typedArray.recycle();
       }
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerFrameLayout.class, "3")) {
          return;
       }
       if (this.c != null) {
          RoundCornerFrameLayout tb = this.b;
          if (tb != null) {
             p0.clipPath(tb);
             Object[] objArray = new Object[0];
             a.D().s("RoundCornerFrameLayout", "dispatchDraw: corner", objArray);
          }
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RoundCornerFrameLayout.class, "2")) {
          return;
       }
       super.onMeasure(p0, p1);
       if (this.c != null) {
          this.b = k4.b(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight(), this.d, this.e, this.f, this.g);
       }
       Object[] objArray = new Object[0];
       a.D().s("RoundCornerFrameLayout", "onMeasure: mEnableCorner = "+this.c, objArray);
       return;
    }
    public void setAllRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerFrameLayout.class, "4")) {
          return;
       }
       this.d = p0;
       this.e = p0;
       this.g = p0;
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setBottomLeftRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerFrameLayout.class, "6")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setBottomRightRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerFrameLayout.class, "5")) {
          return;
       }
       this.f = p0;
       this.invalidate();
       return;
    }
    public void setEnableCorner(boolean p0){
       this.c = p0;
    }
    public void setTopLeftRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerFrameLayout.class, "7")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setTopRightRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerFrameLayout.class, "8")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
}
