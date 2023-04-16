package com.yxcorp.gifshow.encode.s;
import java.lang.Runnable;
import com.yxcorp.gifshow.encode.EncodeManager;
import com.kwai.feature.post.api.feature.encode.model.PostEncodeInfo;
import java.lang.Object;
import java.util.Objects;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo$Status;
import com.kwai.feature.post.api.feature.encode.model.EncodeInfo;
import com.yxcorp.gifshow.log.PostLogger;
import java.lang.String;
import com.yxcorp.gifshow.log.PostSubTaskEvent;
import com.yxcorp.gifshow.log.PostLogger$Status;
import java.lang.StringBuilder;
import java.lang.Integer;
import java.util.Map;
import com.yxcorp.gifshow.postwork.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import f0c.f;
import java.util.Iterator;
import java.util.Set;
import c26.d;

public final class s implements Runnable	// class@000d4b
{
    public final EncodeManager b;
    public final PostEncodeInfo c;

    public void s(EncodeManager p0,PostEncodeInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       float progress;
       s tb = this.b;
       s tc = this.c;
       Objects.requireNonNull(tb);
       if (tc.getStatus() == EncodeInfo$Status.ENCODING) {
          PostLogger postLogger = new PostLogger().c("EncodeManager").e("EncodeManager");
          postLogger.k(tc.mSessionId);
          postLogger.h(PostSubTaskEvent.ENCODE_EVENT).i(String.valueOf(tc.getId())).j(PostLogger$Status.PROCESSING).g("progress: "+tc.getProgress()).d();
       }
       tb.c.put(Integer.valueOf(tc.getId()), tc);
       e uoe = e.a();
       Objects.requireNonNull(uoe);
       e uoe1 = e.class;
       if (!PatchProxy.applyVoidOneRefs(tc, uoe, uoe1, "2")) {
          String str = e.b(tc);
          progress = tc.getProgress();
          if (!PatchProxy.isSupport(uoe1) || !PatchProxy.applyVoidTwoRefs(str, Float.valueOf(progress), uoe, uoe1, "15")) {
             uoe.g(new f(uoe, str, progress));
          }
       }
       Iterator iterator = tb.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().b(tc.getProgress(), tc);
       }
       return;
    }
}
