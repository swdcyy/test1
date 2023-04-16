package com.kwai.lib.adapter.PushSDKLazyInitializerImpl;
import gv6.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import android.content.Context;
import yb7.n;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.push.init.NotificationManagerInitModule;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess;
import com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess;
import com.kwai.android.common.utils.PushLogcat;
import java.lang.StringBuilder;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.util.Log;

public final class PushSDKLazyInitializerImpl implements d	// class@000818
{

    public void PushSDKLazyInitializerImpl(){
       super();
    }
    public void syncInitialize(){
       if (PatchProxy.applyVoid(null, this, PushSDKLazyInitializerImpl.class, "1")) {
          return;
       }
       String str = n.b(a.b());
       Application uApplication = a.b();
       a.o(uApplication, "AppEnv.getAppContext\(\)");
       if (a.g(uApplication.getPackageName(), str)) {
          new NotificationManagerInitModule().n();
          new PushSdkInitModuleForMainProcess().o0();
       }else {
          new NotificationManagerInitModule().n();
          new PushSdkInitModuleForSubProcess().o0();
       }
       PushLogcat.INSTANCE.i("KwaiPushSDK", "call lazy init done process:"+str+" \n "+Log.getStackTraceString(new RuntimeException("this is not exception, just trace the call stack...")));
       return;
    }
}
