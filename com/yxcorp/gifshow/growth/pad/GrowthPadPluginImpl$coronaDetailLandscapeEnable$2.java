package com.yxcorp.gifshow.growth.pad.GrowthPadPluginImpl$coronaDetailLandscapeEnable$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import rkd.b;
import com.kwai.sdk.switchconfig.a;

public final class GrowthPadPluginImpl$coronaDetailLandscapeEnable$2 extends Lambda implements a	// class@001459
{
    public static final GrowthPadPluginImpl$coronaDetailLandscapeEnable$2 INSTANCE;

    static {
       GrowthPadPluginImpl$coronaDetailLandscapeEnable$2.INSTANCE = new GrowthPadPluginImpl$coronaDetailLandscapeEnable$2();
    }
    public void GrowthPadPluginImpl$coronaDetailLandscapeEnable$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, GrowthPadPluginImpl$coronaDetailLandscapeEnable$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (b.g() && !a.t().d("disablePadCoronaLandscapeLayout", b)) {
          b = true;
       }
       return b;
    }
}
