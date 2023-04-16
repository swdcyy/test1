package com.kwai.component.saber.ageonmanager.AegonProxyManager$Companion$aegonProxyManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.component.saber.ageonmanager.AegonProxyManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class AegonProxyManager$Companion$aegonProxyManager$2 extends Lambda implements a	// class@000b20
{
    public static final AegonProxyManager$Companion$aegonProxyManager$2 INSTANCE;

    static {
       AegonProxyManager$Companion$aegonProxyManager$2.INSTANCE = new AegonProxyManager$Companion$aegonProxyManager$2();
    }
    public void AegonProxyManager$Companion$aegonProxyManager$2(){
       super(0);
    }
    public final AegonProxyManager invoke(){
       Object obj = PatchProxy.apply(null, this, AegonProxyManager$Companion$aegonProxyManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new AegonProxyManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
