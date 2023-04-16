package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment;
import tt2.a;
import ml8.d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import android.util.SparseIntArray;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.music.Music;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import java.lang.CharSequence;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyRecommendMusicFragment;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kuaishou.live.core.voiceparty.music.util.LiveVoicePartyKtvMusicDownloadHelper;
import java.lang.Integer;
import tt2.w;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import cjd.e;
import erd.o;
import tt2.e;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$b;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.music.b;
import tt2.d;
import tt2.c;
import mkc.b;
import mkc.c;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyKtvMusicFragment$c;
import java.lang.Runnable;
import ekd.k1;
import ekd.m1;
import com.kwai.feature.component.searchhistory.SearchLayout;
import android.widget.TextView;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMusicChannelResponse$Channel;
import androidx.fragment.app.FragmentActivity;
import android.view.Window;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.util.Objects;
import com.kwai.library.widget.popup.common.c;
import android.view.View$OnKeyListener;
import qu2.a;
import co2.f2;
import fs2.f;
import com.kuaishou.live.core.voiceparty.music.search.c;
import androidx.fragment.app.c;
import tt2.f;
import android.content.Context;
import i2b.a;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;

public class LiveVoicePartyKtvMusicFragment extends TabHostFragment implements a, d	// class@0017c5
{
    public TextView B;
    public View C;
    public SearchLayout D;
    public View E;
    public String F;
    public String G;
    public String H;
    public LiveVoicePartyMusicChannelResponse I;
    public TextView J;
    public TextView K;
    public View L;
    public a M;
    public w N;
    public LiveVoicePartyKtvMusicDownloadHelper O;
    public f2 P;
    public a Q;
    public c R;
    public final SparseIntArray S;
    public final ViewPager$i T;
    public static final int U;

    public void LiveVoicePartyKtvMusicFragment(){
       super();
       this.S = new SparseIntArray();
       this.T = new LiveVoicePartyKtvMusicFragment$a(this);
    }
    public void Ag(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "18")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.Ag();
       }
       return;
    }
    public void Dg(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "20")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.Dg();
       }
       return;
    }
    public int Lb(){
       return 0;
    }
    public void P3(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "21")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.P3(p0);
       }
       return;
    }
    public final b Qh(String p0,Class p1){
       PagerSlidingTabStrip$d obj = PatchProxy.applyTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0.equals(a1.p(0x7f102552)))? new PagerSlidingTabStrip$d(p0, this.L): new PagerSlidingTabStrip$d(p0, p0);
       Bundle uBundle = new Bundle();
       uBundle.putString("tabName", p0);
       uBundle.putString("liveStreamId", this.F);
       uBundle.putString("voicePartyId", this.G);
       uBundle.putString("ktvId", this.H);
       uBundle.putBoolean("isAnchor", this.getArguments().getBoolean("isAnchor", false));
       if (p1 == LiveVoicePartyRecommendMusicFragment.class) {
          SerializableHook.putSerializable(uBundle, "musicChannel", this.I);
       }
       return new b(obj, p1, uBundle);
    }
    public void Rg(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "23")) {
          return;
       }
       this.Uh();
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.Rg(p0);
       }
       return;
    }
    public LiveVoicePartyKtvMusicDownloadHelper Rh(){
       return this.O;
    }
    public boolean S0(){
       return false;
    }
    public void Sb(Music p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveVoicePartyKtvMusicFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveVoicePartyKtvMusicFragment.class, "17")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.Sb(p0, p1, p2, p3);
       }
       return;
    }
    public w Sh(){
       return this.N;
    }
    public void Th(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "10")) {
          return;
       }
       LiveVoicePartyApi.c().o().map(new e()).subscribe(new e(this), new LiveVoicePartyKtvMusicFragment$b(this));
       return;
    }
    public final void Uh(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "12")) {
          return;
       }
       LiveVoicePartyApi.c().r(this.F, this.G, this.H).map(new e()).map(b.b).subscribe(new d(this), new c(this));
       return;
    }
    public void Vh(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "5")) {
          return;
       }
       this.E.setVisibility(0);
       b[] uobArray = new b[]{b.g};
       c.d(this.E, uobArray);
       c.h(this.E, b.e);
       return;
    }
    public final void Wh(int p0){
       if (PatchProxy.isSupport(LiveVoicePartyKtvMusicFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveVoicePartyKtvMusicFragment.class, "13")) {
          return;
       }
       if (this.J == null) {
          return;
       }
       k1.o(new LiveVoicePartyKtvMusicFragment$c(this, p0));
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyKtvMusicFragment.class, "19")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.d9();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "1")) {
          return;
       }
       this.D = m1.f(p0, 0x7f0a37a6);
       this.C = m1.f(p0, 0x7f0a378b);
       this.B = m1.f(p0, 0x7f0a3f7b);
       this.E = m1.f(p0, 0x7f0a23a2);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0e55;
    }
    public void h6(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "22")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.h6(p0);
       }
       return;
    }
    public void me(LiveVoicePartyMusicChannelResponse$Channel p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "24")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.me(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyKtvMusicFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       this.F = this.getArguments().getString("liveStreamId");
       this.G = this.getArguments().getString("voicePartyId");
       this.H = this.getArguments().getString("ktvId");
       if (this.getActivity() != null) {
          this.getActivity().getWindow().setSoftInputMode(32);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveVoicePartyKtvMusicFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       this.doBindView(view);
       return view;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveVoicePartyKtvMusicFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       LiveVoicePartyKtvMusicFragment tR = this.R;
       if (tR != null) {
          Objects.requireNonNull(tR);
          if (p0 instanceof ViewGroup) {
             tR.Y(p0);
          }else {
             p0.setOnKeyListener(tR.e);
          }
       }
       this.Vh();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvMusicFragment.class, "9")) {
          f.b(0, this.Q, this.P);
          c uoc = new c(this.F, this.G, this.H, this.D, this.getFragmentManager(), 0x7f0a378b, this.N);
          p0.l = new f(this);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveVoicePartyKtvMusicFragment.class, "8")) {
          p0 = a.c(this.getContext(), R.layout.arg_RES_7f0d0e6d, objArray);
          this.L = p0;
          this.J = p0.findViewById(0x7f0a2241);
          this.K = this.L.findViewById(0x7f0a3caa);
       }
       this.Th();
       this.Oh(this.T);
       b[] uobArray = new b[]{b.d};
       c.d(this.C, uobArray);
       return;
    }
    public List wh(){
       return null;
    }
    public void yc(Music p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(LiveVoicePartyKtvMusicFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, LiveVoicePartyKtvMusicFragment.class, "16")) {
          return;
       }
       LiveVoicePartyKtvMusicFragment tM = this.M;
       if (tM != null) {
          tM.yc(p0, p1, p2, p3);
       }
       return;
    }
}
