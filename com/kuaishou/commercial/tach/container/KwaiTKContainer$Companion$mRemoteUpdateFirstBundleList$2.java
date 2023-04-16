package com.kuaishou.commercial.tach.container.KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2 extends Lambda implements a	// class@001675
{
    public static final KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2 INSTANCE;

    static {
       KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2.INSTANCE = new KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2();
    }
    public void KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String[] invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiTKContainer$Companion$mRemoteUpdateFirstBundleList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[0];
       return a.t().getValue("remoteUpdateFirstBundleList", String[].class, stringArray);
    }
}
