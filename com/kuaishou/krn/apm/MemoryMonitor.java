package com.kuaishou.krn.apm.MemoryMonitor;
import ji0.a;
import com.kuaishou.krn.apm.MemoryMonitor$mProducers$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.krn.apm.MemoryMonitor$mLazyMaxJvmHeapSize$2;
import com.kuaishou.krn.apm.MemoryMonitor$mLazyMaxRamSize$2;
import com.kuaishou.krn.apm.MemoryMonitor$mAllInstancesMemoryInfo$2;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ji0.a$b;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Number;
import com.kuaishou.krn.apm.MemoryEventProducer;
import java.util.Objects;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import com.kuaishou.krn.instance.JsFramework;
import java.util.List;
import sj0.b;
import com.kuaishou.krn.apm.MemoryEventProducer$updateMemoryEvent$1;
import com.kuaishou.krn.apm.MemoryEventTiming;
import java.lang.Integer;
import msd.l;
import ji0.a$b$b;
import ji0.a$b$a;
import jk0.b;
import jk0.c;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import fk0.a;
import hi0.a;
import com.kuaishou.krn.apm.CoreMemoryInfo;
import hi0.a$a;
import kotlin.jvm.internal.a;
import com.kuaishou.krn.apm.V8MemoryInfo;
import com.kuaishou.krn.apm.CoreUIViewInfo;
import com.kuaishou.krn.apm.CoreUIMemoryInfo;
import java.util.Collection;
import java.util.HashMap;
import java.lang.Iterable;
import java.lang.Long;
import trd.t0;
import android.app.ActivityManager$MemoryInfo;
import com.kuaishou.krn.apm.MemoryMonitor$getAvailableMemory$1;
import android.os.Handler;
import com.kuaishou.krn.apm.MemoryMonitor$a;
import java.lang.Runnable;
import com.kuaishou.krn.apm.KdsMemoryInfo;
import java.lang.StringBuilder;
import android.os.Process;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.Reader;
import wsd.m;
import kotlin.io.TextStreamsKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import qrd.l1;
import java.io.Closeable;
import java.lang.Throwable;
import isd.b;
import android.os.Debug$MemoryInfo;
import android.os.Debug;
import com.kuaishou.krn.experiment.ExpConfigKt;
import android.os.SystemClock;
import com.kuaishou.krn.apm.MemoryMonitor$postMemoryEvent$1;
import ekd.k1;
import com.kuaishou.krn.apm.MemoryMonitor$b;

public final class MemoryMonitor extends a	// class@0007d3
{
    public static final p h;
    public static final p i;
    public static final p j;
    public static final p k;
    public static l l;
    public static final MemoryMonitor m;

    static {
       MemoryMonitor.m = new MemoryMonitor();
       MemoryMonitor.h = s.c(MemoryMonitor$mProducers$2.INSTANCE);
       MemoryMonitor.i = s.c(MemoryMonitor$mLazyMaxJvmHeapSize$2.INSTANCE);
       MemoryMonitor.j = s.c(MemoryMonitor$mLazyMaxRamSize$2.INSTANCE);
       MemoryMonitor.k = s.c(MemoryMonitor$mAllInstancesMemoryInfo$2.INSTANCE);
    }
    public void MemoryMonitor(){
       super();
    }
    public Object call(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$b$b uob$b = PatchProxy.apply(null, this, MemoryMonitor.class, "9");
       if (uob$b != patchProxyRe) {
       }else {
          Iterator iterator = this.i().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             int i = uEntry.getKey().intValue();
             MemoryEventProducer value = uEntry.getValue();
             Objects.requireNonNull(value);
             KrnInternalManager obj = PatchProxy.apply(null, value, MemoryEventProducer.class, "3");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = KrnInternalManager.c;
                if (!obj.b().d(JsFramework.REACT).contains(value.c) && !obj.b().d(JsFramework.VUE).contains(value.c)) {
                   b = false;
                }else {
                   MemoryEventProducer c = value.c;
                   MemoryMonitor.m.k(c, null, c.e(), true, new MemoryEventProducer$updateMemoryEvent$1(value), MemoryEventTiming.PAUSE);
                   b = true;
                }
             }
             if (!b) {
                this.i().remove(Integer.valueOf(i));
             }
          }
          a$b$b a = (this.i().isEmpty())? a$b$b.a: a$b$a.a;
          uob$b = a;
       }
       return uob$b;
    }
    public final boolean e(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.a().y();
    }
    public final Map f(){
       Pair pair;
       short i2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Iterator obj = PatchProxy.apply(null, this, MemoryMonitor.class, "21");
       if (obj != patchProxyRe) {
          return obj;
       }
       ArrayList uArrayList = new ArrayList();
       obj = this.h().entrySet().iterator();
       while (obj.hasNext()) {
          Map$Entry uEntry = obj.next();
          b uob = uEntry.getKey().get();
          if (uob != null) {
             a uoa = uob.a();
             if (uoa != null) {
                uoa = uoa.bundleId;
                if (uoa != null) {
                label_004a :
                   a$a a = a.a;
                   CoreMemoryInfo value = uEntry.getValue();
                   Objects.requireNonNull(a);
                   a uoa1 = PatchProxy.applyOneRefs(value, a, a$a.class, "1");
                   if (uoa1 != patchProxyRe) {
                   }else {
                      a.p(value, "coreMemoryInfo");
                      uoa1 = new a();
                      CoreMemoryInfo v8MemoryInfo = value.v8MemoryInfo;
                      int i = 1024;
                      if (v8MemoryInfo != null) {
                         int i1 = v8MemoryInfo.totalPhysicalSize / i;
                         uoa1.totalPhysicalSize = (short)i1;
                         i2 = v8MemoryInfo.totalHeapSize / i;
                         uoa1.totalHeapSize = (short)i2;
                      }
                      v8MemoryInfo = value.uiViewInfo;
                      if (v8MemoryInfo != null) {
                         uoa1.maxLayoutDepth = (short)v8MemoryInfo.maxLayoutDepth;
                         uoa1.maxViewCounts = (short)v8MemoryInfo.maxViewCounts;
                      }
                      value = value.uiMemoryInfo;
                      if (value != null) {
                         i2 = 0;
                         Collection uCollection = value.imageMemory.values();
                         a.o(uCollection, "it.imageMemory.values");
                         Iterator iterator = uCollection.iterator();
                         while (iterator.hasNext()) {
                            long l = iterator.next().longValue() / (long)i;
                            i2 = i2 + (short)(int)l;
                            i2 = (short)i2;
                         }
                         uoa1.totalImageMemory = i2;
                      }
                   }
                   pair = new Pair(uoa, uoa1);
                }
             }
             String str = "unknown";
             goto label_004a ;
          }else {
             pair = null;
          }
          if (pair != null) {
             uArrayList.add(pair);
          }
       }
       return t0.B0(uArrayList);
    }
    public final ActivityManager$MemoryInfo g(l p0){
       ActivityManager$MemoryInfo memoryInfo;
       MemoryMonitor$getAvailableMemory$1 obj = PatchProxy.applyOneRefs(p0, this, MemoryMonitor.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = MemoryMonitor$getAvailableMemory$1.INSTANCE;
       if (p0 != null) {
          this.b().post(new MemoryMonitor$a(p0));
          memoryInfo = null;
       }else {
          memoryInfo = obj.invoke();
       }
       return memoryInfo;
    }
    public final Map h(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemoryMonitor.k.getValue();
    }
    public final Map i(){
       Object obj = PatchProxy.apply(null, this, MemoryMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MemoryMonitor.h.getValue();
    }
    public final KdsMemoryInfo j(){
       KdsMemoryInfo kdsMemoryInf;
       List list;
       int i;
       Number number;
       boolean b;
       MemoryMonitor memoryMonito = MemoryMonitor.class;
       MemoryMonitor obj = PatchProxy.apply(null, this, memoryMonito, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          kdsMemoryInf = new KdsMemoryInfo();
          obj = MemoryMonitor.m;
          Objects.requireNonNull(obj);
          list = PatchProxy.apply(null, obj, memoryMonito, "15");
          i = 1;
          number = 2;
          if (list != PatchProxyResult.class) {
          }else {
             String str = "/proc/"+Process.myPid()+"/statm";
             ArrayList uArrayList = new ArrayList();
             FileReader uFileReader = new FileReader(str);
             m om = 8192;
             if (uFileReader instanceof BufferedReader) {
             }else {
                uFileReader = new BufferedReader(uFileReader, om);
             }
             String[] stringArray = new String[]{" "};
             list = StringsKt__StringsKt.H4(SequencesKt___SequencesKt.f0(TextStreamsKt.h(uFileReader), 0), stringArray, false, 0, 6, null);
             if (list.size() >= number) {
                uArrayList.add(Integer.valueOf(Integer.parseInt(list.get(0))));
                uArrayList.add(Integer.valueOf(Integer.parseInt(list.get(i))));
             }
             b.a(uFileReader, null);
             list = uArrayList;
          }
       }catch(java.lang.Exception e0){
       }
       if (list.size() == number) {
          kdsMemoryInf.b = list.get(0).intValue();
          kdsMemoryInf.c = list.get(i).intValue();
          obj = MemoryMonitor.m;
          if (obj.e()) {
             Debug.getMemoryInfo(kdsMemoryInf);
          }
          Objects.requireNonNull(obj);
          Boolean obj1 = PatchProxy.apply(null, obj, memoryMonito, "24");
          b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): c.a().N();
          if (b) {
             Debug.getMemoryInfo(kdsMemoryInf);
          }else {
             obj1 = PatchProxy.apply(null, null, ExpConfigKt.class, "11");
             if (obj1 == PatchProxyResult.class) {
                obj1 = ExpConfigKt.k.getValue();
             }
             if (obj1.booleanValue() || obj.e()) {
                kdsMemoryInf.dalvikPss = (int)Debug.getPss();
             }
          }
       }
       return kdsMemoryInf;
    }
    public final void k(b p0,Integer p1,String p2,boolean p3,l p4,MemoryEventTiming p5){
       object oobject = p0;
       object oobject1 = p2;
       object oobject2 = p4;
       object oobject3 = p5;
       MemoryMonitor memoryMonito = MemoryMonitor.class;
       if (PatchProxy.isSupport(memoryMonito)) {
          Object[] objArray = new Object[]{oobject,p1,oobject1,Boolean.valueOf(p3),oobject2,oobject3};
          if (PatchProxy.applyVoid(objArray, this, memoryMonito, "8")) {
             return;
          }
       }else {
          int i = this;
       }
       a.p(p2, "id");
       a.p(oobject2, "block");
       a.p(oobject3, "timing");
       if (this.c() && this.d()) {
          MemoryMonitor$postMemoryEvent$1 opostMemoryE = new MemoryMonitor$postMemoryEvent$1(p0, p1, p2, p3, SystemClock.elapsedRealtime(), p4, new WeakReference(p0), p5);
          k1.o(v11);
       }
       return;
    }
    public final void l(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MemoryMonitor.class, "27")) {
          return;
       }
       this.b().post(new MemoryMonitor$b(p0));
       return;
    }
}
