package com.yxcorp.gifshow.detail.slidev2.presenter.p;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.p$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.p$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.p$c;
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
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import uc6.c;
import sd5.d;
import android.view.View;
import lnc.d2;
import java.lang.Boolean;
import android.os.Build;
import java.lang.CharSequence;
import im8.f;
import android.util.Pair;
import java.lang.Integer;
import m9a.u;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.util.List;
import xe5.r$a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.component.photo.detail.slide.widget.MMUMaskView;
import java.lang.Number;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import lnc.j2;
import lnc.b5;
import rkd.b;
import com.yxcorp.gifshow.detail.presenter.landscape.LandscapeUtil;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import bf5.q;
import xe5.r;
import android.widget.FrameLayout;
import xe5.s;
import xe5.p;
import b8a.z0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import vy6.a;
import android.view.View$OnLayoutChangeListener;
import ac.b;
import com.facebook.drawee.view.DraweeView;
import yb.a;
import xb.t$b;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import rf5.u;
import android.content.res.Resources;
import android.content.res.Configuration;
import java.util.Objects;
import apd.j;
import ekd.m1;
import android.view.ViewGroup;
import sd5.c;
import im8.a;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.y;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;

public class p extends PresenterV2	// class@0019cf
{
    public QPhoto A;
    public List B;
    public f C;
    public u D;
    public List E;
    public BaseFragment F;
    public y G;
    public int H;
    public int I;
    public s J;
    public boolean K;
    public boolean L;
    public SlidePlayViewModel M;
    public q N;
    public final e O;
    public final a P;
    public final View$OnLayoutChangeListener Q;
    public n p;
    public PublishSubject q;
    public boolean r;
    public View s;
    public NasaBizParam t;
    public PhotoDetailParam u;
    public d v;
    public View w;
    public View x;
    public KwaiImageView y;
    public MMUMaskView z;

    public void p(){
       super();
       this.O = new p$a(this);
       this.P = new p$b(this);
       this.Q = new p$c(this);
       if (f.r()) {
          n on = new n();
          this.p = on;
          this.U7(on);
       }
       return;
    }
    public void E8(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p op = p.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, op, "4")) {
          return;
       }
       if (d.a(-1694791652).wh(this.A)) {
          return;
       }
       this.M = SlidePlayViewModel.B0(this.F.getParentFragment());
       this.x = this.v.N().m();
       int width = this.A.getWidth();
       int height = this.A.getHeight();
       boolean b = false;
       if (!d2.g()) {
          r$a obj = PatchProxy.apply(objArray, objArray, op, "11");
          b1 = (obj != patchProxyRe)? obj.booleanValue(): (Build.MODEL).contains("SM-F9000");
          if (!b1) {
             b1 = false;
          label_0069 :
             this.K = b1;
             this.r = b;
             if (this.C.get() != null) {
                this.H = this.C.get().first.intValue();
                this.I = this.C.get().second.intValue();
             }else {
                this.H = u.b(this.m8());
                this.I = u.a(this.m8());
                if (this.H <= null) {
                   this.H = n.k(this.getActivity());
                }
                if (this.I <= null) {
                   this.I = n.j(this.getActivity());
                }
                if (this.H <= null) {
                   this.H = d2.f();
                }
                if (this.I <= null) {
                   this.I = d2.e();
                }
             }
             if (width && height) {
                this.B.add(this.O);
                obj = new r$a();
                obj.o(this.A);
                obj.q(width, height);
                obj.t(this.H, this.I);
                obj.i(d2.f(), d2.e());
                obj.w(this.w);
                obj.x(this.x);
                obj.r(this.y);
                obj.m(this.z);
                p tM = this.M;
                width = (tM != null)? tM.a(): 0;
                obj.u(width);
                NasaSlideParam obj1 = PatchProxy.apply(objArray, this, op, "12");
                if (obj1 != patchProxyRe) {
                   width = obj1.intValue();
                }else if(f.r()){
                   obj1 = this.t.getNasaSlideParam().BOTTOM_BAR_HEIGHT;
                }else {
                   width = 0;
                }
                obj.g(width);
                obj.p(this.A.getPhotoMeta().mPhotoTextLocationInfo);
                obj.k(true);
                obj.f(true);
                obj1 = PatchProxy.apply(objArray, this, op, "13");
                width = (obj1 != patchProxyRe)? obj1.booleanValue(): j2.a() ^ true;
                obj.l(width);
                obj1 = PatchProxy.apply(objArray, this, op, "14");
                width = (obj1 != patchProxyRe)? obj1.booleanValue(): false;
                obj.c(width);
                obj.f(true);
                obj.b(b5.a(this.getActivity()));
                obj1 = PatchProxy.apply(objArray, this, op, "15");
                if (obj1 != patchProxyRe) {
                   width = obj1.booleanValue();
                }else if(this.t.getNasaSlideParam().isHomePage() || (this.t.getNasaSlideParam().isTrendingPage() && f.b())){
                   width = true;
                }else {
                   width = false;
                }
                obj.v(width);
                obj.e((b.g() ^ true));
                obj1 = PatchProxy.apply(objArray, this, op, "16");
                if (obj1 != patchProxyRe) {
                   b2 = obj1.booleanValue();
                }else if(this.t.getNasaSlideParam().isFromProfile()){
                   tM = this.A;
                   if (tM != null && tM.isMine()) {
                      Object obj2 = PatchProxy.apply(objArray, this, op, "17");
                      if (obj2 != patchProxyRe) {
                         b2 = obj2.booleanValue();
                      }else if(b.g() || !LandscapeUtil.a(this.A)){
                         NasaSlideParam mSourcePage = this.t.getNasaSlideParam().mSourcePage;
                         if (!this.t.getNasaSlideParam().isHomeFeatureStyle() && (!LandscapeUtil.b() && (("profile").equals(mSourcePage) || (this.t.getNasaSlideParam().mIsPayCourseDetail != null && (this.t.getNasaSlideParam().mIsMusicRadio == null && (!VisitorModeManager.f() && LandscapeUtil.d(this.A))))))) {
                            b2 = true;
                         }
                      }
                   label_025b :
                      b2 = false;
                      if (b2) {
                         b = 1;
                      }
                   }
                }
                b2 = b;
                obj.n(b2);
                obj.d(f.o());
                obj.s(this.N.h);
                r or = obj.a();
                op = this.z;
                if (op != null) {
                   op.setVisibility(8);
                }
                s os = new s(or);
                this.J = os;
                os.c(this.H, this.P8(), this.R8(), this.N.h);
                if (this.r != null) {
                   this.X7(this.q.subscribe(new z0(this), Functions.e));
                   if (this.M != null) {
                      if (SlidePerformanceExp.c()) {
                         this.M.r0(this.F, this.P);
                      }else {
                         this.M.P(this.F, this.P);
                      }
                   }else {
                      op = this.E;
                      if (op != null) {
                         op.add(this.P);
                      }
                   }
                }
                this.s.addOnLayoutChangeListener(this.Q);
                op = this.p;
                if (op != null) {
                   op.R8(or);
                }
             }
          label_02df :
             return;
          }
       }
       b1 = true;
       goto label_0069 ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       this.y.getHierarchy().u(t$b.i);
       this.y.setScaleType(ImageView$ScaleType.CENTER_CROP);
       this.s = this.getActivity().findViewById(0x1020002);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       if (this.r != null) {
          p tM = this.M;
          if (tM != null) {
             tM.q0(this.F, this.P);
          }else {
             tM = this.E;
             if (tM != null) {
                tM.remove(this.P);
             }
          }
       }
       this.s.removeOnLayoutChangeListener(this.Q);
       return;
    }
    public int P8(){
       return this.I;
    }
    public float R8(){
       Object obj = PatchProxy.apply(null, this, p.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return this.D.q();
    }
    public void S8(boolean p0){
       int i1;
       p op = p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "6")) {
          return;
       }
       p0 = b5.a(this.getActivity());
       Object[] objArray = null;
       if (p0) {
          if (!PatchProxy.applyVoid(objArray, this, op, "7")) {
             Configuration configuratio = this.l8().getConfiguration();
             Configuration densityDpi = configuratio.densityDpi;
             int i = (configuratio.screenWidthDp * densityDpi) / 160;
             i1 = (configuratio.screenHeightDp * densityDpi) / 160;
             if (i != this.H || i1 != this.I) {
                this.H = i;
                this.I = i1;
                p tJ = this.J;
                Objects.requireNonNull(tJ);
                s os = s.class;
                if (PatchProxy.isSupport(os) && PatchProxy.applyTwoRefs(Integer.valueOf(i), Integer.valueOf(i1), tJ, os, "3") != PatchProxyResult.class) {
                }else {
                   tJ.a.C = true;
                   tJ.b(i, i1);
                }
             }
          }
       }else if(this.K != null){
          if (!PatchProxy.applyVoid(objArray, this, op, "8")) {
             i1 = d2.f();
             if (i1 != this.H) {
                d2.n();
                this.H = i1;
                this.J.b(i1, d2.e());
             }
          }
       }else if(this.L != null){
          this.H = d2.f();
          this.I = d2.e();
          this.J.c(this.H, this.P8(), this.R8(), this.N.h);
       }
       this.L = p0;
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "2")) {
          return;
       }
       this.x = j.b(p0, 0x7f0a3e7d);
       this.w = j.b(p0, 0x7f0a3e7f);
       this.y = j.b(p0, 0x7f0a319f);
       this.z = j.b(p0, 0x7f0a2bc6);
       d uod = c.a(m1.f(p0, R.id.texture_view_frame));
       this.v = uod;
       this.W7(uod);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.q = this.r8("DETAIL_ON_CONFIGURATION_CHANGED_EVENT");
       this.A = this.q8(QPhoto.class);
       this.B = this.r8("SLIDE_PLAY_SIZE_CHANGED_LIST");
       this.C = this.x8("SLIDE_PLAY_SIZE_SUPPLIER");
       this.D = this.q8(u.class);
       this.E = this.t8("DETAIL_ATTACH_LISTENERS");
       this.F = this.r8("DETAIL_FRAGMENT");
       this.G = this.r8("DETAIL_FOLD_SCREEN_CHANGE_OBSERVER");
       this.N = this.q8(q.class);
       this.t = this.q8(NasaBizParam.class);
       this.u = this.q8(PhotoDetailParam.class);
       return;
    }
}
