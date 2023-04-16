package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.d;
import ok.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.LiveRedPackRainDialogFragment;
import uh2.q;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.android.live.log.LiveLogTag;
import ph2.a;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import uh2.q$c;
import java.lang.Exception;
import java.lang.Throwable;
import uh2.q$b;
import io.reactivex.g;
import t45.d;
import brd.z;
import th2.g;
import th2.h;
import erd.g;
import crd.b;

public final class d implements h	// class@000f22
{
    public final LiveRedPackRainDialogFragment b;
    public final q c;
    public final boolean d;

    public void d(LiveRedPackRainDialogFragment p0,q p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       d tc = this.c;
       d td = this.d;
       p0 = tb.z;
       Objects.requireNonNull(tc);
       t ot = PatchProxy.applyOneRefs(p0, tc, q.class, "7");
       if (ot != PatchProxyResult.class) {
       }else {
          b.a0(LiveLogTag.LIVE_RED_PACK_RAIN, "grabRedPack", c.j("redPackRainId", p0.a));
          p0 = tc.a;
          ot = (p0.c == null)? t.error(new Exception("No chance to submit request. grabRedPack fail!")): t.create(new q$b(p0)).observeOn(d.a);
       }
       return ot.subscribe(new g(tb, td), new h(tb, td));
    }
}
