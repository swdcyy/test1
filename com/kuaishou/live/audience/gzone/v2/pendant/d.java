package com.kuaishou.live.audience.gzone.v2.pendant.d;
import erd.g;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z12.e;

public class d implements g	// class@000c41
{
    public final LiveGzonePendantViewPagerPresenter b;

    public void d(LiveGzonePendantViewPagerPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
       }else {
          String[] stringArray = new String[0];
          e.a("LivePendantViewPagerPresenter", "getLivingPandents", p0, stringArray);
          this.b.P8();
       }
       return;
    }
}
