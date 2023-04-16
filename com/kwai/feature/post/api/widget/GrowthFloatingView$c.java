package com.kwai.feature.post.api.widget.GrowthFloatingView$c;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.GrowthFloatingView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;
import z36.c;

public final class GrowthFloatingView$c implements Runnable	// class@00146a
{
    public final GrowthFloatingView b;

    public void GrowthFloatingView$c(GrowthFloatingView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingView$c.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthFloatingView guideViewItem destroy", objArray);
       this.b.j.a();
       return;
    }
}
