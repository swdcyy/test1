package com.kuaishou.live.common.core.component.line.widget.LiveLineSettingLayoutIconView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.graphics.Path$Direction;
import android.view.View;
import java.lang.Float;

public class LiveLineSettingLayoutIconView extends KwaiImageView	// class@001498
{
    public float[] x;
    public Path y;
    public RectF z;

    public void LiveLineSettingLayoutIconView(Context p0){
       super(p0, null);
    }
    public void LiveLineSettingLayoutIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveLineSettingLayoutIconView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       if (PatchProxy.applyVoid(null, this, LiveLineSettingLayoutIconView.class, "1")) {
       }else {
          this.y = new Path();
          this.z = new RectF();
          float[] uofloatArray = new float[8];
          this.x = uofloatArray;
          this.setRadius(0);
       }
       return;
    }
    public void draw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLineSettingLayoutIconView.class, "2")) {
          return;
       }
       this.z.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.y.reset();
       this.y.addRoundRect(this.z, this.x, Path$Direction.CW);
       p0.clipPath(this.y);
       super.draw(p0);
       return;
    }
    public void setRadius(float p0){
       if (PatchProxy.isSupport(LiveLineSettingLayoutIconView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LiveLineSettingLayoutIconView.class, "3")) {
          return;
       }
       int i = 0;
       LiveLineSettingLayoutIconView tx = this.x;
       while (i < tx.length) {
          int i1 = 0;
          if (p0 - i1 > 0) {
             i1 = p0;
          }
          tx[i] = i1;
          i = i + 1;
       }
       this.invalidate();
       return;
    }
}
