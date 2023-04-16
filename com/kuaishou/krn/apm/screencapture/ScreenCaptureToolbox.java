package com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$localConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$pageTimesRecord$2;
import java.lang.Object;
import com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$fmpFinishedRecord$2;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mi0.a;
import java.util.concurrent.ConcurrentHashMap;

public final class ScreenCaptureToolbox	// class@0007f4
{
    public static final p a;
    public static final p b;
    public static final Object c;
    public static final p d;
    public static ArrayList e;
    public static String f;
    public static final ScreenCaptureToolbox g;

    static {
       ScreenCaptureToolbox.g = new ScreenCaptureToolbox();
       ScreenCaptureToolbox.a = s.c(ScreenCaptureToolbox$localConfig$2.INSTANCE);
       ScreenCaptureToolbox.b = s.c(ScreenCaptureToolbox$pageTimesRecord$2.INSTANCE);
       ScreenCaptureToolbox.c = new Object();
       ScreenCaptureToolbox.d = s.c(ScreenCaptureToolbox$fmpFinishedRecord$2.INSTANCE);
       ScreenCaptureToolbox.e = new ArrayList();
    }
    public void ScreenCaptureToolbox(){
       super();
    }
    public final WeakHashMap a(){
       Object obj = PatchProxy.apply(null, this, ScreenCaptureToolbox.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreenCaptureToolbox.d.getValue();
    }
    public final a b(){
       Object obj = PatchProxy.apply(null, this, ScreenCaptureToolbox.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreenCaptureToolbox.a.getValue();
    }
    public final ConcurrentHashMap c(){
       Object obj = PatchProxy.apply(null, this, ScreenCaptureToolbox.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ScreenCaptureToolbox.b.getValue();
    }
}
