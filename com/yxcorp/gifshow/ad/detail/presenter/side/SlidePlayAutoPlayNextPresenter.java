package com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.util.BitSet;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.side.SlidePlayAutoPlayNextPresenter$b;
import g19.b0;
import g19.z;
import g19.a0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import com.yxcorp.gifshow.entity.QPhoto;
import g19.y;
import androidx.lifecycle.Observer;
import zz5.d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.ad.detail.presenter.side.e;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.ad.detail.presenter.side.f;
import vy6.a;
import jta.c;
import g19.l;
import android.view.View;
import com.yxcorp.utility.n;
import g19.w;
import erd.g;
import brd.t;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import g19.s;
import g19.t;
import ekd.y0;
import g19.x;
import java.lang.Runnable;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import android.view.ViewGroup;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import brd.y;
import im8.f;
import java.lang.Number;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import lnc.a1;
import ekd.m1;
import android.widget.TextView;
import g19.r;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.ad.detail.presenter.side.d;
import lnc.c3$a;
import lnc.c3;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import w85.a;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public class SlidePlayAutoPlayNextPresenter extends PresenterV2 implements DefaultLifecycleObserver	// class@00169a
{
    public t A;
    public PublishSubject B;
    public f C;
    public f D;
    public PublishSubject E;
    public PublishSubject F;
    public BaseFragment G;
    public a H;
    public y I;
    public f J;
    public PublishSubject K;
    public boolean L;
    public long M;
    public boolean N;
    public Boolean O;
    public b P;
    public b Q;
    public boolean R;
    public int S;
    public BitSet T;
    public GifshowActivity U;
    public y0 U0;
    public QPhoto V;
    public SlidePlayViewModel V0;
    public SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus W;
    public boolean W0;
    public int X;
    public final a X0;
    public boolean Y;
    public final c Y0;
    public boolean Z;
    public final IMediaPlayer$OnPreparedListener Z0;
    public final b$b a1;
    public final IMediaPlayer$OnInfoListener b1;
    public boolean c1;
    public boolean d1;
    public ViewStubInflater2 p;
    public View q;
    public View r;
    public TextView s;
    public TextView t;
    public View u;
    public AvatarInfoResponse v;
    public MilanoContainerEventBus w;
    public QPhoto x;
    public a y;
    public l z;
    public static HashMap e1;

    static {
       SlidePlayAutoPlayNextPresenter.e1 = new HashMap();
    }
    public void SlidePlayAutoPlayNextPresenter(){
       super();
       this.M = -1;
       this.T = new BitSet();
       this.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
       this.X = 1;
       this.Y = true;
       this.Z = true;
       this.X0 = new SlidePlayAutoPlayNextPresenter$a(this);
       this.Y0 = new SlidePlayAutoPlayNextPresenter$b(this);
       this.Z0 = new b0(this);
       this.a1 = new z(this);
       this.b1 = new a0(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayAutoPlayNextPresenter.class, "6")) {
          return;
       }
       boolean b = false;
       this.d1 = b;
       this.V0 = SlidePlayViewModel.B0(this.G.getParentFragment());
       this.y.getPlayer().addOnInfoListener(this.b1);
       int i = 1;
       boolean b1 = (this.x.isImageType() && !this.x.isKtv())? true: false;
       this.R = b1;
       this.V = objArray;
       d.b(this.x, this.G, new y(this));
       if (!this.x.isVideoType() && this.R == null) {
          this.y.getPlayer().addOnPreparedListener(this.Z0);
       }
       this.y.getPlayer().w(this.a1);
       this.Q = b9.c(this.Q, new e(this));
       this.P = b9.c(this.P, new f(this));
       this.V0.P(this.G, this.X0);
       this.z.a(this.Y0);
       View[] viewArray = new View[i];
       viewArray[b] = this.q;
       n.Z(8, viewArray);
       this.R8(b);
       SlidePlayAutoPlayNextPresenter tE = this.E;
       if (tE != null) {
          tE.subscribe(new w(this));
       }
       tE = this.w;
       if (tE != null) {
          this.X7(tE.p.subscribe(new s(this)));
       }
       this.X7(this.K.subscribe(new t(this)));
       return;
    }
    public void F8(){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, slidePlayAut, "17")) {
          this.U0 = new y0(60, new x(this));
       }
       GifshowActivity activity = this.getActivity();
       this.U = activity;
       activity.getLifecycle().addObserver(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "8")) {
          return;
       }
       this.m8().setOnHierarchyChangeListener(null);
       this.e9();
       b9.a(this.P);
       b9.a(this.Q);
       SlidePlayAutoPlayNextPresenter tU = this.U;
       if (tU != null) {
          tU.getLifecycle().removeObserver(this);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "7")) {
          return;
       }
       this.d1 = true;
       this.y.getPlayer().removeOnPreparedListener(this.Z0);
       this.y.getPlayer().O(this.a1);
       SlidePlayAutoPlayNextPresenter tV0 = this.V0;
       if (tV0 != null) {
          tV0.D(this.G, this.X0);
       }
       this.z.c(this.Y0);
       this.y.getPlayer().removeOnInfoListener(this.b1);
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.S == 0x2af8)? true: false;
       return b;
    }
    public final void R8(boolean p0){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (PatchProxy.isSupport(slidePlayAut) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayAut, "32")) {
          return;
       }
       this.I.onNext(Boolean.valueOf(p0));
       return;
    }
    public int S8(float p0){
       return ((int)p0 + 1);
    }
    public final boolean V8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "31");
       if (obj == PatchProxyResult.class) {
          obj = this.X8().get();
       }
       return obj.booleanValue();
    }
    public long W8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (long)this.S;
       if (this.R == null && this.Z8() != null) {
          l = this.Z8().getCurrentPosition();
       }
       return l;
    }
    public final f X8(){
       if (this.Z != null) {
          return this.C;
       }
       return this.D;
    }
    public long Y8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (long)0x2af8;
       if (this.R == null && this.Z8() != null) {
          l = this.Z8().getDuration();
       }
       return l;
    }
    public b Z8(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x.isVideoType() || this.R == null) {
          return this.y.getPlayer();
       }
       return null;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "5")) {
          return;
       }
       if (this.q == null) {
          this.p.g(true);
          this.q = this.p.a();
          if (NasaSlidePlayExperimentUtil.e()) {
             this.q.setBackgroundColor(a1.a(R.color.arg_RES_7f06020a));
          }
          this.s = m1.f(this.q, 0x7f0a39dd);
          this.t = m1.f(this.q, 0x7f0a39de);
          this.u = m1.f(this.q, 0x7f0a3a56);
          this.r = m1.f(this.q, 0x7f0a39df);
          this.q.setVisibility(8);
          this.q.setOnClickListener(new r(this));
       }
       return;
    }
    public boolean b9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.V0.r();
    }
    public void c9(){
       int b;
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "27")) {
          return;
       }
       if (this.Y != null) {
          SlidePlayAutoPlayNextPresenter tV0 = this.V0;
          if (tV0 != null) {
             if (this.X == 2) {
                if (tV0.f0(this.x)) {
                   Object obj = PatchProxy.apply(objArray, this, slidePlayAut, "28");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else {
                      b = this.V0.a0();
                      b = (this.V != null && b == 1)? true: false;
                   }
                   if (!b) {
                      this.V0.p(this.W0);
                   }
                }
                this.V0.L(this.W0);
             }else if(tV0.H(this.x)){
                this.V0.L(this.W0);
             }else {
                this.V0.p(this.W0);
             }
          }
       }
       return;
    }
    public void d9(){
       boolean b;
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "24")) {
          return;
       }
       if (this.W != SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.USER_DISABLE && (!this.V8() && (this.U0 != null && !this.T.cardinality()))) {
          if (this.R == null) {
             if (this.Z8() != null) {
                Object obj = PatchProxy.apply(objArray, this, slidePlayAut, "30");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(this.x.isVideoType() || this.R == null){
                   b = this.y.getPlayer().isPrepared();
                }else {
                   b = false;
                }
                if (!b) {
                label_0065 :
                   return;
                }
             }else {
                goto label_0065 ;
             }
          }
          this.S = 0;
          this.U0.d();
          this.N = true;
          goto label_0065 ;
       }else {
          goto label_0065 ;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "3")) {
          return;
       }
       boolean b = (m1.f(p0, 0x7f0a39e1) != null)? true: false;
       this.c1 = b;
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a39e1, 0);
       this.p = viewStubInfl;
       viewStubInfl.d(p0);
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "25")) {
          return;
       }
       this.M = -1;
       int i = 0;
       this.S = i;
       SlidePlayAutoPlayNextPresenter tU0 = this.U0;
       if (tU0 != null && this.N != null) {
          tU0.e();
          this.N = i;
          View[] viewArray = new View[]{this.q};
          n.Z(8, viewArray);
          this.R8(i);
          c3.c(this.u, d.a);
       }
       return;
    }
    public final boolean h9(long p0,long p1){
       SlidePlayAutoPlayNextPresenter tM = this.M;
       boolean b = (tM - -1 > 0 && (tM - p0) - (p1 / 2) > 0)? true: false;
       return b;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "1")) {
          return;
       }
       this.w = this.q8(MilanoContainerEventBus.class);
       this.x = this.q8(QPhoto.class);
       this.y = this.q8(a.class);
       this.z = this.r8("NASA_SIDEBAR_STATUS");
       this.A = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       this.B = this.r8("DETAIL_SHOW_COMMENT_LONG_CLICK_LIKE_GUIDE");
       this.C = this.x8("THANOS_GLOBAL_AUTO_PLAY_STATE");
       this.D = this.x8("NO_PROFILE_FEED_GLOBAL_AUTO_PLAY_STATE");
       this.E = this.t8("FEATURED_LONG_ATLAS_OPEN");
       this.F = this.t8("SLIDE_PLAY_COUNT_DOWNT_LAYOUT_SHOW");
       this.G = this.r8("DETAIL_FRAGMENT");
       this.H = this.q8(a.class);
       this.I = this.r8("DETAIL_TOP_RIGHT_HIDE_OBSERVER");
       this.J = this.w8("TAG_SHOULD_AUTO_PLAY_NEXT_SERIAL");
       this.K = this.r8("DETAIL_HALF_H5_FRAGMENT_VISIBLE_PUBLISH");
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "13")) {
          return;
       }
       this.T.set(3);
       this.e9();
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "12")) {
          return;
       }
       this.T.clear(3);
       if (this.L != null && this.b9()) {
          this.d9();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
