package com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter;
import com.yxcorp.gifshow.detail.slidev2.presenter.autoplay.SlideAutoPlaySwitchPhotoPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz9.i;
import brd.t;
import t45.d;
import brd.z;
import c8a.m;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d0a.m;
import c8a.j;
import z3d.a;
import c8a.k;
import bxb.a;
import c8a.l;
import c8a.g;
import c8a.h;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import c8a.i;
import android.content.Context;
import com.kwai.feature.api.danmaku.c;
import c8a.f;
import androidx.recyclerview.widget.SlideVerticalAtlasPlayer;
import c8a.d;
import u2.i;
import c8a.e;
import androidx.recyclerview.widget.SlideHorizontalAtlasPlayer;
import com.yxcorp.gifshow.entity.QPhoto;
import c8a.c;
import lnc.u1;
import lnc.b9;
import jm5.c;
import im5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import le5.f;
import com.kwai.sdk.switchconfig.a;
import androidx.fragment.app.Fragment;
import java.lang.Number;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import lnc.a1;
import ekd.i;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup$MarginLayoutParams;
import i3a.b;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import ekd.m1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import f6a.c;
import fm5.a;
import dda.a;
import java.util.BitSet;
import djc.l1;
import mhc.y1;
import java.lang.Float;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus;

public class SlideAutoPlaySwitchPhotoPresenter extends SlidePlayAutoPlayNextPresenter	// class@0018ed
{
    public int f1;
    public int g1;
    public PhotoDetailParam h1;
    public PublishSubject i1;
    public PublishSubject j1;
    public View k1;
    public SlideHorizontalAtlasPlayer l1;
    public c m1;
    public d n1;
    public b o1;
    public NasaBizParam p1;
    public boolean q1;
    public PhotoDetailLogger r1;
    public final c s1;
    public static final int t1;

    public void SlideAutoPlaySwitchPhotoPresenter(){
       super();
       this.s1 = new SlideAutoPlaySwitchPhotoPresenter$a(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlideAutoPlaySwitchPhotoPresenter.class, "2")) {
          return;
       }
       super.E8();
       if (this.V0.r()) {
          return;
       }
       RxBus f = RxBus.f;
       z a = d.a;
       this.X7(f.f(i.class).observeOn(a).subscribe(new m(this)));
       this.X7(f.f(m.class).observeOn(a).subscribe(new j(this)));
       this.X7(f.f(a.class).observeOn(a).subscribe(new k(this)));
       this.X7(f.f(a.class).observeOn(a).subscribe(new l(this)));
       this.X7(this.i1.subscribe(new g(this)));
       this.X7(this.j1.subscribe(new h(this)));
       this.X7(q.p0(this.getActivity()).r0().subscribe(new i(this)));
       this.o1 = this.m1.b(false, false, objArray).observeOn(a).subscribe(new f(this));
       SlideAutoPlaySwitchPhotoPresenter tk1 = this.k1;
       if (tk1 != null && tk1 instanceof SlideVerticalAtlasPlayer) {
          tk1.setPageScrollToEndListener(new d(this));
       }
       tk1 = this.l1;
       if (tk1 != null) {
          tk1.setPageScrollToEndListener(new e(this));
       }
       return;
    }
    public void E9(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "22")) {
          return;
       }
       if (this.Y != null) {
          SlidePlayAutoPlayNextPresenter tV0 = this.V0;
          if (tV0 != null && tV0.H(this.x)) {
             this.V0.L(this.W0);
             c.e(this.x);
          }
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "11")) {
          return;
       }
       super.F8();
       u1.a(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "12")) {
          return;
       }
       super.H8();
       u1.b(this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "10")) {
          return;
       }
       super.J8();
       b9.a(this.o1);
       SlideAutoPlaySwitchPhotoPresenter tn1 = this.n1;
       if (tn1 != null) {
          tn1.x(this.s1);
       }
       return;
    }
    public boolean J9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "15");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.p1.getNasaSlideParam().isHomeFeatureStyle()) {
          obj = PatchProxy.apply(null, null, f.class, "28");
          boolean b1 = (obj != patchProxyRe)? obj.booleanValue(): a.t().d("enableShowAutoPlayPredictViewTip", b);
          if (b1) {
             b = true;
          }
       }
       return b;
    }
    public final void L9(){
       int i;
       SlideAutoPlaySwitchPhotoPresenter slideAutoPla = SlideAutoPlaySwitchPhotoPresenter.class;
       if (PatchProxy.applyVoid(null, this, slideAutoPla, "16")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       Context uContext = this.G.requireContext();
       TypedValue obj = PatchProxy.applyOneRefs(uContext, this, slideAutoPla, "17");
       if (obj != PatchProxyResult.class) {
          i = obj.intValue();
       }else {
          obj = new TypedValue();
          uContext.getTheme().resolveAttribute(R.attr.arg_RES_7f0400f6, obj, true);
          i = TypedValue.complexToDimensionPixelSize(obj.data, c.c(uContext.getResources()));
       }
       i = i + a1.e(12.00f);
       if (i.c()) {
          i = i + n.A(this.G.requireContext());
       }
       ViewGroup$MarginLayoutParams layoutParams = this.q.getLayoutParams();
       this.f1 = layoutParams.topMargin;
       this.g1 = layoutParams.rightMargin;
       layoutParams.topMargin = i;
       layoutParams.rightMargin = a1.e(8.00f);
       this.q.setLayoutParams(layoutParams);
       return;
    }
    public boolean P8(){
       return true;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.x.isSinglePhoto()) {
          return super.R8();
       }
       return this.q1;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "23")) {
          return;
       }
       SlideAutoPlaySwitchPhotoPresenter tr1 = this.r1;
       if (tr1 != null) {
          tr1.setSlideAutoPlayForFeedbackSwitch(b.f());
       }
       this.q1 = false;
       return;
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.x.isAtlasPhotos() || this.x.isLongPhotos()) {
          return false;
       }
       return super.W8();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideAutoPlaySwitchPhotoPresenter.class, "13")) {
          return;
       }
       super.doBindView(p0);
       this.k1 = m1.f(p0, 0x7f0a09e1);
       this.l1 = m1.f(p0, 0x7f0a032f);
       return;
    }
    public int h9(){
       return 0x7f0a39a7;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "1")) {
          return;
       }
       super.j8();
       this.h1 = this.q8(PhotoDetailParam.class);
       this.i1 = this.r8("DETAIL_SLIDE_COMMENT_FRAGMENT_VISIBLE");
       this.j1 = this.r8("DETAIL_SLIDE_AI_TEXT_FRAGMENT_VISIBLE");
       this.m1 = this.r8("FRAGMENT_BARRAGE_KIT_WRAPPER");
       this.r1 = this.r8("DETAIL_LOGGER");
       this.p1 = this.q8(NasaBizParam.class);
       return;
    }
    public int j9(){
       return 0x7f0a39a6;
    }
    public void k9(){
       if (PatchProxy.applyVoid(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "14")) {
          return;
       }
       if (this.q != null || (this.J9() && !this.V0.r())) {
          this.p.g(true);
          this.q = this.p.a();
          if (NasaSlidePlayExperimentUtil.e()) {
             this.q.setBackground(a1.f(R.drawable.arg_RES_7f0819b0));
          }
          this.s = m1.f(this.q, 0x7f0a39dd);
          this.t = m1.f(this.q, 0x7f0a39de);
          this.u = m1.f(this.q, 0x7f0a3a56);
          this.q.setVisibility(8);
          this.L9();
       }
    label_006e :
       return;
    }
    public boolean l9(){
       Object obj = PatchProxy.apply(null, this, SlideAutoPlaySwitchPhotoPresenter.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (b.f() && (!c.e(this.x) || a.w(this.x)))? true: false;
       return b;
    }
    public boolean n9(){
       return true;
    }
    public void onEventMainThread(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideAutoPlaySwitchPhotoPresenter.class, "9")) {
          return;
       }
       if (this.L == null || (this.x.isAd() && p0.a == this.x.mEntity)) {
          this.T.set(19);
          this.G9();
       }
    label_002a :
       return;
    }
    public void onEventMainThread(l1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideAutoPlaySwitchPhotoPresenter.class, "8")) {
          return;
       }
       if (this.L == null) {
          return;
       }
       if (p0.a != null) {
          this.T.set(12);
          this.G9();
       }else {
          this.T.clear(12);
          this.F9();
       }
       return;
    }
    public void onEventMainThread(y1 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideAutoPlaySwitchPhotoPresenter.class, "7")) {
          return;
       }
       if (this.L == null) {
          return;
       }
       if (p0.a != null) {
          this.T.set(11);
          this.G9();
       }else {
          this.T.clear(11);
          this.F9();
       }
       return;
    }
    public void y9(float p0){
       SlideAutoPlaySwitchPhotoPresenter slideAutoPla = SlideAutoPlaySwitchPhotoPresenter.class;
       if (PatchProxy.isSupport(slideAutoPla) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, slideAutoPla, "18")) {
          return;
       }
       int i = 2;
       v0 = p0 - 0x3f800000;
       if (!slideAutoPla) {
          this.W = SlidePlayAutoPlayNextPresenter$AutoPlayNextStatus.ENABLE;
          this.T.clear(i);
          this.F9();
       }else if(!p0){
          this.T.set(i);
          this.G9();
       }
       SlidePlayAutoPlayNextPresenter tq = this.q;
       if (tq != null) {
          if (!p0) {
             tq.setVisibility(8);
          }else if(!slideAutoPla){
             this.L9();
          }
       }
       return;
    }
}
