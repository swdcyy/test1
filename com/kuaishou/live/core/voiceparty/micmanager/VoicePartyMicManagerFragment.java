package com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment;
import com.kuaishou.live.core.voiceparty.micmanager.InvitationFragment;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import au2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.voiceparty.micmanager.a;
import java.util.Map;
import qvb.i;
import y8c.g;
import ps2.k;
import com.kuaishou.live.core.voiceparty.micmanager.VoicePartyMicManagerFragment$a;
import du2.g;
import ps2.m;

public class VoicePartyMicManagerFragment extends InvitationFragment	// class@00155b
{
    public b K;
    public String L;
    public String M;
    public ClientContent$LiveStreamPackage N;
    public ClientContent$LiveVoicePartyPackageV2 O;
    public e0 P;
    public boolean Q;

    public void VoicePartyMicManagerFragment(){
       super();
    }
    public static VoicePartyMicManagerFragment Lh(String p0,String p1,boolean p2,int p3,ClientContent$LiveStreamPackage p4,ClientContent$LiveVoicePartyPackageV2 p5,e0 p6,b p7){
       Bundle obj;
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, null, VoicePartyMicManagerFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Bundle();
       obj.putString("liveStreamId", p0);
       obj.putString("voicePartyId", p1);
       obj.putInt("MIC_ID", p3);
       obj.putBoolean("key_should_show_order_music_info", p2);
       VoicePartyMicManagerFragment voicePartyMi = new VoicePartyMicManagerFragment();
       voicePartyMi.setArguments(obj);
       voicePartyMi.K = p7;
       voicePartyMi.N = p4;
       voicePartyMi.O = p5;
       voicePartyMi.P = p6;
       return voicePartyMi;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, VoicePartyMicManagerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a(this.K));
       PatchProxy.onMethodExit(VoicePartyMicManagerFragment.class, "3");
       return obj;
    }
    public void Jh(boolean p0){
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, VoicePartyMicManagerFragment.class, "9")) {
          return;
       }
       VoicePartyMicManagerFragment tK = this.K;
       if (tK != null) {
          tK.g(p0);
       }
       return;
    }
    public void Kh(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMicManagerFragment.class, "8")) {
          return;
       }
       VoicePartyMicManagerFragment tK = this.K;
       if (tK != null) {
          tK.a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyMicManagerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyMicManagerFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyMicManagerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str = "liveStreamId";
          if (p0.containsKey(str)) {
             String str1 = "voicePartyId";
             if (p0.containsKey(str1) && p0.containsKey("MIC_ID")) {
                this.L = p0.getString(str);
                this.M = p0.getString(str1);
                this.Q = p0.getBoolean("key_should_show_order_music_info", false);
             }
          }
       }
       return;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, VoicePartyMicManagerFragment.class, "7")) {
          return;
       }
       super.u();
       if (!this.uh()) {
          this.a();
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoicePartyMicManagerFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyMicManagerFragment.class, "6")) {
          return;
       }
       super.v2(p0, p1);
       VoicePartyMicManagerFragment tK = this.K;
       if (tK != null) {
          tK.h(this.q());
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMicManagerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       k ok = new k(this.Q, this.N, this.O, this.P, new VoicePartyMicManagerFragment$a(this));
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyMicManagerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new m(this.L, this.M);
    }
}
