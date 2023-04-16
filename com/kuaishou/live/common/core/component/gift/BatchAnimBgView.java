package com.kuaishou.live.common.core.component.gift.BatchAnimBgView;
import com.kuaishou.live.common.core.basic.widget.KwaiAdaptSizeImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Paint;
import android.widget.ImageView;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.view.View;
import android.graphics.RectF;
import android.graphics.Path$Direction;

public class BatchAnimBgView extends KwaiAdaptSizeImageView	// class@001113
{
    public View A;
    public float[] B;
    public Path y;
    public RectF z;

    public void BatchAnimBgView(Context p0){
       super(p0, null, 0);
    }
    public void BatchAnimBgView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BatchAnimBgView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.setLayerType(1, null);
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BatchAnimBgView.class, "2")) {
          return;
       }
       BatchAnimBgView ty = this.y;
       if (ty != null) {
          ty.reset();
          this.z.set((- this.getTranslationX()), 0, ((float)this.A.getWidth() - this.getTranslationX()), (float)this.A.getHeight());
          ty = this.B;
          if (ty != null) {
             this.y.addRoundRect(this.z, ty, Path$Direction.CW);
          }else {
             this.y.addRoundRect(this.z, (float)(this.getHeight() / 2), (float)(this.getHeight() / 2), Path$Direction.CW);
          }
          p0.clipPath(this.y);
       }
       super.draw(p0);
       this.postInvalidateOnAnimation();
       return;
    }
    public void setRadii(float[] p0){
       this.B = p0;
    }
    public void setTarget(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BatchAnimBgView.class, "1")) {
          return;
       }
       this.A = p0;
       this.y = new Path();
       this.z = new RectF();
       return;
    }
}
