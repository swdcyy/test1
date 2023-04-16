package com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import dx2.h;
import bk2.e;
import hx2.a;
import bk2.e$a;
import y8c.t;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dx2.o;
import lnc.a1;
import dx2.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import dx2.p;
import java.lang.Boolean;
import y8c.g;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a;
import com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import qvb.i;
import com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment$b;

public class VoicePartyTheaterTubeSearchFragment extends RecyclerFragment	// class@001a38
{
    public String F;
    public String G;
    public p H;
    public h I;
    public final e J;
    public static final String K;
    public static final String L;
    public static final String M;

    static {
       String name = VoicePartyTheaterTubeSearchFragment.class.getName();
       VoicePartyTheaterTubeSearchFragment.K = name;
       VoicePartyTheaterTubeSearchFragment.L = name+"_tab_id";
       StringBuilder str = name;
       VoicePartyTheaterTubeSearchFragment.M = str+"_keyword";
    }
    public void VoicePartyTheaterTubeSearchFragment(){
       super();
       this.I = h.a;
       this.J = new e(new a(this));
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeSearchFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(this, 0x7f0805fc, a1.p(0x7f105113), true);
    }
    public a Gh(a p0){
       a i = p0.i;
       if (i != null) {
          i.keyword = this.G;
       }
       p0.e = "search_list";
       return p0;
    }
    public boolean S0(){
       return false;
    }
    public boolean S1(){
       return true;
    }
    public int getLayoutResId(){
       return 0x7f0d16ef;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterTubeSearchFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyTheaterTubeSearchFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeSearchFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.H = p.c(this);
       this.F = this.requireArguments().getString(VoicePartyTheaterTubeSearchFragment.L);
       this.G = this.requireArguments().getString(VoicePartyTheaterTubeSearchFragment.M);
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(VoicePartyTheaterTubeSearchFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, VoicePartyTheaterTubeSearchFragment.class, "5")) {
          return;
       }
       if (p0) {
          this.J.e();
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeSearchFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.H, new VoicePartyTheaterTubeSearchFragment$a(this));
    }
    public boolean x0(){
       return false;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeSearchFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterTubeSearchFragment$b(this);
    }
}
