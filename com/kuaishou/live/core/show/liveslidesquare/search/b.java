package com.kuaishou.live.core.show.liveslidesquare.search.b;
import oy5.c;
import com.kuaishou.live.core.show.liveslidesquare.search.d;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import za2.w;
import o02.e;
import com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarTabContainerFragment;
import brd.t;
import cjd.e;
import erd.o;
import mb2.d;
import com.kuaishou.live.core.show.liveslidesquare.search.c;
import erd.g;
import crd.b;

public final class b implements c	// class@000c9b
{
    public final d a;

    public void b(d p0){
       this.a = p0;
    }
    public final void F2(){
       b ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoid(null, ta, d.class, "9")) {
       }else {
          ta.u = e.m().b(ta.q.Qh()).map(new e()).subscribe(new d(ta), c.b);
       }
       return;
    }
}
