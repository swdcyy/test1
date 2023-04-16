package com.yxcorp.gifshow.relation.explore.view.RoundedFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import lnc.a1;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;

public class RoundedFrameLayout extends FrameLayout	// class@00188d
{
    public final float b;
    public final Path c;
    public final RectF d;

    public void RoundedFrameLayout(Context p0){
       super(p0);
       this.b = (float)a1.e(16.00f);
       this.c = new Path();
       this.d = new RectF();
    }
    public void RoundedFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = (float)a1.e(16.00f);
       this.c = new Path();
       this.d = new RectF();
    }
    public void RoundedFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2, p2);
       this.b = (float)a1.e(16.00f);
       this.c = new Path();
       this.d = new RectF();
    }
    public final void a(float p0,float p1){
       if (PatchProxy.isSupport(RoundedFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, RoundedFrameLayout.class, "2")) {
          return;
       }
       this.c.reset();
       this.d.set(0, 0, p0, p1);
       this.c.addRoundRect(this.d, this.b, this.b, Path$Direction.CCW);
       this.c.close();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedFrameLayout.class, "4")) {
          return;
       }
       p0.clipPath(this.c);
       super.dispatchDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedFrameLayout.class, "1")) {
          return;
       }
       this.a((float)this.getWidth(), (float)this.getHeight());
       p0.clipPath(this.c);
       super.onDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundedFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundedFrameLayout.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a((float)p0, (float)p1);
       return;
    }
}
