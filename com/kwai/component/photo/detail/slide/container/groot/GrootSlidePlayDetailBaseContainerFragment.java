package com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment;
import wd5.f;
import qe5.a;
import com.kwai.component.photo.detail.core.container.DetailBaseContainerFragment;
import am6.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import em6.b;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import lv6.a;
import lv6.a$b;
import hm6.e;
import kv6.d;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.library.widget.viewpager.VerticalViewPager;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fx6.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import dm6.f;
import com.kwai.feature.api.feed.detail.router.DetailCommonParam;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.repo.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import em6.a;
import java.util.Objects;
import java.lang.Boolean;
import dm6.d;
import java.util.UUID;
import android.view.View;
import ld5.a;
import jf5.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.slideplay.b;
import d6a.g;
import yw6.g;
import com.kwai.component.taskdispatcher.slide.strategy.SlideTaskDispatcher;
import xw6.a;
import com.yxcorp.gifshow.detail.slideplay.SlidePlayConfig;
import az6.a;
import android.content.Intent;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import re5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import te5.k;
import com.kwai.library.groot.framework.viewpager.GrootViewPager;
import com.kwai.component.photo.detail.slide.container.groot.GrootSlidePlayDetailBaseContainerFragment$a;
import tw6.a;
import se5.b;
import sw6.b;
import qvb.i;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.kwai.library.groot.slide.filter.SlideMediaType;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import uw9.v3;
import yy6.c;
import uv6.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import brd.t;
import t45.d;
import brd.z;
import se5.c;
import erd.g;
import crd.b;
import te5.i;
import le5.f;
import te5.c;
import te5.b;
import te5.l;
import te5.g;
import te5.a;
import android.os.Bundle;
import com.kwai.component.taskdispatcher.slide.SlideDispatchHelper;
import com.trello.rxlifecycle3.components.support.RxFragment;
import java.lang.System;
import yw6.j;
import java.util.List;
import se5.a;
import ok.o;
import uh5.e;
import com.yxcorp.utility.TextUtils;

public abstract class GrootSlidePlayDetailBaseContainerFragment extends DetailBaseContainerFragment implements f, a	// class@000a4e
{
    public String p;
    public SlidePlayViewModel q;
    public SlideTaskDispatcher r;
    public a s;
    public b t;

    public void GrootSlidePlayDetailBaseContainerFragment(){
       super();
    }
    public static void qh(GrootSlidePlayDetailBaseContainerFragment p0,b p1){
       p0.wh();
    }
    private void wh(){
       a uoa;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "13")) {
          return;
       }
       if (this.th()) {
          int source = this.k.getSource();
          if (PatchProxy.isSupport(GrootSlidePlayDetailBaseContainerFragment.class)) {
             uoa = PatchProxy.applyOneRefs(Integer.valueOf(source), this, GrootSlidePlayDetailBaseContainerFragment.class, "14");
             if (uoa != PatchProxyResult.class) {
             label_005b :
                new b(uoa).r(this, this.q.d1(KwaiGrootViewPager.class), this.q.Q0("kwai_data_source_service"));
             }
          }
          a$b uob = new a$b();
          uob.e("GrootSlidePlayDetailBaseContainerFragment");
          uob.c("slide_dynamic_prefetch");
          uob.d(":ks-components:photo-detail:detail-slide");
          uob.f(e.c(source));
          uob.b(e.a(source));
          uoa = uob.a();
          goto label_005b ;
       }
       if (!PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "15")) {
          Object obj = a.b(a.b()).a(this.k.mDetailCommonParam.getDynamicPrefetcherId(), this.getActivity());
          if (obj instanceof a) {
             Objects.requireNonNull(obj);
             a uoa1 = a.class;
             if (!PatchProxy.isSupport(uoa1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, obj, uoa1, "4")) {
                obj.f();
             }
          }
       }
       return;
    }
    public String N8(){
       Object obj = PatchProxy.apply(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p == null) {
          this.p = UUID.randomUUID().toString();
       }
       return this.p;
    }
    public void ch(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrootSlidePlayDetailBaseContainerFragment.class, "2")) {
          return;
       }
       this.s = this.m.b;
       if (!PatchProxy.applyVoidOneRefs(p0, this, GrootSlidePlayDetailBaseContainerFragment.class, "16")) {
          this.q = SlidePlayViewModel.v0(this, this.sh(p0), this.rh(b.b(this.k.mPhoto)), this.r);
       }
       return;
    }
    public void d0(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "9")) {
          return;
       }
       super.d0();
       if (this.getActivity() == null) {
          return;
       }
       GrootSlidePlayDetailBaseContainerFragment tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, SlidePlayViewModel.class, "45")) {
          SlidePlayViewModel h = tq.h;
          if (h != null) {
             h.u();
          }
       }
       DetailBaseContainerFragment tk = this.k;
       this.q.y1(this.k.getSlidePlayConfig(), tk.mSlidePlayId, tk.mDetailCommonParam.getUnserializableBundleId());
       Intent intent = this.getActivity().getIntent();
       if (intent != null) {
          intent.putExtra("hasScrolled", this.q.I());
       }
       return;
    }
    public SlidePlayLogger d1(){
       Object obj = PatchProxy.apply(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return SlidePlayLogger.getLogger(this.q.t());
    }
    public final a dh(){
       Object obj = PatchProxy.apply(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a();
    }
    public QPhoto getCurrentPhoto(){
       QPhoto obj = PatchProxy.apply(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q.getCurrentPhoto();
       if (obj == null || obj.mEntity == null) {
          return this.k.mPhoto;
       }
       return obj;
    }
    public PresenterV2 gh(){
       Object obj = PatchProxy.applyWithListener(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(GrootSlidePlayDetailBaseContainerFragment.class, "5");
       return new k(this.l);
    }
    public void jh(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "17")) {
          g og = this.uh();
          GrootViewPager grootViewPag = this.q.d1(KwaiGrootViewPager.class);
          grootViewPag.j0(new GrootSlidePlayDetailBaseContainerFragment$a(this));
          grootViewPag.setPageScrolledInterceptor(new b(this));
          g og1 = this.q.O0();
          if (og1.M7() != og.M7()) {
             og1 = this.rh(og);
          }
          SlideMediaType slideMediaTy = SlideMediaType.valueOf(og.G1().value());
          KwaiGrootViewPager kwaiGrootVie = this.q.d1(KwaiGrootViewPager.class);
          b = (slideMediaTy == SlideMediaType.LIVE || slideMediaTy == SlideMediaType.ALL)? true: false;
          kwaiGrootVie.setDisableShowTopTips(b);
          this.xh(this.q.d1(KwaiGrootViewPager.class), og1);
          GrootSlidePlayDetailBaseContainerFragment tq = this.q;
          String str = og.id();
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(str, tq, SlidePlayViewModel.class, "100")) {
             tq.c = str;
             if (!TextUtils.isEmpty(str)) {
                tq.d = b.e(tq.c);
             }
          }
       }
    label_00a0 :
       this.s.V = this.k.getBaseFeed().getId();
       this.s.f.a = this.k.getBaseFeed();
       if (b.e()) {
          this.wh();
       }else {
          this.t = RxBus.f.f(b.class).observeOn(d.a).subscribe(new c(this));
       }
       return;
    }
    public final boolean kh(){
       return true;
    }
    public void nh(PresenterV2 p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, GrootSlidePlayDetailBaseContainerFragment.class, "3")) {
          return;
       }
       if (!this.k.isThanos()) {
          p0.U7(new i());
       }
       if (f.p()) {
          p0.U7(new c());
       }
       p0.U7(this.vh());
       p0.U7(new b());
       l ol = PatchProxy.applyWithListener(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "4");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l();
          PatchProxy.onMethodExit(GrootSlidePlayDetailBaseContainerFragment.class, "4");
       }
       p0.U7(ol);
       p0.U7(new g());
       p0.U7(new a());
       PatchProxy.onMethodExit(GrootSlidePlayDetailBaseContainerFragment.class, "3");
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrootSlidePlayDetailBaseContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       if (SlideDispatchHelper.h()) {
          this.r = SlideDispatchHelper.b();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       GrootSlidePlayDetailBaseContainerFragment tr = this.r;
       if (tr != null) {
          tr.l();
          this.r = null;
       }
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       GrootSlidePlayDetailBaseContainerFragment tq = this.q;
       Objects.requireNonNull(tq);
       if (!PatchProxy.applyVoid(objArray, tq, SlidePlayViewModel.class, "46")) {
          SlidePlayViewModel h = tq.h;
          if (h != null) {
             h.m();
          }
       }
       this.s.f.c = System.currentTimeMillis();
       tq = this.t;
       if (tq != null) {
          tq.dispose();
       }
       return;
    }
    public SlidePlayViewModel p0(){
       return this.q;
    }
    public g rh(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, GrootSlidePlayDetailBaseContainerFragment.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new j(p0.e0(), p0.M7(), new a(SlideMediaType.valueOf(p0.G1().value())), false);
    }
    public abstract KwaiGrootViewPager sh(View p0);
    public boolean th(){
       Object obj = PatchProxy.apply(null, this, GrootSlidePlayDetailBaseContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (e.f() || this.k.getBizType() == 16)? true: false;
       return b;
    }
    public g uh(){
       b uob1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       DetailBaseContainerFragment obj = PatchProxy.apply(objArray, this, GrootSlidePlayDetailBaseContainerFragment.class, "19");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.k;
       a mSlidePlayId = obj.mSlidePlayId;
       PhotoDetailParam mPhoto = obj.mPhoto;
       b uob = PatchProxy.applyTwoRefs(mSlidePlayId, mPhoto, objArray, b.class, "43");
       if (uob != patchProxyRe) {
       }else if(TextUtils.x(mSlidePlayId)){
          uob1 = b.c(mPhoto);
       }else {
          uob1 = b.e(mSlidePlayId);
       }
       if (uob1 == null) {
          uob1 = b.c(mPhoto);
       }
       uob = uob1;
       return uob;
    }
    public abstract PresenterV2 vh();
    public abstract void xh(KwaiGrootViewPager p0,g p1);
}
