package com.kuaishou.android.post.funnel.PostFunnelManager$a;
import java.lang.Object;
import nsd.u;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.post.funnel.PostFunnelManager$b;
import kotlin.jvm.internal.a;

public final class PostFunnelManager$a	// class@000eac
{

    public void PostFunnelManager$a(){
       super();
    }
    public void PostFunnelManager$a(u p0){
       super();
    }
    public final PostFunnelManager a(){
       Object obj = PatchProxy.apply(null, this, PostFunnelManager$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostFunnelManager$b.b.a();
    }
    public final void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager$a.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       PostFunnelManager.i = p0;
       return;
    }
}
