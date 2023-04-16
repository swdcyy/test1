package com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager;
import ssd.e;
import ssd.e$a;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$mConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kuaishou.commercial.loggersdk.AdReceivedSuccessManager$ReceiveConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class AdReceivedSuccessManager	// class@00150a
{
    public static final float a;
    public static final p b;
    public static Pair c;
    public static WeakReference d;
    public static final AdReceivedSuccessManager e;

    static {
       AdReceivedSuccessManager.e = new AdReceivedSuccessManager();
       AdReceivedSuccessManager.a = e.b.j();
       AdReceivedSuccessManager.b = s.c(AdReceivedSuccessManager$mConfig$2.INSTANCE);
    }
    public void AdReceivedSuccessManager(){
       super();
    }
    public final AdReceivedSuccessManager$ReceiveConfig a(){
       Object obj = PatchProxy.apply(null, this, AdReceivedSuccessManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return AdReceivedSuccessManager.b.getValue();
    }
}
