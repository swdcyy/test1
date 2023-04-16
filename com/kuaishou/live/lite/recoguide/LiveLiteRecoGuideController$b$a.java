package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b$a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b;
import java.lang.Object;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.recoguide.a;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b$a$a;
import com.kuaishou.live.lite.recoguide.a$a;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import n93.a;
import n93.b;
import qrd.l1;
import android.os.SystemClock;
import v63.a;

public final class LiveLiteRecoGuideController$b$a implements LiveLiteGuidanceMessageQueueManager$b	// class@000ad3
{
    public final LiveLiteRecoGuideController$b a;

    public void LiveLiteRecoGuideController$b$a(LiveLiteRecoGuideController$b p0){
       this.a = p0;
       super();
    }
    public void i(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRecoGuideController$b$a.class, "2")) {
          return;
       }
       a.p(p0, "message");
       a uoa = new a(new LiveLiteRecoGuideController$b$a$a(this));
       this.a.e.p.b(uoa);
       p0.l = uoa;
       long l = (this.a.e.V2() > 0)? -1: SystemClock.elapsedRealtime();
       a.a(l);
       return;
    }
    public void j(LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteRecoGuideController$b$a.class, "1")) {
          return;
       }
       a.p(p0, "message");
       LiveLiteRecoGuideController$b e = this.a.e;
       LiveLiteRecoGuideController l = e.l;
       if (l != null) {
          e.p.a(l);
       }
       return;
    }
}
