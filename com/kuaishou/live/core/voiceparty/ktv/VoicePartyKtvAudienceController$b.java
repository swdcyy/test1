package com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController$b;
import erd.g;
import com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvAudienceController;
import java.lang.Object;
import yu2.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yu2.d$b;
import yu2.d$a;
import java.util.Objects;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import gs2.i;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import qu2.a;
import hp2.e;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import jp2.a;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import brd.t;
import cjd.e;
import erd.o;
import gs2.j;
import gs2.m;
import gs2.n;
import crd.b;

public final class VoicePartyKtvAudienceController$b implements g	// class@00151e
{
    public final VoicePartyKtvAudienceController b;

    public void VoicePartyKtvAudienceController$b(VoicePartyKtvAudienceController p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvAudienceController$b.class, "1")) {
       }else if(p0 instanceof d$b){
          this.b.V1(p0.a);
       }else if(p0 instanceof d$a){
          VoicePartyKtvAudienceController$b tb = this.b;
          d$a a = p0.a;
          d$a b = p0.b;
          Objects.requireNonNull(tb);
          p0 = VoicePartyKtvAudienceController.class;
          if (!PatchProxy.isSupport(p0) || !PatchProxy.applyVoidTwoRefs(a, Integer.valueOf(b), tb, p0, "6")) {
             p0 = "musicId";
             a.p(a, p0);
             VoicePartyKtvAudienceController r = tb.r;
             if (r == null) {
                a.S("orderGuideController");
             }
             Objects.requireNonNull(r);
             i oi = i.class;
             if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidTwoRefs(a, Integer.valueOf(b), r, oi, "3")) {
                a.p(a, p0);
                b.P(LiveVoicePartyLogTag.KTV.appendTag("VoicePartyKtvAudienceOrderGuideController"), "toOrderMusic");
                LiveVoicePartyApi.c().A(r.k.getLiveStreamId(), r.l.f().g0(), r.m.e().d(), a, b).map(new e()).flatMap(new j(r)).subscribe(new m(r), n.b);
             }
          }
       }
       return;
    }
}
