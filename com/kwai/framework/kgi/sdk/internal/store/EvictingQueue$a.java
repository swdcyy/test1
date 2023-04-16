package com.kwai.framework.kgi.sdk.internal.store.EvictingQueue$a;
import java.lang.Object;
import nsd.u;
import com.kwai.framework.kgi.sdk.internal.store.EvictingQueue;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class EvictingQueue$a	// class@0015a1
{

    public void EvictingQueue$a(){
       super();
    }
    public void EvictingQueue$a(u p0){
       super();
    }
    public final EvictingQueue a(int p0){
       EvictingQueue$a uoa = EvictingQueue$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new EvictingQueue(p0, null);
    }
}
