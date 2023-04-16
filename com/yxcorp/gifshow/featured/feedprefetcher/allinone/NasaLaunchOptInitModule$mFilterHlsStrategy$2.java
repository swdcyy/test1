package com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptInitModule$mFilterHlsStrategy$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class NasaLaunchOptInitModule$mFilterHlsStrategy$2 extends Lambda implements a	// class@000f9e
{
    public static final NasaLaunchOptInitModule$mFilterHlsStrategy$2 INSTANCE;

    static {
       NasaLaunchOptInitModule$mFilterHlsStrategy$2.INSTANCE = new NasaLaunchOptInitModule$mFilterHlsStrategy$2();
    }
    public void NasaLaunchOptInitModule$mFilterHlsStrategy$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, NasaLaunchOptInitModule$mFilterHlsStrategy$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("LaunchOpt2022FilterHls", true);
    }
}
