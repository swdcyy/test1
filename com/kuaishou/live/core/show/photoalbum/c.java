package com.kuaishou.live.core.show.photoalbum.c;
import erd.o;
import com.kuaishou.live.core.show.photoalbum.LiveEntryCoverSelectSupplier;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import com.kuaishou.live.core.show.photoalbum.b;
import io.reactivex.g;
import brd.t;

public final class c implements o	// class@000d54
{
    public final LiveEntryCoverSelectSupplier b;

    public void c(LiveEntryCoverSelectSupplier p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       p0 = this.b;
       Objects.requireNonNull(p0);
       t ot = PatchProxy.apply(null, p0, LiveEntryCoverSelectSupplier.class, "10");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new b(p0));
       }
       return ot;
    }
}
