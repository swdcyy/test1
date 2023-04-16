package com.kuaishou.live.common.core.component.pk.widget.RoundedRadiusConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.graphics.Path$Direction;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.DrawFilter;
import android.view.View;
import java.lang.Float;

public class RoundedRadiusConstraintLayout extends ConstraintLayout	// class@001743
{
    public float[] B;
    public Path C;
    public RectF D;

    public void RoundedRadiusConstraintLayout(Context p0){
       super(p0, null);
    }
    public void RoundedRadiusConstraintLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void RoundedRadiusConstraintLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, RoundedRadiusConstraintLayout.class, "1")) {
       }else {
          this.C = new Path();
          this.D = new RectF();
          float[] uofloatArray = new float[8];
          this.B = uofloatArray;
          this.setRadius(0);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundedRadiusConstraintLayout.class, "2")) {
          return;
       }
       this.D.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.C.reset();
       this.C.addRoundRect(this.D, this.B, Path$Direction.CW);
       p0.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
       p0.clipPath(this.C);
       super.draw(p0);
       return;
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(RoundedRadiusConstraintLayout.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, RoundedRadiusConstraintLayout.class, "3")) {
          return;
       }
       int i = 0;
       RoundedRadiusConstraintLayout tB = this.B;
       while (i < tB.length) {
          int i1 = 0;
          if (p0 - i1 > 0) {
             i1 = p0;
          }
          tB[i] = i1;
          i = i + 1;
       }
       this.invalidate();
       return;
    }
}
