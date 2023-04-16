package com.kuaishou.gifshow.kuaishan.logic.feed.g;
import t36.f$a;
import java.util.List;
import java.lang.Object;
import y80.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class g implements f$a	// class@001a45
{
    public final List a;

    public void g(List p0){
       this.a = p0;
       super();
    }
    public void apply(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
       }else if(p0 != null){
          g ta = this.a;
          a.o(ta, "it");
          p0.P6(ta);
       }
       return;
    }
}
