package com.kuaishou.merchant.live.lite.interpretation.LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import v91.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.live.lite.interpretation.LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1$a;

public final class LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1 extends Lambda implements l	// class@001a2e
{
    public static final LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1 INSTANCE;

    static {
       LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1.INSTANCE = new LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1();
    }
    public void LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final b invoke(LiveMessageFrequencyConfig$FrequencyConfig p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LiveMerchantLiteInterpretationPresenter$onTkViewCreated$1$a();
    }
}
