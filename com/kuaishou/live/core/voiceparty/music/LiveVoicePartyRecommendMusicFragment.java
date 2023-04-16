package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyRecommendMusicFragment;
import tt2.v;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import y8c.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyRecommendMusicFragment$a;
import java.util.List;
import java.lang.Integer;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicChannelResponse$Channel;
import tt2.a;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.android.model.music.Music;
import ut2.c;
import tt2.w;
import tt2.p;
import tt2.n;
import java.lang.Runnable;
import ok.h;
import java.util.Map;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicChannelResponse;
import ut2.m;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import ut2.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import tt2.o;
import y8c.g;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import qvb.i;
import qu2.a;
import co2.f2;
import fs2.f;
import vt2.c;

public class LiveVoicePartyRecommendMusicFragment extends RecyclerFragment implements v	// class@0017cc
{
    public int F;
    public int G;
    public List H;
    public String I;
    public String J;
    public String K;
    public m L;
    public static final int M;

    public void LiveVoicePartyRecommendMusicFragment(){
       super();
       this.F = -1;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyRecommendMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new LiveVoicePartyRecommendMusicFragment$a(this, this);
    }
    public final int Gh(int p0,List p1){
       if (PatchProxy.isSupport(LiveVoicePartyRecommendMusicFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, LiveVoicePartyRecommendMusicFragment.class, "18");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i = 0;
       while (true) {
          if (i >= p1.size()) {
             return -1;
          }
          if (p1.get(i).mId == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public final a Hh(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyRecommendMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.Ih();
    }
    public final LiveVoicePartyKtvMusicFragment Ih(){
       c obj = PatchProxy.apply(null, this, LiveVoicePartyRecommendMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParentFragment().getFragmentManager();
       Fragment uFragment = (obj != null)? obj.findFragmentByTag("LiveVoicePartyKtvMusicFragment"): this.getParentFragment();
       return uFragment;
    }
    public final int Jh(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyRecommendMusicFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int intx = a.a.getInt(b.d("user")+"voicePartyKtvSelectedChannelId", 0);
       if (intx >= 0 && this.Gh(intx, p0) > 0) {
          return intx;
       }
       if (this.Gh(0, p0) > 0) {
          return 0;
       }
       return p0.get(0).mId;
    }
    public boolean S0(){
       return false;
    }
    public void ad(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartyRecommendMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartyRecommendMusicFragment.class, "16")) {
          return;
       }
       if (this.Hh() != null) {
          this.Hh().Sb(p0, 1, this.G, p1);
       }
       return;
    }
    public void gb(Music p0,int p1){
       if (PatchProxy.isSupport(LiveVoicePartyRecommendMusicFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, LiveVoicePartyRecommendMusicFragment.class, "15")) {
          return;
       }
       if (this.Hh() != null) {
          this.Hh().yc(p0, 1, this.G, p1);
       }
       return;
    }
    public void gc(Music p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyRecommendMusicFragment.class, "14")) {
          return;
       }
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, LiveVoicePartyRecommendMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else if(this.getParentFragment() == null){
          objArray = this.getParentFragment().Sh();
       }
       if (objArray == null) {
          return;
       }else {
          objArray.a(p0, new p(this, p0, p1), new n(this));
          return;
       }
    }
    public int getLayoutResId(){
       return 0x7f0d0e70;
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyRecommendMusicFragment.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(LiveVoicePartyRecommendMusicFragment.class, null);
       return objectsByTag;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyRecommendMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.I = this.getArguments().getString("liveStreamId", null);
       this.J = this.getArguments().getString("voicePartyId", null);
       this.K = this.getArguments().getString("ktvId");
       LiveVoicePartyMusicChannelResponse serializable = SerializableHook.getSerializable(this.getArguments(), "musicChannel");
       if (serializable != null) {
          this.H = serializable.mMusicChannels;
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyRecommendMusicFragment.class, "5")) {
          return;
       }
       super.onDestroy();
       LiveVoicePartyRecommendMusicFragment tL = this.L;
       if (tL != null) {
          tL.s1(null);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyRecommendMusicFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoid(null, this, LiveVoicePartyRecommendMusicFragment.class, "6")) {
          LiveVoicePartyRecommendMusicFragment tH = this.H;
          if (tH != null && !tH.isEmpty()) {
             RecyclerView recyclerView = this.getView().findViewById(R.id.live_voice_party_music_recommend_label);
             LinearLayoutManager linearLayout = new LinearLayoutManager(this.getContext());
             int i = 0;
             linearLayout.setOrientation(i);
             recyclerView.setLayoutManager(linearLayout);
             b uob = new b(this.H);
             int i1 = this.Gh(this.Jh(this.H), this.H);
             if (i1 >= 0) {
                i = i1;
             }
             uob.g = i;
             recyclerView.setAdapter(uob);
             uob.f = new o(this);
          }
       }
       return;
    }
    public g vh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       m obj = PatchProxy.apply(objArray, this, LiveVoicePartyRecommendMusicFragment.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       LiveVoicePartyKtvMusicDownloadHelper liveVoicePar = PatchProxy.apply(objArray, this, LiveVoicePartyRecommendMusicFragment.class, "10");
       if (liveVoicePar != patchProxyRe) {
       }else {
          liveVoicePar = this.requireParentFragment().Rh();
       }
       obj = new m(liveVoicePar);
       this.L = obj;
       obj.s1(this);
       return this.L;
    }
    public i yh(){
       Object[] objArray = null;
       LiveVoicePartyRecommendMusicFragment obj = PatchProxy.apply(objArray, this, LiveVoicePartyRecommendMusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H;
       if (obj == null || obj.isEmpty()) {
          return objArray;
       }
       int i = this.Jh(this.H);
       this.G = i;
       f.c(1, i, this.Ih().Q, this.Ih().P);
       return new c(this.I, this.J, this.K, this.G);
    }
}
