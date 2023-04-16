package com.kuaishou.live.audience.component.topbar.b;
import lnc.c3$a;
import com.kuaishou.live.audience.component.topbar.d;
import java.lang.Object;
import kg1.e;
import java.util.Objects;
import brd.t;
import g31.h;
import com.kuaishou.live.audience.component.topbar.c;
import erd.g;
import crd.b;

public final class b implements c3$a	// class@000be5
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void apply(Object p0){
       b ta = this.a;
       Objects.requireNonNull(ta);
       ta.V = p0.io().subscribe(new h(p0), c.b);
    }
}
