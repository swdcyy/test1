package com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceTeamPkMicApplyButtonViewController;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceMicApplyButtonViewController;
import m91.b;
import com.kuaishou.live.core.voiceparty.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import co2.f2;
import qs2.a;
import aw2.c;
import bw2.a;
import x61.c;
import vq5.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceTeamPkMicApplyButtonViewController$viewModel$2;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceTeamPkMicApplyButtonViewController$$special$$inlined$viewModels$1;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.ViewModelLazy;
import eo2.i;
import java.lang.Class;
import vsd.d;
import nsd.m0;
import com.kuaishou.live.core.voiceparty.apply.VoicePartyAudienceTeamPkMicApplyButtonViewController$$special$$inlined$viewModels$2;
import msd.a;
import eo2.h;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qrd.p;

public final class VoicePartyAudienceTeamPkMicApplyButtonViewController extends VoicePartyAudienceMicApplyButtonViewController	// class@00132b
{
    public final d A;
    public final p r;
    public final b s;
    public final b t;
    public final MicSeatsDataManager u;
    public final f2 v;
    public final a w;
    public final c x;
    public final a y;
    public final c z;

    public void VoicePartyAudienceTeamPkMicApplyButtonViewController(b p0,b p1,MicSeatsDataManager p2,f2 p3,a p4,c p5,a p6,c p7,d p8){
       VoicePartyAudienceTeamPkMicApplyButtonViewController voicePartyAu = this;
       Object obj = p0;
       Object obj1 = p1;
       Object obj2 = p2;
       Object obj3 = p3;
       Object obj4 = p4;
       Object obj5 = p5;
       Object obj6 = p6;
       a.p(obj, "bizRelationService");
       a.p(obj1, "micSeatDispatcher");
       a.p(obj2, "micSeatsDataManager");
       a.p(obj3, "voicePartyContext");
       a.p(obj4, "micManageService");
       a.p(obj5, "battleService");
       a.p(obj6, "teamPkLogger");
       a.p(p7, "liveBottomBarService");
       a.p(p8, "liveRouterManager");
       super(p0, p1, p2, p3, p4, p7, p8);
       voicePartyAu.s = obj;
       voicePartyAu.t = obj1;
       voicePartyAu.u = obj2;
       voicePartyAu.v = obj3;
       voicePartyAu.w = obj4;
       voicePartyAu.x = obj5;
       voicePartyAu.y = obj6;
       voicePartyAu.z = p7;
       voicePartyAu.A = p8;
       voicePartyAu.r = new ViewModelLazy(m0.d(i.class), new VoicePartyAudienceTeamPkMicApplyButtonViewController$$special$$inlined$viewModels$2(new VoicePartyAudienceTeamPkMicApplyButtonViewController$$special$$inlined$viewModels$1(voicePartyAu)), new VoicePartyAudienceTeamPkMicApplyButtonViewController$viewModel$2(voicePartyAu));
    }
    public h V2(){
       i oi = PatchProxy.apply(null, this, VoicePartyAudienceTeamPkMicApplyButtonViewController.class, "1");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = this.r.getValue();
       }
       return oi;
    }
}
