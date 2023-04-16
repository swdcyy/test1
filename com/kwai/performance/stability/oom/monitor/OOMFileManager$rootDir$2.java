package com.kwai.performance.stability.oom.monitor.OOMFileManager$rootDir$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import msd.l;

public final class OOMFileManager$rootDir$2 extends Lambda implements a	// class@001242
{
    public static final OOMFileManager$rootDir$2 INSTANCE;

    static {
       OOMFileManager$rootDir$2.INSTANCE = new OOMFileManager$rootDir$2();
    }
    public void OOMFileManager$rootDir$2(){
       super(0);
    }
    public final File invoke(){
       File uFile;
       l a = OOMFileManager.a;
       if (a != null) {
          if (a == null) {
             a.S("mRootDirInvoker");
          }
          uFile = a.invoke("oom");
       }else {
          String c = OOMFileManager.c;
          if (c == null) {
             a.S("mRootPath");
          }
          uFile = new File(c);
       }
       return uFile;
    }
    public Object invoke(){
       return this.invoke();
    }
}
