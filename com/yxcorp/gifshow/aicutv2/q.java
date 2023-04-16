package com.yxcorp.gifshow.aicutv2.q;
import erd.o;
import o69.g1;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class q implements o	// class@0019b6
{
    public final g1 b;

    public void q(g1 p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       q oq = PatchProxy.applyOneRefs(p0, this, q.class, "1");
       if (oq != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          oq = this.b;
       }
       return oq;
    }
}
