package com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin$ScatterPriority;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import java.util.List;
import b93.e;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import java.lang.System;
import android.os.Trace;
import b93.d;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase$b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.util.Map;
import b93.e$a;
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
import kotlin.text.StringsKt__IndentKt;
import java.lang.IllegalStateException;

public final class LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1 extends Lambda implements a	// class@000924
{
    public final List $factoryList$inlined;
    public final String $name;
    public final a $presenterFactory;
    public final e $presenterRegistry$inlined;
    public final LiveLiteAdapterPlugin$ScatterPriority $priority;
    public final LiveLitePresenterLoaderBase this$0;

    public void LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1(String p0,a p1,LiveLiteAdapterPlugin$ScatterPriority p2,LiveLitePresenterLoaderBase p3,List p4,e p5){
       this.$name = p0;
       this.$presenterFactory = p1;
       this.$priority = p2;
       this.this$0 = p3;
       this.$factoryList$inlined = p4;
       this.$presenterRegistry$inlined = p5;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       boolean b;
       l1 a;
       Object[] objArray;
       Object obj = this;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoidWithListener(null, obj, LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1.class, "1")) {
          return;
       }
       String str2 = obj.$name+"::Init";
       long l = System.nanoTime();
       Trace.beginSection(str2);
       d uod = obj.$presenterFactory.invoke();
       obj.this$0.h().add(new LiveLitePresenterLoaderBase$b(obj.$priority, uod));
       LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1 $presenterRe = obj.$presenterRegistry$inlined;
       Class class = uod.getClass();
       Objects.requireNonNull($presenterRe);
       e$a obj1 = PatchProxy.applyOneRefs(class, $presenterRe, e.class, "3");
       if (obj1 != PatchProxyResult.class) {
          b = obj1.booleanValue();
       }else {
          a.p(class, "clazz");
          obj1 = $presenterRe.a.get(class);
          b = true;
       }
       if (b) {
          a = l1.a;
          Trace.endSection();
          float f = (float)(System.nanoTime() - l) / 1000000.00f;
          if (f.b()) {
             if (SystemUtil.K()) {
                objArray = new Object[]{str2,Float.valueOf(f)};
                str1 = String.format(str1, Arrays.copyOf(objArray, 2));
                a.o(str1, str);
                b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
             }
          }else {
             objArray = new Object[]{str2,Float.valueOf(f)};
             str1 = String.format(str1, Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
          r0.a(Long.valueOf((long)f), a).getSecond();
          PatchProxy.onMethodExit(LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1.class, "1");
          return;
       }else {
          PatchProxy.onMethodExit(LiveLitePresenterLoaderBase$scheduleLoadTasks$$inlined$trace$lambda$1.class, "1");
          throw new IllegalStateException(StringsKt__IndentKt.r("Presenter ["+uod.getClass()+"] does not registered in PresenterRegistry, \n              |please check LiveLiteMainPresenterRegistry or LiveLitPluginPresenterRegistry\n            ", null, 1, null).toString());
       }
    }
}
