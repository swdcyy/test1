package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardConsumer$delegate$2$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteBenefitCardConsumer$delegate$2 extends Lambda implements a	// class@001e9e
{
    public final LiveLiteBenefitCardConsumer this$0;

    public void LiveLiteBenefitCardConsumer$delegate$2(LiveLiteBenefitCardConsumer p0){
       this.this$0 = p0;
       super(0);
    }
    public final LiveLiteBenefitCardConsumer$delegate$2$1 invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteBenefitCardConsumer$delegate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveLiteBenefitCardConsumer$delegate$2$1(this);
    }
    public Object invoke(){
       return this.invoke();
    }
}
