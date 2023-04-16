package com.kwai.performance.stability.oom.monitor.OOMFileManager$fdDumpDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.String;
import java.lang.Object;

public final class OOMFileManager$fdDumpDir$2 extends Lambda implements a	// class@00123f
{
    public static final OOMFileManager$fdDumpDir$2 INSTANCE;

    static {
       OOMFileManager$fdDumpDir$2.INSTANCE = new OOMFileManager$fdDumpDir$2();
    }
    public void OOMFileManager$fdDumpDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile = new File(OOMFileManager.g(), "fd");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
