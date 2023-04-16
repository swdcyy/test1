package com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$startCoolDownIfNeed$5;
import erd.a;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView;
import msd.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.fanstop.widget.LiveAdNeoPendantBaseView$startCoolDownIfNeed$5$1;

public final class LiveAdNeoPendantBaseView$startCoolDownIfNeed$5 implements a	// class@0009e3
{
    public final LiveAdNeoPendantBaseView b;
    public final boolean c;
    public final a d;

    public void LiveAdNeoPendantBaseView$startCoolDownIfNeed$5(LiveAdNeoPendantBaseView p0,boolean p1,a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveAdNeoPendantBaseView$startCoolDownIfNeed$5.class, "1")) {
          return;
       }
       if (this.c != null) {
          this.b.l(new LiveAdNeoPendantBaseView$startCoolDownIfNeed$5$1(this));
       }else {
          this.d.invoke();
       }
       return;
    }
}
