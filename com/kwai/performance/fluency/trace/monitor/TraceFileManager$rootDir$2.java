package com.kwai.performance.fluency.trace.monitor.TraceFileManager$rootDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import msd.l;

public final class TraceFileManager$rootDir$2 extends Lambda implements a	// class@0010f2
{
    public static final TraceFileManager$rootDir$2 INSTANCE;

    static {
       TraceFileManager$rootDir$2.INSTANCE = new TraceFileManager$rootDir$2();
    }
    public void TraceFileManager$rootDir$2(){
       super(0);
    }
    public final File invoke(){
       l a = TraceFileManager.a;
       if (a == null) {
          a.S("mRootDirInvoker");
       }
       return a.invoke("trace");
    }
    public Object invoke(){
       return this.invoke();
    }
}
