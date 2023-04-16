package com.kuaishou.krn.apm.screencapture.ScreenCaptureToolbox$localConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import mi0.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.apm.screencapture.CaptureConfigMeta;
import java.util.HashMap;

public final class ScreenCaptureToolbox$localConfig$2 extends Lambda implements a	// class@0007f2
{
    public static final ScreenCaptureToolbox$localConfig$2 INSTANCE;

    static {
       ScreenCaptureToolbox$localConfig$2.INSTANCE = new ScreenCaptureToolbox$localConfig$2();
    }
    public void ScreenCaptureToolbox$localConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       Object obj = PatchProxy.apply(null, this, ScreenCaptureToolbox$localConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(new CaptureConfigMeta(100, 0, 3, 10), null);
    }
}
