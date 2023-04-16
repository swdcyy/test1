package com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiChecksumPlugin;
import lz1.e$b;
import bo1.h;
import com.kwai.video.waynelive.LivePlayerController;
import lz1.e;
import xp5.g;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.collection.LruCache;
import lz1.b;
import com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1;
import msd.r;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import bo1.e;
import java.lang.StringBuilder;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import lz1.f;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import bo1.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.common.core.component.interactwatchdog.LiveInteractWatchDogPluginStopReason;

public final class LiveAudienceSeiChecksumPlugin extends h implements e$b	// class@0017df
{
    public final LruCache b;
    public final b c;
    public final LivePlayerController d;
    public final e e;
    public final g f;

    public void LiveAudienceSeiChecksumPlugin(LivePlayerController p0,e p1,g p2){
       a.p(p0, "livePlayerController");
       a.p(p1, "detector");
       a.p(p2, "liveInfoManager");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.b = new LruCache(3);
       this.c = new b(new LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1(this));
    }
    public void b(long p0,long p1){
       LiveAudienceSeiChecksumPlugin liveAudience = LiveAudienceSeiChecksumPlugin.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, liveAudience, "6")) {
          return;
       }
       e.a.a("SEI LOSS !!!");
       this.c.b(2, null, Long.valueOf(p0), Long.valueOf(p1));
       return;
    }
    public void c(long p0,long p1){
       LiveAudienceSeiChecksumPlugin liveAudience = LiveAudienceSeiChecksumPlugin.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, liveAudience, "4")) {
          return;
       }
       this.c.b(0, Long.valueOf(p0), Long.valueOf(p0), Long.valueOf(p1));
       return;
    }
    public void d(long p0,long p1,long p2){
       if (PatchProxy.isSupport(LiveAudienceSeiChecksumPlugin.class) && PatchProxy.applyVoidThreeRefs(Long.valueOf(p0), Long.valueOf(p1), Long.valueOf(p2), this, LiveAudienceSeiChecksumPlugin.class, "5")) {
          return;
       }
       e.a.a("SEI Checksum NOT MATCH: "+"tspt\("+p0+"\), sei\("+p1+')');
       this.c.b(1, Long.valueOf(p1), Long.valueOf(p0), Long.valueOf(p2));
       return;
    }
    public void g(LiveFlvStream$LiveFlvStreamMessage p0){
       f.f(this, p0);
    }
    public void h(long p0){
       LiveAudienceSeiChecksumPlugin liveAudience = LiveAudienceSeiChecksumPlugin.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, liveAudience, "7")) {
          return;
       }
       e.a.a("TSPT LOSS !!!");
       this.c.b(3, Long.valueOf(p0), null, null);
       return;
    }
    public void i(LiveStageProto$LayoutConfig p0,long p1){
       LiveAudienceSeiChecksumPlugin liveAudience = LiveAudienceSeiChecksumPlugin.class;
       if (PatchProxy.isSupport(liveAudience) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, liveAudience, "3")) {
          return;
       }
       a.p(p0, "layoutConfig");
       f.d(this, p0, p1);
       this.b.put(Long.valueOf(p1), p0);
       return;
    }
    public boolean j(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSeiChecksumPlugin.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "config");
       this.e.a(this);
       return true;
    }
    public boolean k(LiveInteractWatchDogPluginStopReason p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceSeiChecksumPlugin.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "reason");
       this.e.e(this);
       return true;
    }
}
