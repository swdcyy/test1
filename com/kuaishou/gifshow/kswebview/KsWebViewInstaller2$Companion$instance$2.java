package com.kuaishou.gifshow.kswebview.KsWebViewInstaller2$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.gifshow.kswebview.KsWebViewInstaller2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class KsWebViewInstaller2$Companion$instance$2 extends Lambda implements a	// class@0019e3
{
    public static final KsWebViewInstaller2$Companion$instance$2 INSTANCE;

    static {
       KsWebViewInstaller2$Companion$instance$2.INSTANCE = new KsWebViewInstaller2$Companion$instance$2();
    }
    public void KsWebViewInstaller2$Companion$instance$2(){
       super(0);
    }
    public final KsWebViewInstaller2 invoke(){
       Object obj = PatchProxy.apply(null, this, KsWebViewInstaller2$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KsWebViewInstaller2();
    }
    public Object invoke(){
       return this.invoke();
    }
}
