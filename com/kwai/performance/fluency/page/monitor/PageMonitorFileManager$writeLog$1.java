package com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$writeLog$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import java.io.File;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;

public final class PageMonitorFileManager$writeLog$1 extends Lambda implements a	// class@00109b
{
    public final boolean $append;
    public final String $fileName;
    public final String $log;

    public void PageMonitorFileManager$writeLog$1(boolean p0,String p1,String p2){
       this.$append = p0;
       this.$fileName = p1;
       this.$log = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (this.$append != null) {
          FilesKt__FileReadWriteKt.i(new File(PageMonitorFileManager.c.a(), this.$fileName), this.$log, null, 2, null);
       }else {
          FilesKt__FileReadWriteKt.G(new File(PageMonitorFileManager.c.a(), this.$fileName), this.$log, null, 2, null);
       }
       return;
    }
}
