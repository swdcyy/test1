package com.kuaishou.tuna_core.tuna_canary.TunaCanaryFeaturesManager$mIsLowPhone$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;

public final class TunaCanaryFeaturesManager$mIsLowPhone$2 extends Lambda implements a	// class@001128
{
    public static final TunaCanaryFeaturesManager$mIsLowPhone$2 INSTANCE;

    static {
       TunaCanaryFeaturesManager$mIsLowPhone$2.INSTANCE = new TunaCanaryFeaturesManager$mIsLowPhone$2();
    }
    public void TunaCanaryFeaturesManager$mIsLowPhone$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       boolean b;
       d obj = PatchProxy.apply(null, this, TunaCanaryFeaturesManager$mIsLowPhone$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-404437045);
       b = (obj != null)? obj.g(): false;
       return b;
    }
}
