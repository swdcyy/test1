package com.kwai.performance.fluency.trace.monitor.TraceFileManager;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager$rootDir$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager$uploadDir$2;
import java.lang.Object;
import java.io.File;

public final class TraceFileManager	// class@0010f4
{
    public static l a;
    public static final p b;
    public static final p c;
    public static final TraceFileManager d;

    static {
       TraceFileManager.d = new TraceFileManager();
       TraceFileManager.b = s.c(TraceFileManager$rootDir$2.INSTANCE);
       TraceFileManager.c = s.c(TraceFileManager$uploadDir$2.INSTANCE);
    }
    public void TraceFileManager(){
       super();
    }
    public static final File a(){
       return TraceFileManager.b.getValue();
    }
}
