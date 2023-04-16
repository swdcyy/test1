package com.kuaishou.android.post.funnel.PostFunnelManager$c;
import android.os.Handler;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class PostFunnelManager$c extends Handler	// class@000eae
{
    public final PostFunnelManager a;

    public void PostFunnelManager$c(PostFunnelManager p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostFunnelManager$c.class, "1")) {
          return;
       }
       a.p(p0, "msg");
       super.handleMessage(p0);
       PostFunnelManager$c ta = this.a;
       if (p0.what == ta.b) {
          ta.i();
       }
       return;
    }
}
