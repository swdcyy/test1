package com.kwai.feature.post.api.widget.GrowthFloatingView$b;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.GrowthFloatingView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.p3;
import q87.c;

public final class GrowthFloatingView$b implements Runnable	// class@001469
{
    public final GrowthFloatingView b;

    public void GrowthFloatingView$b(GrowthFloatingView p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthFloatingView$b.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       p3.D().w("PostGrowth", "GrowthFloatingView dismiss on detach from window", objArray);
       this.b.a(0);
       return;
    }
}
