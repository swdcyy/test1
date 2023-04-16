package com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$b;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class LiveSubscribeFragment$b extends a	// class@0010db
{
    public final LiveSubscribeFragment c;

    public void LiveSubscribeFragment$b(LiveSubscribeFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeFragment$b.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.gh(false);
       return;
    }
}
