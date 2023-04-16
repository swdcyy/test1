package com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1;
import msd.r;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.common.interactwatchdog.sei.LiveAudienceSeiChecksumPlugin;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import java.lang.Long;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import lnc.i3;
import com.kwai.video.waynelive.LivePlayerController;
import com.kwai.sdk.switchconfig.a;
import xp5.g;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import androidx.collection.LruCache;
import com.kuaishou.protobuf.livestage.nano.LiveStageProto$LayoutConfig;
import com.google.gson.Gson;
import k2b.u1;

public final class LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1 extends FunctionReferenceImpl implements r	// class@0017de
{

    public void LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1(LiveAudienceSeiChecksumPlugin p0){
       super(4, p0, LiveAudienceSeiChecksumPlugin.class, "doReport", "doReport\(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;\)V", 0);
    }
    public Object invoke(Object p0,Object p1,Object p2,Object p3){
       this.invoke(p0.intValue(), p1, p2, p3);
       return l1.a;
    }
    public final void invoke(int p0,Long p1,Long p2,Long p3){
       if (PatchProxy.isSupport(LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, LiveAudienceSeiChecksumPlugin$seiChecksumReporter$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.isSupport(LiveAudienceSeiChecksumPlugin.class) || !PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, treceiver, LiveAudienceSeiChecksumPlugin.class, "8")) {
          i3 oi3 = i3.f();
          oi3.d("playerUrl", treceiver.d.getCurrentPlayingUrl());
          oi3.c("playerPts", Long.valueOf(treceiver.d.getLastVideoPts()));
          oi3.d("playerType", a.t().c("playerHotfixLive", ""));
          oi3.d("liveStreamId", treceiver.f.getLiveStreamId());
          oi3.d("anchorId", treceiver.f.d());
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          oi3.d("currentUserId", qCurrentUser.getId());
          oi3.c("errorType", Integer.valueOf(p0));
          oi3.c("seiChecksum", p1);
          oi3.c("tsptChecksum", p2);
          oi3.c("gapTime", p3);
          if (p1 != null) {
             LiveStageProto$LayoutConfig layoutConfig = treceiver.b.get(p1);
             if (layoutConfig != null) {
                oi3.d("seiBizId", layoutConfig.bizId);
                oi3.c("seiBizType", Integer.valueOf(layoutConfig.bizType));
                oi3.d("seiWindowInfo", new Gson().q(layoutConfig.windowInfo));
             }
          }
          u1.R("LIVE_INTERACT_WATCH_DOG_SEI", oi3.e(), 3);
       }
       return;
    }
}
