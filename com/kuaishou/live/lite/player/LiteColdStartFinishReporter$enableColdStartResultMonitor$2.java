package com.kuaishou.live.lite.player.LiteColdStartFinishReporter$enableColdStartResultMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import io7.c;

public final class LiteColdStartFinishReporter$enableColdStartResultMonitor$2 extends Lambda implements a	// class@000a5d
{
    public static final LiteColdStartFinishReporter$enableColdStartResultMonitor$2 INSTANCE;

    static {
       LiteColdStartFinishReporter$enableColdStartResultMonitor$2.INSTANCE = new LiteColdStartFinishReporter$enableColdStartResultMonitor$2();
    }
    public void LiteColdStartFinishReporter$enableColdStartResultMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LiteColdStartFinishReporter$enableColdStartResultMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().u("SOURCE_LIVE").d("enableLiteColdStartMonitor", true);
    }
}
