package com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$e;
import java.lang.Runnable;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView;
import s36.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import sx4.e;
import z36.c;
import com.kwai.feature.post.api.widget.bubble.GrowthBubbleView$e$a;
import tx4.h;
import lnc.p3;
import q87.c;

public final class GrowthBubbleView$e implements Runnable	// class@00148e
{
    public final GrowthBubbleView b;
    public final e c;

    public void GrowthBubbleView$e(GrowthBubbleView p0,e p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, GrowthBubbleView$e.class, "1")) {
          return;
       }
       GrowthBubbleView$e tc = this.c;
       if (tc != null) {
          tc.onShow();
       }
       try{
          e uoe = this.b.j.d();
          if (uoe != null) {
             uoe.b("onItemShowAction", "", GrowthBubbleView$e$a.a);
          }
       }catch(java.lang.Exception e0){
          Object[] objArray = new Object[0];
          p3.D().w("PostGrowth", "GrowthBubbleView invoke js onShow failed", objArray);
       }
       return;
    }
}
