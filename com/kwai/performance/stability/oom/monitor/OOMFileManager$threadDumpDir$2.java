package com.kwai.performance.stability.oom.monitor.OOMFileManager$threadDumpDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.String;
import java.lang.Object;

public final class OOMFileManager$threadDumpDir$2 extends Lambda implements a	// class@001243
{
    public static final OOMFileManager$threadDumpDir$2 INSTANCE;

    static {
       OOMFileManager$threadDumpDir$2.INSTANCE = new OOMFileManager$threadDumpDir$2();
    }
    public void OOMFileManager$threadDumpDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile = new File(OOMFileManager.g(), "thread");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
