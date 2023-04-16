package com.kwai.performance.fluency.trace.monitor.TraceFileManager$uploadDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.fluency.trace.monitor.TraceFileManager;
import java.lang.String;
import java.lang.Object;

public final class TraceFileManager$uploadDir$2 extends Lambda implements a	// class@0010f3
{
    public static final TraceFileManager$uploadDir$2 INSTANCE;

    static {
       TraceFileManager$uploadDir$2.INSTANCE = new TraceFileManager$uploadDir$2();
    }
    public void TraceFileManager$uploadDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile = new File(TraceFileManager.a(), "upload");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
