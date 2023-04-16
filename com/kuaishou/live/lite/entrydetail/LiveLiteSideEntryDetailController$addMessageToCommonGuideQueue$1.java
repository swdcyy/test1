package com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController;
import java.lang.String;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import java.lang.Number;
import msd.p;
import com.kuaishou.live.lite.entrydetail.LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;
import java.lang.Boolean;

public final class LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@0008e4
{
    public final String a;
    public final String b;
    public long c;
    public final LiveLiteSideEntryDetailController$b d;
    public final LiveLiteSideEntryDetailController e;
    public final String f;
    public final String g;
    public final long h;
    public final LiveLiteSideEntryDetailController$b i;

    public void LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1(LiveLiteSideEntryDetailController p0,String p1,String p2,long p3,LiveLiteSideEntryDetailController$b p4){
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       this.i = p4;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "5");
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
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1$frequencyConsumerSupplier$1(this);
    }
    public String g(){
       return this.a;
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.d;
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, LiveLiteSideEntryDetailController$addMessageToCommonGuideQueue$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
    public String l(){
       return this.b;
    }
}
