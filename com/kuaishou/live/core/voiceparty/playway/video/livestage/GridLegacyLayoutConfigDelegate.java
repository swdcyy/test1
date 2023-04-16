package com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate;
import ke3.d;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.GridLegacyLayoutConfigDelegate$Companion;
import nsd.u;
import ts2.f;
import msd.p;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.LinkedHashSet;
import java.util.Set;
import hv2.c;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveVoicePartyVideoLayoutMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import qrd.l1;
import java.lang.Boolean;

public final class GridLegacyLayoutConfigDelegate implements d	// class@0018dc
{
    public final f a;
    public final p b;
    public static final GridLegacyLayoutConfigDelegate$Companion c;

    static {
       GridLegacyLayoutConfigDelegate.c = new GridLegacyLayoutConfigDelegate$Companion(null);
    }
    public void GridLegacyLayoutConfigDelegate(f p0,p p1){
       a.p(p0, "micSeatStateService");
       a.p(p1, "layoutConfigBuilder");
       super();
       this.a = p0;
       this.b = p1;
    }
    public LayoutConfig a(LiveFlvStream$LiveFlvStreamMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GridLegacyLayoutConfigDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       if (p0.messageType != 22) {
          return null;
       }
       return c.b(p0, this.a, this.b, new LinkedHashSet());
    }
    public void b(LayoutConfig p0,LiveFlvStream$LiveFlvStreamMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GridLegacyLayoutConfigDelegate.class, "2")) {
          return;
       }
       a.p(p0, "layoutConfig");
       a.p(p1, "message");
       p1.messageType = 22;
       LiveFlvStream$LiveVoicePartyVideoLayoutMessage liveVoicePar = new LiveFlvStream$LiveVoicePartyVideoLayoutMessage();
       liveVoicePar.videoViewPosition = c.a(p0);
       liveVoicePar.liveVideoAspectRatio = 0x3f92580d;
       liveVoicePar.guestFrameAspectRatio = 0x3f927627;
       liveVoicePar.dividerInVideoWidthPercent = 0.00f;
       p1.voicePartyVideoLayoutInfo = liveVoicePar;
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, GridLegacyLayoutConfigDelegate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
