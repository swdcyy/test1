package com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import java.lang.String;
import java.lang.Class;
import java.lang.StringBuilder;
import com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment$a;
import bk2.e;
import gx2.d;
import bk2.e$a;
import y8c.t;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dx2.o;
import lnc.a1;
import java.util.Map;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import dx2.p;
import y8c.g;
import com.kuaishou.live.core.voiceparty.theater.tube.playlist.VoicePartyTheaterPlayListFragment$b;
import gx2.c;
import qvb.i;
import gx2.e;

public class VoicePartyTheaterPlayListFragment extends RecyclerFragment	// class@001a35
{
    public p F;
    public String G;
    public c H;
    public final e I;
    public static final String J;
    public static final String K;

    static {
       String name = VoicePartyTheaterTubeListFragment.class.getName();
       VoicePartyTheaterPlayListFragment.J = name;
       StringBuilder str = name;
       VoicePartyTheaterPlayListFragment.K = str+"_tab_name";
    }
    public void VoicePartyTheaterPlayListFragment(){
       super();
       this.H = new VoicePartyTheaterPlayListFragment$a(this);
       this.I = new e(new d(this));
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayListFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new o(this, 0x7f0814f6, a1.p(0x7f102d11), true);
    }
    public boolean S0(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d16ed;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTheaterPlayListFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(VoicePartyTheaterPlayListFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterPlayListFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = p.c(this);
       this.G = this.requireArguments().getString(VoicePartyTheaterPlayListFragment.K);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayListFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new VoicePartyTheaterPlayListFragment$b(this, this.F, this.H);
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterPlayListFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e(this.F);
    }
}
