package com.kwai.video.wayne.debug.WayneDebug$Companion$instance$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.video.wayne.debug.WayneDebug;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import nsd.u;

public final class WayneDebug$Companion$instance$2 extends Lambda implements a	// class@000c95
{
    public static final WayneDebug$Companion$instance$2 INSTANCE;

    static {
       WayneDebug$Companion$instance$2.INSTANCE = new WayneDebug$Companion$instance$2();
    }
    public void WayneDebug$Companion$instance$2(){
       super(0);
    }
    public final WayneDebug invoke(){
       Object obj = PatchProxy.apply(null, this, WayneDebug$Companion$instance$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new WayneDebug(null);
    }
    public Object invoke(){
       return this.invoke();
    }
}
