package com.yxcorp.gifshow.aicutv2.c;
import erd.o;
import o69.a;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class c implements o	// class@0019a4
{
    public final a b;

    public void c(a p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       c uoc = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (uoc != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uoc = this.b;
       }
       return uoc;
    }
}
