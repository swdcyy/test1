package com.facebook.react.views.deractors.BackgroundReactImageView;
import com.facebook.react.views.image.ReactImageView;
import android.content.Context;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import pf.a;
import pf.c;
import pf.g;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.RectF;
import android.widget.ImageView;
import android.graphics.Path$Direction;
import android.view.View;
import nf.b;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.bridge.ReadableMap;

public class BackgroundReactImageView extends ReactImageView	// class@0013aa
{
    public float W0;
    public float[] X0;
    public b Y0;
    public Path Z0;
    public float[] a1;
    public RectF b1;

    public void BackgroundReactImageView(Context p0,AbstractDraweeControllerBuilder p1,a p2,c p3){
       super(p0, p1, p2, null, p3);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundReactImageView.class, "1")) {
          return;
       }
       p0.save();
       if (this.Z0 == null) {
          this.Z0 = new Path();
       }
       this.Z0.reset();
       float f = 0;
       if (this.b1 == null) {
          this.b1 = new RectF(f, f, (float)this.getWidth(), (float)this.getHeight());
       }
       BackgroundReactImageView tW0 = this.W0;
       if (tW0 - f > 0) {
          this.Z0.addRoundRect(this.b1, tW0, tW0, Path$Direction.CCW);
       }else {
          tW0 = this.X0;
          if (tW0 != null) {
             if (this.a1 == null) {
                float[] uofloatArray = new float[8];
                this.a1 = uofloatArray;
             }
             BackgroundReactImageView ta1 = this.a1;
             ta1[0] = tW0[0];
             ta1[1] = tW0[0];
             ta1[2] = tW0[1];
             ta1[3] = tW0[1];
             ta1[4] = tW0[2];
             ta1[5] = tW0[2];
             ta1[6] = tW0[3];
             ta1[7] = tW0[3];
             this.Z0.addRoundRect(this.b1, ta1, Path$Direction.CCW);
             p0.clipPath(this.Z0);
          }else {
             this.Z0.addRoundRect(this.b1, f, f, Path$Direction.CCW);
          }
       }
       p0.clipPath(this.Z0);
       super.draw(p0);
       return;
    }
    public b getBackgroundScaleType(){
       Object obj = PatchProxy.apply(null, this, BackgroundReactImageView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.Y0 == null) {
          this.Y0 = new b();
       }
       return this.Y0;
    }
    public void setBackgroundSource(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BackgroundReactImageView.class, "5")) {
          return;
       }
       this.getBackgroundScaleType().p = p0;
       return;
    }
}
