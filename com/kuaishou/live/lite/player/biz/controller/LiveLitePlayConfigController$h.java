package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$h;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Trace;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import android.os.SystemClock;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import qrd.r0;

public final class LiveLitePlayConfigController$h implements g	// class@000a8b
{
    public final LiveLitePlayConfigController b;
    public final long c;

    public void LiveLitePlayConfigController$h(LiveLitePlayConfigController p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       Object obj = this;
       l1 obj1 = p0;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, LiveLitePlayConfigController$h.class, "1")) {
       }else {
          String str2 = "PlayConfig::starPlayError";
          Trace.beginSection(str2);
          b.x(LiveLiteLogTag.PLAYER.appendTag(obj.b.a), "startPlay api failed", "time cost", Long.valueOf((SystemClock.elapsedRealtime() - obj.c)), obj1);
          obj.b.c(obj1);
          obj1 = l1.a;
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
          r0.a(Long.valueOf((long)f), obj1).getSecond();
       }
       return;
    }
}
