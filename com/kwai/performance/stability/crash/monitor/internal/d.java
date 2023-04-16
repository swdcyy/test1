package com.kwai.performance.stability.crash.monitor.internal.d;
import java.io.FileFilter;
import java.lang.Object;
import java.io.File;
import com.kwai.performance.stability.crash.monitor.internal.ExceptionReporter;

public final class d implements FileFilter	// class@0011ea
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final boolean accept(File p0){
       long l;
       boolean b = false;
       if (p0 == null) {
       }else if(p0.exists() == true){
          l = 1;
       label_0010 :
          if (l && p0.length() > 0) {
             b = true;
          }
          return b;
       }
       l = 0;
       goto label_0010 ;
    }
}
