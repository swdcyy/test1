package com.kuaishou.live.common.core.component.gift.update.LiveRoundViewFlipper;
import com.kuaishou.live.core.basic.widget.LiveCustomViewFlipper;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Canvas;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ViewFlipper;
import android.graphics.Path$Direction;
import android.view.ViewGroup;

public final class LiveRoundViewFlipper extends LiveCustomViewFlipper	// class@001325
{
    public RectF g;
    public Path h;
    public HashMap i;

    public void LiveRoundViewFlipper(Context p0){
       super(p0, null);
    }
    public void LiveRoundViewFlipper(Context p0,AttributeSet p1){
       super(p0, p1);
       this.g = new RectF();
       this.h = new Path();
    }
    public boolean drawChild(Canvas p0,View p1,long p2){
       if (PatchProxy.isSupport(LiveRoundViewFlipper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, LiveRoundViewFlipper.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.g.set(0, 0, (float)this.getWidth(), (float)this.getHeight());
       this.h.reset();
       this.h.addRoundRect(this.g, ((float)this.getWidth() * 0x3f000000), ((float)this.getHeight() * 0x3f000000), Path$Direction.CW);
       if (p0 != null) {
          p0.clipPath(this.h);
       }
       return super.drawChild(p0, p1, p2);
    }
}
