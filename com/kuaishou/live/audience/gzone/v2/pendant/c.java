package com.kuaishou.live.audience.gzone.v2.pendant.c;
import erd.g;
import com.kuaishou.live.audience.gzone.v2.pendant.LiveGzonePendantViewPagerPresenter;
import brd.t;
import java.lang.Object;
import java.lang.Long;
import java.util.Objects;
import cjd.e;
import erd.o;
import z31.h;
import com.kuaishou.live.audience.gzone.v2.pendant.d;
import crd.b;

public final class c implements g	// class@000c40
{
    public final LiveGzonePendantViewPagerPresenter b;
    public final t c;

    public void c(LiveGzonePendantViewPagerPresenter p0,t p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       this.c.map(new e()).subscribe(new h(tb), new d(tb));
    }
}
