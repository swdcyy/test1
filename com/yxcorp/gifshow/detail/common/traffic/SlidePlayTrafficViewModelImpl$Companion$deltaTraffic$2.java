package com.yxcorp.gifshow.detail.common.traffic.SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Long;

public final class SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2 extends Lambda implements a	// class@0014f2
{
    public static final SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2 INSTANCE;

    static {
       SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2.INSTANCE = new SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2();
    }
    public void SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2(){
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, SlidePlayTrafficViewModelImpl$Companion$deltaTraffic$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return (a.t().b("nasaPlayerPanelSavaTrafficThreshold", -1) * 1024);
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
