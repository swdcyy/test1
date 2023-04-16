package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$c;
import java.lang.Runnable;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;

public final class LiveLiteRecoGuideController$c implements Runnable	// class@000ad5
{
    public final LiveLiteRecoGuideController b;

    public void LiveLiteRecoGuideController$c(LiveLiteRecoGuideController p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRecoGuideController$c.class, "1")) {
          return;
       }
       LiveLiteRecoGuideController$c tb = this.b;
       LiveLiteRecoGuideController o = tb.o;
       Objects.requireNonNull(o, "null cannot be cast to non-null type com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager.ILiveLiteGuidanceMessage");
       tb.q.d(o);
       return;
    }
}
