package com.kwai.performance.stability.oom.monitor.OOMFileManager;
import com.kwai.performance.stability.oom.monitor.OOMFileManager$rootDir$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.performance.stability.oom.monitor.OOMFileManager$hprofAnalysisDir$2;
import com.kwai.performance.stability.oom.monitor.OOMFileManager$oomDumDir$2;
import com.kwai.performance.stability.oom.monitor.OOMFileManager$threadDumpDir$2;
import com.kwai.performance.stability.oom.monitor.OOMFileManager$fdDumpDir$2;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.StringBuilder;

public final class OOMFileManager	// class@001244
{
    public static l a;
    public static String b;
    public static String c;
    public static final p d;
    public static final p e;
    public static final p f;
    public static final p g;
    public static final p h;
    public static final OOMFileManager i;

    static {
       OOMFileManager.i = new OOMFileManager();
       OOMFileManager.d = s.c(OOMFileManager$rootDir$2.INSTANCE);
       OOMFileManager.e = s.c(OOMFileManager$hprofAnalysisDir$2.INSTANCE);
       OOMFileManager.f = s.c(OOMFileManager$oomDumDir$2.INSTANCE);
       OOMFileManager.g = s.c(OOMFileManager$threadDumpDir$2.INSTANCE);
       OOMFileManager.h = s.c(OOMFileManager$fdDumpDir$2.INSTANCE);
    }
    public void OOMFileManager(){
       super();
    }
    public static final File a(File p0){
       a.p(p0, "dumpDir");
       p0.mkdirs();
       return new File(p0, "dump.txt");
    }
    public static final File b(Date p0){
       a.p(p0, "date");
       String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(p0);
       File uFile = OOMFileManager.g();
       StringBuilder str1 = "";
       String b = OOMFileManager.b;
       if (b == null) {
          a.S("mPrefix");
       }
       OOMFileManager.g().mkdirs();
       return new File(uFile, str1+b+str+".hprof");
    }
    public static final File c(Date p0){
       a.p(p0, "date");
       String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(p0);
       File uFile = OOMFileManager.g();
       StringBuilder str1 = "";
       String b = OOMFileManager.b;
       if (b == null) {
          a.S("mPrefix");
       }
       OOMFileManager.g().mkdirs();
       return new File(uFile, str1+b+str+".txt");
    }
    public static final File d(Date p0,String p1){
       File uFile;
       StringBuilder str;
       String b;
       a.p(p0, "date");
       if (p1 != null) {
          uFile = OOMFileManager.h();
          str = "";
          b = OOMFileManager.b;
          if (b == null) {
             a.S("mPrefix");
          }
          OOMFileManager.h().mkdirs();
          return new File(uFile, str+b+p1+".hprof");
       }else {
          String str1 = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(p0);
          uFile = OOMFileManager.h();
          str = "";
          b = OOMFileManager.b;
          if (b == null) {
             a.S("mPrefix");
          }
          OOMFileManager.h().mkdirs();
          return new File(uFile, str+b+str1+".hprof");
       }
    }
    public static final File e(Date p0){
       a.p(p0, "date");
       String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss_SSS", Locale.CHINESE).format(p0);
       File uFile = OOMFileManager.g();
       StringBuilder str1 = "";
       String b = OOMFileManager.b;
       if (b == null) {
          a.S("mPrefix");
       }
       OOMFileManager.g().mkdirs();
       return new File(uFile, str1+b+str+".json");
    }
    public static final File f(){
       return OOMFileManager.h.getValue();
    }
    public static final File g(){
       return OOMFileManager.e.getValue();
    }
    public static final File h(){
       return OOMFileManager.f.getValue();
    }
    public static final File j(){
       return OOMFileManager.g.getValue();
    }
    public final File i(){
       return OOMFileManager.d.getValue();
    }
}
