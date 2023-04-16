package s66.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.performance.stability.crash.monitor.message.ExceptionMessage;
import com.kwai.robust.PatchProxyResult;
import com.kwai.performance.stability.crash.monitor.message.JavaExceptionMessage;
import java.lang.Thread;
import vg7.d;
import java.util.HashMap;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.google.gson.Gson;
import java.lang.Boolean;
import o56.c;
import o56.a;
import xf6.l;
import java.lang.UnsatisfiedLinkError;
import rg.e;
import android.app.Application;
import android.content.pm.ApplicationInfo;
import java.util.Map;
import f66.h;
import oe6.a;
import java.lang.Long;
import java.io.File;
import java.util.Arrays;
import java.lang.ClassLoader;
import dalvik.system.BaseDexClassLoader;
import wkd.b;
import a76.d;

public class a	// class@0023e6
{

    public void a(){
       super();
    }
    public static void a(){
       if (PatchProxy.applyVoid(null, null, a.class, "2")) {
          return;
       }
       a.e("MagicFaceId");
       a.e("MagicFaceName");
       return;
    }
    public static ExceptionMessage b(Throwable p0){
       JavaExceptionMessage obj = PatchProxy.applyOneRefs(p0, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new JavaExceptionMessage();
       String name = Thread.currentThread().getName();
       obj.mThreadName = name;
       if (("AnrAsyncSched").equals(name)) {
          obj.mStatusMap = d.j.q(e.p());
       }
       e.u(p0, obj);
       return obj;
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.a().c() && l.c("key_disable_exception_handler", b)) {
          b = true;
       }
       return b;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "3")) {
          return;
       }
       e.v(p0, p1);
       return;
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "4")) {
          return;
       }
       e.p().remove(p0);
       return;
    }
    public static void f(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "1")) {
          return;
       }
       a.d("MagicFaceId", p0);
       a.d("MagicFaceName", p1);
       return;
    }
    public static void g(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, "15")) {
          return;
       }
       if (p0 instanceof UnsatisfiedLinkError) {
          e.v("relinker.recursive", e.h);
          e.v("relinker.extra", e.i);
          ApplicationInfo applicationI = a.b().getApplicationInfo();
          if (applicationI != null) {
             e.v("sourceDir", applicationI.sourceDir);
             e.v("sourceInfo", h.b(applicationI.sourceDir));
          }
          e.v("upgradeVersion", a.b());
          e.v("upgradeTime", Long.valueOf(a.r()));
          if (applicationI != null) {
             File uFile = new File(new File(applicationI.sourceDir).getParentFile(), "lib");
             e.v("libPath", h.a(uFile));
             File[] uFileArray = uFile.listFiles();
             if (uFileArray == null) {
                e.v("libPath.error", "empty children directory");
             }else {
                e.v("libPath.soList", Arrays.toString(uFileArray[0].list()));
             }
          }
          String message = p0.getMessage();
          if (message == null) {
             return;
          }else {
             String[] stringArray = message.split("\"");
             int i = 2;
             if (stringArray.length > i && (stringArray[(stringArray.length - i)]).endsWith(".so")) {
                object oobject = stringArray[(stringArray.length - i)];
                e.v("soFilePath", oobject);
                if (oobject.startsWith(File.separator)) {
                   e.v("soFileInfo", h.b(oobject));
                }else {
                   message = e.class.getClassLoader().findLibrary(oobject);
                   if (message != null) {
                      e.v("soFileInfo", h.b(message));
                   }
                }
             }
             e.v("libPath.appLibList", Arrays.toString(a.b().getDir("lib", 0).list()));
          }
       }
       if (a.a().c()) {
          a.d("KSStartTaskInfo", b.a(-2118755940).p());
       }
       return;
    }
}
