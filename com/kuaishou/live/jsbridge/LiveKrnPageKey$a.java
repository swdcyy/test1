package com.kuaishou.live.jsbridge.LiveKrnPageKey$a;
import java.lang.Object;
import nsd.u;
import java.lang.String;
import com.kuaishou.live.jsbridge.LiveKrnPageKey;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.util.Map;

public final class LiveKrnPageKey$a	// class@001d24
{

    public void LiveKrnPageKey$a(){
       super();
    }
    public void LiveKrnPageKey$a(u p0){
       super();
    }
    public final LiveKrnPageKey a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveKrnPageKey$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "key");
       p0 = p0.toLowerCase();
       a.o(p0, "\(this as java.lang.String\).toLowerCase\(\)");
       return LiveKrnPageKey.mapping.get(p0);
    }
}
