package com.yxcorp.gifshow.init.module.AvoidClipboardLeakInitModule;
import com.kwai.framework.init.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.os.Build;
import android.os.Build$VERSION;
import android.app.Application;
import o56.a;
import ukd.a;

public class AvoidClipboardLeakInitModule extends a	// class@001964
{

    public void AvoidClipboardLeakInitModule(){
       super();
    }
    public static boolean l0(){
       Object obj = PatchProxy.applyWithListener(null, null, AvoidClipboardLeakInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (("samsung").equalsIgnoreCase(Build.MANUFACTURER) && Build$VERSION.SDK_INT <= 21)? true: false;
       PatchProxy.onMethodExit(AvoidClipboardLeakInitModule.class, "2");
       return b;
    }
    public int f0(){
       return 19;
    }
    public void n(){
       if (PatchProxy.applyVoidWithListener(null, this, AvoidClipboardLeakInitModule.class, "1")) {
          return;
       }
       if (!AvoidClipboardLeakInitModule.l0()) {
          PatchProxy.onMethodExit(AvoidClipboardLeakInitModule.class, "1");
          return;
       }else {
          Object[] objArray = new Object[]{a.b()};
          a.b("android.sec.clipboard.ClipboardUIManager", "getInstance", objArray);
          PatchProxy.onMethodExit(AvoidClipboardLeakInitModule.class, "1");
          return;
       }
    }
}
