package com.kuaishou.merchant.live.cart.onsale.widget.RoundCornerView;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Path$Direction;
import java.lang.Integer;
import lnc.a1;

public class RoundCornerView extends View	// class@0019c2
{
    public float[] b;
    public Path c;
    public RectF d;

    public void RoundCornerView(Context p0){
       super(p0, null);
    }
    public void RoundCornerView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundCornerView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, RoundCornerView.class, "1")) {
       }else {
          this.c = new Path();
          this.d = new RectF();
          float[] uofloatArray = new float[8];
          this.b = uofloatArray;
          this.setRadius(0);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundCornerView.class, "2")) {
          return;
       }
       this.d.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.c.reset();
       this.c.addRoundRect(this.d, this.b, Path$Direction.CW);
       p0.clipPath(this.c);
       super.draw(p0);
       return;
    }
    public void setRadius(int p0){
       if (PatchProxy.isSupport(RoundCornerView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RoundCornerView.class, "3")) {
          return;
       }
       int i = 0;
       RoundCornerView tb = this.b;
       while (i < tb.length) {
          float f = (p0 > 0)? (float)a1.d(p0): 0;
          tb[i] = f;
          i = i + 1;
       }
       this.invalidate();
       return;
    }
}
