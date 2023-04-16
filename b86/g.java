package b86.g;
import java.util.concurrent.ConcurrentHashMap;
import b86.b;
import android.os.Handler;
import b86.f;
import b86.e;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import x76.a;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import b86.h;
import java.lang.StringBuilder;
import y76.b;
import u76.a;
import java.lang.Thread;
import java.lang.Throwable;
import u76.a$a;
import w76.a;
import p76.f$d;
import p76.d;
import b86.c;
import java.util.Map;
import b86.d;
import java.util.Objects;
import kotlin.jvm.internal.a;
import android.os.Looper;
import java.util.Set;
import java.util.Map$Entry;
import w76.e;
import java.util.HashMap;
import java.lang.Boolean;
import java.lang.Math;
import java.util.ArrayList;

public final class g	// class@00043e
{
    public static int a = 5;
    public static int b = 10;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final Handler e;
    public static final Handler f;
    public static final ConcurrentHashMap g;
    public static final ConcurrentHashMap h;
    public static final ConcurrentHashMap i;
    public static final ConcurrentHashMap j;
    public static final ConcurrentHashMap k;
    public static final g l;

    static {
       g.l = new g();
       g.c = new ConcurrentHashMap();
       g.d = new ConcurrentHashMap();
       g.e = b.j.a();
       g.f = e.e.a();
       g.g = new ConcurrentHashMap();
       g.h = new ConcurrentHashMap();
       g.i = new ConcurrentHashMap();
       g.j = new ConcurrentHashMap();
       g.k = new ConcurrentHashMap();
    }
    public void g(){
       super();
    }
    public static final List a(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.k.get(Integer.valueOf(p0));
    }
    public static final List b(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.j.get(Integer.valueOf(p0));
    }
    public static final void e(){
       if (PatchProxy.applyVoid(null, null, g.class, "1")) {
          return;
       }
       Iterator iterator = a.d.a().iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          g.i(i);
          g l = g.l;
          l.j(g.j, l.d(i), i);
          l.j(g.k, l.c(i), i);
          a.b.a(new f$d(i));
       }
       return;
    }
    public static final Handler f(){
       return g.e;
    }
    public static final c g(int p0){
       ConcurrentHashMap obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = g.l.c(p0);
       obj = g.d;
       c uoc = obj.get(Integer.valueOf(p0));
       if (uoc == null) {
          uoc = new c(p0);
          obj.put(Integer.valueOf(p0), uoc);
       }
       return uoc;
    }
    public static final d h(int p0){
       ConcurrentHashMap obj;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       p0 = g.l.d(p0);
       obj = g.c;
       d uod = obj.get(Integer.valueOf(p0));
       if (uod == null) {
          uod = new d(p0);
          obj.put(Integer.valueOf(p0), uod);
       }
       return uod;
    }
    public static final h i(int p0){
       ConcurrentHashMap obj;
       Handler handler;
       Handler e;
       Handler handler1;
       ConcurrentHashMap g;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, og, "6");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = g.i;
       h oh = obj.get(Integer.valueOf(p0));
       if (oh == null) {
          g l = g.l;
          Objects.requireNonNull(l);
          if (PatchProxy.isSupport(og)) {
             handler = PatchProxy.applyOneRefs(Integer.valueOf(p0), l, og, "9");
             if (handler != patchProxyRe) {
             label_0065 :
                e = g.e;
                Objects.requireNonNull(l);
                if (PatchProxy.isSupport(og)) {
                   handler1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), l, og, "12");
                   if (handler1 != patchProxyRe) {
                   }else {
                   label_007f :
                      g = g.g;
                      handler1 = g.get(Integer.valueOf(p0));
                      if (handler1 == null) {
                         handler1 = g.g(p0).a();
                         g.put(Integer.valueOf(p0), handler1);
                      }
                   }
                }else {
                   goto label_007f ;
                }
                oh = new h(handler, e, handler1);
                obj.put(Integer.valueOf(p0), oh);
             }
          }
          ConcurrentHashMap h = g.h;
          e = h.get(Integer.valueOf(p0));
          if (e == null) {
             e = g.h(p0).a();
             h.put(Integer.valueOf(p0), e);
          }
          handler = e;
          goto label_0065 ;
       }
       a.o(oh, "mThreadsHandlerMap[chann¡­p[channelId] = it\n      }");
       return oh;
    }
    public static final void k(){
       if (PatchProxy.applyVoid(null, null, g.class, "2")) {
          return;
       }
       int i = 2;
       g.e.getLooper().quit();
       b.e("KgiThreads#singleControlHandler.quit : <-------------++++++++++++++++++!!!!!!!!!", false, i, null);
       g.f.getLooper().quitSafely();
       b.e("KgiThreads#singleStoreHandler.quitSafely : <-------------++++++++++++++++++!!!!!!!!!", false, i, null);
       Iterator iterator = g.d.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().d();
       }
       g.d.clear();
       g.g.clear();
       g.k.clear();
       iterator = g.c.entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().d();
       }
       g.c.clear();
       g.h.clear();
       g.j.clear();
       g.i.clear();
       return;
    }
    public final int c(int p0){
       Integer obj;
       e e;
       boolean b1;
       e uoe = e.class;
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "10");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = a.d.a().size();
       e = e.e;
       Objects.requireNonNull(e);
       Object[] objArray = null;
       Object obj1 = PatchProxy.apply(objArray, e, uoe, "5");
       int i1 = (obj1 != PatchProxyResult.class)? obj1.intValue(): e.b.size();
       int i2 = 0;
       if (i1 > i) {
          return i2;
       }else {
          int b = g.b;
          int i3 = 1;
          if (b < i3) {
             b = 1;
          }
          int i4 = 2;
          if (b != i3) {
             if (b != i4) {
                if (!i1 || i1 == i) {
                   i3 = b;
                }else {
                   obj = Integer.valueOf(((i * b) / i1));
                   if (obj.intValue() > 0) {
                      i2 = 1;
                   }
                   if (i2) {
                      objArray = obj;
                   }
                   if (objArray != null) {
                      i3 = objArray.intValue();
                   }
                   i3 = b - i3;
                }
             }else if(!i1 || i1 == i){
                i3 = 2;
             }
          }
          b = b - i3;
          Objects.requireNonNull(e);
          if (PatchProxy.isSupport(uoe)) {
             Object obj2 = PatchProxy.applyOneRefs(Integer.valueOf(p0), e, uoe, "6");
             if (obj2 != PatchProxyResult.class) {
                b1 = obj2.booleanValue();
             label_00a0 :
                i3 = (b1 && b > 0)? i3 + (p0 % i1): p0 % i3;
                return i3;
             }
          }
          b1 = e.b.containsKey(Integer.valueOf(p0));
          goto label_00a0 ;
       }
    }
    public final int d(int p0){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, og, "7");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int a = g.a;
       if (a < 1) {
          a = 1;
       }
       return Math.abs((p0 % a));
    }
    public final void j(ConcurrentHashMap p0,int p1,int p2){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g.class, "3")) {
          return;
       }
       List list = p0.get(Integer.valueOf(p1));
       if (list == null) {
          list = new ArrayList();
          p0.put(Integer.valueOf(p1), list);
       }
       a.o(list, "this[threadId] ?: \(Array\x20\x02 { this[threadId] = it }\)\x00");
       list.add(Integer.valueOf(p2));
       return;
    }
}
