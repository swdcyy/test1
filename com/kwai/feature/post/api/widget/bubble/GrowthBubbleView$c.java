package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$c;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import z36.c;

public final class GrowthBubbleView$c implements Runnable	// class@00148b
{
    public final GrowthBubbleView b;

    public void GrowthBubbleView$c(GrowthBubbleView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthBubbleView$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthBubbleView guideViewItem destroy", objArray);
       this.b.j.a();
       return;
    }
}
