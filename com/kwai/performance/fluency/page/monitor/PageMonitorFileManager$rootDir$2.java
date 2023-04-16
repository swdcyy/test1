package com.kwai.performance.fluency.page.monitor.PageMonitorFileManager$rootDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.fluency.page.monitor.PageMonitorFileManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import msd.l;

public final class PageMonitorFileManager$rootDir$2 extends Lambda implements a	// class@001099
{
    public static final PageMonitorFileManager$rootDir$2 INSTANCE;

    static {
       PageMonitorFileManager$rootDir$2.INSTANCE = new PageMonitorFileManager$rootDir$2();
    }
    public void PageMonitorFileManager$rootDir$2(){
       super(0);
    }
    public final File invoke(){
       l a = PageMonitorFileManager.a;
       if (a == null) {
          a.S("mRootDirInvoker");
       }
       return a.invoke("page_monitor");
    }
    public Object invoke(){
       return this.invoke();
    }
}
