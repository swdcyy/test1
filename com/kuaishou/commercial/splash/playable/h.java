package com.kuaishou.commercial.splash.playable.h;
import erd.g;
import com.kuaishou.commercial.splash.playable.j;
import java.lang.Object;
import bz.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ez.g0;
import java.lang.Runnable;
import ekd.k1;

public final class h implements g	// class@0015c0
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, j.class, "4")) {
       }else {
          p0 = p0.b;
          if (p0 == 1) {
             tb.V8();
          }else if(p0 == 2){
             k1.r(new g0(tb), 1);
          }
       }
       return;
    }
}
