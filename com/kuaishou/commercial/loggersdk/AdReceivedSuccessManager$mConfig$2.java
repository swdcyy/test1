package com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$mConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReceiveConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class AdReceivedSuccessManager$mConfig$2 extends Lambda implements a	// class@001509
{
    public static final AdReceivedSuccessManager$mConfig$2 INSTANCE;

    static {
       AdReceivedSuccessManager$mConfig$2.INSTANCE = new AdReceivedSuccessManager$mConfig$2();
    }
    public void AdReceivedSuccessManager$mConfig$2(){
       super(0);
    }
    public final AdReceivedSuccessManager$ReceiveConfig invoke(){
       Object obj = PatchProxy.apply(null, this, AdReceivedSuccessManager$mConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("adReceivedReportConfig", AdReceivedSuccessManager$ReceiveConfig.class, new AdReceivedSuccessManager$ReceiveConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
