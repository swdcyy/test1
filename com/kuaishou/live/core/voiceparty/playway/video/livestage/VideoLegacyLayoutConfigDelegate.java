package com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate;
import ke3.d;
import com.kuaishou.live.core.voiceparty.playway.video.livestage.VideoLegacyLayoutConfigDelegate$Companion;
import nsd.u;
import ts2.f;
import msd.p;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveFlvStreamMessage;
import com.kuaishou.live.livestage.basic.LayoutConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import hv2.c;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveVoicePartyVideoLayoutMessage;
import com.kuaishou.protobuf.livestream.nano.LiveFlvStream$LiveChatViewPostionMessage;
import qrd.l1;
import java.lang.Boolean;

public final class VideoLegacyLayoutConfigDelegate implements d	// class@0018df
{
    public final f a;
    public final p b;
    public final Set c;
    public static final VideoLegacyLayoutConfigDelegate$Companion d;

    static {
       VideoLegacyLayoutConfigDelegate.d = new VideoLegacyLayoutConfigDelegate$Companion(null);
    }
    public void VideoLegacyLayoutConfigDelegate(f p0,p p1,Set p2){
       a.p(p0, "micSeatStateService");
       a.p(p1, "layoutConfigBuilder");
       a.p(p2, "forceOpenVideoUsers");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public LayoutConfig a(LiveFlvStream$LiveFlvStreamMessage p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VideoLegacyLayoutConfigDelegate.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "message");
       if (p0.messageType != 19) {
          return null;
       }
       return c.b(p0, this.a, this.b, CollectionsKt___CollectionsKt.K5(this.c));
    }
    public void b(LayoutConfig p0,LiveFlvStream$LiveFlvStreamMessage p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VideoLegacyLayoutConfigDelegate.class, "2")) {
          return;
       }
       a.p(p0, "layoutConfig");
       a.p(p1, "message");
       p1.messageType = 19;
       LiveFlvStream$LiveVoicePartyVideoLayoutMessage liveVoicePar = new LiveFlvStream$LiveVoicePartyVideoLayoutMessage();
       liveVoicePar.videoViewPosition = c.a(p0);
       liveVoicePar.liveVideoAspectRatio = 0x3f2af123;
       liveVoicePar.guestFrameAspectRatio = 0x3f555555;
       liveVoicePar.dividerInVideoWidthPercent = 0.00f;
       p1.voicePartyVideoLayoutInfo = liveVoicePar;
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, VideoLegacyLayoutConfigDelegate.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return false;
    }
}
