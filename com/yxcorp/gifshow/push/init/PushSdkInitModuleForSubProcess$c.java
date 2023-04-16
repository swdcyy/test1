package com.yxcorp.gifshow.push.init.PushSdkInitModuleForSubProcess$c;
import java.lang.Runnable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.push.badge.b;
import o56.c;
import o56.a;
import kotlin.jvm.internal.a;
import android.app.Application;
import android.content.Context;
import android.app.Notification;

public final class PushSdkInitModuleForSubProcess$c implements Runnable	// class@001653
{
    public static final PushSdkInitModuleForSubProcess$c b;

    static {
       PushSdkInitModuleForSubProcess$c.b = new PushSdkInitModuleForSubProcess$c();
    }
    public void PushSdkInitModuleForSubProcess$c(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForSubProcess$c.class, "1")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Application uApplication = uoc.a();
       a.o(uApplication, "AppEnv.get\(\).appContext");
       b.d(b.d, uApplication, null, 2, null);
       return;
    }
}
