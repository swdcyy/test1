package com.kuaishou.recruit.live.guide.audience.a;
import ok.x;
import java.lang.Object;
import androidx.collection.ArrayMap;
import java.lang.String;
import com.google.common.base.Optional;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rt4.a;
import java.util.Map;
import d61.r;
import v91.b;

public class a	// class@000ec7
{
    public final x a;
    public final ArrayMap b;

    public void a(x p0){
       super();
       this.b = new ArrayMap();
       this.a = p0;
    }
    public final Optional a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return r.b(this.b, p0, new a(this, p0));
    }
    public void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       Optional optional = this.a(p0);
       if (optional.isPresent()) {
          optional.get().a();
       }
       return;
    }
}
