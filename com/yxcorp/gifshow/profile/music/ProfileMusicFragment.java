package com.yxcorp.gifshow.profile.music.ProfileMusicFragment;
import com.yxcorp.gifshow.profile.fragment.ProfileTabItemFragment;
import xl8.b;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import d4c.h0;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import com.yxcorp.gifshow.profile.music.e;
import y2c.o;
import y8c.t;
import fx5.h;
import s1c.r0;
import com.kwai.feature.api.social.profile.model.ProfileParam;
import y3c.k0;
import lkd.b;
import com.yxcorp.gifshow.profile.music.c;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.lang.CharSequence;
import l3c.a0;
import npb.c;
import qm9.d0;
import java.lang.Boolean;
import android.widget.FrameLayout;
import qvb.i;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserOwnerCount;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import y8c.g;
import g9c.a;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import java.lang.Throwable;
import java.util.List;
import java.util.ArrayList;
import im8.c;
import y3c.q0;
import java.util.Map;
import m56.f;
import kob.r;
import android.os.Bundle;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import tkd.b;
import tkd.d;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import y3c.m0;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import lnc.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import s1c.a1;
import android.widget.RelativeLayout;
import android.content.Context;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.utility.n;
import xa5.a;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import y3c.z;
import s1c.a;
import io.reactivex.subjects.PublishSubject;
import com.trello.rxlifecycle3.components.support.RxFragment;
import brd.t;
import y3c.l0;
import com.yxcorp.gifshow.profile.music.d;
import erd.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment$d;
import androidx.recyclerview.widget.RecyclerView$r;
import j5c.b;
import com.yxcorp.gifshow.profile.common.event.RxPageBus;
import y3c.b0;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment$a;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment$b;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import com.yxcorp.gifshow.profile.http.f;
import com.yxcorp.gifshow.profile.music.ProfileMusicFragment$c;

public class ProfileMusicFragment extends ProfileTabItemFragment	// class@0013ff
{
    public LoadingView F;
    public LinearLayout G;
    public LinearLayoutManager H;
    public r0 I;
    public b J;
    public b0 K;
    public FragmentCompositeLifecycleState L;
    public b M;
    public r N;
    public d0 O;
    public boolean P;
    public z Q;
    public boolean R;
    public MusicListPlayerView S;
    public b T;
    public static final int U;

    public void ProfileMusicFragment(){
       super();
       this.J = new b("");
       this.P = false;
       this.R = false;
       this.T = null;
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ProfileMusicFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       if (this.R != null) {
          obj.U7(new h0(this.S));
       }
       obj.U7(new e());
       obj.U7(new o());
       PatchProxy.onMethodExit(ProfileMusicFragment.class, "5");
       return obj;
    }
    public t Bh(){
       h obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new h(this, this.I.d);
       obj.f(new k0(this));
       obj.c(c.a);
       obj.h(this.getResources().getString(R.string.feedback_no_more));
       obj.h = this.J;
       return new a0(obj);
    }
    public void Fc(r0 p0){
       this.I = p0;
    }
    public final String Gh(){
       ProfileMusicFragment obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.O;
       if (obj != null && obj.a() != null) {
          return this.O.a().getId();
       }
       return null;
    }
    public final boolean Hh(){
       ProfileMusicFragment obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.S;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public void Ih(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ProfileMusicFragment.class, "18")) {
          return;
       }
       if (!this.isAdded()) {
          return;
       }
       if (!this.q().hasMore()) {
          this.I.b.mOwnerCount.mSong = this.q().getCount();
       }
       this.I.b.notifyChanged();
       if (!this.g7().getItemCount()) {
          this.sh().i();
       }else {
          this.sh().f();
          this.sh().g();
       }
       if (!PatchProxy.applyVoid(objArray, this, ProfileMusicFragment.class, "20")) {
          ProfileMusicFragment tF = this.F;
          if (tF != null) {
             tF.setVisibility(8);
          }
       }
       return;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(ProfileMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, ProfileMusicFragment.class, "15")) {
          return;
       }
       this.Ih();
       return;
    }
    public List fg(){
       ArrayList obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       obj.add(this);
       obj.add(new c("FRAGMENT", this));
       obj.add(this.I);
       obj.add(this.I.e);
       return obj;
    }
    public int getLayoutResId(){
       return 0x7f0d1245;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ProfileMusicFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new q0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, ProfileMusicFragment.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(ProfileMusicFragment.class, new q0());
       }else {
          obj.put(ProfileMusicFragment.class, null);
       }
       return obj;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMusicFragment.class, "30")) {
          return;
       }
       ProfileMusicFragment tN = this.N;
       if (tN != null && (tN.isPlaying() && (this.N.getCurrent() != null && this.N.getCurrent().a()))) {
          this.N.pause();
       }
    label_002e :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ProfileMusicFragment.class, "4")) {
          return;
       }
       super.onCreate(p0);
       this.R = MusicExperienceUtils.d();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ProfileMusicFragment.class, "21")) {
          r or = d.a(-1687636538);
          this.N = or;
          or.qj(true);
          this.N.DD(true);
          this.N.aU(this.getActivity());
          this.O = new d0(this.N);
       }
       if (!PatchProxy.applyVoid(objArray, this, ProfileMusicFragment.class, "25")) {
          if (this.T == null) {
             this.T = new m0(this);
          }
          a.a().a().registerActivityLifecycleCallbacks(this.T);
       }
       u1.a(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MusicListPlayerView obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ProfileMusicFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       if (this.R != null) {
          Object[] objArray = null;
          p1 = PatchProxy.apply(objArray, this, ProfileMusicFragment.class, "6");
          if (p1 != patchProxyRe) {
             objArray = p1;
          }else {
             for (Fragment parentFragme = this.getParentFragment(); parentFragme != null; parentFragme = parentFragme.getParentFragment()) {
                if (parentFragme instanceof a1) {
                   objArray = parentFragme.getView();
                   break ;
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(objArray, this, ProfileMusicFragment.class, "2") && objArray instanceof RelativeLayout) {
             int i = 0x7f0a3298;
             obj = objArray.findViewById(i);
             this.S = obj;
             if (obj == null) {
                obj = new MusicListPlayerView(this.getContext());
                this.S = obj;
                obj.g(false);
                this.S.setVisibility(8);
                this.S.setId(i);
                int i1 = -1;
                Context context = objArray.getContext();
                float f = (MusicExperienceUtils.d())? 80.00f: 61.50f;
                RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i1, n.c(context, f));
                layoutParams.addRule(12);
                Object obj1 = PatchProxy.applyOneRefs(this, this, ProfileMusicFragment.class, "3");
                boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): a.g(this);
                if (b) {
                   layoutParams.bottomMargin = a1.d(0x7f070bf1);
                }
                objArray.addView(this.S, layoutParams);
             }
          }
       }
    label_00bc :
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "24")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "26") && this.T != null) {
          a.a().a().unregisterActivityLifecycleCallbacks(this.T);
          this.T = null;
       }
       if (this.R == null) {
          this.N.clear();
       }
       b9.a(this.M);
       u1.b(this);
       super.onDestroy();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "22")) {
          return;
       }
       super.onPause();
       if (this.O != null && this.L.c()) {
          this.O.e(this.Hh());
       }
       return;
    }
    public void onResume(){
       ProfileMusicFragment tN;
       if (PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "23")) {
          return;
       }
       super.onResume();
       if (!PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "27") && (this.L.c() && this.P != null)) {
          tN = this.Q;
          if (tN != null) {
             tN.b(this.Gh());
             tN = this.I;
             if (tN != null && tN.e != null) {
                tN = this.O;
                if (tN != null && (tN.f(true) && (this.R == null || this.O.b()))) {
                   this.I.e.h.onNext(Boolean.TRUE);
                }
             }
          }
       }
    label_005b :
       if (this.R != null) {
          tN = this.N;
          if (tN != null) {
             tN.HS(null, null);
          }
       }
       this.P = false;
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileMusicFragment.class, "8")) {
          return;
       }
       super.onViewCreated(p0, p1);
       FragmentCompositeLifecycleState uFragmentCom = new FragmentCompositeLifecycleState(this);
       this.L = uFragmentCom;
       this.M = uFragmentCom.j().subscribe(new l0(this), d.b);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, ProfileMusicFragment.class, "16")) {
          return;
       }
       super.th();
       this.h0().setLayoutManager(this.H);
       this.h0().setBackgroundColor(this.getResources().getColor(R.color.arg_RES_7f0600a1));
       this.h0().addOnScrollListener(new ProfileMusicFragment$d(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(ProfileMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, ProfileMusicFragment.class, "14")) {
          return;
       }
       super.v2(p0, p1);
       this.Ih();
       ProfileMusicFragment tI = this.I;
       if (tI != null) {
          r0 e = tI.e;
          if (e != null) {
             e.d.b("PROFILE_FEED_LOAD", "MAIN_KEY", b.a(tI.c, this.q().hasMore(), this.q().getCount()));
          }
       }
       return;
    }
    public g vh(){
       b0 obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b0(this.I.e.h, this.J);
       this.K = obj;
       obj.A = new ProfileMusicFragment$a(this);
       this.K.B = new ProfileMusicFragment$b(this);
       return this.K;
    }
    public RecyclerView$LayoutManager xh(){
       NpaLinearLayoutManager obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NpaLinearLayoutManager(this.getContext());
       this.H = obj;
       return obj;
    }
    public i yh(){
       f obj = PatchProxy.apply(null, this, ProfileMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f(this.I.b.getId(), this.J);
       ProfileMusicFragment$c uoc = new ProfileMusicFragment$c(this);
       this.Q = uoc;
       uoc.c(obj);
       return obj;
    }
}
