package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import hb3.c;
import java.lang.System;
import android.os.Trace;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import ma3.b;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1;
import androidx.lifecycle.LifecycleOwner;
import b93.e;
import msd.l;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;

public final class LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 extends Lambda implements a	// class@000974
{
    public final LiveLiteRootViewController this$0;

    public void LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2(LiveLiteRootViewController p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray;
       Object obj = this;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoidWithListener(null, obj, LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2.class, "1")) {
          return;
       }
       obj.this$0.q.e = SystemClock.elapsedRealtime();
       String str2 = "bizPresenterLoader.startScatterLoad";
       Trace.beginSection(str2);
       LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 this$0 = obj.this$0;
       Activity uActivity = this$0.B2();
       LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 this$01 = obj.this$0;
       this$0.o.y(uActivity, this$01, this$01.X2(), obj.this$0.Y2(), obj.this$0.Z2(), new LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1(obj));
       l1 a = l1.a;
       Trace.endSection();
       float f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
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
       PatchProxy.onMethodExit(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2.class, "1");
       return;
    }
}
