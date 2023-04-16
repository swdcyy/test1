package com.kwai.performance.stability.oom.monitor.OOMHeapDumper;
import java.lang.Object;
import xg7.b;
import java.lang.String;
import yf7.h;
import java.util.Date;
import java.io.File;
import com.kwai.performance.stability.oom.monitor.OOMFileManager;
import java.lang.System;
import mh7.a;
import kh7.c;
import com.kwai.performance.stability.oom.monitor.OOMHeapDumper$dump$1;
import msd.l;
import java.lang.StringBuilder;
import nh7.a$a;
import java.lang.Runtime;
import java.lang.Throwable;

public final class OOMHeapDumper	// class@001246
{
    public static final OOMHeapDumper a;

    static {
       OOMHeapDumper.a = new OOMHeapDumper();
    }
    public void OOMHeapDumper(){
       super();
    }
    public final void a(b p0,int p1,String p2){
       a$a a;
       h.d("OOMHeapDumper", "dump hprof start");
       File uFile = OOMFileManager.d(new Date(), p2);
       uFile.createNewFile();
       p0.dump(uFile.getAbsolutePath());
       a.p.c();
       c.a.a(uFile, p1, "oom", new OOMHeapDumper$dump$1(p2));
       a = a$a.a;
       h.e("OOMHeapDumper", "dump hprof complete, dumpTime:"+(System.currentTimeMillis() - System.currentTimeMillis())+" fileName:"+uFile.getName()+" origin fileSize:"+a.f(uFile.length())+" JVM max memory:"+a.f(Runtime.getRuntime().maxMemory())+" JVM  free memory:"+a.f(Runtime.getRuntime().freeMemory())+" JVM total memory:"+a.f(Runtime.getRuntime().totalMemory()), true);
       return;
    }
}
