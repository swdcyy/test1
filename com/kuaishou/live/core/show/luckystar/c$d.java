package com.kuaishou.live.core.show.luckystar.c$d;
import sfc.a;
import com.kuaishou.live.core.show.luckystar.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public class c$d extends a	// class@000cbd
{
    public final c c;

    public void c$d(c p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       super.b(p0);
       b.I(LiveLogTag.LUCKY_STAR, "confirmParticipate failed", p0);
       return;
    }
}
