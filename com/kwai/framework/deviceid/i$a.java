package com.kwai.framework.deviceid.i$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.io.File;
import o56.c;
import o56.a;
import android.app.Application;
import com.kwai.framework.deviceid.i;
import java.lang.Boolean;
import com.kwai.framework.deviceid.DeviceIdWrapper;
import com.kwai.framework.deviceid.DeviceIdWrapper$e;
import com.kwai.framework.deviceid.DeviceIdWrapper$a;
import com.kwai.framework.deviceid.DeviceIdWrapper$f;
import com.kwai.framework.deviceid.DeviceIdWrapper$d;

public final class i$a	// class@000b3e
{

    public void i$a(){
       super();
    }
    public static String a(){
       String obj = PatchProxy.apply(null, null, i$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = i$a.c();
       if (i$a.d(obj)) {
          return obj;
       }
       return "";
    }
    public static File b(){
       Object obj = PatchProxy.apply(null, null, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(a.a().a().getExternalCacheDir(), ".t_did");
    }
    public static String c(){
       Object obj = PatchProxy.apply(null, null, i$a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.m(i$a.b());
    }
    public static boolean d(String p0){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, i$a.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = PatchProxy.applyOneRefs(p0, null, DeviceIdWrapper.class, "2");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 == null || p0.length() != 24){
          b = false;
       }else {
          b = DeviceIdWrapper.b(new DeviceIdWrapper$e(null), p0, DeviceIdWrapper.c(1));
       }
       return b;
    }
}
