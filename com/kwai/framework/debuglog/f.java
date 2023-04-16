package com.kwai.framework.debuglog.f;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.debuglog.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import f66.e;
import com.kwai.performance.stability.crash.monitor.util.e;
import qkd.b;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.kwai.logger.KwaiLog;
import android.app.Application;
import o56.a;
import android.content.Context;
import j80.f;
import com.yxcorp.utility.Log;

public final class f implements Runnable	// class@000b28
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final void run(){
       String str1;
       File uFile2;
       if (PatchProxy.applyVoid(null, null, g.class, "8")) {
       }else {
          e.t(new File(e.a.getAbsolutePath(), "logcat.log"));
          String str = "kwailink";
          File uFile = new File(e.a.getParentFile(), str);
          if (uFile.exists()) {
             File uFile1 = new File(e.a.getAbsolutePath(), str);
             try{
                uFile1.mkdir();
                b.c(uFile, uFile1);
             }catch(java.io.IOException e1){
                KwaiLog.d("DebugLoggerInit", "copyDirectory failed path: "+uFile.getAbsolutePath(), e1);
             }
          }
       }
    }
}
