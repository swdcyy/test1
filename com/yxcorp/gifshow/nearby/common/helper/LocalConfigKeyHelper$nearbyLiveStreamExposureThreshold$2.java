package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.framework.abtest.f;
import java.lang.Integer;

public final class LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2 extends Lambda implements a	// class@002100
{
    public static final LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2.INSTANCE = new LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2();
    }
    public void LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyLiveStreamExposureThreshold$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("nearbyLiveStreamExposureThreshold", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
