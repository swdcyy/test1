package com.yxcorp.gifshow.push.init.PushSdkInitModuleForMainProcess$d$a;
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

public final class PushSdkInitModuleForMainProcess$d$a implements Runnable	// class@00164a
{
    public static final PushSdkInitModuleForMainProcess$d$a b;

    static {
       PushSdkInitModuleForMainProcess$d$a.b = new PushSdkInitModuleForMainProcess$d$a();
    }
    public void PushSdkInitModuleForMainProcess$d$a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, PushSdkInitModuleForMainProcess$d$a.class, "1")) {
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
