package com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.benefitcard.framework.LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1$a;
import x51.b;
import ok.x;
import v91.n;
import v91.e;
import msd.l;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.Iterable;
import v91.a;

public final class LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1 extends Lambda implements p	// class@001ea1
{
    public final LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1 this$0;

    public void LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1(LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1 p0){
       this.this$0 = p0;
       super(2);
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0, p1);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0,LiveMessageFrequencyConfig$FrequencyConfig p1){
       b uob;
       LiveLiteBenefitCardServiceImpl b;
       LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1 obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.c;
       StringBuilder str = (obj.b != null)? 1: null;
       if (!str) {
          if (p0 != null) {
             QCurrentUser qCurrentUser = QCurrentUser.me();
             a.o(qCurrentUser, "QCurrentUser.me\(\)");
             uob = n.b(p0.mConfigBizId+'_'+qCurrentUser.getId(), p0, new LiveLiteBenefitCardServiceImpl$tryShowBenefitCard$message$1$frequencyConsumerSupplier$1$a(this), b.b());
             if (uob != null) {
             label_0058 :
                obj.b = uob;
             }
          }
          uob = new e();
          goto label_0058 ;
       }
       b[] uobArray = new b[2];
       b = this.this$0.c.b;
       if (b == null) {
          a.S("frequencyConsumer");
       }
       uobArray[0] = b;
       uobArray[1] = this.this$0.i.invoke(p1);
       uob = a.a(CollectionsKt__CollectionsKt.L(uobArray));
       a.o(uob, "ILiveFrequencyConsumer.c¡­            \)\n          \)");
       return uob;
    }
}
