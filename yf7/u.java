package yf7.u;
import kotlin.text.Regex;
import java.lang.String;
import yf7.x;
import yf7.e;
import nsd.u;
import yf7.b;
import java.lang.Integer;
import kotlin.Result;
import java.io.File;
import yf7.u$a;
import java.io.FileFilter;
import java.lang.Object;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Runtime;
import java.lang.Number;
import zsd.d;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import java.util.Iterator;
import java.io.Closeable;
import isd.b;
import zsd.u;
import qrd.l1;
import android.content.Context;
import kotlin.jvm.internal.a;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import kotlin.TypeCastException;
import java.lang.Long;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import java.util.List;
import java.util.Collection;
import kotlin.collections.ArraysKt___ArraysKt;
import zsd.k;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class u	// class@0028ac
{
    public static final Regex a;
    public static final Regex b;
    public static final Regex c;
    public static final Regex d;
    public static final Regex e;
    public static final Regex f;
    public static final Regex g;
    public static final Regex h;
    public static Integer i;
    public static Long j;
    public static Double k;
    public static x l;
    public static e m;
    public static b n;

    static {
       u.a = new Regex("VmSize:\\s*\(\\d+\)\\s*kB");
       u.b = new Regex("VmRSS:\\s*\(\\d+\)\\s*kB");
       u.c = new Regex("Threads:\\s*\(\\d+\)\\s*");
       u.d = new Regex("MemTotal:\\s*\(\\d+\)\\s*kB");
       u.e = new Regex("MemFree:\\s*\(\\d+\)\\s*kB");
       u.f = new Regex("MemAvailable:\\s*\(\\d+\)\\s*kB");
       u.g = new Regex("CmaTotal:\\s*\(\\d+\)\\s*kB");
       u.h = new Regex("ION_heap:\\s*\(\\d+\)\\s*kB");
       u.l = new x();
       e uoe = new e(0, 0, 0, 0, 0, 0, 63, null);
       u.m = v0;
       b uob = new b(0, 0, 0, 0, 0, 31, null);
       u.n = v0;
    }
    public static final int a(){
       int i1;
       Integer i = u.i;
       if (i != null) {
          i1 = i.intValue();
       }else {
          File[] uFileArray = new File("/sys/devices/system/cpu/").listFiles(u$a.b);
          i1 = (uFileArray != null)? uFileArray.length: 0;
          i = Result.constructor-impl(Integer.valueOf(i1));
          Integer integer = Integer.valueOf(Runtime.getRuntime().availableProcessors());
          if (Result.isFailure-impl(i)) {
             i = integer;
          }
          u.i = Integer.valueOf(i.intValue());
          i1 = i.intValue();
       }
       return i1;
    }
    public static final x b(){
       Throwable throwable;
       x ox = new x();
       boolean b = 8192;
       InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File("/proc/self/status")), d.a);
       if (inputStreamR instanceof BufferedReader) {
       }else {
          inputStreamR = new BufferedReader(inputStreamR, b);
       }
       Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
       while (true) {
          throwable = null;
          if (iterator.hasNext()) {
             String str = iterator.next();
             boolean i = 0;
             if (ox.a - i && (ox.b - i && ox.c - i)) {
                break ;
             }else {
                i = false;
                if (u.q2(str, "VmSize", i, 2, throwable)) {
                   ox.a = u.e(u.a, str);
                }else if(u.q2(str, "VmRSS", i, 2, throwable)){
                   ox.b = u.e(u.b, str);
                }else if(u.q2(str, "Threads", i, 2, throwable)){
                   ox.c = u.e(u.c, str);
                }
             }
          }else {
             b.a(inputStreamR, throwable);
             Result.constructor-impl(l1.a);
             u.l = ox;
             return ox;
          }
       }
       u.l = ox;
       b.a(inputStreamR, throwable);
       return ox;
    }
    public static final long c(Context p0){
       a.q(p0, "context");
       ActivityManager$MemoryInfo memoryInfo = new ActivityManager$MemoryInfo();
       p0 = p0.getSystemService("activity");
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
       }
       p0.getMemoryInfo(memoryInfo);
       return memoryInfo.availMem;
    }
    public static final long d(){
       long l;
       long l1;
       Long j = u.j;
       if (j != null) {
          l = j.longValue();
       }else {
          boolean b = 8192;
          InputStreamReader inputStreamR = new InputStreamReader(new FileInputStream(new File("/proc/meminfo")), d.a);
          if (inputStreamR instanceof BufferedReader) {
          }else {
             inputStreamR = new BufferedReader(inputStreamR, b);
          }
          Iterator iterator = TextStreamsKt.h(inputStreamR).iterator();
          while (true) {
             if (iterator.hasNext()) {
                String str = iterator.next();
                if (StringsKt__StringsKt.O2(str, "MemTotal", false, 2, null)) {
                   String[] stringArray = new String[false];
                   Object[] objArray = new Regex("\\s+").split(str, false).toArray(stringArray);
                   if (objArray != null) {
                      object oobject = (1 <= ArraysKt___ArraysKt.Rd(objArray))? objArray[1]: "0";
                      l1 = Long.parseLong(oobject) << 10;
                   }else {
                      throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                   }
                }
             }else {
                l1 = 0;
             }
             b.a(inputStreamR, null);
             u.j = Long.valueOf(l1);
             l = l1;
             break ;
          }
       }
       return l;
    }
    public static final long e(Regex p0,String p1){
       long l;
       if (p1 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
       }
       k ok = p0.matchEntire(StringsKt__StringsKt.o5(p1).toString());
       if (ok != null) {
          List list = ok.c();
          if (list != null) {
             String str = CollectionsKt___CollectionsKt.F2(list, 1);
             if (str != null) {
                l = Long.parseLong(str);
             label_0026 :
                return l;
             }
          }
       }
       l = 0;
       goto label_0026 ;
    }
}
