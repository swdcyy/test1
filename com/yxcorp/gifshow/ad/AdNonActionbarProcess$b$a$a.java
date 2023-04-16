package com.yxcorp.gifshow.ad.AdNonActionbarProcess$b$a$a;
import erd.g;
import nx8.q;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class AdNonActionbarProcess$b$a$a implements g	// class@0014d1
{
    public final q b;

    public void AdNonActionbarProcess$b$a$a(q p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdNonActionbarProcess$b$a$a.class, "1")) {
       }else {
          a.p(p0, "clientAdLog");
          p0 = p0.F;
          p0.b = 81;
          p0.w1 = this.b.a();
       }
       return;
    }
}
