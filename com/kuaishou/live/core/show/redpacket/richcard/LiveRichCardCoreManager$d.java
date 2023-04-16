package com.kuaishou.live.core.show.redpacket.richcard.LiveRichCardCoreManager$d;
import erd.g;
import msd.l;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class LiveRichCardCoreManager$d implements g	// class@000f43
{
    public final l b;
    public final long c;

    public void LiveRichCardCoreManager$d(l p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveRichCardCoreManager$d.class, "1")) {
       }else {
          this.b.invoke(Long.valueOf((this.c - (p0.longValue() * (long)100))));
       }
       return;
    }
}
