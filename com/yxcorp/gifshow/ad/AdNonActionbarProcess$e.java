package com.yxcorp.gifshow.ad.AdNonActionbarProcess$e;
import erd.g;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class AdNonActionbarProcess$e implements g	// class@0014d6
{
    public final int b;

    public void AdNonActionbarProcess$e(int p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNonActionbarProcess$e.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0.j0 = this.b;
       }
       return;
    }
}
