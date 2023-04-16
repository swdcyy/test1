package com.yxcorp.gifshow.postentrance.bubblev2.widget.RoundFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import android.graphics.Path;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;

public final class RoundFrameLayout extends FrameLayout	// class@001042
{
    public final float b;
    public final Path c;
    public final RectF d;
    public HashMap e;

    public void RoundFrameLayout(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void RoundFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void RoundFrameLayout(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.b = (float)a1.e(6.00f);
       this.c = new Path();
       this.d = new RectF();
    }
    public void RoundFrameLayout(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void a(float p0,float p1){
       if (PatchProxy.isSupport(RoundFrameLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), Float.valueOf(p1), this, RoundFrameLayout.class, "2")) {
          return;
       }
       this.c.reset();
       this.d.set(0, 0, p0, p1);
       this.c.addRoundRect(this.d, this.b, this.b, Path$Direction.CCW);
       this.c.close();
       return;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundFrameLayout.class, "4")) {
          return;
       }
       a.p(p0, "canvas");
       p0.clipPath(this.c);
       super.dispatchDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundFrameLayout.class, "1")) {
          return;
       }
       a.p(p0, "canvas");
       this.a((float)this.getWidth(), (float)this.getHeight());
       p0.clipPath(this.c);
       super.onDraw(p0);
       p0.restoreToCount(p0.save());
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundFrameLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundFrameLayout.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       this.a((float)p0, (float)p1);
       return;
    }
}
