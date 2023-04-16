package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
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
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import java.lang.System;
import android.os.Trace;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import java.lang.Enum;
import b93.d;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5$$special$$inlined$trace$lambda$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5$$special$$inlined$trace$lambda$2;
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

public final class LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5 extends Lambda implements a	// class@000945
{
    public final Activity $activity;
    public final LiveLiteModelManager $modelManager;
    public final e $presenterRegistry;
    public final c $serviceManager;
    public final LiveLitePresenterScatterLoader this$0;

    public void LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5(LiveLitePresenterScatterLoader p0,Activity p1,e p2,LiveLiteModelManager p3,c p4){
       this.this$0 = p0;
       this.$activity = p1;
       this.$presenterRegistry = p2;
       this.$modelManager = p3;
       this.$serviceManager = p4;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       l1 a;
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, this, LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5.class, "1")) {
          return;
       }
       String str2 = this.this$0.g()+"FactoryList.addCreateTaskFirstPhase";
       long l = System.nanoTime();
       Trace.beginSection(str2);
       float f = 1000000.00f;
       Iterator iterator = this.this$0.h().iterator();
       while (iterator.hasNext()) {
          LiveLitePresenterLoaderBase$b uob = iterator.next();
          if (uob.b().compareTo(LiveLiteAdapterPlugin$ScatterPriority.Default) < 0) {
             String simpleName = uob.a().getClass().getSimpleName();
             a.o(simpleName, "javaClass.simpleName");
             this.this$0.x(StringsKt__StringsKt.Z3(StringsKt__StringsKt.T3(simpleName, "LiveLite"), "Presenter")+"::Create", new LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5$$special$$inlined$trace$lambda$1(uob, this));
          }
       }
       this.this$0.x("slideComponentLoadEnd", new LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5$$special$$inlined$trace$lambda$2(this));
       a = l1.a;
       Trace.endSection();
       float f1 = (float)(System.nanoTime() - l) / f;
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
