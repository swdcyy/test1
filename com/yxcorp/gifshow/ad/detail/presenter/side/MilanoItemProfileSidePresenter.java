package com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter$a;
import com.yxcorp.gifshow.ad.detail.presenter.side.MilanoItemProfileSidePresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import w85.a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.utils.DefaultSyncable;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import g19.h;
import erd.g;
import crd.b;
import bf5.q;
import g19.g;
import io.reactivex.internal.functions.Functions;
import g19.e;
import g19.d;
import g19.f;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import sy8.l;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.lang.StringBuilder;
import yx.j0;
import java.lang.Integer;
import z1.e;
import im8.f;
import java.util.List;
import jta.e;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import g19.i;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.view.SlidePlayAlphaEmojiTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.utility.n;
import le5.f;
import java.lang.Math;
import d6a.u;
import rkd.b;
import java.lang.Number;
import lnc.d2;
import hn5.n;
import hn5.m;
import ro5.a;
import java.lang.Boolean;
import ekd.m1;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import android.widget.TextView;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import io.reactivex.subjects.PublishSubject;
import rf5.u;
import g19.l;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public class MilanoItemProfileSidePresenter extends PresenterV2 implements DefaultLifecycleObserver	// class@001696
{
    public View A;
    public View B;
    public ScaleHelpView C;
    public View D;
    public View E;
    public View F;
    public QPhoto G;
    public BaseFragment H;
    public u I;
    public List J;
    public List K;
    public List L;
    public f M;
    public l N;
    public f O;
    public f P;
    public f Q;
    public PublishSubject R;
    public l S;
    public q T;
    public a U;
    public SlidePlayViewModel V;
    public boolean W;
    public GifshowActivity X;
    public final c Y;
    public final a Z;
    public View p;
    public TextView q;
    public View r;
    public View s;
    public TextView t;
    public View u;
    public View v;
    public SlideLongAtlasRecyclerView w;
    public View x;
    public View y;
    public View z;
    public static final int U0;

    static {
       MilanoItemProfileSidePresenter.U0 = a1.d(0x7f070ec3);
    }
    public void MilanoItemProfileSidePresenter(){
       super();
       this.Y = new MilanoItemProfileSidePresenter$a(this);
       this.Z = new MilanoItemProfileSidePresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "7")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.H.getParentFragment());
       this.V = slidePlayVie;
       slidePlayVie.P(this.H, this.Z);
       MilanoItemProfileSidePresenter tU = this.U;
       if (tU != null && tU.k()) {
          this.G.getUser().startSyncWithFragment(this.H.m());
          this.X7(this.G.getUser().observable().subscribe(new h(this)));
       }
       g e = Functions.e;
       this.X7(this.T.l.subscribe(new g(this), e));
       this.X7(this.T.x.subscribe(new e(this), e));
       this.X7(this.T.o.subscribe(new d(this), e));
       this.X7(this.T.r.subscribe(new f(this), e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "3")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.X = activity;
       activity.getLifecycle().addObserver(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "8")) {
          return;
       }
       MilanoItemProfileSidePresenter tX = this.X;
       if (tX != null) {
          tX.getLifecycle().removeObserver(this);
       }
       return;
    }
    public final void P8(float p0){
       int b1;
       Object obj;
       int i;
       int i1;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, milanoItemPr, "12")) {
          return;
       }
       MilanoItemProfileSidePresenter tN = this.N;
       MilanoItemProfileSidePresenter tT = this.T;
       q a = tT.a;
       q c = tT.c;
       tN.a = tT.e - ((a - c) / 2);
       tN.b = tT.f - ((a - c) / 2);
       boolean b = false;
       if (!PatchProxy.isSupport(milanoItemPr) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, milanoItemPr, "13") && !this.V.s1())) {
          tN = this.T;
          a = tN.d;
          float f1 = (float)a;
          int i3 = (int)(f1 + ((float)(tN.b - a) * p0));
          q c1 = tN.c;
          f1 = (float)c1;
          i1 = (int)(f1 + ((float)((tN.a - tN.g) - c1) * p0));
          this.m8().getLayoutParams().height = i1;
          Object[] objArray = new Object[b];
          String str = "MilanoItemProfileSideP";
          j0.f(str, "reSizeViews: height "+i1+", mMinHeight "+this.T.c+", mScreenHeight "+this.T.a+", progress "+p0, objArray);
          this.Q.set(e.a(Integer.valueOf(i3), Integer.valueOf(i1)));
          for (b1 = 0; b1 < this.L.size(); b1 = b1 + 1) {
             this.L.get(b1).b(i3, i1);
          }
          MilanoItemProfileSidePresenter tu = this.u;
          String str1 = ", ";
          if (tu != null) {
             tu.getLayoutParams().width = i3;
             this.u.getLayoutParams().height = i1;
             objArray1 = new Object[b];
             j0.f(str, "mVerticalCoverFrame "+this.u+str1+this.u.getBackground(), objArray1);
          }
          tu = this.y;
          if (tu != null) {
             tu.getLayoutParams().width = i3;
             this.y.getLayoutParams().height = i1;
             objArray1 = new Object[b];
             j0.f(str, "mPageAutoPlayRecyclerView "+this.y+str1+this.y.getBackground(), objArray1);
          }
          tu = this.C;
          if (tu != null) {
             tu.getLayoutParams().width = i3;
             this.C.getLayoutParams().height = i1;
             objArray1 = new Object[b];
             j0.f(str, "mVideoScaleHelpView "+this.C+str1+this.C.getBackground(), objArray1);
          }
          tu = this.D;
          if (tu != null) {
             tu.getLayoutParams().width = i3;
             objArray1 = new Object[b];
             j0.f(str, "mBigMarqueeTopShadow "+this.D+str1+this.D.getBackground(), objArray1);
          }
          tu = this.E;
          if (tu != null) {
             tu.getLayoutParams().width = i3;
             this.E.getLayoutParams().height = i1;
             Object[] objArray2 = new Object[b];
             j0.f(str, "mVerticalOutScaleView "+this.E+str1+this.E.getBackground(), objArray2);
          }
          this.m8().requestLayout();
          this.m8().post(new i(this));
       }
       this.R8(this.p, p0);
       this.R8(this.D, p0);
       this.R8(this.F, p0);
       this.R8(this.A, p0);
       this.R8(this.B, p0);
       b1 = 4;
       if (!PatchProxy.isSupport(milanoItemPr) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, milanoItemPr, "17")) {
          float f = 0x3f800000 - p0;
          i1 = (int)((float)MilanoItemProfileSidePresenter.U0 * f);
          MilanoItemProfileSidePresenter tt = this.t;
          if (tt != null && tt instanceof SlidePlayAlphaEmojiTextView) {
             boolean b2 = (!p0 - 0x3f800000)? true: false;
             tt.setAlphaEnable(b2);
          }
          ViewGroup$MarginLayoutParams layoutParams1 = this.r.getLayoutParams();
          layoutParams1.leftMargin = (int)((float)n.c(this.getContext(), 5.00f) * f);
          layoutParams1.rightMargin = i1;
          MilanoItemProfileSidePresenter ts = this.s;
          if (ts != null) {
             ts.getLayoutParams().rightMargin = i1;
             if (f.o()) {
                this.s.setScaleX(this.T.h);
                this.s.setScaleY(this.T.h);
             }
          }
          ts = this.z;
          if (ts != null) {
             ts.getLayoutParams().rightMargin = i1;
             if (f.o()) {
                this.z.setScaleX(this.T.h);
                this.z.setScaleY(this.T.h);
                tN = this.z;
                tN.setPivotY((float)tN.getHeight());
                tN = this.z;
                tN.setPivotX(((float)tN.getWidth() / 2.00f));
                this.z.setAlpha(Math.max(0, ((2.00f * p0) - 0x3f800000)));
                tN = this.z;
                int i2 = (!p0)? 4: 0;
                tN.setVisibility(i2);
             }
          }
       }
    label_02ce :
       if (PatchProxy.isSupport(milanoItemPr) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, milanoItemPr, "18") && !u.a())) {
          tN = this.x;
          if (tN != null) {
             tN.getLayoutParams().bottomMargin = (int)((float)this.N.b * (0x3f800000 - p0));
          }
       }
       if (!PatchProxy.isSupport(milanoItemPr) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, milanoItemPr, "19")) {
          tN = this.q;
          if (!p0 - 0x3f800000) {
             b1 = 0;
          }
          if (PatchProxy.isSupport(milanoItemPr) && (!PatchProxy.applyVoidTwoRefs(tN, Integer.valueOf(b1), this, milanoItemPr, "15") && (tN != null && tN.getVisibility() != b1))) {
             tN.setVisibility(b1);
          }
       }
    label_0335 :
       ViewGroup$LayoutParams layoutParams = this.v.getLayoutParams();
       if (b.g() && b.e()) {
          obj = PatchProxy.apply(null, this, milanoItemPr, "6");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(d2.g()){
             i = d2.e();
          }else {
             i = a1.g();
          }
       }else {
          obj = PatchProxy.apply(null, this, milanoItemPr, "5");
          if (obj != patchProxyRe) {
             i = obj.intValue();
          }else if(d2.g()){
             i = d2.f();
          }else {
             i = a1.h();
          }
       }
       layoutParams.width = (int)((float)i - ((float)MilanoItemProfileSidePresenter.U0 * (0x3f800000 - p0)));
       this.v.setLayoutParams(layoutParams);
       Activity activity = this.getActivity();
       if (activity != null && m.a().U3(activity)) {
          MilanoItemProfileSidePresenter tH = this.H;
          if (p0 - 0x3f800000 >= 0) {
             b = true;
          }
          a.m(tH, b);
       }
       return;
    }
    public final void R8(View p0,float p1){
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, milanoItemPr, "16")) {
          return;
       }
       if (p0 != null && p0.getAlpha() - p1) {
          p0.setAlpha(p1);
       }
       return;
    }
    public void S8(View p0,int p1){
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, milanoItemPr, "22")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void V8(boolean p0){
       boolean b;
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, milanoItemPr, "4")) {
          return;
       }
       Object obj = PatchProxy.apply(null, this, milanoItemPr, "10");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!this.M.get().booleanValue()){
          b = true;
       }else {
          b = false;
       }
       if (b) {
          if (this.V.r()) {
             this.R8(this.F, 0);
             milanoItemPr = this.F;
             if (!p0) {
                i = 4;
             }
             this.S8(milanoItemPr, i);
          }else {
             this.R8(this.F, 0x3f800000);
             this.S8(this.F, i);
          }
       }else {
          this.S8(this.F, 4);
          this.R8(this.F, 0);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoItemProfileSidePresenter.class, "2")) {
          return;
       }
       this.x = m1.f(p0, 0x7f0a3ea7);
       this.u = m1.f(p0, 0x7f0a09e1);
       this.s = m1.f(p0, 0x7f0a302f);
       this.r = m1.f(p0, 0x7f0a39fe);
       this.p = m1.f(p0, 0x7f0a3e9c);
       this.w = m1.f(p0, 0x7f0a0aeb);
       this.D = m1.f(p0, 0x7f0a400c);
       this.t = m1.f(p0, 0x7f0a4386);
       this.y = m1.f(p0, 0x7f0a032f);
       this.E = m1.f(p0, 0x7f0a2f51);
       this.v = m1.f(p0, 0x7f0a39f7);
       this.C = m1.f(p0, 0x7f0a2a96);
       this.q = m1.f(p0, 0x7f0a0cb4);
       this.F = m1.f(p0, 0x7f0a3e8a);
       this.z = m1.f(p0, 0x7f0a39f2);
       this.A = m1.f(p0, 0x7f0a04db);
       this.B = m1.f(p0, 0x7f0a400c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "1")) {
          return;
       }
       this.G = this.q8(QPhoto.class);
       this.H = this.r8("DETAIL_FRAGMENT");
       this.J = this.r8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.K = this.r8("SLIDE_PLAY_GLOBAL_SLIDE_PROFILE_LIST");
       this.L = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       this.M = this.x8("SLIDE_PLAY_CLOSE_STATE");
       this.N = this.q8(l.class);
       this.O = this.x8("FEED_KS_ORDER_ID");
       this.P = this.x8("PROFILE_KS_ORDER_ID");
       this.R = this.r8("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK");
       this.I = this.q8(u.class);
       this.Q = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       this.S = this.r8("NASA_SIDEBAR_STATUS");
       this.T = this.q8(q.class);
       this.U = this.s8(a.class);
       return;
    }
    public void onCreate(LifecycleOwner p0){
       a.a(this, p0);
    }
    public void onDestroy(LifecycleOwner p0){
       a.b(this, p0);
    }
    public void onPause(LifecycleOwner p0){
       a.c(this, p0);
    }
    public void onResume(LifecycleOwner p0){
       a.d(this, p0);
    }
    public void onStart(LifecycleOwner p0){
       a.e(this, p0);
    }
    public void onStop(LifecycleOwner p0){
       a.f(this, p0);
    }
}
