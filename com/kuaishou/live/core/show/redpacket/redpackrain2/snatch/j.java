package com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.j;
import ok.h;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.k;
import java.lang.Object;
import java.lang.Void;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import th2.s;
import erd.g;
import crd.b;

public final class j implements h	// class@000f2d
{
    public final k b;

    public void j(k p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       j tb = this.b;
       Objects.requireNonNull(tb);
       return t.intervalRange(0, 0x7fffffff, 0, 500, TimeUnit.MILLISECONDS).subscribeOn(d.c).observeOn(d.a).subscribe(new s(tb));
    }
}
