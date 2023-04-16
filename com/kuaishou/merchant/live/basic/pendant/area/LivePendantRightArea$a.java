package com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea$a;
import java.lang.Runnable;
import com.kuaishou.merchant.live.basic.pendant.PendantContainerView;
import com.kuaishou.merchant.live.basic.pendant.area.LivePendantRightArea;
import ms3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import x14.b;

public final class LivePendantRightArea$a implements Runnable	// class@0018a3
{
    public final PendantContainerView b;
    public final LivePendantRightArea c;
    public final b d;

    public void LivePendantRightArea$a(PendantContainerView p0,LivePendantRightArea p1,b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoidWithListener(null, this, LivePendantRightArea$a.class, "1")) {
          return;
       }
       PendantContainerView.n(this.b, this.c.b().indexOf(this.d), null, 2, null);
       PatchProxy.onMethodExit(LivePendantRightArea$a.class, "1");
       return;
    }
}
