package com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler;
import zo2.j;
import co2.f2;
import qu2.a;
import com.kuaishou.android.live.model.LiveStreamModel;
import hf3.a;
import com.kuaishou.live.core.voiceparty.player.VoicePartyPlayerController;
import brd.t;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hp2.j;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$liveInfo$1;
import com.kuaishou.live.core.voiceparty.simpleplay.LivePreviewVoicePartyLogic$b;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$liveInfo$2;
import hp2.o;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$a;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import pv2.e;
import com.kuaishou.live.core.voiceparty.simpleplay.VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1;
import ee1.a;
import msd.p;
import bp2.c;
import zo2.o;
import zo2.p0;
import zo2.n;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ip2.a;

public final class VoicePartyAudienceSimplePlayManagerAssembler implements j	// class@001911
{
    public final j a;
    public final VoicePartyAudienceSimplePlayManagerAssembler$a b;
    public final RtcManager c;
    public final c d;
    public final o e;
    public final f2 f;
    public final a g;
    public final a h;
    public final t i;
    public final a j;
    public final a k;

    public void VoicePartyAudienceSimplePlayManagerAssembler(f2 p0,a p1,LiveStreamModel p2,boolean p3,a p4,VoicePartyPlayerController p5,t p6,t p7,a p8,a p9){
       VoicePartyAudienceSimplePlayManagerAssembler voicePartyAu = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p4;
       Object obj3 = p6;
       Object obj4 = p7;
       QCurrentUser obj5 = p8;
       c obj6 = p9;
       a.p(obj, "voicePartyContext");
       a.p(obj1, "liveContextWrapper");
       a.p(p2, "liveModel");
       a.p(obj2, "longConnection");
       a.p(p5, "livePlayerController");
       a.p(obj3, "liveEndSignal");
       a.p(obj4, "offlineSignal");
       a.p(obj5, "emptyDetailCallback");
       a.p(obj6, "obtainMicSeatDecorationInfo");
       super();
       voicePartyAu.f = obj;
       voicePartyAu.g = obj1;
       voicePartyAu.h = obj2;
       voicePartyAu.i = obj4;
       voicePartyAu.j = obj5;
       voicePartyAu.k = obj6;
       StreamType streamType = StreamType.fromInt(obj1.B0(), StreamType.VOICEPARTY);
       a.m(streamType);
       a.o(streamType, "StreamType.fromInt\(liveC¡­reamType\(\), VOICEPARTY\)!!");
       obj5 = QCurrentUser.me();
       a.o(obj5, "QCurrentUser.me\(\)");
       String id = obj5.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       j oj = new j(new VoicePartyAudienceSimplePlayManagerAssembler$liveInfo$1(voicePartyAu), streamType, d0.q(p2), p3, VoicePartyAudienceSimplePlayManagerAssembler$liveInfo$2.INSTANCE, new o(id));
       voicePartyAu.a = obj4;
       VoicePartyAudienceSimplePlayManagerAssembler$a uoa = new VoicePartyAudienceSimplePlayManagerAssembler$a(voicePartyAu);
       voicePartyAu.b = uoa;
       voicePartyAu.c = new RtcManager(obj4, new e(), VoicePartyAudienceSimplePlayManagerAssembler$rtcManager$1.INSTANCE);
       obj6 = new c(obj1, obj, obj2);
       voicePartyAu.d = obj6;
       voicePartyAu.e = new o(obj4, obj2, uoa, obj3);
       obj6.f();
    }
    public AudienceVoicePartyManager a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceSimplePlayManagerAssembler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       AudienceVoicePartyManager uAudienceVoi = new AudienceVoicePartyManager(p0, this.g, this.h, this.i, this.b, this.c, this.d);
       return obj;
    }
}
