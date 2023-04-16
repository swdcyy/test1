package com.yxcorp.gifshow.v3.editor.enhancefilter.g$b;
import erd.o;
import com.yxcorp.gifshow.v3.editor.enhancefilter.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class g$b implements o	// class@000f8c
{
    public final g b;

    public void g$b(g p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       g$b uob = PatchProxy.applyOneRefs(p0, this, g$b.class, "1");
       if (uob != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uob = this.b;
       }
       return uob;
    }
}
