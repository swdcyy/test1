package com.kwai.performance.stability.oom.monitor.OOMFileManager$hprofAnalysisDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.String;
import java.lang.Object;

public final class OOMFileManager$hprofAnalysisDir$2 extends Lambda implements a	// class@001240
{
    public static final OOMFileManager$hprofAnalysisDir$2 INSTANCE;

    static {
       OOMFileManager$hprofAnalysisDir$2.INSTANCE = new OOMFileManager$hprofAnalysisDir$2();
    }
    public void OOMFileManager$hprofAnalysisDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile = new File(OOMFileManager.i.i(), "memory/hprof-aly");
       uFile.mkdirs();
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
