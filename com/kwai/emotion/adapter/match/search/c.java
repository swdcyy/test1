package com.kwai.emotion.adapter.match.search.c;
import erd.o;
import com.kwai.emotion.adapter.match.search.e;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import zj5.o;
import io.reactivex.g;
import t45.d;
import brd.z;

public final class c implements o	// class@000d68
{
    public final e b;

    public void c(e p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       t ot = PatchProxy.applyOneRefs(p0, tb, e.class, "7");
       if (ot != PatchProxyResult.class) {
       }else {
          ot = t.create(new o(tb, p0)).subscribeOn(d.c);
       }
       return ot;
    }
}
