package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2 extends Lambda implements a	// class@0020f0
{
    public static final LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2.INSTANCE = new LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2();
    }
    public void LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableNearbyRoamPanelPreload$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("enableNearbyRoamPanelPreload");
    }
}
