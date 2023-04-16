package com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment;
import com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$a;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Object;
import kotlin.jvm.internal.a;
import crd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.voiceparty.micmanager.a;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$b;
import au2.b;
import java.util.HashMap;
import java.util.Map;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import y8c.g;
import ps2.a;
import du2.g;
import com.kuaishou.live.core.voiceparty.micmanager.FriendsInvitationFragment$obtainItemClickListener$1;
import qvb.i;
import ps2.f;

public final class FriendsInvitationFragment extends InvitationFragment	// class@001555
{
    public final String K;
    public final a L;
    public final String M;
    public final String N;
    public final FriendsInvitationFragment$a O;
    public final e0 P;
    public final ClientContent$LiveStreamPackage Q;
    public final ClientContent$LiveVoicePartyPackageV2 R;
    public HashMap S;

    public void FriendsInvitationFragment(String p0,String p1,FriendsInvitationFragment$a p2,e0 p3,ClientContent$LiveStreamPackage p4,ClientContent$LiveVoicePartyPackageV2 p5){
       a.p(p0, "liveStreamId");
       a.p(p1, "voicePartyId");
       a.p(p2, "delegate");
       a.p(p4, "liveStreamPackage");
       super();
       this.M = p0;
       this.N = p1;
       this.O = p2;
       this.P = p3;
       this.Q = p4;
       this.R = p5;
       this.K = "FriendsInvitationFragment";
       this.L = new a();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, FriendsInvitationFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a(new FriendsInvitationFragment$b(this)));
       PatchProxy.onMethodExit(FriendsInvitationFragment.class, "3");
       return obj;
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, FriendsInvitationFragment.class, "11")) {
          return;
       }
       FriendsInvitationFragment tS = this.S;
       if (tS != null) {
          tS.clear();
       }
       return;
    }
    public void Kh(){
       if (PatchProxy.applyVoid(null, this, FriendsInvitationFragment.class, "5")) {
          return;
       }
       this.O.b();
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendsInvitationFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(FriendsInvitationFragment.class, null);
       return objectsByTag;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, FriendsInvitationFragment.class, "4")) {
          return;
       }
       b.j0(LiveVoicePartyLogTag.OTHER, this.K+" onDestroy");
       this.L.d();
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       super.onDestroyView();
       this.Gh();
    }
    public g vh(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FriendsInvitationFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       FriendsInvitationFragment tP = this.P;
       FriendsInvitationFragment tQ = this.Q;
       FriendsInvitationFragment tR = this.R;
       FriendsInvitationFragment$obtainItemClickListener$1 oobtainItemC = PatchProxy.apply(objArray, this, FriendsInvitationFragment.class, "6");
       if (oobtainItemC != PatchProxyResult.class) {
       }else {
          oobtainItemC = new FriendsInvitationFragment$obtainItemClickListener$1(this);
       }
       return new a(tP, tQ, tR, oobtainItemC);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, FriendsInvitationFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new f(this.M, this.N);
    }
}
