package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$Style;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$a;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$c;
import tt2.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import com.kwai.library.widget.popup.common.c;
import java.lang.Boolean;
import qvb.i;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.util.Map;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import ut2.l;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$b;

public class LiveVoicePartyOrderedMusicFragment extends RecyclerFragment	// class@0017ca
{
    public String F;
    public String G;
    public String H;
    public boolean I;
    public b J;
    public a K;
    public LiveVoicePartyOrderedMusicFragment$Style L;
    public l$f M;

    public void LiveVoicePartyOrderedMusicFragment(){
       super();
       this.L = LiveVoicePartyOrderedMusicFragment$Style.OrderMusicStation;
       this.M = new LiveVoicePartyOrderedMusicFragment$a(this);
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyOrderedMusicFragment$c(this, this);
    }
    public a Gh(){
       LiveVoicePartyOrderedMusicFragment obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          return obj;
       }
       Fragment parentFragme = this.getParentFragment();
       if (parentFragme == null) {
          return null;
       }
       c fragmentMana = parentFragme.getFragmentManager();
       if (fragmentMana != null) {
          return fragmentMana.findFragmentByTag("LiveVoicePartyKtvMusicFragment");
       }
       if (parentFragme instanceof a) {
          return parentFragme;
       }
       return null;
    }
    public void Hh(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyOrderedMusicFragment.class, "7")) {
          return;
       }
       LiveVoicePartyOrderedMusicFragment tJ = this.J;
       if (tJ != null && tJ.K()) {
          this.J.q(2);
       }
       return;
    }
    public boolean Ih(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       if (this.q().getItem(i).status > 1) {
          i = true;
       }
       return i;
    }
    public boolean S0(){
       return false;
    }
    public int getLayoutResId(){
       return 0x7f0d0e6e;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyOrderedMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveVoicePartyOrderedMusicFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyOrderedMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getString("liveStreamId");
       this.G = this.getArguments().getString("voicePartyId");
       this.H = this.getArguments().getString("ktvId");
       this.I = this.getArguments().getBoolean("isAnchor", false);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyOrderedMusicFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0.z = this.M;
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new l(this.L, this.I, this.getChildFragmentManager());
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyOrderedMusicFragment$b(this);
    }
}
