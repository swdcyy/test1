package cs2.d;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$a;
import com.kuaishou.live.core.voiceparty.invitation.GuestInvitationPanel;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import t02.a0;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import pj2.c0;
import com.kuaishou.live.core.show.share.f$b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import p91.m;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.c;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import co2.k1;

public final class d implements FriendsInvitationFragment$a	// class@0023d5
{
    public final GuestInvitationPanel a;

    public void d(GuestInvitationPanel p0){
       this.a = p0;
       super();
    }
    public CDNUrl[] a(){
       Object[] objArray = null;
       a0 obj = PatchProxy.apply(objArray, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.u.c;
       if (obj != null) {
          LiveStreamFeedWrapper mEntity = obj.mEntity;
          if (mEntity != null) {
             objArray = r1.F0(mEntity);
          }
       }
       return objArray;
    }
    public void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "1")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.s+" onInviteMoreFriends");
       this.a.u.o1.w1(objArray);
       a0 z2 = this.a.u.Z2;
       a.o(z2, "playCallerContext.mLiveBasicContext");
       a0 z21 = this.a.u.Z2;
       a.o(z21, "playCallerContext.mLiveBasicContext");
       a0 z22 = this.a.u.Z2;
       a.o(z22, "playCallerContext.mLiveBasicContext");
       ClientContent$LiveVoicePartyPackageV2 liveVoicePar = z22.y();
       c.a(z2.b(), z21.a(), liveVoicePar, "INVITE_MORE_FRIEND");
       return;
    }
    public void c(UserInfo p0,int p1,String[] p2){
       if (PatchProxy.isSupport(d.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, d.class, "2")) {
          return;
       }
       a.p(p0, "userInfo");
       b.Z(LiveVoicePartyLogTag.MIC_SEATS_MANAGE, this.a.s+" onOpenUserProfile");
       this.a.u.U.w0(new UserProfile(p0), LiveStreamClickType.VOICE_PARTY, 18, false, 32);
       a0 z2 = this.a.u.Z2;
       a.o(z2, "playCallerContext.mLiveBasicContext");
       BaseFragment uBaseFragmen = z2.b();
       z2 = this.a.u.Z2;
       a.o(z2, "playCallerContext.mLiveBasicContext");
       ClientContent$LiveStreamPackage liveStreamPa = z2.a();
       z2 = this.a.u.Z2;
       a.o(z2, "playCallerContext.mLiveBasicContext");
       k1.c(uBaseFragmen, liveStreamPa, z2.y(), (p1 + 1), p0.mId, false, p2, false);
       return;
    }
}
