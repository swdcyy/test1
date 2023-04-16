package com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog;
import com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog$mTimeStampToCharArrayHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.framework.exceptionhandler.safemode.SafeModeDebugLog$mTimeStampRecorder$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Application;
import o56.a;
import kotlin.jvm.internal.a;
import kotlin.Result;
import s66.c;
import java.lang.System;
import java.util.Objects;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import s66.c$a;
import s66.d;
import android.content.Context;
import qrd.l1;
import java.lang.Throwable;
import qrd.j0;
import java.io.File;
import j80.f;
import java.lang.StringBuilder;
import android.os.Process;
import android.util.Log;
import java.lang.Integer;
import java.lang.StringBuffer;
import qkd.b;
import java.nio.charset.Charset;

public final class SafeModeDebugLog	// class@001543
{
    public static final String a = "SafeModeLog";
    public static boolean b;
    public static final p c;
    public static final p d;
    public static File e;
    public static final SafeModeDebugLog f;

    static {
       SafeModeDebugLog.f = new SafeModeDebugLog();
       SafeModeDebugLog.c = s.c(SafeModeDebugLog$mTimeStampToCharArrayHelper$2.INSTANCE);
       SafeModeDebugLog.d = s.c(SafeModeDebugLog$mTimeStampRecorder$2.INSTANCE);
    }
    public void SafeModeDebugLog(){
       super();
    }
    public static final void a(){
       SafeModeDebugLog safeModeDebu = SafeModeDebugLog.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, safeModeDebu, "5")) {
          return;
       }
       if (!SafeModeDebugLog.b) {
          Application uApplication = a.b();
          a.o(uApplication, "AppEnv.getAppContext\(\)");
          if (!PatchProxy.applyVoidOneRefs(uApplication, objArray, safeModeDebu, "6")) {
             safeModeDebu = SafeModeDebugLog.f;
             c uoc = safeModeDebu.b();
             long l = System.currentTimeMillis();
             Objects.requireNonNull(uoc);
             c uoc1 = c.class;
             if (PatchProxy.isSupport(uoc1)) {
                uoc1 = PatchProxy.applyOneRefs(Long.valueOf(l), uoc, uoc1, "1");
                if (uoc1 != PatchProxyResult.class) {
                label_0056 :
                   a.o(uoc1, "mTimeStampRecorder.init\(¡­imeMillis\(\)\n            \)");
                   safeModeDebu.c().j(uoc1.a, uoc1.b, uoc1.c, uoc1.d, uoc1.e, uoc1.f, uoc1.g);
                   SafeModeDebugLog.e(uApplication);
                   Result.constructor-impl(l1.a);
                }
             }
             uoc.a = new c$a();
             uoc.b(l);
             uoc1 = uoc.a;
             goto label_0056 ;
          }
          SafeModeDebugLog.b = true;
       }
       return;
    }
    public static final File d(Context p0){
       File obj = PatchProxy.applyOneRefs(p0, null, SafeModeDebugLog.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "context");
       obj = new File(f.b(p0), "safe_mode");
       obj.getAbsolutePath();
       return obj;
    }
    public static final void e(Context p0){
       String a;
       String str = null;
       if (PatchProxy.applyVoidOneRefs(p0, str, SafeModeDebugLog.class, "4")) {
          return;
       }
       SafeModeDebugLog f = SafeModeDebugLog.f;
       c$a uoa = f.b().a(System.currentTimeMillis());
       a.o(uoa, "mTimeStampRecorder.getTi¡­stem.currentTimeMillis\(\)\)");
       char[] uocharArray = f.c().a(uoa.a, uoa.b, uoa.c, uoa.d, 0, 0, 0);
       a.o(uocharArray, "mTimeStampToCharArrayHel¡­ur, 0, 0, 0\n            \)");
       char[] uocharArray1 = new char[16];
       System.arraycopy(uocharArray, 0, uocharArray1, 0, 16);
       StringBuilder str1 = "safe-mode-"+uocharArray1+".log";
       a.o(str1, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       SafeModeDebugLog.e = new File(SafeModeDebugLog.d(p0), str1);
       a = SafeModeDebugLog.a;
       str1 = "mFile create if not exist ";
       File e = SafeModeDebugLog.e;
       if (e == null) {
          a.S("mFile");
       }
       if (e != null) {
          str = e.getAbsolutePath();
       }
       Result.constructor-impl(Integer.valueOf(Log.d(a, str1+str+" for pid "+Process.myPid())));
       return;
    }
    public static synchronized final void f(String p0,String p1){
       _monitor_enter(SafeModeDebugLog.class);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, SafeModeDebugLog.class, "3")) {
          _monitor_exit(SafeModeDebugLog.class);
          return;
       }else {
          a.p(p0, "tag");
          a.p(p1, "msg");
          SafeModeDebugLog.a();
          SafeModeDebugLog f = SafeModeDebugLog.f;
          c$a uoa = f.b().a(System.currentTimeMillis());
          a.o(uoa, "mTimeStampRecorder.getTi¡­stem.currentTimeMillis\(\)\)");
          char[] uocharArray = f.c().b(uoa.a, uoa.b, uoa.c, uoa.d, uoa.e, uoa.f, uoa.g);
          a.o(uocharArray, "mTimeStampToCharArrayHel¡­Millisecond\n            \)");
          StringBuffer str = uocharArray;
          str = str+" "+Process.myPid()+" "+Process.myTid()+" "+p0+": "+p1+"\n";
          File e = SafeModeDebugLog.e;
          if (e == null) {
             a.S("mFile");
          }
          b.w0(e, str, Charset.defaultCharset(), true);
          Result.constructor-impl(l1.a);
          _monitor_exit(SafeModeDebugLog.class);
          return;
       }
    }
    public final c b(){
       Object obj = PatchProxy.apply(null, this, SafeModeDebugLog.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SafeModeDebugLog.d.getValue();
    }
    public final d c(){
       Object obj = PatchProxy.apply(null, this, SafeModeDebugLog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SafeModeDebugLog.c.getValue();
    }
}
