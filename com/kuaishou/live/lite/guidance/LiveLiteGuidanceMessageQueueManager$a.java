package com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$a;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteGuidanceMessageQueueManager$a	// class@00099b
{
    public Long a;

    public void LiveLiteGuidanceMessageQueueManager$a(){
       super();
    }
    public final Long a(){
       return this.a;
    }
    public final LiveLiteGuidanceMessageQueueManager$a b(long p0){
       LiveLiteGuidanceMessageQueueManager$a uoa = LiveLiteGuidanceMessageQueueManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.a = Long.valueOf(p0);
       return this;
    }
}
