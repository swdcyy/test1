package com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment$a;
import du2.g;
import com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import au2.b;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import co2.k1;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUser;
import y8c.g;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.util.Arrays;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public class VoicePartyMicManagerFragment$a implements g	// class@00155a
{
    public final VoicePartyMicManagerFragment a;

    public void VoicePartyMicManagerFragment$a(VoicePartyMicManagerFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMicManagerFragment$a.class, "4")) {
          return;
       }
       VoicePartyMicManagerFragment k = this.a.K;
       if (k != null) {
          k.a();
       }
       return;
    }
    public void b(UserInfo p0,int p1,String[] p2,int p3){
       UserInfo this;
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, Integer.valueOf(p3), this, VoicePartyMicManagerFragment$a.class, "3")) {
          return;
       }
       VoicePartyMicManagerFragment k = this.a.K;
       if (k != null) {
          k.c(p0);
       }
       VoicePartyMicManagerFragment$a ta = this.a;
       VoicePartyMicManagerFragment o = ta.O;
       int i = 1;
       boolean b = (o != null && o.role != i)? true: false;
       VoicePartyMicManagerFragment p = ta.P;
       k = ta.N;
       this = p0.mId;
       boolean b1 = (p3 == 5)? true: false;
       k1.c(p, k, o, p1, this, b1, p2, b);
       return;
    }
    public void c(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       VoicePartyMicManagerFragment k;
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, VoicePartyMicManagerFragment$a.class, "2")) {
          return;
       }
       boolean b = false;
       int i = 5;
       if (p0.mStatus == i) {
          k = this.a.K;
          if (k != null) {
             k.d(p0, b, p2, p1);
          }
       }
       VoicePartyMicManagerFragment$a ta = this.a;
       k = ta.P;
       VoicePartyMicManagerFragment n = ta.N;
       VoicePartyMicManagerFragment o = ta.O;
       int i1 = 1;
       p1 = p1 + i1;
       UserInfo mId = p0.mApplyUserInfo.mId;
       if (PatchProxy.isSupport(k1.class)) {
          Object[] objArray = new Object[]{k,n,o,Integer.valueOf(p1),mId,p3};
          if (PatchProxy.applyVoid(objArray, null, k1.class, "16")) {
          label_0095 :
             return;
          }
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "MIC_MODEL_PANEL_ACCEPT_BUTTON";
       i3 oi3 = i3.f();
       oi3.d("label", Arrays.toString(p3));
       uElementPack.params = oi3.e();
       ClientContent$UserPackage userPackage = new ClientContent$UserPackage();
       userPackage.identity = mId;
       userPackage.index = p1;
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.liveVoicePartyPackage = o;
       uContentPack.liveStreamPackage = n;
       uContentPack.userPackage = userPackage;
       u1.L("", k, 6, uElementPack, uContentPack);
       goto label_0095 ;
    }
    public void d(VoicePartyOnlineUser p0,int p1,g p2,String[] p3){
       VoicePartyMicManagerFragment this;
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, VoicePartyMicManagerFragment$a.class, "1")) {
          return;
       }
       if (p0.mStatus == 1) {
          VoicePartyMicManagerFragment k = this.a.K;
          if (k != null) {
             k.f(p0, false, p2, p1);
          }
       }
       VoicePartyMicManagerFragment$a ta = this.a;
       this = ta.O;
       boolean b = (this != null && this.role != 1)? true: false;
       VoicePartyMicManagerFragment p = ta.P;
       VoicePartyMicManagerFragment n = ta.N;
       int i = p1 + 1;
       UserInfo mId = p0.mApplyUserInfo.mId;
       String str = (p0.mIsUserNotInLivingRoom != null)? "INVITE_FRIEND": "INVITE_AUDIENCE";
       k1.e(p, n, this, i, mId, str, p3, b);
       return;
    }
}
