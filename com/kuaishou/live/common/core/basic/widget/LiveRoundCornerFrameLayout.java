package com.kuaishou.live.common.core.basic.widget.LiveRoundCornerFrameLayout;
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
import android.view.ViewGroup;
import java.lang.Integer;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import android.graphics.RectF;

public class LiveRoundCornerFrameLayout extends FrameLayout	// class@000f25
{
    public Path b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    public void LiveRoundCornerFrameLayout(Context p0){
       super(p0, null);
    }
    public void LiveRoundCornerFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveRoundCornerFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       boolean b = false;
       this.c = b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveRoundCornerFrameLayout.class, "1")) {
       }else if(p1 == null){
          TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.P2);
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRoundCornerFrameLayout.class, "3")) {
          return;
       }
       if (this.c != null) {
          LiveRoundCornerFrameLayout tb = this.b;
          if (tb != null) {
             p0.clipPath(tb);
          }
       }
       super.dispatchDraw(p0);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       Path path;
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveRoundCornerFrameLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (this.c != null) {
          p0 = this.getMeasuredWidth();
          p1 = this.getMeasuredHeight();
          LiveRoundCornerFrameLayout td = this.d;
          LiveRoundCornerFrameLayout te = this.e;
          LiveRoundCornerFrameLayout tf = this.f;
          LiveRoundCornerFrameLayout tg = this.g;
          if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class)) {
             Object[] objArray = new Object[]{Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(td),Integer.valueOf(te),Integer.valueOf(tf),Integer.valueOf(tg)};
             path = PatchProxy.apply(objArray, this, LiveRoundCornerFrameLayout.class, "9");
             if (path != PatchProxyResult.class) {
             label_00f6 :
                this.b = path;
             }
          }
          path = new Path();
          path.moveTo(0, (float)td);
          if (td != null) {
             path.arcTo(new RectF(0, 0, (float)(td * 2), (float)(td * 2)), -180.00f, 90.00f);
          }
          path.lineTo((float)(p0 - te), 0);
          if (te != null) {
             te = te * 2;
             path.arcTo(new RectF((float)(p0 - te), 0, (float)p0, (float)te), -90.00f, 90.00f);
          }
          float f = (float)p0;
          path.lineTo(f, (float)(p1 - tf));
          if (tf != null) {
             int i = tf * 2;
             path.arcTo(new RectF((float)(p0 - i), (float)(p1 - i), f, (float)p1), 0, 90.00f);
          }
          f = (float)p1;
          path.lineTo((float)tg, f);
          if (tg != null) {
             int i1 = tg * 2;
             path.arcTo(new RectF(0, (float)(p1 - i1), (float)i1, f), 90.00f, 90.00f);
          }
          path.close();
          path.offset((float)0, (float)0);
          goto label_00f6 ;
       }
       return;
    }
    public void setAllRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundCornerFrameLayout.class, "4")) {
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
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundCornerFrameLayout.class, "6")) {
          return;
       }
       this.g = p0;
       this.invalidate();
       return;
    }
    public void setBottomRightRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundCornerFrameLayout.class, "5")) {
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
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundCornerFrameLayout.class, "7")) {
          return;
       }
       this.d = p0;
       this.invalidate();
       return;
    }
    public void setTopRightRadius(int p0){
       if (PatchProxy.isSupport(LiveRoundCornerFrameLayout.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveRoundCornerFrameLayout.class, "8")) {
          return;
       }
       this.e = p0;
       this.invalidate();
       return;
    }
}
