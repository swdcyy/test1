package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoItemProfileSidePresenter;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoItemProfileSidePresenter$a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoItemProfileSidePresenter$b;
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
import z0a.i;
import erd.g;
import crd.b;
import bf5.q;
import z0a.h;
import io.reactivex.internal.functions.Functions;
import z0a.f;
import z0a.e;
import z0a.g;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.robust.PatchProxyResult;
import java.lang.Float;
import d6a.v;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import z1.e;
import im8.f;
import java.util.List;
import jta.e;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import z0a.j;
import java.lang.Runnable;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.detail.view.SlidePlayAlphaEmojiTextView;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
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
import r7a.f;
import androidx.lifecycle.LifecycleOwner;
import n2.a;

public class MilanoItemProfileSidePresenter extends PresenterV2 implements DefaultLifecycleObserver	// class@00152f
{
    public View A;
    public View B;
    public View C;
    public View D;
    public ScaleHelpView E;
    public View F;
    public View G;
    public View H;
    public QPhoto I;
    public BaseFragment J;
    public u K;
    public List L;
    public List M;
    public List N;
    public f O;
    public v P;
    public f Q;
    public f R;
    public f S;
    public PublishSubject T;
    public f U;
    public final c U0;
    public q V;
    public final a V0;
    public a W;
    public SlidePlayViewModel X;
    public boolean Y;
    public GifshowActivity Z;
    public View p;
    public TextView q;
    public View r;
    public View s;
    public View t;
    public TextView u;
    public View v;
    public View w;
    public SlideLongAtlasRecyclerView x;
    public View y;
    public View z;
    public static final int W0;
    public static final int X0;

    static {
       MilanoItemProfileSidePresenter.W0 = a1.d(0x7f070ec3);
       MilanoItemProfileSidePresenter.X0 = a1.d(0x7f070eef);
    }
    public void MilanoItemProfileSidePresenter(){
       super();
       this.U0 = new MilanoItemProfileSidePresenter$a(this);
       this.V0 = new MilanoItemProfileSidePresenter$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "7")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.J.getParentFragment());
       this.X = slidePlayVie;
       slidePlayVie.P(this.J, this.V0);
       MilanoItemProfileSidePresenter tW = this.W;
       if (tW != null && tW.k()) {
          this.I.getUser().startSyncWithFragment(this.J.m());
          this.X7(this.I.getUser().observable().subscribe(new i(this)));
       }
       g e = Functions.e;
       this.X7(this.V.l.subscribe(new h(this), e));
       this.X7(this.V.x.subscribe(new f(this), e));
       this.X7(this.V.o.subscribe(new e(this), e));
       this.X7(this.V.r.subscribe(new g(this), e));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "3")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       this.Z = activity;
       activity.getLifecycle().addObserver(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "8")) {
          return;
       }
       MilanoItemProfileSidePresenter tZ = this.Z;
       if (tZ != null) {
          tZ.getLifecycle().removeObserver(this);
       }
       return;
    }
    public final void P8(float p0){
       Object obj1;
       int i1;
       int i2;
       int i3;
       MilanoItemProfileSidePresenter u;
       int b1;
       int i4;
       Object[] objArray1;
       Object obj = this;
       float f = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoItemPr, "13")) {
          return;
       }
       MilanoItemProfileSidePresenter p = obj.P;
       MilanoItemProfileSidePresenter v = obj.V;
       q a = v.a;
       q c = v.c;
       p.a = v.e - ((a - c) / 2);
       p.b = v.f - ((a - c) / 2);
       int b = false;
       if (!PatchProxy.isSupport(milanoItemPr) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoItemPr, "14") && !obj.X.s1())) {
          p = obj.V;
          a = p.d;
          float f3 = (float)a;
          i2 = (int)(f3 + ((float)(p.b - a) * f));
          q c1 = p.c;
          f3 = (float)c1;
          i3 = (int)(f3 + ((float)((p.a - p.g) - c1) * f));
          this.m8().getLayoutParams().height = i3;
          Object[] objArray = new Object[b];
          String str1 = "MilanoItemProfileSideP";
          o.C().w(str1, "reSizeViews: height "+i3+", mMinHeight "+obj.V.c+", mScreenHeight "+obj.V.a+", progress "+f, objArray);
          obj.S.set(e.a(Integer.valueOf(i2), Integer.valueOf(i3)));
          if (!i2 || !i3) {
             objArray = new Object[b];
             o.C().t(str1, "error adapt size: "+i2+","+i3+"photo: "+obj.I.getPhotoId()+obj.I.getCaption(), objArray);
          }
          for (int i5 = 0; i5 < obj.N.size(); i5 = i5 + 1) {
             obj.N.get(i5).b(i2, i3);
          }
          MilanoItemProfileSidePresenter v1 = obj.v;
          String str2 = ", ";
          if (v1 != null) {
             v1.getLayoutParams().width = i2;
             obj.v.getLayoutParams().height = i3;
             objArray1 = new Object[b];
             o.C().w(str1, "mVerticalCoverFrame "+obj.v+str2+obj.v.getBackground(), objArray1);
          }
          v1 = obj.z;
          if (v1 != null) {
             v1.getLayoutParams().width = i2;
             obj.z.getLayoutParams().height = i3;
             objArray1 = new Object[b];
             o.C().w(str1, "mPageAutoPlayRecyclerView "+obj.z+str2+obj.z.getBackground(), objArray1);
          }
          v1 = obj.E;
          if (v1 != null) {
             v1.getLayoutParams().width = i2;
             obj.E.getLayoutParams().height = i3;
             objArray1 = new Object[b];
             o.C().w(str1, "mVideoScaleHelpView "+obj.E+str2+obj.E.getBackground(), objArray1);
          }
          v1 = obj.F;
          if (v1 != null) {
             v1.getLayoutParams().width = i2;
             objArray1 = new Object[b];
             o.C().w(str1, "mBigMarqueeTopShadow "+obj.F+str2+obj.F.getBackground(), objArray1);
          }
          v1 = obj.G;
          if (v1 != null) {
             v1.getLayoutParams().width = i2;
             obj.G.getLayoutParams().height = i3;
             Object[] objArray2 = new Object[b];
             o.C().w(str1, "mVerticalOutScaleView "+obj.G+str2+obj.G.getBackground(), objArray2);
          }
          this.m8().requestLayout();
          this.m8().post(new j(obj));
       }
       obj.R8(obj.p, f);
       p = obj.p;
       String str = null;
       v8 = f - str;
       int i = (!c)? 4: 0;
       n.Y(p, i, b);
       obj.R8(obj.F, f);
       obj.R8(obj.H, f);
       obj.R8(obj.B, f);
       obj.R8(obj.C, f);
       obj.R8(obj.D, f);
       if (!PatchProxy.isSupport(milanoItemPr) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoItemPr, "18")) {
          float f1 = 0x3f800000 - f;
          i3 = (int)((float)MilanoItemProfileSidePresenter.W0 * f1);
          u = obj.u;
          if (u != null && u instanceof SlidePlayAlphaEmojiTextView) {
             b1 = (!f - 0x3f800000)? true: false;
             u.setAlphaEnable(b1);
          }
          ViewGroup$MarginLayoutParams layoutParams1 = obj.r.getLayoutParams();
          layoutParams1.leftMargin = (int)((float)n.c(this.getContext(), 5.00f) * f1);
          layoutParams1.rightMargin = i3;
          u = obj.s;
          if (u != null) {
             u.getLayoutParams().rightMargin = i3;
             if (f.o()) {
                obj.s.setScaleX(obj.V.h);
                obj.s.setScaleY(obj.V.h);
             }
             u = obj.t;
             if (u != null) {
                b1 = MilanoItemProfileSidePresenter.X0;
                i4 = c;
                u.getLayoutParams().topMargin = b1 + (int)(((((double)obj.s.getHeight() * 0x3fdae147ae147ae1) - ((double)obj.t.getHeight() * 0x3fe0000000000000)) - (double)b1) * (double)f1);
             label_0318 :
                v = obj.A;
                if (v != null) {
                   v.getLayoutParams().rightMargin = i3;
                   if (f.o()) {
                      obj.A.setScaleX(obj.V.h);
                      obj.A.setScaleY(obj.V.h);
                      p = obj.A;
                      p.setPivotY((float)p.getHeight());
                      p = obj.A;
                      float f2 = 2.00f;
                      p.setPivotX(((float)p.getWidth() / f2));
                      obj.A.setAlpha(Math.max(str, ((f * f2) - 0x3f800000)));
                      p = obj.A;
                      b = (!i4)? 4: 0;
                      p.setVisibility(b);
                   }
                }
             }
          }
          i4 = c;
          goto label_0318 ;
       }
    label_0369 :
       if (PatchProxy.isSupport(milanoItemPr) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoItemPr, "19") && !u.a())) {
          p = obj.y;
          if (p != null) {
             p.getLayoutParams().bottomMargin = (int)((float)obj.P.b * (0x3f800000 - f));
          }
       }
       if (!PatchProxy.isSupport(milanoItemPr) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), obj, milanoItemPr, "20")) {
          p = obj.q;
          i2 = (!f - 0x3f800000)? 0: 4;
          if (PatchProxy.isSupport(milanoItemPr) && (!PatchProxy.applyVoidTwoRefs(p, Integer.valueOf(i2), obj, milanoItemPr, "16") && (p != null && p.getVisibility() != i2))) {
             p.setVisibility(i2);
          }
       }
    label_03d2 :
       ViewGroup$LayoutParams layoutParams = obj.w.getLayoutParams();
       if (b.g() && b.e()) {
          obj1 = PatchProxy.apply(null, obj, milanoItemPr, "6");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else if(d2.g()){
             i1 = d2.e();
          }else {
             i1 = a1.g();
          }
       }else {
          obj1 = PatchProxy.apply(null, obj, milanoItemPr, "5");
          if (obj1 != patchProxyRe) {
             i1 = obj1.intValue();
          }else if(d2.g()){
             i1 = d2.f();
          }else {
             i1 = a1.h();
          }
       }
       layoutParams.width = (int)((float)i1 - ((float)MilanoItemProfileSidePresenter.W0 * (0x3f800000 - f)));
       obj.w.setLayoutParams(layoutParams);
       Activity activity = this.getActivity();
       if (activity != null && m.a().U3(activity)) {
          MilanoItemProfileSidePresenter j = obj.J;
          b = (f - 0x3f800000 >= 0)? true: false;
          a.m(j, b);
       }
       return;
    }
    public final void R8(View p0,float p1){
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, milanoItemPr, "17")) {
          return;
       }
       if (p0 != null && p0.getAlpha() - p1) {
          p0.setAlpha(p1);
       }
       return;
    }
    public void S8(View p0,int p1){
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, milanoItemPr, "23")) {
          return;
       }
       if (p0 != null) {
          p0.setVisibility(p1);
       }
       return;
    }
    public void V8(boolean p0){
       boolean b1;
       MilanoItemProfileSidePresenter milanoItemPr = MilanoItemProfileSidePresenter.class;
       if (PatchProxy.isSupport(milanoItemPr) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, milanoItemPr, "4")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, milanoItemPr, "10");
       boolean b = true;
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          Object obj1 = PatchProxy.apply(objArray, this, milanoItemPr, "12");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             milanoItemPr = this.I;
             b1 = (milanoItemPr != null && (!milanoItemPr.isAtlasPhotos() && (this.I.isLongPhotos() || this.I.isSinglePhoto())))? true: false;
          }
          if (!b1 && this.O.get().booleanValue()) {
             b = false;
          }
       }
       float f = 0;
       if (b) {
          if (this.X.r()) {
             this.R8(this.H, f);
             milanoItemPr = this.H;
             if (!p0) {
                i = 4;
             }
             this.S8(milanoItemPr, i);
          }else {
             this.R8(this.H, 0x3f800000);
             this.S8(this.H, i);
          }
       }else {
          this.S8(this.H, 4);
          this.R8(this.H, f);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoItemProfileSidePresenter.class, "2")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a3ea7);
       this.v = m1.f(p0, 0x7f0a09e1);
       this.s = m1.f(p0, 0x7f0a302f);
       this.t = m1.f(p0, 0x7f0a3030);
       this.r = m1.f(p0, 0x7f0a39fe);
       this.p = m1.f(p0, 0x7f0a3e9c);
       this.x = m1.f(p0, 0x7f0a0aeb);
       this.F = m1.f(p0, 0x7f0a400c);
       this.u = m1.f(p0, 0x7f0a4386);
       this.z = m1.f(p0, 0x7f0a032f);
       this.G = m1.f(p0, 0x7f0a2f51);
       this.w = m1.f(p0, 0x7f0a39f7);
       this.E = m1.f(p0, 0x7f0a2a96);
       this.q = m1.f(p0, 0x7f0a0cb4);
       this.H = m1.f(p0, 0x7f0a3e8a);
       this.A = m1.f(p0, 0x7f0a39f2);
       this.B = m1.f(p0, 0x7f0a04db);
       this.C = m1.f(p0, 0x7f0a04dd);
       this.D = m1.f(p0, 0x7f0a400c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MilanoItemProfileSidePresenter.class, "1")) {
          return;
       }
       this.I = this.q8(QPhoto.class);
       this.J = this.r8("DETAIL_FRAGMENT");
       this.L = this.r8("SLIDE_PLAY_SLIDE_PROFILE_LIST");
       this.M = this.r8("SLIDE_PLAY_GLOBAL_SLIDE_PROFILE_LIST");
       this.N = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       this.O = this.x8("SLIDE_PLAY_CLOSE_STATE");
       this.P = this.q8(v.class);
       this.Q = this.x8("FEED_KS_ORDER_ID");
       this.R = this.x8("PROFILE_KS_ORDER_ID");
       this.T = this.r8("DETAIL_SLIDE_PHOTO_LIST_PAUSE_VIEW_CLICK");
       this.K = this.q8(u.class);
       this.S = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       this.U = this.r8("NASA_SIDEBAR_STATUS");
       this.V = this.q8(q.class);
       this.W = this.s8(a.class);
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
