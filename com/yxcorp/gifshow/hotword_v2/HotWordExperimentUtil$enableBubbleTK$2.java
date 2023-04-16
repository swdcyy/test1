package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$enableBubbleTK$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.d;
import xf6.l;
import com.kwai.sdk.switchconfig.a;

public final class HotWordExperimentUtil$enableBubbleTK$2 extends Lambda implements a	// class@0018f9
{
    public static final HotWordExperimentUtil$enableBubbleTK$2 INSTANCE;

    static {
       HotWordExperimentUtil$enableBubbleTK$2.INSTANCE = new HotWordExperimentUtil$enableBubbleTK$2();
    }
    public void HotWordExperimentUtil$enableBubbleTK$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object[] objArray = null;
       Boolean obj = PatchProxy.apply(objArray, this, HotWordExperimentUtil$enableBubbleTK$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = Boolean.valueOf(l.c("ENABLE_BUBBLE_TK", false));
       int i = 1;
       if (obj.booleanValue() != i) {
          i = 0;
       }
       if (i) {
          objArray = obj;
       }
       boolean b = (objArray != null)? objArray.booleanValue(): a.t().d("enableSearchBubbleTKModel", false);
       return b;
    }
}
