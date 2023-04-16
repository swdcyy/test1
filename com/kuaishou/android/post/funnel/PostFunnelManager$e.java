package com.kuaishou.android.post.funnel.PostFunnelManager$e;
import java.lang.Runnable;
import com.kuaishou.android.post.funnel.PostFunnelManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import android.os.Message;
import ekd.k1;

public final class PostFunnelManager$e implements Runnable	// class@000eb2
{
    public final PostFunnelManager b;

    public void PostFunnelManager$e(PostFunnelManager p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PostFunnelManager$e.class, "1")) {
          return;
       }
       PostFunnelManager$e tb = this.b;
       tb.g.removeMessages(tb.b);
       Message message = new Message();
       PostFunnelManager$e tb1 = this.b;
       message.what = tb1.b;
       tb1.g.sendMessageDelayed(message, tb1.c);
       this.b.d = k1.i();
       return;
    }
}
