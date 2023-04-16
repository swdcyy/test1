package com.yxcorp.gifshow.aicutv2.p;
import erd.o;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class p implements o	// class@0019b5
{
    public final AICutErrorCode b;

    public void p(AICutErrorCode p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p op = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (op != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          op = this.b;
       }
       return op;
    }
}
