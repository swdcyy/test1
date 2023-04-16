package com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$obtainItemClickListener$1;
import du2.g;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment;
import java.lang.Object;
import du2.f;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$a;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import co2.k1;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1;
import com.yxcorp.gifshow.model.CDNUrl;
import sx1.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import sx1.a$b;
import ps2.c;
import brd.t;
import t45.d;
import brd.z;
import ps2.d;
import msd.a;
import sfc.a;
import erd.g;
import crd.b;
import crd.a;

public final class FriendsInvitationFragment$obtainItemClickListener$1 implements g	// class@001554
{
    public final FriendsInvitationFragment a;

    public void FriendsInvitationFragment$obtainItemClickListener$1(FriendsInvitationFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       f.b(this);
    }
    public void b(UserInfo p0,int p1,String[] p2,int p3){
       if (PatchProxy.isSupport(FriendsInvitationFragment$obtainItemClickListener$1.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, FriendsInvitationFragment$obtainItemClickListener$1.class, "2")) {
          return;
       }
       if (p0 != null) {
          this.a.O.c(p0, p1, p2);
       }
       return;
    }
    public void c(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       f.a(this, p0, p1, p2, p3);
    }
    public void d(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       if (PatchProxy.isSupport(FriendsInvitationFragment$obtainItemClickListener$1.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, FriendsInvitationFragment$obtainItemClickListener$1.class, "1")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.j0(oTHER, this.a.K+" onInviteUser");
       if (p0 != null) {
          FriendsInvitationFragment$obtainItemClickListener$1 ta = this.a;
          int i = p1 + 1;
          UserInfo mId = p0.mApplyUserInfo.mId;
          a.o(mId, "onlineUser.mApplyUserInfo.mId");
          Objects.requireNonNull(ta);
          if (!PatchProxy.isSupport(FriendsInvitationFragment.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(i), mId, p3, ta, FriendsInvitationFragment.class, "9")) {
             k1.e(ta.P, ta.Q, ta.R, i, mId, "INVITE_FRIEND", p3, null);
          }
          ta = this.a;
          FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1 oobtainItemC = new FriendsInvitationFragment$obtainItemClickListener$1$onInviteUser$$inlined$let$lambda$1(this, p1, p0, p3, p2);
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidTwoRefs(p0, i, ta, FriendsInvitationFragment.class, "7")) {
             CDNUrl[] uCDNUrlArray = ta.O.a();
             if (uCDNUrlArray == null) {
                b.j0(oTHER, ta.K+" sendIMMessage empty cover abort");
             }else {
                GifshowActivity activity = ta.getActivity();
                a.m(activity);
                FriendsInvitationFragment m = ta.M;
                UserInfo mId1 = p0.mApplyUserInfo.mId;
                a.o(mId1, "invitingUser.mApplyUserInfo.mId");
                c uoc = PatchProxy.applyOneRefs(mId1, ta, FriendsInvitationFragment.class, "8");
                if (uoc != PatchProxyResult.class) {
                }else {
                   uoc = new c(ta, mId1);
                }
                a uoa = new a(activity, m, uCDNUrlArray, uoc);
                d uod = new d(uoa, i);
                ta.L.c(uoa.b(p0.mApplyUserInfo.mId).observeOn(d.a).subscribe(uod, new a()));
             }
          }
       }
       return;
    }
}
