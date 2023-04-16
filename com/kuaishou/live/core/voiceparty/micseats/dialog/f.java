package com.kuaishou.live.core.voiceparty.micseats.dialog.f;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Object;
import co2.f2;
import bw2.a;
import com.kwai.framework.model.user.UserInfo;
import ys2.h;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import bs2.d;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import qu2.a;
import ys2.k;
import z1.a;
import sfc.a;
import erd.g;
import crd.b;
import crd.a;

public final class f implements VoicePartyAudienceTeamPkJoinBattleDialogFragment$a	// class@0015a2
{
    public final LiveVoicePartyInvitationPanelFragment a;
    public final VoicePartyOnlineUser b;
    public final g c;
    public final int d;

    public void f(LiveVoicePartyInvitationPanelFragment p0,VoicePartyOnlineUser p1,g p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(int p0,VoicePartyOnlineUser p1){
       t ot;
       f uof = this;
       VoicePartyOnlineUser voicePartyOn = p1;
       f a = uof.a;
       f b = uof.b;
       f c = uof.c;
       f d = uof.d;
       if (!a.u.K()) {
       }else {
          LiveVoicePartyInvitationPanelFragment h = a.H;
          int i = 1;
          int i1 = 2;
          if (p0 != i) {
             i = 2;
          }
          h.b(i, i1);
          if (voicePartyOn) {
             UserInfo mId = voicePartyOn.mApplyUserInfo.mId;
             h oh = new h(b, c, d, p1, p0);
             if (!PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), mId, i1, a, LiveVoicePartyInvitationPanelFragment.class, "24")) {
                if (PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class)) {
                   ot = PatchProxy.applyTwoRefs(mId, Integer.valueOf(p0), a, LiveVoicePartyInvitationPanelFragment.class, "25");
                   if (ot != PatchProxyResult.class) {
                   }else if(a.y != null){
                      ot = LiveVoicePartyApi.d().g(a.v.getLiveStreamId(), a.u.y(), a.u.r(), mId, p0);
                   }else {
                      ot = LiveVoicePartyApi.d().d(a.v.getLiveStreamId(), a.u.y(), a.u.r(), mId, p0);
                   }
                }else {
                   goto label_0067 ;
                }
                if (ot != null) {
                   a.G.c(ot.subscribe(new k(i1), new a()));
                }
             }
          }
       }
    label_00b9 :
       return;
    }
}
