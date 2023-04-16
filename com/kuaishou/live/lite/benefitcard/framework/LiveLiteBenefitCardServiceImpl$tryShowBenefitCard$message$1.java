package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl;
import java.lang.String;
import msd.l;
import f93.e;
import java.lang.Object;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer;
import f93.d;
import xp5.i;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import ip3.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls;
import msd.p;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$b;

public final class LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1 implements LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage	// class@001ea2
{
    public final LiveLiteBenefitCardConsumer a;
    public long b;
    public final LiveLiteBenefitCardServiceImpl c;
    public final String d;
    public final String e;
    public final String f;
    public final long g;
    public final long h;
    public final l i;
    public final e j;
    public final long k;

    public void LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1(LiveLiteBenefitCardServiceImpl p0,String p1,String p2,String p3,long p4,long p5,l p6,e p7,long p8){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.h = p5;
       this.i = p6;
       this.j = p7;
       this.k = p8;
       super();
       LiveLiteBenefitCardConsumer liveLiteBene = new LiveLiteBenefitCardConsumer(p7, this, p0.a, p0.d, p0.e, p0.f);
       this.a = v8;
       this.b = p8;
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage$DefaultImpls.a(this);
    }
    public long b(){
       return this.h;
    }
    public long c(){
       return this.g;
    }
    public void d(long p0){
       this.b = p0;
    }
    public long e(){
       return this.b;
    }
    public p f(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1(this);
    }
    public String g(){
       return this.e;
    }
    public String getExtraInfo(){
       return this.d;
    }
    public LiveLiteGuidanceMessageQueueManager$b h(){
       return this.a;
    }
    public boolean k(){
       return false;
    }
    public String l(){
       return this.f;
    }
}
