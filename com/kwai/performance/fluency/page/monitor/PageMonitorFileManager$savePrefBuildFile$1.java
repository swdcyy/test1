package com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$savePrefBuildFile$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.io.File;
import android.app.Application;
import yf7.k;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;

public final class PageMonitorFileManager$savePrefBuildFile$1 extends Lambda implements a	// class@00109a
{
    public final String $fileName;
    public final String $log;

    public void PageMonitorFileManager$savePrefBuildFile$1(String p0,String p1){
       this.$fileName = p0;
       this.$log = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       FilesKt__FileReadWriteKt.G(new File(new File(k.b().getExternalCacheDir(), "trace"), this.$fileName), this.$log, null, 2, null);
    }
}
