package com.tachikoma.component.container.round.RoundTKYogaLayout;
import com.tachikoma.core.component.TKYogaLayout;
import android.content.Context;
import com.tachikoma.component.container.round.RoundTKYogaLayout$RadiusMode;
import android.graphics.RectF;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.graphics.Path;
import java.lang.Float;
import com.tachikoma.component.container.round.RoundTKYogaLayout$a;
import java.lang.Enum;
import android.view.ViewGroup;
import android.graphics.Path$FillType;
import android.graphics.Path$Direction;
import java.lang.Integer;

public class RoundTKYogaLayout extends TKYogaLayout	// class@000ced
{
    public RoundTKYogaLayout$RadiusMode m;
    public float[] n;
    public final RectF o;
    public Path p;

    public void RoundTKYogaLayout(Context p0){
       super(p0);
       this.m = RoundTKYogaLayout$RadiusMode.NONE;
       float[] uofloatArray = new float[8];
       this.n = uofloatArray;
       this.o = new RectF();
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RoundTKYogaLayout.class, "4")) {
          return;
       }
       if (this.m == RoundTKYogaLayout$RadiusMode.NONE) {
          super.draw(p0);
          return;
       }else {
          p0.clipPath(this.p);
          super.draw(p0);
          p0.restoreToCount(p0.save());
          return;
       }
    }
    public void h(float p0,RoundTKYogaLayout$RadiusMode p1){
       RoundTKYogaLayout tn1;
       if (PatchProxy.isSupport(RoundTKYogaLayout.class) && PatchProxy.applyVoidTwoRefs(Float.valueOf(p0), p1, this, RoundTKYogaLayout.class, "1")) {
          return;
       }
       this.m = p1;
       int i = RoundTKYogaLayout$a.a[p1.ordinal()];
       int i1 = 7;
       int i2 = 6;
       int i3 = 8;
       int i4 = 5;
       if (i != 1) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i != i4) {
                      float[] uofloatArray = new float[i3];
                      this.n = uofloatArray;
                   }else {
                      tn1 = this.n;
                      tn1[4] = p0;
                      tn1[i4] = p0;
                   }
                }else {
                   tn1 = this.n;
                   tn1[i2] = p0;
                   tn1[i1] = p0;
                }
             }else {
                tn1 = this.n;
                tn1[2] = p0;
                tn1[3] = p0;
             }
          }else {
             tn1 = this.n;
             tn1[0] = p0;
             tn1[1] = p0;
          }
       }else {
          float[] uofloatArray1 = new float[i3];
          uofloatArray1[0] = p0;
          uofloatArray1[1] = p0;
          uofloatArray1[2] = p0;
          uofloatArray1[3] = p0;
          uofloatArray1[4] = p0;
          uofloatArray1[i4] = p0;
          uofloatArray1[i2] = p0;
          uofloatArray1[i1] = p0;
          this.n = uofloatArray1;
       }
       RoundTKYogaLayout tn = this.n;
       i = tn.length;
       i2 = 0;
       for (i1 = 0; i1 < i; i1 = i1 + 1) {
          i3 = (tn[i1])? 1: 0;
          i2 = i2 | i3;
       }
       if (!i2 || p1 == RoundTKYogaLayout$RadiusMode.NONE) {
          this.setWillNotDraw(true);
          return;
       }else {
          this.setWillNotDraw(false);
          this.i();
          return;
       }
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, RoundTKYogaLayout.class, "3")) {
          return;
       }
       RoundTKYogaLayout tp = this.p;
       if (tp == null) {
          this.p = new Path();
       }else {
          tp.reset();
       }
       this.p.setFillType(Path$FillType.EVEN_ODD);
       this.p.addRoundRect(this.o, this.n, Path$Direction.CW);
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(RoundTKYogaLayout.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, RoundTKYogaLayout.class, "2")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       RoundTKYogaLayout to = this.o;
       to.top = 0;
       to.left = 0;
       to.right = (float)p0;
       to.bottom = (float)p1;
       this.i();
       return;
    }
}
