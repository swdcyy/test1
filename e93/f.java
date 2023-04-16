package e93.f;
import java.util.PriorityQueue;
import e93.f$e;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import e93.f$b;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Collection;
import java.util.Map;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.lang.Integer;
import pp.c;
import com.kuaishou.android.live.log.b;
import ec3.f;
import java.util.Iterator;
import java.lang.Iterable;
import ekd.k1;
import java.util.Set;
import java.util.Map$Entry;
import kotlin.jvm.internal.a;
import o56.a;
import java.lang.Long;
import java.lang.System;
import android.os.Trace;
import qrd.l1;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.Pair;
import qrd.r0;
import java.lang.Number;
import e93.f$a;
import e93.f$c;
import com.google.gson.JsonObject;
import e93.f$d;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import w51.a;
import java.lang.Boolean;
import o56.c;
import xf6.l;
import java.lang.CharSequence;
import e17.i;

public final class f	// class@0026c1
{
    public static final PriorityQueue a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final f d;

    static {
       f.d = new f();
       f.a = new PriorityQueue(20, f$e.b);
       f.b = new ConcurrentHashMap();
       f.c = new ConcurrentHashMap();
    }
    public void f(){
       super();
    }
    public static final ConcurrentHashMap a(f p0){
       return f.b;
    }
    public static final ConcurrentHashMap b(f p0){
       return f.c;
    }
    public static final Runnable c(String p0,Runnable p1){
       f$b obj = PatchProxy.applyTwoRefs(p0, p1, null, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f$b(p0, p1);
       ConcurrentHashMap b = f.b;
       CopyOnWriteArrayList uCopyOnWrite = b.get(p1);
       LiveLiteLogTag liveLiteLogT = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: null;
       if (liveLiteLogT) {
          uCopyOnWrite = new CopyOnWriteArrayList();
          b.put(p1, uCopyOnWrite);
       }
       uCopyOnWrite.add(obj);
       if (SystemUtil.K()) {
          b.d0(LiveLiteLogTag.LIVE_LITE_TASK, "getActionWrapper", "actionMapValue.size", Integer.valueOf(uCopyOnWrite.size()), "name", p0);
       }
       return obj;
    }
    public static final void f(Runnable p0){
       Iterator iterator;
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "6")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (f.c()) {
          CopyOnWriteArrayList uCopyOnWrite = f.b.get(p0);
          boolean b = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? true: false;
          if (!b) {
             iterator = uCopyOnWrite.iterator();
             while (iterator.hasNext()) {
                k1.m(iterator.next());
             }
          }
          f.b.remove(p0);
          iterator = f.c.entrySet().iterator();
          while (iterator.hasNext()) {
             iterator.next().getValue().remove(p0);
          }
          Iterator iterator1 = f.c.entrySet().iterator();
          while (iterator1.hasNext()) {
             if (iterator1.next().getValue().isEmpty()) {
                iterator1.remove();
             }
          }
       }else {
          k1.m(p0);
       }
       return;
    }
    public static final void g(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, f.class, "7")) {
          return;
       }
       a.p(p0, "token");
       if (f.c()) {
          k1.n(p0);
          CopyOnWriteArrayList uCopyOnWrite = f.c.get(p0);
          boolean b = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? true: false;
          if (!b) {
             Iterator iterator = uCopyOnWrite.iterator();
             while (iterator.hasNext()) {
                f.b.remove(iterator.next());
             }
             f.c.remove(p0);
          }
          if (a.d() && SystemUtil.K()) {
             b.d0(LiveLiteLogTag.LIVE_LITE_TASK, "removeUiThreadCallbacksWithToken", "actionMap.size", Integer.valueOf(f.b.size()), "tokenMap.size", Integer.valueOf(f.c.size()));
          }
       }else {
          k1.n(p0);
       }
       return;
    }
    public static final void h(String p0,Runnable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "1")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "action");
       if (f.c()) {
          k1.o(f.c(p0, p1));
       }else {
          k1.o(p1);
       }
       return;
    }
    public static final void i(String p0,Runnable p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, f.class, "2")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "action");
       a.p(p2, "token");
       if (f.c()) {
          k1.p(f.d.d(p0, p1, p2), p2);
       }else {
          k1.p(p1, p2);
       }
       return;
    }
    public static final void j(String p0,Runnable p1,long p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Long.valueOf(p2), null, f.class, "4")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "action");
       if (f.c()) {
          k1.r(f.c(p0, p1), p2);
       }else {
          k1.r(p1, p2);
       }
       return;
    }
    public static final void k(String p0,Runnable p1,Object p2,long p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Long.valueOf(p3), null, f.class, "5")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "action");
       a.p(p2, "token");
       if (f.c()) {
          k1.s(f.d.d(p0, p1, p2), p2, p3);
       }else {
          k1.s(p1, p2, p3);
       }
       return;
    }
    public static final void l(String p0,Runnable p1){
       float f;
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, f.class, "10")) {
          return;
       }
       Trace.beginSection(p0);
       int i = 1;
       int i1 = 0;
       int i2 = 2;
       p1.run();
       l1 a = l1.a;
       Trace.endSection();
       f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[i2];
             objArray[i1] = p0;
             objArray[i] = Float.valueOf(f);
             str1 = String.format(str1, Arrays.copyOf(objArray, i2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[i2];
          objArray[i1] = p0;
          objArray[i] = Float.valueOf(f);
          str1 = String.format(str1, Arrays.copyOf(objArray, i2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       long l = r0.a(Long.valueOf((long)f), a).getFirst().longValue();
       if (l - (long)5 > 0) {
          PriorityQueue a1 = f.a;
          if (a1.size() >= 20) {
             Object obj = a1.peek();
             a.m(obj);
             if (obj.a() - l < 0) {
                a1.poll();
             }
          }
          a1.add(new f$a(p0, l));
       }
       b.d0(LiveLiteLogTag.LIVE_LITE_TASK, "runOnUiThread", "name", p0, "costTimeMs", Long.valueOf(l));
       return;
    }
    public final Runnable d(String p0,Runnable p1,Object p2){
       ConcurrentHashMap obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       f$c uoc = new f$c(p0, p1, p2);
       obj = f.b;
       CopyOnWriteArrayList uCopyOnWrite = obj.get(p1);
       String str = null;
       CopyOnWriteArrayList uCopyOnWrite1 = (uCopyOnWrite == null || uCopyOnWrite.isEmpty())? 1: null;
       if (uCopyOnWrite1) {
          uCopyOnWrite = new CopyOnWriteArrayList();
          obj.put(p1, uCopyOnWrite);
       }
       uCopyOnWrite.add(uoc);
       obj = f.c;
       uCopyOnWrite1 = obj.get(p2);
       if (uCopyOnWrite1 == null || uCopyOnWrite1.isEmpty()) {
          str = 1;
       }
       if (str) {
          uCopyOnWrite1 = new CopyOnWriteArrayList();
          obj.put(p2, uCopyOnWrite1);
       }
       uCopyOnWrite1.add(p1);
       if (SystemUtil.K()) {
          b.f0(LiveLiteLogTag.LIVE_LITE_TASK, "getActionWrapper", "actionMapValue.size", Integer.valueOf(uCopyOnWrite.size()), "tokenMapValue.size", Integer.valueOf(uCopyOnWrite1.size()), "name", p0, "token", p2);
       }
       return uoc;
    }
    public final JsonObject e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       JsonObject obj = PatchProxy.apply(objArray, this, f.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new JsonObject();
       Iterator iterator = CollectionsKt___CollectionsKt.f5(f.a, new f$d()).iterator();
       boolean b = false;
       int i = 0;
       while (iterator.hasNext()) {
          Object obj1 = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("Name", obj1.a);
          jsonObject.a0("Duration", Long.valueOf(obj1.a()));
          obj.G("Top"+i1, jsonObject);
          i = i1;
       }
       f.a.clear();
       String str = "task cost time top "+obj;
       b.Z(LiveLiteLogTag.LIVE_LITE_TASK, str);
       if (a.d()) {
          Object obj2 = PatchProxy.apply(objArray, objArray, a.class, "20");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(a.a().c() && l.c("enableLitePerfToast", b)){
             b = 1;
          }
          b1 = b;
          if (b1) {
             i.d(R.style.arg_RES_7f110668, str);
          }
       }
       return obj;
    }
}
