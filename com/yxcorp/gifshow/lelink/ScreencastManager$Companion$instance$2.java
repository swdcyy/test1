package com.yxcorp.gifshow.lelink.ScreencastManager$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.lelink.ScreencastManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class ScreencastManager$Companion$instance$2 extends Lambda implements a	// class@001a29
{
    public static final ScreencastManager$Companion$instance$2 INSTANCE;

    static {
       ScreencastManager$Companion$instance$2.INSTANCE = new ScreencastManager$Companion$instance$2();
    }
    public void ScreencastManager$Companion$instance$2(){
       super(0);
    }
    public final ScreencastManager invoke(){
       Object obj = PatchProxy.apply(null, this, ScreencastManager$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ScreencastManager(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
