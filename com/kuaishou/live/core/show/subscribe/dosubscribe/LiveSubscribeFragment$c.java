package com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment$c;
import sfc.a;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import wk2.s;

public class LiveSubscribeFragment$c extends a	// class@0010dc
{
    public final LiveSubscribeFragment c;

    public void LiveSubscribeFragment$c(LiveSubscribeFragment p0){
       this.c = p0;
       super();
    }
    public void accept(Object p0){
       this.b(p0);
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSubscribeFragment$c.class, "1")) {
          return;
       }
       super.b(p0);
       this.c.gh(false);
       s.e(this.c.t, p0.getMessage());
       return;
    }
}
