package com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import au2.b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import qvb.i;
import cu2.a;
import java.util.Map;
import crd.b;
import lnc.b9;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.content.Context;
import androidx.core.content.ContextCompat;
import y8c.g;
import du2.i;
import com.kuaishou.live.core.voiceparty.online.search.VoicePartySearchOnlineFragment$a;
import du2.g;

public class VoicePartySearchOnlineFragment extends RecyclerFragment	// class@001800
{
    public b F;
    public String G;
    public String H;
    public int I;
    public boolean J;
    public b K;
    public String L;
    public ClientContent$LiveStreamPackage M;
    public ClientContent$LiveVoicePartyPackageV2 N;
    public e0 O;

    public void VoicePartySearchOnlineFragment(){
       super();
    }
    public static VoicePartySearchOnlineFragment Gh(String p0,String p1,boolean p2,int p3,b p4,ClientContent$LiveStreamPackage p5,ClientContent$LiveVoicePartyPackageV2 p6,e0 p7){
       Bundle obj;
       if (PatchProxy.isSupport(VoicePartySearchOnlineFragment.class)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Integer.valueOf(p3),p4,p5,p6,p7};
          obj = PatchProxy.apply(objArray, null, VoicePartySearchOnlineFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Bundle();
       obj.putString("liveStreamId", p0);
       obj.putString("voicePartyId", p1);
       obj.putBoolean("key_should_show_order_music_info", p2);
       obj.putInt("MIC_ID", p3);
       VoicePartySearchOnlineFragment voicePartySe = new VoicePartySearchOnlineFragment();
       voicePartySe.setArguments(obj);
       voicePartySe.F = p4;
       voicePartySe.M = p5;
       voicePartySe.N = p6;
       voicePartySe.O = p7;
       return voicePartySe;
    }
    public void Hh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartySearchOnlineFragment.class, "2")) {
          return;
       }
       this.L = p0;
       if (this.isAdded()) {
          this.q().h2(p0);
          this.a();
       }
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartySearchOnlineFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartySearchOnlineFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartySearchOnlineFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str = "liveStreamId";
          if (p0.containsKey(str)) {
             String str1 = "voicePartyId";
             if (p0.containsKey(str1) && p0.containsKey("MIC_ID")) {
                this.G = p0.getString(str);
                this.H = p0.getString(str1);
                this.I = p0.getInt("MIC_ID");
                this.J = p0.getBoolean("key_should_show_order_music_info", false);
             }
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VoicePartySearchOnlineFragment.class, "7")) {
          return;
       }
       super.onDestroyView();
       b9.a(this.K);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartySearchOnlineFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.setBackgroundColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f06008d));
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartySearchOnlineFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i oi = new i(this.J, new VoicePartySearchOnlineFragment$a(this), this.M, this.N, this.O);
       return obj;
    }
    public i yh(){
       a obj = PatchProxy.apply(null, this, VoicePartySearchOnlineFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.G, this.H);
       obj.h2(this.L);
       return obj;
    }
}
