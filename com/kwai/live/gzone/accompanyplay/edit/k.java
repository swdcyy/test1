package com.kwai.live.gzone.accompanyplay.edit.k;
import sfc.a;
import com.kwai.live.gzone.accompanyplay.edit.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class k extends a	// class@000c05
{
    public final g c;

    public void k(g p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.a(p0);
       this.c.h();
       b.I(LiveLogTag.LIVE_GZONE_ACCOMPANY, "save and create error", p0);
       return;
    }
}
