package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j8a.c;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.b$c;
import android.animation.ValueAnimator;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.PointF;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import im8.f;
import xx9.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import com.airbnb.lottie.LottieAnimationView;
import j8a.f;
import android.view.View$OnTouchListener;
import android.content.Context;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.a;
import w4.n;
import w4.a;
import w4.e$a;
import jd5.i;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import ekd.k1;
import vy6.a;
import androidx.viewpager.widget.ViewPager$i;
import j8a.g;
import erd.g;
import crd.b;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import j8a.k;
import j8a.l;
import j8a.h;
import j8a.i;
import j8a.j;
import lnc.u1;
import android.animation.AnimatorSet;
import j8a.d;
import android.view.ViewConfiguration;
import java.lang.Float;
import ekd.m1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import mhc.y1;
import qz9.k;

public class b extends PresenterV2	// class@001985
{
    public AnimatorSet A;
    public boolean B;
    public boolean C;
    public Runnable D;
    public Runnable E;
    public int F;
    public int G;
    public Runnable H;
    public final Runnable I;
    public SlidePlayViewModel J;
    public a K;
    public PublishSubject L;
    public PublishSubject M;
    public t N;
    public final ViewPager$i O;
    public final a P;
    public final i Q;
    public View p;
    public View q;
    public TextView r;
    public LottieAnimationView s;
    public SlideHorizontalAtlasPlayer t;
    public f u;
    public f v;
    public QPhoto w;
    public BaseFragment x;
    public t y;
    public PublishSubject z;

    public void b(){
       super();
       this.I = new c(this);
       this.O = new b$a(this);
       this.P = new b$b(this);
       this.Q = new b$c(this);
    }
    public static void P8(b p0,ValueAnimator p1){
       Objects.requireNonNull(p0);
       if (PatchProxy.applyVoidOneRefs(p1, p0, b.class, "16")) {
       }else if(p0.r == null || p0.s == null){
          PointF x = p1.getAnimatedValue().x;
          p0.r.setTranslationX((- x));
          if (p0.r.getVisibility()) {
             p0.r.setVisibility(0);
          }
          if (p0.s.getVisibility()) {
             p0.s.setVisibility(0);
          }
          p0 = p0.t;
          if (p0 != null) {
             LinearLayoutManager layoutManage = p0.getLayoutManager();
             if (layoutManage != null) {
                layoutManage.scrollToPositionWithOffset(0, (- (int)x));
             }
          }
       }
       return;
    }
    public static void R8(b p0){
       boolean b;
       Objects.requireNonNull(p0);
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, p0, uob, "9")) {
       }else if(VisitorModeManager.f()){
          b obj = PatchProxy.apply(objArray, p0, uob, "10");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(NasaFeatureGuideManager.f().b() && (!p0.u.get().booleanValue() && (!p0.K.c() && (!p0.J.r() && !SlideGuideManager.a().b(p0.getActivity()))))){
             b = true;
          }else {
             b = false;
          }
          if (b) {
             if (p0.G != null) {
                p0.H = new c(p0);
             }else if(PatchProxy.applyVoid(objArray, p0, uob, "11")){
                if (!PatchProxy.applyVoid(objArray, p0, uob, "8") && p0.getActivity() != null) {
                   ViewStub viewStub = p0.getActivity().findViewById(R.id.up_slide_guide_layout_stub);
                   p0.p = (viewStub != null && viewStub.getParent() != null)? viewStub.inflate(): p0.getActivity().findViewById(0x7f0a1192);
                   p0.r = p0.getActivity().findViewById(0x7f0a11a9);
                   p0.s = p0.getActivity().findViewById(0x7f0a1732);
                   p0.q = p0.getActivity().findViewById(0x7f0a11a1);
                }
                p0.C = true;
                p0.v.set(Boolean.FALSE);
                p0.u.set(Boolean.TRUE);
                obj = p0.q;
                if (obj != null) {
                   obj.setVisibility(0);
                   p0.q.setOnTouchListener(new f(p0));
                }
                if (!PatchProxy.applyVoid(objArray, p0, uob, "12") && (p0.p == null || (p0.getActivity() != null && p0.getContext() != null))) {
                   e$a.a(p0.getContext(), R.raw.bg, new a(p0));
                }
             }
          }
       }
    label_012e :
       return;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       b tt = this.t;
       if (tt != null) {
          tt.x(this.Q);
       }
       this.J = SlidePlayViewModel.B0(this.x.getParentFragment());
       this.B = false;
       this.W8();
       k1.m(this.I);
       this.J.P(this.x, this.P);
       this.J.i(this.O);
       this.X7(this.y.subscribe(new g(this)));
       this.X7(this.x.m().subscribe(new k(this)));
       this.X7(this.K.h(new l(this)));
       this.X7(this.L.subscribe(new h(this)));
       this.X7(this.M.subscribe(new i(this)));
       tt = this.N;
       if (tt != null) {
          this.X7(tt.subscribe(new j(this)));
       }
       u1.a(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "7")) {
          return;
       }
       b tt = this.t;
       if (tt != null) {
          tt.M(this.Q);
       }
       k1.m(this.I);
       this.J.g(this.O);
       u1.b(this);
       return;
    }
    public void S8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, b.class, "17")) {
          return;
       }
       if (this.B != null || (this.C != null && this.p != null)) {
          this.v.set(Boolean.TRUE);
          b ts = this.s;
          if (ts == null) {
             return;
          }else {
             b tE = this.E;
             if (tE != null) {
                ts.removeCallbacks(tE);
             }
             this.s.f();
             this.s.t();
             ts = this.A;
             if (ts != null) {
                ts.removeAllListeners();
                this.A.cancel();
                this.A = objArray;
             }
             ts = this.t;
             if (ts != null) {
                LinearLayoutManager layoutManage = ts.getLayoutManager();
                if (layoutManage != null) {
                   layoutManage.scrollToPositionWithOffset(0, 0);
                }
             }
             ts = this.r;
             int i = 8;
             if (ts != null) {
                ts.setVisibility(i);
             }
             this.s.setVisibility(i);
             this.p.setVisibility(i);
             this.B = true;
             this.C = false;
             d uod = new d(this);
             this.D = uod;
             this.p.postDelayed(uod, (long)ViewConfiguration.getJumpTapTimeout());
             SlideGuideManager.a().f(0);
          }
       }
       return;
    }
    public final PointF V8(PointF p0,PointF p1,float p2,float p3){
       if (PatchProxy.isSupport(b.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, b.class, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PointF(((p1.x - p0.x) * p2), ((p1.y - p0.y) * p3));
    }
    public void W8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b tD = this.D;
       if (tD != null) {
          b tp = this.p;
          if (tp != null) {
             tp.removeCallbacks(tD);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "3")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a032f);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.u = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.v = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       this.w = this.q8(QPhoto.class);
       this.x = this.r8("DETAIL_FRAGMENT");
       this.y = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       this.z = this.r8("SLIDE_PLAY_ATLAS_PLAY_PROGRESS");
       this.K = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.L = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.M = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       this.N = this.t8("MORE_OPERATION_PANEL_SHOW_OBSERVABLE");
       return;
    }
    public void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       if (p0.a != null) {
          k1.m(this.I);
       }
       return;
    }
    public void onEventMainThread(k p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       if (p0.a != null) {
          k1.m(this.I);
       }
       return;
    }
}
