package com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.player.biz.controller.LiveLitePlayConfigController;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import android.os.Trace;
import com.kwai.video.waynelive.LivePlayerController;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import uj3.b;
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

public final class LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1 extends Lambda implements a	// class@000a8c
{
    public final boolean $isLiveStreamIdChanged;
    public final LiveLitePlayConfigController this$0;

    public void LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1(LiveLitePlayConfigController p0,boolean p1){
       this.this$0 = p0;
       this.$isLiveStreamIdChanged = p1;
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
       if (PatchProxy.applyVoid(null, this, LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1.class, "1")) {
          return;
       }
       String str2 = "updateUrlToPlayer";
       Trace.beginSection(str2);
       LiveLitePlayConfigController$onStartPlayRequestSuccess$updateUrlToPlayer$1 tthis$0 = this.this$0;
       b.g(tthis$0.n, tthis$0.k, this.$isLiveStreamIdChanged);
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
       return;
    }
}
