package com.kwai.framework.kgi.sdk.Kgi$a;
import erd.g;
import msd.l;
import java.lang.Object;
import p76.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class Kgi$a implements g	// class@001580
{
    public final l b;

    public void Kgi$a(l p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Kgi$a.class, "1")) {
       }else {
          a.o(p0, "kgiEvent");
          this.b.invoke(p0);
       }
       return;
    }
}
