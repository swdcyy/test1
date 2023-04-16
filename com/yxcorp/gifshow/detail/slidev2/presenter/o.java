package com.yxcorp.gifshow.detail.slidev2.presenter.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.o$a;
import b8a.y0;
import le5.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.n;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.u;
import com.yxcorp.gifshow.entity.QPhoto;
import uc6.c;
import sd5.d;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import xe5.t;
import java.util.Objects;
import xe5.t$a;
import kotlin.jvm.internal.a;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewModel;
import im8.f;
import z1.e;
import java.lang.Integer;
import m9a.u;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.d2;
import java.util.List;
import xe5.r$a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.component.photo.detail.slide.widget.MMUMaskView;
import java.lang.Number;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import lnc.b5;
import java.lang.Boolean;
import rkd.b;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import bf5.q;
import xe5.r;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import rf5.u;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.y;

public class o extends PresenterV2	// class@0019cb
{
    public f A;
    public u B;
    public List C;
    public BaseFragment D;
    public y E;
    public int F;
    public int G;
    public t H;
    public SlidePlayViewModel I;
    public q J;
    public r K;
    public final e L;
    public final View$OnLayoutChangeListener M;
    public View p;
    public View q;
    public View r;
    public KwaiImageView s;
    public MMUMaskView t;
    public d u;
    public PublishSubject v;
    public n w;
    public NasaBizParam x;
    public QPhoto y;
    public List z;

    public void o(){
       super();
       this.L = new o$a(this);
       this.M = new y0(this);
       if (f.r()) {
          n on = new n();
          this.w = on;
          this.U7(on);
       }
       return;
    }
    public void E8(){
       boolean b;
       boolean b1;
       o oo1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "4")) {
          return;
       }
       if (d.a(-1694791652).wh(this.y)) {
          return;
       }
       this.r = this.u.N().m();
       this.I = SlidePlayViewModel.B0(this.D.getParentFragment());
       Fragment parentFragme = this.D.getParentFragment();
       t ot = t.class;
       String str = "5";
       r$a obj = PatchProxy.applyOneRefs(parentFragme, objArray, ot, str);
       if (obj != patchProxyRe) {
       }else {
          t$a b2 = t.b;
          Objects.requireNonNull(b2);
          obj = PatchProxy.applyOneRefs(parentFragme, b2, t$a.class, "1");
          if (obj != patchProxyRe) {
          }else {
             a.p(parentFragme, "parentFragment");
             ViewModel viewModel = ViewModelProviders.of(parentFragme).get(ot);
             a.o(viewModel, "ViewModelProviders.of\(pa¡­izeViewModel::class.java\)");
             obj = viewModel;
          }
       }
       this.H = obj;
       int width = this.y.getWidth();
       boolean height = this.y.getHeight();
       if (this.A.get() != null) {
          this.F = this.A.get().a.intValue();
          this.G = this.A.get().b.intValue();
       }else {
          this.F = u.b(this.m8());
          this.G = u.a(this.m8());
          if (this.F <= null) {
             this.F = n.k(this.getActivity());
          }
          if (this.G <= null) {
             this.G = n.j(this.getActivity());
          }
          if (this.F <= null) {
             this.F = d2.f();
          }
          if (this.G <= null) {
             this.G = d2.e();
          }
       }
       if (width && height) {
          this.z.add(this.L);
          obj = new r$a();
          obj.o(this.y);
          obj.q(width, height);
          obj.t(this.F, this.G);
          obj.i(this.p.getWidth(), this.p.getHeight());
          obj.w(this.q);
          obj.x(this.r);
          obj.r(this.s);
          obj.m(this.t);
          o tI = this.I;
          height = false;
          width = (tI != null)? tI.a(): 0;
          obj.u(width);
          NasaSlideParam obj1 = PatchProxy.apply(objArray, this, oo, str);
          if (obj1 != patchProxyRe) {
             width = obj1.intValue();
          }else if(f.r()){
             obj1 = this.x.getNasaSlideParam().BOTTOM_BAR_HEIGHT;
          }else {
             width = 0;
          }
          obj.g(width);
          obj.p(this.y.getPhotoMeta().mPhotoTextLocationInfo);
          width = true;
          obj.k(width);
          obj.f(width);
          obj.l(height);
          obj.c(height);
          obj.b(b5.a(this.getActivity()));
          o obj2 = PatchProxy.apply(objArray, this, oo, "6");
          if (obj2 != patchProxyRe) {
             b = obj2.booleanValue();
          }else if(this.x.getNasaSlideParam().isHomePage() || (this.x.getNasaSlideParam().isTrendingPage() && f.b())){
             b = true;
          }else {
             b = false;
          }
          obj.v(b);
          obj.e((b.g() ^ width));
          obj2 = PatchProxy.apply(objArray, this, oo, "7");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else if(this.x.getNasaSlideParam().isFromProfile()){
             obj2 = this.y;
             if (obj2 != null && obj2.isMine()) {
                Object obj3 = PatchProxy.apply(objArray, this, oo, "8");
                if (obj3 != patchProxyRe) {
                   b1 = obj3.booleanValue();
                }else if(b.g() || !LandscapeUtil.a(this.y)){
                   NasaSlideParam mSourcePage = this.x.getNasaSlideParam().mSourcePage;
                   if (!this.x.getNasaSlideParam().isHomeFeatureStyle() && (!LandscapeUtil.b() && (("profile").equals(mSourcePage) || (this.x.getNasaSlideParam().mIsPayCourseDetail != null && (this.x.getNasaSlideParam().mIsMusicRadio == null && (!VisitorModeManager.f() && LandscapeUtil.d(this.y))))))) {
                      b1 = true;
                   }
                }
             label_024d :
                b1 = false;
                if (b1) {
                   oo1 = 1;
                }
             }
          }
          b1 = oo1;
          obj.n(b1);
          obj.d(f.o());
          obj.s(this.J.h);
          this.K = obj.a();
          o tt = this.t;
          if (tt != null) {
             tt.setVisibility(8);
          }
          this.H.p0(this.K, this.F, this.G, this.P8(), this.J.h);
          this.p.addOnLayoutChangeListener(this.M);
          tt = this.w;
          if (tt != null) {
             tt.R8(this.K);
          }
       }
    label_0295 :
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.s.getHierarchy().u(t$b.i);
       this.s.setScaleType(ImageView$ScaleType.CENTER_CROP);
       this.p = this.getActivity().findViewById(0x1020002);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       this.p.removeOnLayoutChangeListener(this.M);
       return;
    }
    public float P8(){
       Object obj = PatchProxy.apply(null, this, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.B.q();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a3e7d);
       this.q = m1.f(p0, 0x7f0a3e7f);
       this.s = m1.f(p0, 0x7f0a319f);
       this.t = m1.f(p0, 0x7f0a2bc6);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.u = uod;
       this.W7(uod);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.x = this.q8(NasaBizParam.class);
       this.v = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.y = this.q8(QPhoto.class);
       this.z = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       this.A = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       this.B = this.q8(u.class);
       this.C = this.t8("DETAIL_ATTACH_LISTENERS");
       this.D = this.r8("DETAIL_FRAGMENT");
       this.E = this.r8("DETAIL_FOLD_SCREEN_CHANGE_OBSERVER");
       this.J = this.q8(q.class);
       return;
    }
}
