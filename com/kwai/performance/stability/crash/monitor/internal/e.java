package com.kwai.performance.stability.crash.monitor.internal.e;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;

public final class e implements FileFilter	// class@0011eb
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final boolean accept(File p0){
       a.p(p0, "file");
       String name = p0.getName();
       a.o(name, "file.name");
       boolean b = false;
       if (u.H1(name, ".zip", b, 2, null) && p0.length() > 0) {
          b = true;
       }
       return b;
    }
}
