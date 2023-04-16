package com.kwai.performance.stability.oom.monitor.OOMFileManager$oomDumDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.String;
import java.lang.Object;

public final class OOMFileManager$oomDumDir$2 extends Lambda implements a	// class@001241
{
    public static final OOMFileManager$oomDumDir$2 INSTANCE;

    static {
       OOMFileManager$oomDumDir$2.INSTANCE = new OOMFileManager$oomDumDir$2();
    }
    public void OOMFileManager$oomDumDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile = new File(OOMFileManager.i.i(), "memory/hprof2");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
