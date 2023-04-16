package fna.f;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import kotlin.Pair;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class f	// class@00297b
{

    public static final String a(long p0,long p1){
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), null, f.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return f.d(p1);
    }
    public static final float b(long p0){
       return ((float)p0 / (float)0x100000);
    }
    public static final Pair c(long p0){
       Pair obj;
       Pair pair;
       Object[] objArray;
       String str1;
       Pair pair1;
       Object[] objArray1;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uof, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       String str = "MB";
       if (!p0) {
          pair = new Pair("0", str);
       }else {
          obj = 1024;
          if (p0 - obj < 0) {
             obj = new Pair(String.valueOf(p0), "B");
          }else {
             r0 or0 = 0x100000;
             if (p0 - or0 < 0) {
                objArray = new Object[]{Float.valueOf(((float)p0 / (float)obj))};
                str1 = String.format("%.2f", Arrays.copyOf(objArray, 1));
                a.o(str1, "java.lang.String.format\(format, *args\)");
                pair1 = new Pair(str1, "KB");
             }else {
                obj = 0x40000000;
                if (p0 - obj < 0) {
                   objArray1 = new Object[]{Float.valueOf(((float)p0 / (float)or0))};
                   str1 = String.format("%.2f", Arrays.copyOf(objArray1, 1));
                   a.o(str1, "java.lang.String.format\(format, *args\)");
                   obj = new Pair(str1, str);
                }else {
                   pair1 = 0x10000000000;
                   if (p0 - pair1 < 0) {
                      objArray = new Object[]{Float.valueOf(((float)p0 / (float)obj))};
                      str1 = String.format("%.2f", Arrays.copyOf(objArray, 1));
                      a.o(str1, "java.lang.String.format\(format, *args\)");
                      pair1 = new Pair(str1, "GB");
                   }else {
                      objArray1 = new Object[]{Float.valueOf(((float)p0 / (float)pair1))};
                      str1 = String.format("%.2f", Arrays.copyOf(objArray1, 1));
                      a.o(str1, "java.lang.String.format\(format, *args\)");
                      obj = new Pair(str1, "TB");
                   }
                }
             }
             pair = pair1;
          }
          pair = obj;
       }
       return pair;
    }
    public static final String d(long p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, uof, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Pair pair = f.c(p0);
       return pair.getFirst()+pair.getSecond();
    }
}
