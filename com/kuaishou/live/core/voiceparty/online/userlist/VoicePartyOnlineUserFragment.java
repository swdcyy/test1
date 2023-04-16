package com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment$b;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import mkc.b;
import android.view.View;
import mkc.c;
import ekd.m1;
import com.yxcorp.gifshow.widget.LiveEmptyView;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import zf6.j;
import java.lang.Boolean;
import y8c.g;
import du2.i;
import com.kuaishou.live.core.voiceparty.online.userlist.VoicePartyOnlineUserFragment$a;
import du2.g;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import k2b.e0;
import qvb.i;
import du2.h;

public class VoicePartyOnlineUserFragment extends RecyclerFragment implements d	// class@001807
{
    public String F;
    public String G;
    public int H;
    public boolean I;
    public LiveEmptyView J;
    public ViewGroup K;
    public b L;
    public ClientContent$LiveStreamPackage M;
    public ClientContent$LiveVoicePartyPackageV2 N;
    public e0 O;
    public static final int P;

    public void VoicePartyOnlineUserFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyOnlineUserFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyOnlineUserFragment$b(this);
    }
    public void Gh(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment.class, "6")) {
          return;
       }
       this.J.setVisibility(8);
       this.h0().setVisibility(8);
       this.K.setVisibility(0);
       b[] uobArray = new b[]{b.g};
       c.d(this.K, uobArray);
       c.h(this.K, b.e);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyOnlineUserFragment.class, "1")) {
          return;
       }
       this.K = m1.f(p0, 0x7f0a44d6);
       this.J = m1.f(p0, 0x7f0a44d5);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e6b;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyOnlineUserFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyOnlineUserFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyOnlineUserFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 != null) {
          String str = "liveStreamId";
          if (p0.containsKey(str)) {
             String str1 = "voicePartyId";
             if (p0.containsKey(str1) && p0.containsKey("MIC_ID")) {
                this.F = p0.getString(str);
                this.G = p0.getString(str1);
                this.H = p0.getInt("MIC_ID");
                this.I = p0.getBoolean("key_should_show_order_music_info", false);
             }
          }
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment.class, "3")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyOnlineUserFragment.class, "5")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.Gh();
       this.J.setEmptyImage(j.n(this.getContext(), R.drawable.arg_RES_7f080e49, 0x7f0616aa));
       this.J.setEmptyText(R.string.arg_RES_7f102e45);
       return;
    }
    public int qh(){
       return 0x7f0a44da;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOnlineUserFragment.class, "11")) {
          return;
       }
       super.u();
       if (!this.uh()) {
          this.a();
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoicePartyOnlineUserFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyOnlineUserFragment.class, "9")) {
          return;
       }
       super.v2(p0, p1);
       b[] uobArray = new b[]{b.e};
       c.d(this.K, uobArray);
       this.K.setVisibility(8);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyOnlineUserFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i oi = new i(this.I, new VoicePartyOnlineUserFragment$a(this), this.M, this.N, this.O);
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyOnlineUserFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this.F, this.G);
    }
}
