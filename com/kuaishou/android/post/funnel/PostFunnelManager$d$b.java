package com.kuaishou.android.post.funnel.PostFunnelManager$d$b;
import erd.g;
import com.kuaishou.android.post.funnel.PostFunnelManager$d;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import com.yxcorp.gifshow.util.PostUtils;

public final class PostFunnelManager$d$b implements g	// class@000eb0
{
    public final PostFunnelManager$d b;

    public void PostFunnelManager$d$b(PostFunnelManager$d p0){
       this.b = p0;
       super();
    }
    public final void a(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager$d$b.class, "1")) {
          return;
       }
       PostUtils.D(this.b.a.a, "onSetDrafts\(\)", p0);
       return;
    }
    public void accept(Object p0){
       this.a(p0);
    }
}
