package com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper$a;
import java.lang.Runnable;
import com.kuaishou.live.common.core.component.hotspot.fixedEntrance.LiveMarqueeTextFlipper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.widget.ShootMarqueeView;

public final class LiveMarqueeTextFlipper$a implements Runnable	// class@001425
{
    public final LiveMarqueeTextFlipper b;

    public void LiveMarqueeTextFlipper$a(LiveMarqueeTextFlipper p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveMarqueeTextFlipper$a.class, "1")) {
          return;
       }
       LiveMarqueeTextFlipper$a tb = this.b;
       LiveMarqueeTextFlipper j = tb.j;
       if (j != null) {
          j.v(tb.i);
       }
       return;
    }
}
