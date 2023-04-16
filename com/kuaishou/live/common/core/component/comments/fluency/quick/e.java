package com.kuaishou.live.common.core.component.comments.fluency.quick.e;
import ok.x;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.String;
import com.google.common.base.Optional;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gf1.c;
import java.util.Map;
import d61.r;

public class e	// class@00108c
{
    public final x a;
    public final ArrayMap b;

    public void e(x p0){
       super();
       this.b = new ArrayMap();
       this.a = p0;
    }
    public final Optional a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(this.b, p0, new c(this, p0));
    }
}
