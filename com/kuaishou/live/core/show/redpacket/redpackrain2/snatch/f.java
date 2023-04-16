package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.f;
import ok.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.i;
import java.lang.Object;
import java.lang.Void;
import t02.a0;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.c$b;
import java.lang.String;
import p91.m;
import ph2.a;
import brd.t;
import uh2.e;
import th2.n;
import erd.o;
import th2.m;
import th2.l;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.g;
import erd.g;
import crd.b;

public final class f implements h	// class@000f29
{
    public final i b;

    public void f(i p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       l ol = new l(tb);
       return e.d(tb.k.e().Z2.getLiveStreamId(), tb.k.i().a).map(new n(tb)).concatMap(new m(tb)).subscribe(ol, g.b);
    }
}
