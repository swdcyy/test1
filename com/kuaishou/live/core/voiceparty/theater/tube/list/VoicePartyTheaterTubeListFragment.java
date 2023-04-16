package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import dx2.h;
import bk2.e;
import fx2.a;
import bk2.e$a;
import y8c.t;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dx2.o;
import lnc.a1;
import dx2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import y8c.g;
import g9c.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.b;
import com.kuaishou.live.core.voiceparty.theater.tube.b$a;
import com.yxcorp.gifshow.tube.TubeInfo;
import fx2.b;
import msd.a;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import dx2.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import qvb.i;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment$b;

public class VoicePartyTheaterTubeListFragment extends RecyclerFragment	// class@001a10
{
    public String F;
    public String G;
    public int H;
    public String I;
    public p J;
    public h K;
    public final e L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;

    static {
       String name = VoicePartyTheaterTubeListFragment.class.getName();
       VoicePartyTheaterTubeListFragment.M = name;
       VoicePartyTheaterTubeListFragment.N = name+"_tab_id";
       VoicePartyTheaterTubeListFragment.O = name+"_tab_name";
       VoicePartyTheaterTubeListFragment.P = name+"_tube_channel_id";
       StringBuilder str = name;
       VoicePartyTheaterTubeListFragment.Q = str+"_tube_channel_name";
    }
    public void VoicePartyTheaterTubeListFragment(){
       super();
       this.K = h.a;
       this.L = new e(new a(this));
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(this, 0x7f0814f6, a1.p(0x7f102d0b), true);
    }
    public a Gh(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeListFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Hh(p0, new VoicePartyTheaterTubeFeedWithEpisodes());
    }
    public a Hh(a p0,VoicePartyTheaterTubeFeedWithEpisodes p1){
       ClientContent$TagPackage obj = PatchProxy.applyTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          p0 = new a();
       }
       obj = new ClientContent$TagPackage();
       obj.identity = String.valueOf(this.H);
       obj.name = this.I;
       p0.f = this.G;
       p0.h = obj;
       p0.b = p1;
       if (TextUtils.equals(this.F, "playListTab")) {
          p0.e = "play_list";
       }else if(TextUtils.equals(this.F, "episodeListTab")){
          p0.e = "video_list";
       }else {
          p0.e = "activity_list";
       }
       return p0;
    }
    public void Ih(int p0){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTheaterTubeListFragment.class, "9")) {
          return;
       }
       VoicePartyTheaterTubeFeedWithEpisodes voicePartyTh = this.g7().N0(p0);
       if (this.K0() && voicePartyTh != null) {
          b.h0.a().p(voicePartyTh.mTube.mTubeId, new b(this, p0));
       }
       return;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return true;
    }
    public int getLayoutResId(){
       return 0x7f0d16e9;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeListFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyTheaterTubeListFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.requireArguments().getString(VoicePartyTheaterTubeListFragment.N);
       this.G = this.requireArguments().getString(VoicePartyTheaterTubeListFragment.O);
       this.H = this.requireArguments().getInt(VoicePartyTheaterTubeListFragment.P);
       this.I = this.requireArguments().getString(VoicePartyTheaterTubeListFragment.Q);
       this.J = p.c(this);
       return;
    }
    public void u(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyTheaterTubeListFragment.class, "7")) {
          return;
       }
       super.u();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyTheaterTubeListFragment.class, "8")) {
          LinearLayoutManager layoutManage = this.h0().getLayoutManager();
          if (layoutManage != null) {
             int i1 = layoutManage.c();
             for (int i = layoutManage.i0(); i <= i1; i = i2) {
                int i2 = i + 1;
                this.Ih(i);
             }
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyTheaterTubeListFragment.class, "6")) {
          return;
       }
       if (p0) {
          this.L.e();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.J, new VoicePartyTheaterTubeListFragment$a(this));
    }
    public boolean x0(){
       return true;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterTubeListFragment$b(this, this.H);
    }
}
