package com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl;
import java.lang.String;
import msd.l;
import java.util.List;
import java.lang.Object;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveConsumer;
import vc3.l;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import java.lang.Number;
import msd.p;
import com.kuaishou.live.lite.quickinteractive.framework.LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1$frequencyConsumerSupplier$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;

public final class LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@000acf
{
    public final LiveLiteQuickInteractiveConsumer a;
    public long b;
    public final LiveLiteQuickInteractiveServiceImpl c;
    public final String d;
    public final String e;
    public final String f;
    public final l g;
    public final List h;
    public final long i;

    public void LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1(LiveLiteQuickInteractiveServiceImpl p0,String p1,String p2,String p3,l p4,List p5,long p6){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       super();
       LiveLiteQuickInteractiveConsumer liveLiteQuic = new LiveLiteQuickInteractiveConsumer(this, p5, p0.a, p0.d, p0.e, p0.f);
       this.a = p1;
       this.b = p6;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public long c(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return 0;
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteQuickInteractiveServiceImpl$tryShowQuickInteractive$message$1$frequencyConsumerSupplier$1(this);
    }
    public String g(){
       return this.d;
    }
    public String getExtraInfo(){
       return this.f;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.a;
    }
    public boolean k(){
       return true;
    }
    public String l(){
       return this.e;
    }
}
