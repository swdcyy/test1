package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.HashMap;
import java.util.BitSet;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$b;
import b8a.w1;
import b8a.u1;
import b8a.v1;
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
import b8a.t1;
import androidx.lifecycle.Observer;
import zz5.d;
import com.kwai.video.player.IMediaPlayer$OnPreparedListener;
import com.kwai.framework.player.core.b$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.v;
import crd.b;
import ok.h;
import lnc.b9;
import com.yxcorp.gifshow.detail.slidev2.presenter.w;
import vy6.a;
import jta.c;
import r7a.f;
import android.view.View;
import com.yxcorp.utility.n;
import b8a.r1;
import erd.g;
import brd.t;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import b8a.n1;
import b8a.o1;
import xx9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ekd.y0;
import b8a.s1;
import java.lang.Runnable;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.detail.slidev2.presenter.u;
import lnc.c3$a;
import lnc.c3;
import android.view.ViewGroup;
import android.view.ViewGroup$OnHierarchyChangeListener;
import java.lang.Integer;
import w85.a;
import com.kwai.feature.component.photofeatures.startup.response.AvatarInfoResponse;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.detail.slidev2.presenter.SearchDetailAutoPlayNextPresenter;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaMusicRadioAutoPlayPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.NasaFeedSlidePhotoAutoPlayPresenter;
import brd.y;
import im8.f;
import java.lang.Number;
import ekd.m1;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.graphics.drawable.Drawable;
import lnc.a1;
import b8a.m1;
import android.view.View$OnClickListener;
import androidx.lifecycle.LifecycleOwner;
import n2.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Float;

public class SlidePlayAutoPlayNextPresenter extends PresenterV2 implements DefaultLifecycleObserver	// class@0018c4
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
    public a K;
    public boolean L;
    public long M;
    public boolean N;
    public boolean O;
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
    public f z;
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
       this.Z0 = new w1(this);
       this.a1 = new u1(this);
       this.b1 = new v1(this);
    }
    public void B9(boolean p0){
    }
    public void C9(){
    }
    public void D9(){
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
       d.b(this.x, this.G, new t1(this));
       if (!this.x.isVideoType() && this.R == null) {
          this.y.getPlayer().addOnPreparedListener(this.Z0);
       }
       this.y.getPlayer().w(this.a1);
       this.Q = b9.c(this.Q, new v(this));
       this.P = b9.c(this.P, new w(this));
       this.V0.P(this.G, this.X0);
       this.z.a(this.Y0);
       View[] viewArray = new View[i];
       viewArray[b] = this.q;
       n.Z(8, viewArray);
       this.B9(b);
       this.X8(b);
       SlidePlayAutoPlayNextPresenter tE = this.E;
       if (tE != null) {
          tE.subscribe(new r1(this));
       }
       tE = this.w;
       if (tE != null) {
          this.X7(tE.p.subscribe(new n1(this)));
       }
       this.X7(this.K.h(new o1(this)));
       return;
    }
    public void E9(){
       int b;
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "26")) {
          return;
       }
       if (this.Y != null && this.V0 != null) {
          if (this.X == 2 && !this.P8()) {
             if (this.V0.f0(this.x)) {
                Object obj = PatchProxy.apply(objArray, this, slidePlayAut, "27");
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
          }else if(this.V0.H(this.x)){
             this.V0.L(this.W0);
          }else {
             this.V0.p(this.W0);
          }
       }
       return;
    }
    public void F8(){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, slidePlayAut, "17")) {
          this.U0 = new y0(60, new s1(this));
       }
       GifshowActivity activity = this.getActivity();
       this.U = activity;
       activity.getLifecycle().addObserver(this);
       return;
    }
    public void F9(){
       boolean b;
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, slidePlayAut, "23")) {
          return;
       }
       if (this.W != SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.USER_DISABLE && (!this.a9() && (this.U0 != null && !this.T.cardinality()))) {
          if (this.R == null) {
             if (this.e9() != null) {
                Object obj = PatchProxy.apply(objArray, this, slidePlayAut, "29");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                }else if(this.x.isVideoType() || this.R == null){
                   b = this.y.getPlayer().isPrepared();
                }else {
                   b = false;
                }
                if (!b) {
                label_006b :
                   return;
                }
             }else {
                goto label_006b ;
             }
          }
          if (this.l9()) {
             this.S = 0;
             this.U0.d();
             this.N = true;
             goto label_006b ;
          }else {
             goto label_006b ;
          }
       }else {
          goto label_006b ;
       }
    }
    public void G9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "24")) {
          return;
       }
       this.M = -1;
       int i = 0;
       this.S = i;
       SlidePlayAutoPlayNextPresenter tU0 = this.U0;
       if (tU0 != null && this.N != null) {
          tU0.e();
          this.N = i;
          if (this.J9()) {
             View[] viewArray = new View[]{this.q};
             n.Z(8, viewArray);
             this.X8(i);
             c3.c(this.u, u.a);
          }
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "8")) {
          return;
       }
       this.m8().setOnHierarchyChangeListener(null);
       this.G9();
       b9.a(this.P);
       b9.a(this.Q);
       SlidePlayAutoPlayNextPresenter tU = this.U;
       if (tU != null) {
          tU.getLifecycle().removeObserver(this);
       }
       return;
    }
    public void H9(int p0){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (PatchProxy.isSupport(slidePlayAut) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, slidePlayAut, "15")) {
          return;
       }
       if (this.Z != null) {
          if (!this.H.k() && (this.H.m() == null || this.H.m().intValue() > 1)) {
             slidePlayAut = this.v;
             if (slidePlayAut == null || slidePlayAut.mPhotoCount > 1) {
             label_003f :
                if (p0 > 0) {
                   slidePlayAut = this.s;
                   if (slidePlayAut != null) {
                      View[] viewArray = new View[]{slidePlayAut};
                      n.Z(0, viewArray);
                      View[] viewArray1 = new View[]{this.t};
                      n.Z(0, viewArray1);
                      this.s.setText(String.valueOf(p0));
                      this.X8(1);
                   }
                }
                return;
             }
          }
          return;
       }else {
          goto label_003f ;
       }
    }
    public void I9(){
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
    public boolean J9(){
       return (this instanceof SearchDetailAutoPlayNextPresenter ^ 0x01);
    }
    public final boolean K9(long p0,long p1){
       SlidePlayAutoPlayNextPresenter tM = this.M;
       boolean b = (tM - -1 > 0 && (tM - p0) - (p1 / 2) > 0)? true: false;
       return b;
    }
    public boolean P8(){
       return this instanceof NasaMusicRadioAutoPlayPresenter;
    }
    public boolean R8(){
       boolean b = (this.S == 0x2af8)? true: false;
       return b;
    }
    public void S8(){
    }
    public boolean V8(){
       return false;
    }
    public boolean W8(){
       return (this instanceof NasaFeedSlidePhotoAutoPlayPresenter ^ 0x01);
    }
    public final void X8(boolean p0){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (PatchProxy.isSupport(slidePlayAut) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, slidePlayAut, "31")) {
          return;
       }
       this.I.onNext(Boolean.valueOf(p0));
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "25")) {
          return;
       }
       SlidePlayAutoPlayNextPresenter tV0 = this.V0;
       if (tV0 == null) {
          return;
       }
       boolean b = (tV0.f0(this.x) || this.V0.H(this.x))? true: false;
       this.O = b;
       return;
    }
    public int Z8(float p0){
       return ((int)p0 + 1);
    }
    public final boolean a9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "30");
       if (obj == PatchProxyResult.class) {
          obj = this.c9().get();
       }
       return obj.booleanValue();
    }
    public long b9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (long)this.S;
       if (this.R == null && this.e9() != null) {
          l = this.e9().getCurrentPosition();
       }
       return l;
    }
    public final f c9(){
       if (this.Z != null) {
          return this.C;
       }
       return this.D;
    }
    public long d9(){
       long duration;
       b obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = 0x2af8;
       if (this.R == null && this.e9() != null) {
          duration = this.e9().getDuration();
       }
       return duration;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "3")) {
          return;
       }
       boolean b = (m1.f(p0, this.h9()) != null)? true: false;
       this.c1 = b;
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(this.h9(), this.j9());
       this.p = viewStubInfl;
       viewStubInfl.d(p0);
       return;
    }
    public b e9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x.isVideoType() || this.R == null) {
          return this.y.getPlayer();
       }
       return null;
    }
    public int h9(){
       return 0x7f0a39e1;
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
       this.K = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       return;
    }
    public int j9(){
       return 0;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, SlidePlayAutoPlayNextPresenter.class, "5")) {
          return;
       }
       if (this.q == null && this.J9()) {
          this.p.g(true);
          this.q = this.p.a();
          if (NasaSlidePlayExperimentUtil.e()) {
             this.q.setBackground(a1.f(R.drawable.arg_RES_7f0819b0));
          }
          this.s = m1.f(this.q, 0x7f0a39dd);
          this.t = m1.f(this.q, 0x7f0a39de);
          this.u = m1.f(this.q, 0x7f0a3a56);
          this.r = m1.f(this.q, 0x7f0a39df);
          this.q.setVisibility(8);
          this.q.setOnClickListener(new m1(this));
       }
       return;
    }
    public boolean l9(){
       return true;
    }
    public boolean m9(){
       SlidePlayAutoPlayNextPresenter obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.q;
       boolean b = (obj != null && !obj.getVisibility())? true: false;
       return b;
    }
    public boolean n9(){
       Object obj = PatchProxy.apply(null, this, SlidePlayAutoPlayNextPresenter.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.V0.r();
    }
    public boolean o9(){
       return false;
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
       if (!this.o9()) {
          this.G9();
       }
       return;
    }
    public void onResume(LifecycleOwner p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "12")) {
          return;
       }
       this.T.clear(3);
       if (this.L != null && this.n9()) {
          this.F9();
       }
       return;
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
    public void q9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "20")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTO_PLAY_TOAST";
       i3 oi3 = i3.f();
       oi3.d("click_type", "CLOSE");
       uElementPack.params = oi3.e();
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.x.getEntity());
       u1.M("", this.G, 0, uElementPack, uContentPack, null);
       return;
    }
    public void s9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayAutoPlayNextPresenter.class, "19")) {
          return;
       }
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = "AUTO_PLAY_TOAST";
       ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
       uContentPack.photoPackage = w1.f(this.x.getEntity());
       u1.D0("", this.G, 0, uElementPack, uContentPack, null);
       return;
    }
    public void t9(boolean p0){
    }
    public boolean u9(float p0){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (PatchProxy.isSupport(slidePlayAut)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, slidePlayAut, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (this.Z8(p0) <= 3)? true: false;
       return b;
    }
    public boolean x9(float p0){
       return false;
    }
    public void y9(float p0){
       SlidePlayAutoPlayNextPresenter slidePlayAut = SlidePlayAutoPlayNextPresenter.class;
       if (PatchProxy.isSupport(slidePlayAut) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, slidePlayAut, "2")) {
          return;
       }
       if (p0 || (this.Z != null || (!p0 - 0x3f800000 && this.Z == null))) {
          SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus eNABLE = ((this.d9() - this.b9()) - 3000 > 0)? SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE: SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.CURRENT_POSITION_DISABLE;
          this.W = eNABLE;
          this.T.clear(2);
          this.F9();
       }else {
          this.T.set(2);
          this.G9();
          this.B9(false);
       }
       return;
    }
}
