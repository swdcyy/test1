package com.yxcorp.gifshow.lelink.screencast.KwaiLelink$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.lelink.screencast.KwaiLelink;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class KwaiLelink$Companion$instance$2 extends Lambda implements a	// class@001a49
{
    public static final KwaiLelink$Companion$instance$2 INSTANCE;

    static {
       KwaiLelink$Companion$instance$2.INSTANCE = new KwaiLelink$Companion$instance$2();
    }
    public void KwaiLelink$Companion$instance$2(){
       super(0);
    }
    public final KwaiLelink invoke(){
       Object obj = PatchProxy.apply(null, this, KwaiLelink$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiLelink(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
