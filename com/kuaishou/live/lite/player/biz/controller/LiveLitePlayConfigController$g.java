package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$g;
import erd.g;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.System;
import android.os.Trace;
import android.os.SystemClock;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import java.util.List;
import pp.c;
import java.lang.Long;
import com.kuaishou.android.live.log.b;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.Pair;
import qrd.r0;

public final class LiveLitePlayConfigController$g implements g	// class@000a8a
{
    public final LiveLitePlayConfigController b;
    public final long c;

    public void LiveLitePlayConfigController$g(LiveLitePlayConfigController p0,long p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLitePlayConfigController$g.class, "1")) {
       }else {
          a.p(p0, "newPlayConfig");
          String str2 = "PlayConfig::starPlaySuccess";
          Trace.beginSection(str2);
          p0.mRequestCostTime = SystemClock.elapsedRealtime() - this.c;
          b.S(LiveLiteLogTag.PLAYER.appendTag(this.b.a), "startPlay api success", "time cost", Long.valueOf(p0.mRequestCostTime));
          this.b.d(p0);
          p0 = l1.a;
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
          r0.a(Long.valueOf((long)f), p0).getSecond();
       }
       return;
    }
}
