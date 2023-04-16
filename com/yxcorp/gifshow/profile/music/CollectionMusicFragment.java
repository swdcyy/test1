package com.yxcorp.gifshow.profile.music.CollectionMusicFragment;
import k3c.v1;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.profile.music.b;
import p2c.p0;
import e4c.v;
import com.kwai.feature.post.api.music.data.MusicSource;
import android.view.View;
import e4c.c0;
import com.yxcorp.gifshow.common_music_player.MusicListPlayerView;
import p2c.w;
import p2c.a;
import p2c.j0;
import y8c.t;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$c;
import s1c.r0;
import npb.c;
import qm9.d0;
import java.util.Objects;
import androidx.fragment.app.Fragment;
import s1c.a1;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import qa6.a;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import y3c.z;
import com.yxcorp.utility.SystemUtil;
import f2c.d;
import java.lang.StringBuilder;
import q87.c;
import kob.r;
import java.lang.Throwable;
import java.util.List;
import y3c.n;
import java.util.Map;
import m56.f;
import android.os.Bundle;
import com.yxcorp.gifshow.common_music_player.MusicExperienceUtils;
import tkd.b;
import tkd.d;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.music.utils.f$a;
import com.yxcorp.gifshow.music.utils.f;
import lnc.u1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$b;
import crd.b;
import ok.h;
import lnc.b9;
import android.widget.RelativeLayout;
import android.content.Context;
import i2b.a;
import android.widget.RelativeLayout$LayoutParams;
import com.yxcorp.utility.n;
import r2c.j;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import com.kuaishou.android.model.music.Music;
import com.kwai.framework.activitycontext.ActivityContext;
import androidx.recyclerview.widget.RecyclerView;
import xa5.a;
import uh5.e;
import lnc.p8;
import ip5.a;
import y3c.h;
import com.trello.rxlifecycle3.android.FragmentEvent;
import erd.g;
import eoc.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import zf6.j;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$f;
import androidx.recyclerview.widget.RecyclerView$r;
import y8c.g;
import g9c.a;
import qvb.i;
import y3c.a;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$d;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import o2c.f;
import com.yxcorp.gifshow.profile.music.CollectionMusicFragment$e;

public class CollectionMusicFragment extends RecyclerFragment implements v1	// class@0013fa
{
    public String F;
    public r0 G;
    public boolean H;
    public View I;
    public FragmentCompositeLifecycleState J;
    public b K;
    public LinearLayoutManager L;
    public v M;
    public c0 N;
    public r O;
    public d0 P;
    public z Q;
    public boolean R;
    public boolean S;
    public PublishSubject T;
    public a U;
    public b V;
    public boolean W;
    public f$a X;

    public void CollectionMusicFragment(){
       super();
       this.F = "MUSIC";
       this.H = false;
       this.R = false;
       this.S = false;
       this.T = PublishSubject.g();
       this.V = null;
       this.W = false;
       this.X = new CollectionMusicFragment$a(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, CollectionMusicFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new b());
       obj.U7(new p0(this));
       CollectionMusicFragment tI = this.I;
       if (tI != null) {
          if (this.W == null) {
             v ov = new v(tI, MusicSource.PROFILE_COLLECT_TAB_MUSIC, false);
             this.M = ov;
             obj.U7(ov);
          }else {
             c0 uoc0 = new c0(tI);
             this.N = uoc0;
             obj.U7(uoc0);
          }
       }
       obj.U7(new w());
       obj.U7(new a());
       obj.U7(new j0());
       PatchProxy.onMethodExit(CollectionMusicFragment.class, "11");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new CollectionMusicFragment$c(this, this, this.G);
    }
    public void Fc(r0 p0){
       this.G = p0;
    }
    public final String Gh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       CollectionMusicFragment obj = PatchProxy.apply(objArray, this, CollectionMusicFragment.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.P;
       if (obj != null && obj.a() != null) {
          obj = this.P;
          Objects.requireNonNull(obj);
          objArray = PatchProxy.apply(objArray, obj, d0.class, "5");
          if (objArray != patchProxyRe) {
          }else {
             d0 b = obj.b;
             String id = (b != null)? b.getId(): "";
             objArray = id;
          }
       }
       return objArray;
    }
    public Fragment Hh(){
       Fragment obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getParentFragment();
       while (true) {
          if (obj == null) {
             return obj;
          }
          if (obj instanceof a1) {
             break ;
          }else {
             obj = obj.getParentFragment();
          }
       }
       return obj;
    }
    public boolean Ih(){
       CollectionMusicFragment obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.G;
       boolean b = (obj != null && a.b(obj.b))? true: false;
       return b;
    }
    public void Jh(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, CollectionMusicFragment.class, "28")) {
          return;
       }
       CollectionMusicFragment tP = this.P;
       if (tP != null) {
          CollectionMusicFragment tM = this.M;
          if (tM != null) {
             tP.e(tM.H);
          }else {
             tM = this.N;
             if (tM != null) {
                Objects.requireNonNull(tM);
                c0 obj = PatchProxy.apply(objArray, tM, c0.class, "5");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else {
                   obj = tM.q;
                   b = (obj != null && !obj.getVisibility())? true: false;
                }
                tP.e(b);
             }
          }
       }
       return;
    }
    public void Kh(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "29")) {
          return;
       }
       if (!this.J.c()) {
          return;
       }
       Boolean uBoolean = 1;
       boolean b = false;
       if (this.R != null) {
          CollectionMusicFragment tQ = this.Q;
          if (tQ != null) {
             if (this.S != null) {
                tQ.b(this.Gh());
             label_003e :
                if (this.W == null) {
                   if (this.S != null) {
                      this.S = b;
                      this.T.onNext(Boolean.FALSE);
                   }else if(this.P == null){
                      return;
                   }else if(SystemUtil.K()){
                      Object[] objArray = new Object[b];
                      d.C().w("CollectionMusicFragment", "mPipedMusicMemorizer.isPlaying: "+this.P.c(), objArray);
                      objArray = new Object[b];
                      d.C().w("CollectionMusicFragment", "mCloudMusicController.isPlaying: "+this.O.isPlaying(), objArray);
                      Object[] objArray1 = new Object[b];
                      d.C().w("CollectionMusicFragment", "mCloudMusicController.position: "+this.O.getCurrentPosition(), objArray1);
                   }
                   if (!this.O.isPlaying() && (this.R != null || (this.P.f(uBoolean) && (this.O.isPlaying() && this.P.b())))) {
                      this.T.onNext(Boolean.TRUE);
                   }
                }
                return;
             }else if(this.O != null){
                tQ.b(this.Gh());
                tQ = this.P;
                if (tQ != null) {
                   tQ.f(uBoolean);
                }
             }
          }
       }
       uBoolean = null;
       goto label_003e ;
    }
    public void M1(boolean p0,Throwable p1){
       if (PatchProxy.isSupport(CollectionMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, CollectionMusicFragment.class, "20")) {
          return;
       }
       this.sh().x();
       this.sh().k(p0, p1);
       return;
    }
    public boolean S1(){
       return false;
    }
    public boolean Xg(){
       return false;
    }
    public void Z1(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CollectionMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CollectionMusicFragment.class, "10")) {
          return;
       }
       if (p0) {
          CollectionMusicFragment tM = this.M;
          if (tM != null) {
             tM.X8(8);
          }
          tM = this.P;
          if (tM != null) {
             tM.d = false;
          }
       }
       return;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "24")) {
          return;
       }
       super.c0();
       this.O.pause();
       return;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       obj.add(this);
       obj.add(this.G);
       return obj;
    }
    public void ga(boolean p0){
       this.H = p0;
    }
    public int getLayoutResId(){
       return 0x7f0d127f;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, CollectionMusicFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, CollectionMusicFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(CollectionMusicFragment.class, new n());
       }else {
          obj.put(CollectionMusicFragment.class, null);
       }
       return obj;
    }
    public boolean h9(){
       return this.H;
    }
    public boolean lh(){
       return true;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment.class, "33")) {
          return;
       }
       CollectionMusicFragment tO = this.O;
       if (tO != null && (tO.isPlaying() && (this.O.getCurrent() != null && this.O.getCurrent().a()))) {
          this.O.pause();
       }
    label_002e :
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectionMusicFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.W = MusicExperienceUtils.d();
       if (!PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "25")) {
          r or = d.a(-1687636538);
          this.O = or;
          or.qj(true);
          this.O.DD(true);
          this.O.aU(this.getActivity());
          this.P = new d0(this.O);
       }
       if (this.Ih()) {
          f.d(this.X);
       }
       u1.a(this);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       View obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, CollectionMusicFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       View view = super.onCreateView(p0, p1, p2);
       this.J = new FragmentCompositeLifecycleState(this);
       this.K = b9.c(this.K, new CollectionMusicFragment$b(this));
       Fragment uFragment = this.Hh();
       if (uFragment != null) {
          View view1 = uFragment.getView();
          if (!PatchProxy.applyVoidOneRefs(view1, this, CollectionMusicFragment.class, "7")) {
             Objects.toString(view1);
             if (view1 instanceof RelativeLayout) {
                int i = 0x7f0a0813;
                obj = view1.findViewById(i);
                this.I = obj;
                if (obj == null) {
                   if (this.W != null) {
                      MusicListPlayerView musicListPla = new MusicListPlayerView(this.getContext());
                      this.I = musicListPla;
                      musicListPla.g(false);
                      this.I.setEnableMusicRadioGuide(true);
                   }else {
                      this.I = a.a(view1.getContext(), 0x7f0d11da);
                   }
                   this.I.setVisibility(8);
                   this.I.setId(i);
                   int i1 = -1;
                   Context context = view1.getContext();
                   float f = (this.W != null)? 80.00f: 61.50f;
                   RelativeLayout$LayoutParams layoutParams = new RelativeLayout$LayoutParams(i1, n.c(context, f));
                   layoutParams.addRule(12);
                   if (j.c(this)) {
                      layoutParams.bottomMargin = a1.d(0x7f070bf1);
                   }
                   view1.addView(this.I, layoutParams);
                }
             }
          }
       }
       return view;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "32")) {
          return;
       }
       CollectionMusicFragment tV = this.V;
       if (tV != null && !tV.isDisposed()) {
          this.V.dispose();
       }
       if (this.W == null) {
          tV = this.P;
          if (tV != null) {
             c uoc = tV.a();
             c current = this.O.getCurrent();
             if (uoc != null) {
                if (current != null) {
                   if ((current.c().getUniqueCode()).equalsIgnoreCase(uoc.c().getUniqueCode())) {
                      this.O.clear();
                   }
                }else {
                   this.O.clear();
                }
             }
          }
       }
       f.e(this.X);
       super.onDestroy();
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "31")) {
          return;
       }
       super.onDestroyView();
       u1.b(this);
       b9.a(this.K);
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "26")) {
          return;
       }
       super.onPause();
       this.Jh();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "27")) {
          return;
       }
       super.onResume();
       this.Kh();
       this.R = false;
       if (this.W != null) {
          CollectionMusicFragment tO = this.O;
          if (tO != null) {
             tO.HS(null, null);
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "30")) {
          return;
       }
       super.onStop();
       if (!this.getActivity().equals(ActivityContext.g().e())) {
          this.R = true;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CollectionMusicFragment.class, "9")) {
          return;
       }
       super.onViewCreated(p0, p1);
       p0 = p0.findViewById(R.id.refresh_layout);
       if (p0 != null) {
          p0.setBackgroundResource(R.color.arg_RES_7f061b13);
       }
       if (this.h0() != null && a.g(this)) {
          p8.a(this.h0(), e.c());
       }
       f.c(a.class, new h(this), this, FragmentEvent.DESTROY_VIEW);
       return;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "21")) {
          return;
       }
       super.th();
       this.h0().setLayoutManager(this.L);
       this.h0().setBackgroundColor(j.d(this.h0(), R.color.arg_RES_7f061ca5));
       this.h0().addOnScrollListener(new CollectionMusicFragment$f(this));
       return;
    }
    public void v2(boolean p0,boolean p1){
       if (PatchProxy.isSupport(CollectionMusicFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, CollectionMusicFragment.class, "19")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, this, CollectionMusicFragment.class, "23") && this.isAdded()) {
          if (!this.g7().getItemCount()) {
             this.sh().i();
          }else {
             this.sh().f();
             if (this.q().hasMore()) {
                this.sh().g();
             }else {
                this.sh().p();
             }
          }
       }
       return;
    }
    public g vh(){
       a obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(this.T, this.G.b.getId());
       this.U = obj;
       obj.y = new CollectionMusicFragment$d(this);
       return this.U;
    }
    public boolean x0(){
       return false;
    }
    public RecyclerView$LayoutManager xh(){
       NpaLinearLayoutManager obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new NpaLinearLayoutManager(this.getContext());
       this.L = obj;
       return obj;
    }
    public i yh(){
       f obj = PatchProxy.apply(null, this, CollectionMusicFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new f(this.G.b.getId());
       CollectionMusicFragment$e uoe = new CollectionMusicFragment$e(this);
       this.Q = uoe;
       uoe.c(obj);
       return obj;
    }
}
