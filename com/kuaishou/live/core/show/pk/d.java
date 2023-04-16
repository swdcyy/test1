package com.kuaishou.live.core.show.pk.d;
import brd.x;
import java.lang.Object;
import brd.t;
import brd.w;
import com.kuaishou.live.core.show.pk.e;
import erd.g;
import com.kuaishou.live.core.show.pk.f;

public final class d implements x	// class@000d84
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final w apply(t p0){
       return p0.doOnSubscribe(e.b).doOnNext(f.b);
    }
}
