package com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment$a;
import au2.b;
import com.kuaishou.live.core.voiceparty.micseats.dialog.LiveVoicePartyInvitationPanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import t02.r1;
import pj2.c0;
import sx1.b;
import t02.a0;
import com.kuaishou.live.core.show.share.f$b;
import au2.a;
import com.kwai.framework.model.user.UserInfo;
import java.util.Objects;
import co2.f2;
import qu2.a;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import tx1.a;
import wj2.r0;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import java.lang.Boolean;
import java.lang.Integer;
import bu2.l$c;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import sx1.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import sx1.a$b;
import ys2.n;
import brd.t;
import t45.d;
import brd.z;
import ys2.l;
import sfc.a;
import erd.g;
import crd.b;
import crd.a;
import androidx.fragment.app.KwaiDialogFragment;
import com.kuaishou.live.core.voiceparty.d0;
import com.kuaishou.live.core.voiceparty.micseats.dialog.f;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment$a;
import com.kuaishou.live.core.voiceparty.teampk.jointeam.VoicePartyAudienceTeamPkJoinBattleDialogFragment;
import bw2.b;
import com.kuaishou.live.core.voiceparty.playway.shared.model.MicSeatsDataManager;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import z1.a;
import ys2.i;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import java.lang.StringBuilder;
import android.widget.RelativeLayout;
import qvb.i;
import ps2.m;
import com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerListResponse;
import lnc.i3;
import yx2.n;
import yx2.d;
import java.lang.Number;

public class LiveVoicePartyInvitationPanelFragment$a implements b	// class@00159a
{
    public final LiveVoicePartyInvitationPanelFragment a;

    public void LiveVoicePartyInvitationPanelFragment$a(LiveVoicePartyInvitationPanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyInvitationPanelFragment$a.class, "5")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "LiveVoicePartyInvitationPanelFragment onInviteMore");
       LiveVoicePartyInvitationPanelFragment$a ta = this.a;
       LiveVoicePartyInvitationPanelFragment y = ta.y;
       if (y != null) {
          y.I.w1(null);
       }else {
          LiveVoicePartyInvitationPanelFragment x = ta.x;
          if (x != null) {
             x.o1.w1(null);
          }
       }
       return;
    }
    public void b(String p0){
       a.b(this, p0);
    }
    public void c(UserInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyInvitationPanelFragment$a.class, "2")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment openUserProfile");
       LiveVoicePartyInvitationPanelFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, LiveVoicePartyInvitationPanelFragment.class, "16")) {
          b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment showProfile");
          int i = (ta.u.J())? 35: 32;
          if (ta.v.e()) {
             LiveVoicePartyInvitationPanelFragment y = ta.y;
             if (y != null) {
                y.Z.g3(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, i);
             }
          }
          if (!ta.v.e()) {
             LiveVoicePartyInvitationPanelFragment x = ta.x;
             if (x != null) {
                x.U.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, false, i);
             }
          }
          b.B(oTHER, "LiveVoicePartyInvitationPanelFragment showProfile failed");
       }
       return;
    }
    public void d(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       if (PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, LiveVoicePartyInvitationPanelFragment$a.class, "3")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment onAcceptApplyButtonClick");
       LiveVoicePartyInvitationPanelFragment$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class) || !PatchProxy.applyVoidThreeRefs(p0, p2, Integer.valueOf(p3), ta, LiveVoicePartyInvitationPanelFragment.class, "17")) {
          b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment acceptMicSeatApply");
          f2 s = ta.u.s;
          if (s != null) {
             s.c(p0, p2, p3);
          }
       }
       return;
    }
    public void e(){
       a.g(this);
    }
    public void f(VoicePartyOnlineUser p0,boolean p1,g p2,int p3){
       LiveVoicePartyInvitationPanelFragment$a ta;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), p2, Integer.valueOf(p3), this, LiveVoicePartyInvitationPanelFragment$a.class, "1")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment onInviteButtonClick");
       if (p0 != null && p2 != null) {
          if (p0.mIsUserNotInLivingRoom != null) {
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class) || (!PatchProxy.applyVoidThreeRefs(p0, p2, Integer.valueOf(p3), ta, LiveVoicePartyInvitationPanelFragment.class, "18") && ta.wh() != null)) {
                GifshowActivity activity = ta.getActivity();
                String liveStreamId = ta.v.getLiveStreamId();
                CDNUrl[] uCDNUrlArray = ta.wh();
                UserInfo mId = p0.mApplyUserInfo.mId;
                n on = PatchProxy.applyOneRefs(mId, ta, LiveVoicePartyInvitationPanelFragment.class, "19");
                if (on != patchProxyRe) {
                }else {
                   on = new n(ta, mId);
                }
                a uoa = new a(activity, liveStreamId, uCDNUrlArray, on);
                ta.G.c(uoa.b(p0.mApplyUserInfo.mId).observeOn(d.a).subscribe(new l(uoa, p0, p2, p3), new a()));
             }
             return;
          }else if(this.a.u.h() == 5){
             ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.isSupport(LiveVoicePartyInvitationPanelFragment.class) || !PatchProxy.applyVoidThreeRefs(p0, p2, Integer.valueOf(p3), ta, LiveVoicePartyInvitationPanelFragment.class, "21")) {
                d0.c(ta.F);
                if (ta.F == null) {
                   ta.F = VoicePartyAudienceTeamPkJoinBattleDialogFragment.xh(new f(ta, p0, p2, p3));
                }
                ta.F.yh(p0);
                ta.F.Ah(b.b(p0));
                ta.F.zh(ta.xh().m(false), ta.xh().f(false));
                if (ta.getFragmentManager() != null) {
                   ta.F.show(ta.getFragmentManager(), "LiveVoicePartyInvitationPanelFragment");
                   ta.yh(1);
                   ta.yh(2);
                }
             }
             d0.c(this.a);
          }else {
             LiveVoicePartyInvitationPanelFragment$a ta1 = this.a;
             LiveVoicePartyInvitationPanelFragment w = ta1.w;
             Objects.requireNonNull(ta1);
             i oi = PatchProxy.applyTwoRefs(p0, p2, ta1, LiveVoicePartyInvitationPanelFragment.class, "14");
             if (oi != patchProxyRe) {
             }else {
                oi = new i(p2, p0);
             }
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidThreeRefs(w, p0, oi, ta1, LiveVoicePartyInvitationPanelFragment.class, "15")) {
                b.Z(oTHER, "LiveVoicePartyInvitationPanelFragment inviteUser");
                f2 s = ta1.u.s;
                if (s != null) {
                   s.d(p0.mApplyUserInfo.mId, w, 1, oi);
                }
             }
          }
       }
       return;
    }
    public void g(boolean p0){
       LiveVoicePartyInvitationPanelFragment$a uoa = LiveVoicePartyInvitationPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.OTHER, "LiveVoicePartyInvitationPanelFragment onEmptyStateChanged: "+p0);
       LiveVoicePartyInvitationPanelFragment d = this.a.D;
       int i = (p0)? 8: 0;
       d.setVisibility(i);
       return;
    }
    public void h(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyInvitationPanelFragment$a.class, "4")) {
          return;
       }
       boolean b = false;
       if (p0 instanceof m && p0.L0() instanceof VoicePartyMicManagerListResponse) {
          b = p0.L0().haveFriends();
       }
       int i = 2;
       LiveVoicePartyInvitationPanelFragment z = this.a.z;
       if (z == 11 || z == 12) {
          i = 1;
       }
       i3 oi3 = i3.f();
       n.a(this.a.u, oi3);
       LiveVoicePartyInvitationPanelFragment$a ta = this.a;
       oi3.c("have_friend", Integer.valueOf(b));
       oi3.c("source_btn", Integer.valueOf(i));
       new d("VOICE_PARTY_FRIEND_INVITE_CARD", ta.u, ta.v).a(oi3.e()).g();
       return;
    }
}
