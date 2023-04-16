package com.kwai.framework.initmodule.ProcessBroadCastInitModel$a;
import java.lang.Runnable;
import com.kwai.framework.initmodule.ProcessBroadCastInitModel;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import android.app.Application;
import o56.a;
import android.content.IntentFilter;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Intent;

public final class ProcessBroadCastInitModel$a implements Runnable	// class@001576
{
    public final ProcessBroadCastInitModel b;

    public void ProcessBroadCastInitModel$a(ProcessBroadCastInitModel p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, ProcessBroadCastInitModel$a.class, "1")) {
          return;
       }
       ProcessBroadCastInitModel$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, ProcessBroadCastInitModel.class, "2")) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          a.b().registerReceiver(tb.q, new IntentFilter("com.kwai.action.BLOCKING_IO_RECEIVER"), uApplication.getPackageName()+".BLOCKING_PERMISSION", null);
       }
       return;
    }
}
