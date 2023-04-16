package com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController;
import java.lang.Object;
import ok.x;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteRecoGuideConfig;
import java.lang.String;
import java.util.Objects;
import android.os.SystemClock;
import com.kuaishou.live.lite.recoguide.LiveLiteRecoGuideController$b$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import java.lang.Number;
import msd.p;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import java.lang.Boolean;

public final class LiveLiteRecoGuideController$b implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@000ad4
{
    public final String a;
    public final String b;
    public long c;
    public final LiveLiteRecoGuideController$b$a d;
    public final LiveLiteRecoGuideController e;

    public void LiveLiteRecoGuideController$b(LiveLiteRecoGuideController p0){
       this.e = p0;
       super();
       LiveConfigStartupResponse$LiveLiteRecoGuideConfig liveLiteReco = p0.n.get();
       liveLiteReco = (liveLiteReco != null)? liveLiteReco.mSubBizType: null;
       Objects.requireNonNull(liveLiteReco, "null cannot be cast to non-null type kotlin.String");
       this.a = liveLiteReco;
       this.b = String.valueOf(SystemClock.elapsedRealtime());
       this.c = (long)0x2710;
       this.d = new LiveLiteRecoGuideController$b$a(this);
       return;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public void d(long p0){
       this.c = p0;
    }
    public long e(){
       return this.c;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.b(this);
    }
    public String g(){
       return this.a;
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.d;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecoGuideController$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String l(){
       return this.b;
    }
}
