package com.yxcorp.gifshow.aicutv2.f;
import erd.o;
import o69.a;
import java.lang.Object;
import i69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class f implements o	// class@0019a7
{
    public final a b;

    public void f(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       f uof = PatchProxy.applyOneRefs(p0, this, f.class, "1");
       if (uof != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          this.b.l(p0);
          uof = this.b;
       }
       return uof;
    }
}
