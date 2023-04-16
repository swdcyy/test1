package com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment;
import tt2.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kuaishou.live.core.voiceparty.music.j;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import gka.h;
import tt2.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import android.os.IBinder;
import android.content.Context;
import com.yxcorp.utility.n;
import com.kuaishou.android.model.music.Music;
import java.lang.Integer;
import ut2.c;
import tt2.t;
import tt2.s;
import java.lang.Runnable;
import ok.h;
import tt2.w;
import java.util.Map;
import android.os.Bundle;
import ut2.m;
import y8c.g;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment$a;
import androidx.recyclerview.widget.RecyclerView$i;
import qvb.i;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment$b;

public class LiveVoicePartySearchMusicFragment extends RecyclerFragment implements v	// class@0017d2
{
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public w K;
    public m L;
    public static final int M;

    public void LiveVoicePartySearchMusicFragment(){
       super();
       this.K = j.a;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySearchMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
    public final a Gh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySearchMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getFragmentManager().findFragmentByTag("LiveVoicePartyKtvMusicFragment");
    }
    public void Hh(RecyclerView$Adapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchMusicFragment.class, "5")) {
          return;
       }
       if (p0.getItemCount() > 0) {
          n.E(this.getActivity(), this.getView().getWindowToken());
       }
       return;
    }
    public boolean S0(){
       return false;
    }
    public void ad(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartySearchMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartySearchMusicFragment.class, "9")) {
          return;
       }
       if (this.Gh() != null) {
          this.Gh().Sb(p0, 4, -1, p1);
       }
       return;
    }
    public void gb(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartySearchMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartySearchMusicFragment.class, "8")) {
          return;
       }
       if (this.Gh() != null) {
          this.Gh().yc(p0, 4, -1, p1);
       }
       return;
    }
    public void gc(Music p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartySearchMusicFragment.class, "7")) {
          return;
       }
       this.K.a(p0, new t(this, p0, p1), new s(this));
       return;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartySearchMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveVoicePartySearchMusicFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartySearchMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getString("musicSearchKey", null);
       this.G = this.getArguments().getString("liveStreamId", null);
       this.H = this.getArguments().getString("voicePartyId", null);
       this.I = this.getArguments().getString("ktvId", null);
       this.J = this.getArguments().getString("ssid", null);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartySearchMusicFragment.class, "2")) {
          return;
       }
       super.onDestroy();
       LiveVoicePartySearchMusicFragment tL = this.L;
       if (tL != null) {
          tL.s1(null);
       }
       return;
    }
    public g vh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, LiveVoicePartySearchMusicFragment.class, "4");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveVoicePartyKtvMusicDownloadHelper liveVoicePar = PatchProxy.apply(objArray, this, LiveVoicePartySearchMusicFragment.class, "11");
       if (liveVoicePar != patchProxyRe) {
       }else {
          liveVoicePar = this.getFragmentManager().findFragmentByTag("LiveVoicePartyKtvMusicFragment").Rh();
       }
       obj = new m(liveVoicePar);
       obj.s1(this);
       obj.F0(new LiveVoicePartySearchMusicFragment$a(this, obj));
       this.L = obj;
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySearchMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartySearchMusicFragment$b(this);
    }
}
