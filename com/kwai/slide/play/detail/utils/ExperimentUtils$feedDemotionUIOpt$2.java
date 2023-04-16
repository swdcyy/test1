package com.kwai.slide.play.detail.utils.ExperimentUtils$feedDemotionUIOpt$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wzc.a;
import com.kwai.sdk.switchconfig.a;

public final class ExperimentUtils$feedDemotionUIOpt$2 extends Lambda implements a	// class@00187d
{
    public static final ExperimentUtils$feedDemotionUIOpt$2 INSTANCE;

    static {
       ExperimentUtils$feedDemotionUIOpt$2.INSTANCE = new ExperimentUtils$feedDemotionUIOpt$2();
    }
    public void ExperimentUtils$feedDemotionUIOpt$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, ExperimentUtils$feedDemotionUIOpt$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a() || a.t().d("feedDemotionUIOpt", b)) {
          b = true;
       }
       return b;
    }
}
