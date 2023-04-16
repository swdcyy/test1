package com.yxcorp.gifshow.hotword_v2.HotWordExperimentUtil$enableBubbleUnLogin$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class HotWordExperimentUtil$enableBubbleUnLogin$2 extends Lambda implements a	// class@0018fa
{
    public static final HotWordExperimentUtil$enableBubbleUnLogin$2 INSTANCE;

    static {
       HotWordExperimentUtil$enableBubbleUnLogin$2.INSTANCE = new HotWordExperimentUtil$enableBubbleUnLogin$2();
    }
    public void HotWordExperimentUtil$enableBubbleUnLogin$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, HotWordExperimentUtil$enableBubbleUnLogin$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableSearchBubbleNotLogin", false);
    }
}
