package com.kwai.performance.stability.crash.monitor.b;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import vg7.e;
import android.content.Context;
import msd.l;
import yf7.m;
import lg7.m;
import java.util.Objects;
import com.kwai.performance.stability.crash.monitor.SafeModeMessageHandler$saveRootDir$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;
import brd.t;
import com.kwai.performance.stability.crash.monitor.util.e;
import yf7.i;
import vg7.d;
import com.kwai.performance.stability.crash.monitor.ExceptionFileUploadInfo;
import nsd.u;
import com.google.gson.Gson;
import yf7.d;
import yf7.d$a;
import java.util.HashMap;
import java.lang.Integer;
import com.kwai.performance.monitor.base.MonitorBuildConfig;
import java.util.Map;
import lg7.b;
import erd.g;
import com.kwai.performance.stability.crash.monitor.a;
import erd.a;
import lg7.a;
import java.lang.Boolean;

public final class b	// class@000e16
{
    public static final b a;
    public static File b;
    public static m c;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public static final File a(){
       File uFile = new File(b.a.c(), a.C("anr_log", "/dump"));
       e.a(uFile);
       return uFile;
    }
    public static final File b(){
       File uFile = new File(b.a.c(), a.C("java_crash_log", "/dump"));
       e.a(uFile);
       return uFile;
    }
    public static final File d(){
       File uFile = new File(b.a.c(), a.C("native_crash_log", "/dump"));
       e.a(uFile);
       return uFile;
    }
    public final File c(){
       File b = b.b;
       if (b != null) {
          return b;
       }
       a.S("mRootDir");
       throw null;
    }
    public final File e(){
       File uFile = new File(this.c(), "temp");
       e.a(uFile);
       return uFile;
    }
    public final void f(Context p0,l p1,m p2){
       a.p(p0, "context");
       a.p(p1, "rootDirInvoker");
       File uFile = p1.invoke("exception");
       a.p(uFile, "<set-?>");
       b.b = uFile;
       b.c = p2;
       String path = this.c().getPath();
       a.o(path, "mRootDir.path");
       Objects.requireNonNull(m.a);
       a.p(p0, "context");
       a.p(path, "dir");
       SafeModeMessageHandler$saveRootDir$1 osaveRootDir = new SafeModeMessageHandler$saveRootDir$1(p0, path);
       Monitor_ThreadKt.b(0, osaveRootDir, 1, null);
    }
    public final t g(File p0,String p1,int p2){
       File uFile = p0;
       m obj = p1;
       int i = p2;
       t ot = null;
       if (!uFile) {
       }else {
          String name = p0.getName();
          a.o(name, "it.name");
          String str = e.x(name);
          a.p(str, "logUUID");
          if (i == 1) {
             ExceptionFileUploadInfo uExceptionFi = new ExceptionFileUploadInfo(str, 0, 0, null, p2, 14, null);
             d$a.c(i.a, "crash_file_upload_event", d.j.q(v15), 0, 4, 0);
          }
          HashMap hashMap = new HashMap();
          hashMap.put("bizType", Integer.valueOf(5));
          hashMap.put("sid", MonitorBuildConfig.g());
          hashMap.put("did", MonitorBuildConfig.c());
          if (obj) {
             hashMap.put("extraInfo", obj);
          }
          hashMap.put("fileExtend", "zip");
          obj = b.c;
          if (obj != null) {
             t ot1 = obj.a(hashMap, uFile);
             if (ot1 != null) {
                ot1 = ot1.doOnNext(new b(str, i));
                if (ot1 != null) {
                   ot1 = ot1.doOnComplete(a.b);
                   if (ot1 != null) {
                      ot = ot1.doOnError(new a(str, i));
                   }
                }
             }
          }
       }
    label_00a4 :
       if (ot == null) {
          ot = t.just(Boolean.FALSE);
          a.o(ot, "just\(false\)");
       }
       return ot;
    }
}
