package com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager$livePlayConfigListener$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Trace;
import com.kuaishou.live.lite.longconnection.v2.LiveLiteLongConnectionManager;
import brd.y;
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

public final class LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1 extends Lambda implements a	// class@000a27
{
    public final LiveLiteLongConnectionManager$livePlayConfigListener$1 this$0;

    public void LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1(LiveLiteLongConnectionManager$livePlayConfigListener$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, this, LiveLiteLongConnectionManager$livePlayConfigListener$1$onAfterConfigUpdated$1.class, "1")) {
          return;
       }
       String str2 = "resumeLongConnection";
       Trace.beginSection(str2);
       l1 a = l1.a;
       this.this$0.b.C.onNext(a);
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
       return;
    }
}
