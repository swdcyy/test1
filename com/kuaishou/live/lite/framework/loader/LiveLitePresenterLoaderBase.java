package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import msd.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$a;
import android.content.Context;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Trace;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Iterator;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import b93.d;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.util.Map;
import ec3.j;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import java.lang.Boolean;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$InitStep;
import gb3.b;
import java.lang.Enum;
import android.view.View;
import java.lang.Number;
import d93.a;
import d93.b;
import c93.d;
import c93.b;
import android.os.SystemClock;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$a;
import java.util.Comparator;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2;

public abstract class LiveLitePresenterLoaderBase	// class@00092b
{
    public final long a;
    public final List b;
    public final Map c;
    public long d;
    public long e;
    public long f;
    public final String g;

    public void LiveLitePresenterLoaderBase(String p0){
       a.p(p0, "name");
       super();
       this.g = p0;
       this.a = a.t().u("SOURCE_LIVE").b("liveLiteTwoPhaseLoadTimeOutDuration", 0);
       this.b = new ArrayList();
       this.c = new LinkedHashMap();
    }
    public static LiveLiteAdapterPlugin$a d(LiveLitePresenterLoaderBase p0,String p1,LiveLiteAdapterPlugin$ScatterPriority p2,a p3,int p4,Object p5){
       p2 = (p4 & 0x02)? LiveLiteAdapterPlugin$ScatterPriority.Default: null;
       return p0.c(p1, p2, p3);
    }
    public abstract List a(Context p0);
    public void b(){
       l1 a;
       long l1;
       Object[] objArray2;
       Object obj = this;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, obj, LiveLitePresenterLoaderBase.class, "7")) {
          return;
       }
       String str2 = "::destroy";
       String str3 = obj.g+str2;
       long l = System.nanoTime();
       Trace.beginSection(str3);
       float f = 1000000.00f;
       Iterator iterator = CollectionsKt___CollectionsKt.G4(obj.b).iterator();
       while (iterator.hasNext()) {
          LiveLitePresenterLoaderBase$b uob = iterator.next();
          String simpleName = uob.a().getClass().getSimpleName();
          a.o(simpleName, "javaClass.simpleName");
          String str4 = StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName, "LiveLite"), "Presenter")+str2;
          Trace.beginSection(str4);
          uob.a().destroy();
          a = l1.a;
          Trace.endSection();
          l1 = System.nanoTime() - System.nanoTime();
          float f1 = (float)l1 / f;
          if (f.b()) {
             if (SystemUtil.K()) {
                Object[] objArray = new Object[]{str4,Float.valueOf(f1)};
                String str5 = String.format(str1, Arrays.copyOf(objArray, 2));
                a.o(str5, str);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str5);
             }
          }else {
             Object[] objArray1 = new Object[]{str4,Float.valueOf(f1)};
             str4 = String.format(str1, Arrays.copyOf(objArray1, 2));
             a.o(str4, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str4);
          }
          r0.a(Long.valueOf((long)f1), a).getSecond();
          f = 1000000.00f;
       }
       l1 a1 = l1.a;
       Trace.endSection();
       float f2 = (float)(System.nanoTime() - l) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray2 = new Object[]{str3,Float.valueOf(f2)};
             str1 = String.format(str1, Arrays.copyOf(objArray2, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray2 = new Object[]{str3,Float.valueOf(f2)};
          str1 = String.format(str1, Arrays.copyOf(objArray2, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f2), a1).getSecond();
       return;
    }
    public final LiveLiteAdapterPlugin$a c(String p0,LiveLiteAdapterPlugin$ScatterPriority p1,a p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveLitePresenterLoaderBase.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       a.p(p1, "scatterPriority");
       a.p(p2, "factory");
       return new LiveLiteAdapterPlugin$a(p0, p1, p2);
    }
    public final Collection e(){
       Object obj = PatchProxy.apply(null, this, LiveLitePresenterLoaderBase.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.values();
    }
    public final long f(){
       return this.a;
    }
    public final String g(){
       return this.g;
    }
    public final List h(){
       return this.b;
    }
    public final j i(String p0){
       LiveLitePresenterLoaderBase obj = PatchProxy.applyOneRefs(p0, this, LiveLitePresenterLoaderBase.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       j oj = obj.get(p0);
       if (oj == null) {
          j oj1 = new j(p0, 0, 0, 0, 0);
          obj.put(p0, oj);
       }
       return oj;
    }
    public boolean j(Activity p0,LifecycleOwner p1,e p2,LiveLiteModelManager p3,c p4){
       LiveLitePresenterLoaderBase liveLitePres = LiveLitePresenterLoaderBase.class;
       if (PatchProxy.isSupport(liveLitePres)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, liveLitePres, "5");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       a.p(p1, "parentLifecycle");
       a.p(p2, "presenterRegistry");
       a.p(p3, "modelManager");
       a.p(p4, "serviceManager");
       return 0;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterLoaderBase.class, "4")) {
          return;
       }
       if (SystemUtil.K() && !f.b()) {
          String str = "";
          Iterator iterator = this.b.iterator();
          while (iterator.hasNext()) {
             LiveLitePresenterLoaderBase$b uob = iterator.next();
             str = str+"Presenter:"+uob;
             String str1 = "append\(value\)";
             a.o(str, str1);
             str = str+10;
             a.o(str, "append\(\'\\n\'\)");
             str = str+"    provide: "+uob.a().s;
             a.o(str, str1);
             str = str+10;
             a.o(str, "append\(\'\\n\'\)");
             str = str+"    inject model: "+uob.a().t;
             a.o(str, str1);
             str = str+10;
             a.o(str, "append\(\'\\n\'\)");
             str = str+"    inject service: "+uob.a().u;
             a.o(str, str1);
             str = str+10;
             a.o(str, "append\(\'\\n\'\)");
             str = str+10;
             a.o(str, "append\(\'\\n\'\)");
          }
          str = str;
          a.o(str, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "loaded presenters\n"+str);
       }
       return;
    }
    public final void l(LiveLitePresenterLoaderBase$InitStep p0,Activity p1,e p2,LiveLiteModelManager p3,c p4,d p5){
       String str;
       l1 a;
       float f;
       Object[] objArray2;
       LiveLitePresenterLoaderBase liveLitePres = LiveLitePresenterLoaderBase.class;
       int i = 4;
       if (PatchProxy.isSupport(liveLitePres)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, liveLitePres, "6")) {
             return;
          }
       }
       a.p(p0, "step");
       a.p(p1, "activity");
       a.p(p2, "presenterRegistry");
       a.p(p3, "modelManager");
       a.p(p4, "serviceManager");
       a.p(p5, "presenter");
       String simpleName = p5.getClass().getSimpleName();
       a.o(simpleName, "javaClass.simpleName");
       simpleName = StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName, "LiveLite"), "Presenter");
       int i1 = b.a[p0.ordinal()];
       if (i1 != 1) {
          if (i1 != 2) {
             if (i1 != 3) {
                if (i1 == i) {
                   str = simpleName+"::Create";
                   Trace.beginSection(str);
                   p5.f(new View(p1));
                   Object[] objArray1 = new Object[]{new Object()};
                   p5.i(objArray1);
                   a = l1.a;
                   Trace.endSection();
                   f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
                   if (f.b()) {
                      if (SystemUtil.K()) {
                         objArray2 = new Object[]{str,Float.valueOf(f)};
                         str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                         a.o(str, "java.lang.String.format\(format, *args\)");
                         b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                      }
                   }else {
                      objArray2 = new Object[]{str,Float.valueOf(f)};
                      str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                      a.o(str, "java.lang.String.format\(format, *args\)");
                      b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                   }
                   f.e = r0.a(Long.valueOf((long)f), a).getFirst().longValue();
                }
             }else {
                str = simpleName+"::InjectService";
                Trace.beginSection(str);
                p5.S8(p4, p2);
                a = l1.a;
                Trace.endSection();
                f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
                if (f.b()) {
                   if (SystemUtil.K()) {
                      objArray2 = new Object[]{str,Float.valueOf(f)};
                      str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                      a.o(str, "java.lang.String.format\(format, *args\)");
                      b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                   }
                }else {
                   objArray2 = new Object[]{str,Float.valueOf(f)};
                   str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                   a.o(str, "java.lang.String.format\(format, *args\)");
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                }
                this.i(simpleName).g(r0.a(Long.valueOf((long)f), a).getFirst().longValue());
             }
          }else {
             str = simpleName+"::Register";
             Trace.beginSection(str);
             p5.V8(p4, p2);
             a = l1.a;
             Trace.endSection();
             f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
             if (f.b()) {
                if (SystemUtil.K()) {
                   objArray2 = new Object[]{str,Float.valueOf(f)};
                   str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                   a.o(str, "java.lang.String.format\(format, *args\)");
                   b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
                }
             }else {
                objArray2 = new Object[]{str,Float.valueOf(f)};
                str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                a.o(str, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
             }
             f.c = r0.a(Long.valueOf((long)f), a).getFirst().longValue();
          }
       }else {
          str = simpleName+"::InjectModel";
          Trace.beginSection(str);
          p5.R8(new d(p3), p2);
          a = l1.a;
          Trace.endSection();
          f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
          if (f.b()) {
             if (SystemUtil.K()) {
                objArray2 = new Object[]{str,Float.valueOf(f)};
                str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
                a.o(str, "java.lang.String.format\(format, *args\)");
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
             }
          }else {
             objArray2 = new Object[]{str,Float.valueOf(f)};
             str = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
             a.o(str, "java.lang.String.format\(format, *args\)");
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
          }
          this.i(simpleName).g(r0.a(Long.valueOf((long)f), a).getFirst().longValue());
       }
       return;
    }
    public final void m(Activity p0,LifecycleOwner p1,e p2,LiveLiteModelManager p3,c p4){
       int i2;
       Object[] objArray1;
       l1 a;
       Object[] objArray2;
       String str2;
       long l = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       LiveLitePresenterLoaderBase liveLitePres = LiveLitePresenterLoaderBase.class;
       int i = 2;
       int i1 = 1;
       if (PatchProxy.isSupport(liveLitePres)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, l, liveLitePres, "3")) {
             return;
          }
       }
       a.p(oobject, "activity");
       a.p(oobject1, "parentLifecycle");
       a.p(oobject2, "presenterRegistry");
       a.p(oobject3, "modelManager");
       a.p(oobject4, "serviceManager");
       l.d = SystemClock.elapsedRealtime();
       String str = "Create"+l.g+"FactoryList";
       long l1 = System.nanoTime();
       Trace.beginSection(str);
       List list = this.a(p0);
       LiveLiteAdapterPlugin$a obj = PatchProxy.apply(null, l, liveLitePres, "2");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.t().u("SOURCE_LIVE").d("enableListScatterPriority", i1);
       if (b) {
          list = CollectionsKt___CollectionsKt.f5(list, new LiveLitePresenterLoaderBase$a());
       }
       Trace.endSection();
       float f = (float)(System.nanoTime() - l1) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             i2 = 2;
             objArray1 = new Object[i2];
             objArray1[0] = str;
             objArray1[i1] = Float.valueOf(f);
             str = String.format("%s - %.3fms", Arrays.copyOf(objArray1, i2));
             a.o(str, "java.lang.String.format\(format, *args\)");
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
          }
       }else {
          i2 = 2;
          objArray1 = new Object[i2];
          objArray1[0] = str;
          objArray1[i1] = Float.valueOf(f);
          str = String.format("%s - %.3fms", Arrays.copyOf(objArray1, i2));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str);
       }
       Object obj1 = r0.a(Long.valueOf((long)f), list).getSecond();
       String str1 = l.g+"FactoryList.addInitTask";
       long l2 = System.nanoTime();
       Trace.beginSection(str1);
       Iterator iterator = obj1.iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          str = obj.a();
          LiveLiteAdapterPlugin$ScatterPriority scatterPrior = obj.b();
          a uoa = obj.c();
          LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1 oscheduleLoa = list;
          LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1 oscheduleLoa1 = list;
          oscheduleLoa = new LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1(str, uoa, scatterPrior, this, obj1, p2);
          l.n(str+"::Init", oscheduleLoa1);
          i1 = 1;
       }
       a = l1.a;
       Trace.endSection();
       f = (float)(System.nanoTime() - l2) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray2 = new Object[]{str1,Float.valueOf(f)};
             str2 = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
             a.o(str2, "java.lang.String.format\(format, *args\)");
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
          }
       }else {
          objArray2 = new Object[]{str1,Float.valueOf(f)};
          str2 = String.format("%s - %.3fms", Arrays.copyOf(objArray2, 2));
          a.o(str2, "java.lang.String.format\(format, *args\)");
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
       }
       r0.a(Long.valueOf((long)f), a).getSecond();
       if (this.j(p0, p1, p2, p3, p4)) {
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "scheduleLoadTasks interceptLoadTasksScheduling");
       }else {
          LiveLitePresenterLoaderBase$scheduleLoadTasks$2 oscheduleLoa2 = new LiveLitePresenterLoaderBase$scheduleLoadTasks$2(this, p1, p0, p2, p3, p4);
          l.n("InitStep", a);
       }
       return;
    }
    public abstract void n(String p0,a p1);
}
