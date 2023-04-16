package com.kwai.performance.stability.crash.monitor.CrashMonitor$fastInit$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import android.content.Context;
import java.lang.String;
import java.io.File;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.performance.stability.crash.monitor.util.e;

public final class CrashMonitor$fastInit$1 extends Lambda implements l	// class@001188
{
    public final Context $context;

    public void CrashMonitor$fastInit$1(Context p0){
       this.$context = p0;
       super(1);
    }
    public final File invoke(String p0){
       a.p(p0, "it");
       File uFile = new File(e.a.k(this.$context), "exception");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
