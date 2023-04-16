package com.yxcorp.plugin.search.utils.r;
import erd.o;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class r implements o	// class@0007b1
{
    public final List b;

    public void r(List p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          this.b.clear();
          p0 = this.b;
       }
       return p0;
    }
}
