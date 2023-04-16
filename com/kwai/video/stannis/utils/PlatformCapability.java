package com.kwai.video.stannis.utils.PlatformCapability;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.Thread;
import android.content.Context;
import java.lang.Boolean;
import android.os.Process;
import android.os.Build$VERSION;
import android.os.Build;

public final class PlatformCapability	// class@000c7f
{

    public void PlatformCapability(){
       super();
    }
    public static String getThreadInfo(){
       Object obj = PatchProxy.apply(null, null, PlatformCapability.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "@[name="+Thread.currentThread().getName()+", id="+Thread.currentThread().getId()+", priority="+Thread.currentThread().getPriority()+"]";
    }
    public static boolean hasPermission(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, PlatformCapability.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!p0.checkPermission(p1, Process.myPid(), Process.myUid()))? true: false;
       return b;
    }
    public static void logDeviceInfo(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, PlatformCapability.class, "2")) {
          return;
       }
       return;
    }
    public static boolean runningOnLollipopOrHigher(){
       return true;
    }
}
