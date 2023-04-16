package com.kuaishou.live.common.core.component.livestage.LiveStageInit;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit$a;
import java.lang.Object;
import java.util.List;
import trd.t;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import io7.c;
import com.kuaishou.live.common.core.component.livestage.LiveStageInit$enableHidePlayerViewAfterRtcViewOnDraw$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class LiveStageInit	// class@00149f
{
    public static final List a;
    public static final boolean b;
    public static final boolean c;
    public static final p d;
    public static final LiveStageInit e;

    static {
       LiveStageInit.e = new LiveStageInit();
       LiveStageInit.a = t.k(LiveStageInit$a.b);
       LiveStageInit.b = a.t().u("SOURCE_LIVE").d("enableLiveStageSeiLayoutMessage", true);
       LiveStageInit.c = a.t().u("SOURCE_LIVE").d("enableLiveStageAndroidNewInfra", false);
       LiveStageInit.d = s.c(LiveStageInit$enableHidePlayerViewAfterRtcViewOnDraw$2.INSTANCE);
    }
    public void LiveStageInit(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, LiveStageInit.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = LiveStageInit.d.getValue();
       }
       return obj.booleanValue();
    }
}
