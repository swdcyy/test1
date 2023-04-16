package com.kwai.sdk.eve.internal.featurecenter.monitor.EveHeadSetMonitor$actions$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.collections.CollectionsKt__CollectionsKt;

public final class EveHeadSetMonitor$actions$2 extends Lambda implements a	// class@00151f
{
    public static final EveHeadSetMonitor$actions$2 INSTANCE;

    static {
       EveHeadSetMonitor$actions$2.INSTANCE = new EveHeadSetMonitor$actions$2();
    }
    public void EveHeadSetMonitor$actions$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final List invoke(){
       String[] obj = PatchProxy.apply(null, this, EveHeadSetMonitor$actions$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"android.intent.action.HEADSET_PLUG","android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED","android.media.AUDIO_BECOMING_NOISY"};
       return CollectionsKt__CollectionsKt.L(obj);
    }
}
