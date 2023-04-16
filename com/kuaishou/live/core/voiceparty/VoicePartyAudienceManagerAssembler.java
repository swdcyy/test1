package com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler;
import zo2.j;
import co2.f2;
import com.kuaishou.android.live.model.LiveStreamModel;
import t02.a0;
import hf3.a;
import brd.t;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hp2.j;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler$liveInfo$1;
import p91.m;
import com.kuaishou.live.basic.model.StreamType;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler$liveInfo$2;
import hp2.o;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.core.voiceparty.core.audience.RtcManager;
import lp3.e;
import ee1.a;
import java.lang.Class;
import lp3.c;
import com.kuaishou.live.core.voiceparty.core.audience.aryalogic.DefaultSnowFactory$defaultSnowFactory$1;
import msd.p;
import com.kuaishou.live.core.voiceparty.VoicePartyAudienceManagerAssembler$a;
import bp2.c;
import qu2.d;
import qu2.a;
import zo2.o;
import zo2.p0;
import zo2.n;
import com.kuaishou.live.core.voiceparty.core.audience.AudienceVoicePartyManager;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ip2.a;

public final class VoicePartyAudienceManagerAssembler implements j	// class@001318
{
    public final j a;
    public final RtcManager b;
    public final p0 c;
    public final c d;
    public final o e;
    public final f2 f;
    public final a0 g;
    public final a h;
    public final t i;
    public final t j;
    public final a k;
    public final a l;

    public void VoicePartyAudienceManagerAssembler(f2 p0,LiveStreamModel p1,a0 p2,a p3,t p4,t p5,a p6,a p7){
       VoicePartyAudienceManagerAssembler voicePartyAu = this;
       Object obj = p0;
       a0 obj1 = p2;
       Object obj2 = p3;
       Object obj3 = p4;
       Object obj4 = p5;
       a0 obj5 = p6;
       Object obj6 = p7;
       a.p(obj, "context");
       a.p(p1, "liveModel");
       a.p(obj1, "callerContext");
       a.p(obj2, "longConnection");
       a.p(obj3, "offlineSignal");
       a.p(obj4, "liveEndSignal");
       a.p(obj5, "obtainMicSeatDecorationInfo");
       a.p(obj6, "emptyDetailCallback");
       super();
       voicePartyAu.f = obj;
       voicePartyAu.g = obj1;
       voicePartyAu.h = obj2;
       voicePartyAu.i = obj3;
       voicePartyAu.j = obj4;
       voicePartyAu.k = obj5;
       voicePartyAu.l = obj6;
       obj5 = obj1.Z2;
       a.o(obj5, "callerContext.mLiveBasicContext");
       StreamType streamType = StreamType.fromInt(obj5.B0(), StreamType.VOICEPARTY);
       a.m(streamType);
       a.o(streamType, "StreamType.fromInt\(calle¡­StreamType, VOICEPARTY\)!!");
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       String id = qCurrentUser.getId();
       a.o(id, "QCurrentUser.me\(\).id");
       j oj = new j(new VoicePartyAudienceManagerAssembler$liveInfo$1(voicePartyAu), streamType, d0.q(p1), false, new VoicePartyAudienceManagerAssembler$liveInfo$2(voicePartyAu), new o(id));
       voicePartyAu.a = obj3;
       a0 z2 = obj1.Z2;
       a.o(z2, "callerContext.mLiveBasicContext");
       c uoc = z2.t5().a(a.class);
       a.o(uoc, "callerContext.mLiveBasic¡­veRTCManager::class.java\)");
       voicePartyAu.b = new RtcManager(obj3, uoc, DefaultSnowFactory$defaultSnowFactory$1.INSTANCE);
       VoicePartyAudienceManagerAssembler$a uoa = new VoicePartyAudienceManagerAssembler$a(voicePartyAu);
       voicePartyAu.c = uoa;
       obj1 = obj1.Z2;
       a.o(obj1, "callerContext.mLiveBasicContext");
       uoc = new c(new d(obj1), obj, obj2);
       voicePartyAu.d = uoc;
       voicePartyAu.e = new o(obj3, obj2, uoa, obj4);
       uoc.f();
    }
    public AudienceVoicePartyManager a(n p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceManagerAssembler.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "param");
       a0 z2 = this.g.Z2;
       a.o(z2, "callerContext.mLiveBasicContext");
       d uod = new d(z2);
       AudienceVoicePartyManager uAudienceVoi = new AudienceVoicePartyManager(p0, uod, this.h, this.i, this.c, this.b, this.d);
       return obj;
    }
    public final o b(){
       return this.e;
    }
    public final RtcManager c(){
       return this.b;
    }
}
