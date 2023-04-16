package com.kwai.performance.stability.crash.monitor.CrashMonitor$getSafeModeExceptionMessages$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.b;
import java.util.Objects;
import lg7.m;
import android.content.SharedPreferences;
import oe6.o;

public final class CrashMonitor$getSafeModeExceptionMessages$2$1 extends Lambda implements l	// class@001189
{
    public final Context $context;

    public void CrashMonitor$getSafeModeExceptionMessages$2$1(Context p0){
       this.$context = p0;
       super(1);
    }
    public final File invoke(String p0){
       a.p(p0, "it");
       CrashMonitor$getSafeModeExceptionMessages$2$1 t$context = this.$context;
       Objects.requireNonNull(b.a);
       a.p(t$context, "context");
       Objects.requireNonNull(m.a);
       a.p(t$context, "context");
       int i = 0;
       String str = o.c(t$context, "crash_monitor_safe_mode", i).getString("crash_file_root_dir", "");
       if (str == null) {
       }else if(str.length() > 0){
          i = 1;
       }
       if (i) {
       label_0037 :
          if (str == null) {
             File externalFile = t$context.getExternalFilesDir("");
             if (externalFile == null) {
                externalFile = t$context.getFilesDir();
             }
             str = new File(externalFile, "performance/").getPath();
          }
          return new File(str);
       }
       str = null;
       goto label_0037 ;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
