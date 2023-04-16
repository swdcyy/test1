package com.yxcorp.gifshow.homepage.util.HomeCardExperimentUtil$enableSearchMaskFix$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HomeCardExperimentUtil$enableSearchMaskFix$2 extends Lambda implements a	// class@00180b
{
    public static final HomeCardExperimentUtil$enableSearchMaskFix$2 INSTANCE;

    static {
       HomeCardExperimentUtil$enableSearchMaskFix$2.INSTANCE = new HomeCardExperimentUtil$enableSearchMaskFix$2();
    }
    public void HomeCardExperimentUtil$enableSearchMaskFix$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HomeCardExperimentUtil$enableSearchMaskFix$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("sfr_mask_priority_fix", false);
    }
}
