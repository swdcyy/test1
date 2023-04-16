package ag7.a;
import ag7.a$f;
import ag7.a$e;
import ag7.a$b;
import ag7.a$d;
import ag7.a$c;
import java.lang.Object;
import java.util.Map;
import org.json.JSONArray;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.lang.StringBuilder;
import zsd.u;
import android.content.Context;
import ag7.a$a;
import android.os.Build$VERSION;
import android.os.BatteryManager;
import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.a;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class a	// class@0000c0
{
    public static final FilenameFilter a;
    public static final FilenameFilter b;
    public static final FilenameFilter c;
    public static final FilenameFilter d;
    public static final FilenameFilter e;
    public static final a f;

    static {
       a.f = new a();
       a.a = a$f.b;
       a.b = a$e.b;
       a.c = a$b.b;
       a.d = a$d.b;
       a.e = a$c.b;
    }
    public void a(){
       super();
    }
    public final JSONArray a(Map p0){
       JSONArray jSONArray = new JSONArray();
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          StringBuilder str = key;
          jSONArray.put(u.g2(str+"##"+uEntry.getValue(), " ", "_", false, 4, null));
       }
       return jSONArray;
    }
    public final a$a b(Context p0){
       int sDK_INT = Build$VERSION.SDK_INT;
       BatteryManager systemServic = p0.getSystemService("batterymanager");
       a$a uoa = new a$a();
       if (systemServic != null) {
          uoa.g(systemServic.getIntProperty(4));
          if (sDK_INT >= 26) {
             uoa.h(systemServic.getIntProperty(6));
          }
          uoa.k(systemServic.getIntProperty(2));
          uoa.j(systemServic.getIntProperty(3));
          uoa.i(systemServic.getIntProperty(1));
          uoa.l(systemServic.getLongProperty(5));
       }
       return uoa;
    }
    public final void c(String p0,Map p1){
       File uFile = new File(p0);
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles(a.c);
          int i = 0;
          if (uFileArray == null) {
             uFileArray = new File[i];
          }
          int len = uFileArray.length;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.exists() && p1 != null) {
                a.h(oobject, "kgslDetailFile");
                String absolutePath = oobject.getAbsolutePath();
                a.h(absolutePath, "kgslDetailFile.absolutePath");
                p1.put(absolutePath, CollectionsKt___CollectionsKt.m2(FilesKt__FileReadWriteKt.x(oobject, null, 1, null)));
             }
             i = i + 1;
          }
       }
       return;
    }
    public final void d(Map p0){
       object oobject;
       String absolutePath;
       this.c("/sys/class/kgsl/kgsl-3d0", p0);
       this.c("/sys/class/kgsl/kgsl-3d0/devfreq", p0);
       File[] uFileArray = new File("/sys/class/devfreq").listFiles(a.e);
       if (uFileArray != null) {
       }else {
          uFileArray = new File[0];
       }
       int len = uFileArray.length;
       int i = 0;
       String str = "kgslDetailFile";
       while (i < len) {
          oobject = uFileArray[i];
          if (oobject.exists()) {
             a.h(oobject, str);
             if (oobject.isDirectory()) {
                str = oobject.getAbsolutePath();
                a.h(str, "kgslDetailFile.absolutePath");
                this.c(str, p0);
             }
          }
          i = i + 1;
       }
       uFileArray = new File("/sys/devices/soc").listFiles(a.e);
       if (uFileArray == null) {
          uFileArray = new File[0];
       }
       len = uFileArray.length;
       i = 0;
       while (i < len) {
          oobject = uFileArray[i];
          if (oobject.exists()) {
             a.h(oobject, str);
             if (oobject.isDirectory()) {
                File[] uFileArray1 = new File(oobject, "devfreq").listFiles(a.e);
                if (uFileArray1 == null) {
                   uFileArray1 = new File[0];
                }
                int len1 = uFileArray1.length;
                int i1 = 0;
                while (i1 < len1) {
                   object oobject1 = uFileArray1[i1];
                   if (oobject1.exists()) {
                      a.h(oobject1, "subKgslDetailFile");
                      if (oobject1.isDirectory()) {
                         absolutePath = oobject1.getAbsolutePath();
                         a.h(absolutePath, "subKgslDetailFile.absolutePath");
                         this.c(absolutePath, p0);
                      }
                   }
                   i1 = i1 + 1;
                }
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void e(Map p0){
       this.c("/sys/devices/platform/gpusysfs", p0);
       this.c("/sys/class/devfreq/gpufreq", p0);
       this.c("/sys/class/devfreq/gpufreq/power", p0);
       File[] uFileArray = new File("/sys/class/platform").listFiles(a.d);
       int i = 0;
       if (uFileArray != null) {
       }else {
          uFileArray = new File[i];
       }
       int len = uFileArray.length;
       while (i < len) {
          object oobject = uFileArray[i];
          if (oobject.exists()) {
             a.h(oobject, "kgslDetailFile");
             if (oobject.isDirectory()) {
                this.c(oobject.getAbsolutePath()+"/devfreq/gpufreq", p0);
                this.c(oobject.getAbsolutePath()+"/devfreq/gpufreq/power", p0);
             }
          }
          i = i + 1;
       }
       return;
    }
    public final void f(Map p0){
       File uFile = new File("/sys/class/thermal");
       if (uFile.exists() && uFile.isDirectory()) {
          File[] uFileArray = uFile.listFiles(a.a);
          if (uFileArray == null) {
             uFileArray = new File[0];
          }
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.exists()) {
                a.h(oobject, "thermalZoneDir");
                if (oobject.isDirectory()) {
                   File[] uFileArray1 = oobject.listFiles(a.b);
                   if (uFileArray1 == null) {
                      uFileArray1 = new File[0];
                   }
                   int len1 = uFileArray1.length;
                   int i1 = 0;
                   while (i1 < len1) {
                      object oobject1 = uFileArray1[i1];
                      if (oobject1.exists()) {
                         a.h(oobject1, "thermalDetailFile");
                         String absolutePath = oobject1.getAbsolutePath();
                         a.h(absolutePath, "thermalDetailFile.absolutePath");
                         p0.put(absolutePath, CollectionsKt___CollectionsKt.m2(FilesKt__FileReadWriteKt.x(oobject1, null, 1, null)));
                      }
                      i1 = i1 + 1;
                   }
                }
             }
             i = i + 1;
          }
       }
       return;
    }
}
