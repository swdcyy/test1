package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import androidx.lifecycle.LifecycleOwner;
import android.app.Activity;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Trace;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import b93.d;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$1;
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
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$2;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$4;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$5;

public final class LiveLitePresenterLoaderBase$scheduleLoadTasks$2 extends Lambda implements a	// class@00092a
{
    public final Activity $activity;
    public final LiveLiteModelManager $modelManager;
    public final LifecycleOwner $parentLifecycle;
    public final e $presenterRegistry;
    public final c $serviceManager;
    public final LiveLitePresenterLoaderBase this$0;

    public void LiveLitePresenterLoaderBase$scheduleLoadTasks$2(LiveLitePresenterLoaderBase p0,LifecycleOwner p1,Activity p2,e p3,LiveLiteModelManager p4,c p5){
       this.this$0 = p0;
       this.$parentLifecycle = p1;
       this.$activity = p2;
       this.$presenterRegistry = p3;
       this.$modelManager = p4;
       this.$serviceManager = p5;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       String simpleName;
       l1 a;
       Object[] objArray;
       long l1;
       LiveLitePresenterLoaderBase$b uob1;
       Object[] objArray1;
       Object[] objArray2;
       LiveLitePresenterLoaderBase$b uob2;
       String simpleName3;
       int i2;
       Object obj = this;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, obj, LiveLitePresenterLoaderBase$scheduleLoadTasks$2.class, "1")) {
          return;
       }
       String str2 = obj.this$0.g()+"FactoryList.addLifecycleTask";
       long l = System.nanoTime();
       Trace.beginSection(str2);
       float f = 1000000.00f;
       int i = 0;
       int i1 = 2;
       Iterator iterator = obj.this$0.h().iterator();
       String str3 = "Presenter";
       while (iterator.hasNext()) {
          LiveLitePresenterLoaderBase$b uob = iterator.next();
          simpleName = uob.a().getClass().getSimpleName();
          a.o(simpleName, "javaClass.simpleName");
          obj.this$0.n(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName, "LiveLite"), str3), new LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$1(uob, obj));
       }
       a = l1.a;
       Trace.endSection();
       float f1 = (float)(System.nanoTime() - l) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[i1];
             objArray[i] = str2;
             objArray[1] = Float.valueOf(f1);
             str2 = String.format(str1, Arrays.copyOf(objArray, i1));
             a.o(str2, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
          }
       }else {
          objArray = new Object[i1];
          objArray[i] = str2;
          objArray[1] = Float.valueOf(f1);
          str2 = String.format(str1, Arrays.copyOf(objArray, i1));
          a.o(str2, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
       }
       r0.a(Long.valueOf((long)f1), a).getSecond();
       str2 = "FactoryList.addInjectTask";
       String str4 = obj.this$0.g()+str2;
       l1 = System.nanoTime();
       Trace.beginSection(str4);
       iterator = obj.this$0.h().iterator();
       while (iterator.hasNext()) {
          uob1 = iterator.next();
          String simpleName1 = uob1.a().getClass().getSimpleName();
          a.o(simpleName1, "javaClass.simpleName");
          obj.this$0.n(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName1, "LiveLite"), str3)+"::InjectModel", new LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$2(uob1, obj));
          r0 or0 = null;
       }
       a = l1.a;
       Trace.endSection();
       float f2 = (float)(System.nanoTime() - l1) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray1 = new Object[i1];
             objArray1[0] = str4;
             objArray1[1] = Float.valueOf(f2);
             str4 = String.format(str1, Arrays.copyOf(objArray1, i1));
             a.o(str4, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str4);
          }
       }else {
          objArray1 = new Object[i1];
          objArray1[0] = str4;
          objArray1[1] = Float.valueOf(f2);
          str4 = String.format(str1, Arrays.copyOf(objArray1, i1));
          a.o(str4, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str4);
       }
       r0.a(Long.valueOf((long)f2), a).getSecond();
       str4 = obj.this$0.g()+"FactoryList.addRegisterTask";
       long l2 = System.nanoTime();
       Trace.beginSection(str4);
       iterator = obj.this$0.h().iterator();
       while (iterator.hasNext()) {
          uob1 = iterator.next();
          String simpleName2 = uob1.a().getClass().getSimpleName();
          a.o(simpleName2, "javaClass.simpleName");
          obj.this$0.n(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName2, "LiveLite"), str3)+"::Register", new LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$3(uob1, obj));
          long l3 = 2;
       }
       a = l1.a;
       Trace.endSection();
       f2 = (float)(System.nanoTime() - l2) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             i = 2;
             objArray2 = new Object[i];
             objArray2[0] = str4;
             objArray2[1] = Float.valueOf(f2);
             str4 = String.format(str1, Arrays.copyOf(objArray2, i));
             a.o(str4, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str4);
          }
       }else {
          i = 2;
          objArray2 = new Object[i];
          objArray2[0] = str4;
          objArray2[1] = Float.valueOf(f2);
          str4 = String.format(str1, Arrays.copyOf(objArray2, i));
          a.o(str4, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str4);
       }
       r0.a(Long.valueOf((long)f2), a).getSecond();
       str2 = obj.this$0.g()+str2;
       l = System.nanoTime();
       Trace.beginSection(str2);
       iterator = obj.this$0.h().iterator();
       while (iterator.hasNext()) {
          uob2 = iterator.next();
          simpleName3 = uob2.a().getClass().getSimpleName();
          a.o(simpleName3, "javaClass.simpleName");
          obj.this$0.n(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName3, "LiveLite"), str3)+"::InjectService", new LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$4(uob2, obj));
       }
       a = l1.a;
       Trace.endSection();
       f1 = (float)(System.nanoTime() - l) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             i2 = 2;
             objArray1 = new Object[i2];
             objArray1[0] = str2;
             objArray1[1] = Float.valueOf(f1);
             str2 = String.format(str1, Arrays.copyOf(objArray1, i2));
             a.o(str2, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
          }
       }else {
          i2 = 2;
          objArray1 = new Object[i2];
          objArray1[0] = str2;
          objArray1[1] = Float.valueOf(f1);
          str2 = String.format(str1, Arrays.copyOf(objArray1, i2));
          a.o(str2, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str2);
       }
       r0.a(Long.valueOf((long)f1), a).getSecond();
       str2 = obj.this$0.g()+"FactoryList.addCreateTask";
       l = System.nanoTime();
       Trace.beginSection(str2);
       iterator = obj.this$0.h().iterator();
       while (iterator.hasNext()) {
          uob2 = iterator.next();
          simpleName3 = uob2.a().getClass().getSimpleName();
          a.o(simpleName3, "javaClass.simpleName");
          obj.this$0.n(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName3, "LiveLite"), str3)+"::Create", new LiveLitePresenterLoaderBase$scheduleLoadTasks$2$$special$$inlined$trace$lambda$5(uob2, obj));
       }
       a = l1.a;
       Trace.endSection();
       f1 = (float)(System.nanoTime() - l) / f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[]{str2,Float.valueOf(f1)};
             str1 = String.format(str1, Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[]{str2,Float.valueOf(f1)};
          str1 = String.format(str1, Arrays.copyOf(objArray, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f1), a).getSecond();
       return;
    }
}
