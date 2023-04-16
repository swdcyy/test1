package e0d.h;
import e0d.c;
import java.lang.Object;
import l0d.c;
import e0d.d;
import com.yxcorp.image.cache.CacheKeyOptions;
import e0d.d$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import p0d.e;
import h0d.d;
import h0d.a;
import java.lang.Number;
import java.lang.Double;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import java.util.regex.Pattern;
import java.lang.StringBuilder;
import com.yxcorp.image.common.log.Log;
import java.lang.Boolean;
import android.os.Build$VERSION;
import java.lang.Runtime;
import f0d.a;
import java.util.concurrent.atomic.AtomicBoolean;

public class h	// class@001509
{
    public static d a;
    public static final e b;

    static {
       h.b = new c();
    }
    public void h(){
       super();
    }
    public static c a(){
       c a1;
       d a = h.a;
       if (a != null) {
          a = a.O;
          if (a != null) {
          label_000a :
             return a1;
          }
       }
       a1 = c.a;
       goto label_000a ;
    }
    public static CacheKeyOptions b(){
       d a = h.a;
       CacheKeyOptions uRL = (a == null)? CacheKeyOptions.URL: a.Q;
       return uRL;
    }
    public static d$c c(){
       d obj = PatchProxy.apply(null, null, h.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.a;
       if (obj != null) {
          obj = obj.N;
          if (obj != null) {
          label_001b :
             return obj;
          }
       }
       e b = e.b;
       goto label_001b ;
    }
    public static d d(){
       a uoa;
       d obj = PatchProxy.apply(null, null, h.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = h.a;
       if (obj != null) {
          obj = obj.S;
          if (obj != null) {
          label_001d :
             return uoa;
          }
       }
       uoa = new a();
       goto label_001d ;
    }
    public static int e(){
       d a = h.a;
       int i = (a == null)? 0x40000000: a.h * 0x100000;
       return i;
    }
    public static double f(String p0,String p1,String p2,String p3,String p4){
       String obj;
       Double uDouble;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       h oh = h.class;
       int i = 0;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          obj = PatchProxy.apply(objArray, null, oh, "4");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       i = -123173735;
       if (h.a == null) {
          int i1 = p0.hashCode();
          if (i1 != -1867169789) {
             if (i1 != i) {
                if (i1 != 0x5c4d208 || !oobject.equals("error")) {
                label_006e :
                   i = -1;
                }else {
                   i = 2;
                }
             }else if(!oobject.equals("canceled")){
                goto label_006e ;
             }else {
                i = 1;
             }
          }else if(!oobject.equals("success")){
             goto label_006e ;
          }else {
             i = 0;
          }
          if (i) {
             if (i != 1) {
                if (i != 2) {
                   return 0;
                }else {
                   return d.X.doubleValue();
                }
             }else {
                return d.W.doubleValue();
             }
          }else {
             return d.V.doubleValue();
          }
       }else if(oobject1 != null && !p1.isEmpty()){
          uDouble = h.a.k.get(oobject1);
          if (uDouble != null) {
             return uDouble.doubleValue();
          }
       }
       if (oobject2 != null && !p2.isEmpty()) {
          Iterator iterator = h.a.l.keySet().iterator();
          while (true) {
             if (iterator.hasNext()) {
                obj = iterator.next();
                if (Pattern.matches(obj, oobject2)) {
                   return h.a.l.get(obj).doubleValue();
                }
                continue ;
             }
          }
          return d.V.doubleValue();
       }
       if (oobject4 != null && !p4.isEmpty()) {
          uDouble = h.a.m.get(oobject4);
          if (uDouble != null) {
             return uDouble.doubleValue();
          }
       }
       if (oobject3 != null && !p3.isEmpty()) {
          uDouble = h.a.n.get(oobject3);
          if (uDouble != null) {
             return uDouble.doubleValue();
          }
       }
       uDouble = h.a.o.get(oobject);
       if (uDouble != null) {
          return uDouble.doubleValue();
       }
    }
    public static void g(boolean p0){
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), null, oh, "6")) {
          return;
       }
       if (Build$VERSION.SDK_INT >= 23 && (Runtime.getRuntime().maxMemory() >> 20) - 256 > 0) {
          a.f.getAndSet(p0);
       }
       return;
    }
    public static boolean h(){
       d a = h.a;
       boolean b = (a != null && a.t != null)? true: false;
       return b;
    }
    public static boolean i(){
       d a = h.a;
       boolean b = (a == null || a.G != null)? true: false;
       return b;
    }
    public static boolean j(){
       d a = h.a;
       boolean b = (a != null && a.r != null)? true: false;
       return b;
    }
}
