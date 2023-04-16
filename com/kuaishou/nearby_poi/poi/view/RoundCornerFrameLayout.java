package com.kuaishou.nearby_poi.poi.view.RoundCornerFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.RectF;
import android.view.ViewGroup;

public class RoundCornerFrameLayout extends FrameLayout	// class@000a35
{
    public Path b;
    public float c;
    public float d;
    public float e;
    public float f;

    public void RoundCornerFrameLayout(Context p0){
       super(p0);
       this.b = new Path();
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerFrameLayout.class, "1")) {
          return;
       }
       this.b.reset();
       this.b.moveTo(0, this.c);
       RoundCornerFrameLayout tc = this.c;
       float f = tc * 2.00f;
       RectF rectF = new RectF(0, 0, f, (tc * 2.00f));
       this.b.arcTo(rectF, -180.00f, 90.00f);
       float f1 = (float)this.getWidth();
       this.b.lineTo((f1 - this.d), 0);
       tc = this.d;
       this.b.arcTo(new RectF((f1 - (tc * 2.00f)), 0, f1, (tc * 2.00f)), -90.00f, 90.00f);
       float f2 = (float)this.getHeight();
       this.b.lineTo(f1, (f2 - this.e));
       tc = this.e;
       this.b.arcTo(new RectF((f1 - (tc * 2.00f)), (f2 - (tc * 2.00f)), f1, f2), 0, 90.00f);
       this.b.lineTo(this.f, f2);
       RoundCornerFrameLayout tf = this.f;
       this.b.arcTo(new RectF(0, (f2 - (tf * 2.00f)), (tf * 2.00f), f2), 90.00f, 90.00f);
       this.b.close();
       p0.clipPath(this.b);
       super.dispatchDraw(p0);
       return;
    }
    public void setRadius(float p0){
       this.c = p0;
       this.d = p0;
       this.e = p0;
       this.f = p0;
    }
}
