package com.kuaishou.commercial.tach.component.RoundClipTKYogaLayout;
import com.tachikoma.core.component.TKYogaLayout;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import java.lang.Float;
import android.graphics.Path$Direction;
import android.view.View;
import java.lang.Integer;

public class RoundClipTKYogaLayout extends TKYogaLayout	// class@00164b
{
    public float m;
    public Path n;
    public RectF o;

    public void RoundClipTKYogaLayout(Context p0){
       super(p0);
       this.n = new Path();
       this.o = new RectF();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundClipTKYogaLayout.class, "5")) {
          return;
       }
       p0.clipPath(this.n);
       super.dispatchDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public final void h(float p0,float p1){
       if (PatchProxy.isSupport(RoundClipTKYogaLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, RoundClipTKYogaLayout.class, "2")) {
          return;
       }
       this.n.reset();
       this.o.set(0, 0, p0, p1);
       this.n.addRoundRect(this.o, this.m, this.m, Path$Direction.CCW);
       this.n.close();
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundClipTKYogaLayout.class, "4")) {
          return;
       }
       p0.clipPath(this.n);
       super.onDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundClipTKYogaLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundClipTKYogaLayout.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.h((float)p0, (float)p1);
       return;
    }
    public void setClipRadius(float p0){
       if (PatchProxy.isSupport(RoundClipTKYogaLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundClipTKYogaLayout.class, "1")) {
          return;
       }
       this.m = p0;
       int width = this.getWidth();
       int height = this.getHeight();
       if (width > 0 && height > 0) {
          this.h((float)width, (float)height);
          this.invalidate();
       }
       return;
    }
}
