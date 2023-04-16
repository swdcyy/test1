package com.kwai.feature.post.api.postcard.a;
import erd.o;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import kotlin.jvm.internal.a;

public final class a implements o	// class@001428
{
    public final Integer b;

    public void a(Integer p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Pair pair = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (pair != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          pair = new Pair(this.b, p0);
       }
       return pair;
    }
}
