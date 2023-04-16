package com.kwai.live.gzone.accompanyplay.edit.l;
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

public class l extends a	// class@000c07
{
    public final g c;

    public void l(g p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, l.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.h();
       b.I(LiveLogTag.LIVE_GZONE_ACCOMPANY, "save error", p0);
       return;
    }
}
