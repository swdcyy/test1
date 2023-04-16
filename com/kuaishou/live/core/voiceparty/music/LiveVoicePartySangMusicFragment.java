package com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment;
import tt2.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment$b;
import tt2.a;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.kuaishou.android.model.music.Music;
import java.lang.Integer;
import ut2.c;
import tt2.w;
import tt2.r;
import tt2.q;
import java.lang.Runnable;
import ok.h;
import java.util.Map;
import android.os.Bundle;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import y8c.g;
import ut2.p;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import qvb.i;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment$a;

public class LiveVoicePartySangMusicFragment extends RecyclerFragment implements v	// class@0017cf
{
    public String F;
    public String G;
    public String H;
    public View I;
    public static final int J;

    public void LiveVoicePartySangMusicFragment(){
       super();
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartySangMusicFragment$b(this);
    }
    public final a Gh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Hh();
    }
    public final LiveVoicePartyKtvMusicFragment Hh(){
       c obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParentFragment().getFragmentManager();
       Fragment uFragment = (obj != null)? obj.findFragmentByTag("LiveVoicePartyKtvMusicFragment"): this.getParentFragment();
       return uFragment;
    }
    public boolean S0(){
       return false;
    }
    public void ad(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartySangMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartySangMusicFragment.class, "12")) {
          return;
       }
       if (this.Gh() != null) {
          this.Gh().Sb(p0, 3, -1, p1);
       }
       return;
    }
    public void gb(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartySangMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartySangMusicFragment.class, "11")) {
          return;
       }
       if (this.Gh() != null) {
          this.Gh().yc(p0, 3, -1, p1);
       }
       return;
    }
    public void gc(Music p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartySangMusicFragment.class, "9")) {
          return;
       }
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveVoicePartySangMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.getParentFragment() == null){
          objArray = this.getParentFragment().Sh();
       }
       if (objArray == null) {
          return;
       }else {
          objArray.a(p0, new r(this, p0, p1), new q(this));
          return;
       }
    }
    public int getLayoutResId(){
       return 0x7f0d0e71;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartySangMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveVoicePartySangMusicFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySangMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getString("liveStreamId", null);
       this.G = this.getArguments().getString("voicePartyId", null);
       this.H = this.getArguments().getString("ktvId");
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartySangMusicFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.I = p0.findViewById(0x7f0a27aa);
       p0.w = this;
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p(this.Hh().Rh());
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartySangMusicFragment$a(this);
    }
}
