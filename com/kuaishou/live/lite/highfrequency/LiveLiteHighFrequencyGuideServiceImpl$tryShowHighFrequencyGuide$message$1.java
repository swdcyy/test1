package com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideServiceImpl;
import java.lang.String;
import msd.l;
import mb3.f;
import java.lang.Object;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideConsumer;
import mb3.b;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import msd.p;
import com.kuaishou.live.lite.highfrequency.LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1$frequencyConsumerSupplier$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;

public final class LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@0009ad
{
    public final LiveLiteHighFrequencyGuideConsumer a;
    public long b;
    public final LiveLiteHighFrequencyGuideServiceImpl c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;
    public final l h;
    public final f i;
    public final long j;

    public void LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1(LiveLiteHighFrequencyGuideServiceImpl p0,String p1,String p2,long p3,long p4,l p5,f p6,long p7){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       super();
       LiveLiteHighFrequencyGuideConsumer liveLiteHigh = new LiveLiteHighFrequencyGuideConsumer(p6, this, p0.a, p0.d, p0.e, p0.f);
       this.a = p5;
       this.b = p7;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       return this.g;
    }
    public long c(){
       return this.f;
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1$frequencyConsumerSupplier$1(this);
    }
    public String g(){
       return this.d;
    }
    public String getExtraInfo(){
       Object obj = PatchProxy.apply(null, this, LiveLiteHighFrequencyGuideServiceImpl$tryShowHighFrequencyGuide$message$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return null;
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
