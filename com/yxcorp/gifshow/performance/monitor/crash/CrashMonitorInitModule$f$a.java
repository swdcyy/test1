package com.yxcorp.gifshow.performance.monitor.crash.CrashMonitorInitModule$f$a;
import java.lang.Runnable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o66.d;
import f66.f;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.io.File;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.utility.Log;

public final class CrashMonitorInitModule$f$a implements Runnable	// class@000e67
{
    public final ExceptionMessage b;

    public void CrashMonitorInitModule$f$a(ExceptionMessage p0){
       this.b = p0;
       super();
    }
    public final void run(){
       File a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CrashMonitorInitModule$f$a.class, "1")) {
          return;
       }
       try{
          d.d(this.b);
          if (!PatchProxy.applyVoid(objArray, objArray, f.class, "4") && SystemUtil.L(a.a().a())) {
             a = f.a;
             if (a != null && a.exists()) {
                b.q(f.a);
                a = new File(f.a.getAbsolutePath()+".zip");
                if (a.exists()) {
                   b.q(a);
                }
                f.a = objArray;
             }
          }
       }catch(java.lang.Exception e0){
          f.a = objArray;
          Log.e("DebugLoggerLogFileCreate", "deleteDateRangeLogFile failed", e0);
       }
       return;
    }
}
