package com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$rootDir$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$writeLog$1;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import java.io.File;

public final class PageMonitorFileManager	// class@00109c
{
    public static l a;
    public static final p b;
    public static final PageMonitorFileManager c;

    static {
       PageMonitorFileManager.c = new PageMonitorFileManager();
       PageMonitorFileManager.b = s.c(PageMonitorFileManager$rootDir$2.INSTANCE);
    }
    public void PageMonitorFileManager(){
       super();
    }
    public static void b(PageMonitorFileManager p0,String p1,String p2,boolean p3,int p4,Object p5){
       if (p4 & 0x04) {
          p3 = false;
       }
       Objects.requireNonNull(p0);
       a.p(p1, "fileName");
       a.p(p2, "log");
       Monitor_ThreadKt.b(0, new PageMonitorFileManager$writeLog$1(p3, p1, p2), 1, null);
       return;
    }
    public final File a(){
       return PageMonitorFileManager.b.getValue();
    }
}
