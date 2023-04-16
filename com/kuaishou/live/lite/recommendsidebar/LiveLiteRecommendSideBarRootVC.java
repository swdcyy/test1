package com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC;
import com.kuaishou.live.viewcontroller.ViewController;
import xc3.c;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$a;
import com.kuaishou.live.lite.recommendsidebar.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import lnc.a1;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$coreModel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$c;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$b;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarRootVC$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xc3.f;
import xc3.h;
import java.lang.System;
import android.os.Trace;
import android.content.Context;
import android.view.View;
import ha1.b;
import androidx.viewpager.widget.ViewPager$i;
import qw6.a;
import qrd.l1;
import ec3.f;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.util.Objects;
import hka.a;
import ns5.a;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import xc3.i;
import android.graphics.Rect;
import android.graphics.Point;
import com.yxcorp.utility.n;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import yc3.x;
import java.lang.Integer;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import io.reactivex.subjects.PublishSubject;

public final class LiveLiteRecommendSideBarRootVC extends ViewController	// class@000ae6
{
    public final int j;
    public QPhoto k;
    public Float l;
    public ViewGroup m;
    public SlidePlayViewModel n;
    public View o;
    public final p p;
    public final p q;
    public long r;
    public final LiveLiteRecommendSideBarRootVC$c s;
    public final LiveLiteRecommendSideBarRootVC$b t;
    public final LiveLiteRecommendSideBarRootVC$d u;
    public final f v;
    public final c w;
    public final BaseFragment x;
    public final LiveLiteRecommendSideBarRootVC$a y;
    public final b z;

    public void LiveLiteRecommendSideBarRootVC(c p0,BaseFragment p1,LiveLiteRecommendSideBarRootVC$a p2,b p3){
       a.p(p0, "dataSourceReplaceManager");
       a.p(p1, "fragment");
       a.p(p2, "delegate");
       a.p(p3, "swipeMovement");
       super();
       this.w = p0;
       this.x = p1;
       this.y = p2;
       this.z = p3;
       this.j = a1.d(0x7f070591);
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(p1);
       a.o(slidePlayVie, "SlidePlayViewModel.get\(fragment\)");
       this.n = slidePlayVie;
       this.p = s.c(LiveLiteRecommendSideBarRootVC$coreModel$2.INSTANCE);
       this.q = s.c(new LiveLiteRecommendSideBarRootVC$recommendPanelFragmentLazy$1(this));
       this.s = new LiveLiteRecommendSideBarRootVC$c(this);
       this.t = new LiveLiteRecommendSideBarRootVC$b(this);
       this.u = new LiveLiteRecommendSideBarRootVC$d(this);
       h oh = PatchProxy.apply(null, this, LiveLiteRecommendSideBarRootVC.class, "5");
       if (oh != PatchProxyResult.class) {
       }else {
          oh = new h(this);
       }
       this.v = oh;
       return;
    }
    public void F2(){
       l1 a;
       Object[] objArray;
       String str = "java.lang.String.format\(format, *args\)";
       String str1 = "%s - %.3fms";
       if (PatchProxy.applyVoid(null, this, LiveLiteRecommendSideBarRootVC.class, "3")) {
          return;
       }
       String str2 = "LiveLiteRecommendSideBarRootVC::onCreate";
       Trace.beginSection(str2);
       View view = b.e(this.D2(), R.layout.arg_RES_7f0d0c70);
       a.o(view, "LiteLayoutInflater.infla¡­ecommend_side_bar_layout\)");
       this.R2(view);
       this.c3();
       this.b3();
       this.y.r(this.t);
       this.y.h(this.u);
       a = l1.a;
       Trace.endSection();
       float f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[]{str2,Float.valueOf(f)};
             str1 = String.format(str1, Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[]{str2,Float.valueOf(f)};
          str1 = String.format(str1, Arrays.copyOf(objArray, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f), a).getSecond();
       return;
    }
    public void J2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecommendSideBarRootVC.class, "4")) {
          return;
       }
       LiveLiteRecommendSideBarRootVC tz = this.z;
       GifshowActivity gifshowActiv = this.B2();
       Objects.requireNonNull(tz);
       if (!PatchProxy.applyVoidOneRefs(gifshowActiv, tz, b.class, "2")) {
          gifshowActiv.l3(tz.v);
       }
       this.z.w(objArray);
       this.y.q(this.t);
       this.y.l(this.u);
       return;
    }
    public final LiveLiteRecommendSideBarCoreModel V2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendSideBarRootVC.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.p.getValue();
    }
    public final c W2(){
       return this.w;
    }
    public final LiveLiteRecommendSideBarRootVC$a X2(){
       return this.y;
    }
    public final BaseFragment Y2(){
       return this.x;
    }
    public final LiveLiteRecommendPanelFragment Z2(){
       Object obj = PatchProxy.apply(null, this, LiveLiteRecommendSideBarRootVC.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.q.getValue();
    }
    public final b a3(){
       return this.z;
    }
    public final void b3(){
       LiveLiteRecommendSideBarRootVC liveLiteReco = LiveLiteRecommendSideBarRootVC.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteReco, "8")) {
          return;
       }
       LiveLiteRecommendSideBarRootVC tz = this.z;
       i oi = PatchProxy.apply(objArray, this, liveLiteReco, "6");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(this);
       }
       tz.w(oi);
       liveLiteReco = this.z;
       GifshowActivity gifshowActiv = this.B2();
       Objects.requireNonNull(liveLiteReco);
       if (!PatchProxy.applyVoidOneRefs(gifshowActiv, liveLiteReco, b.class, "1")) {
          gifshowActiv.F2(liveLiteReco.v);
       }
       this.z.r = new Rect(0, 0, (n.s(this.B2()).x - this.j), n.s(this.B2()).y);
       return;
    }
    public final void c3(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRecommendSideBarRootVC.class, "7")) {
          return;
       }
       ViewGroup viewGroup = this.A2(R.id.live_lite_recommend_side_bar_layout);
       this.m = viewGroup;
       a.m(viewGroup);
       viewGroup.setTranslationX((float)this.j);
       View view = this.A2(R.id.live_lite_recommend_side_bar_left_empty_placeholder_view);
       this.o = view;
       if (view != null) {
          objArray = view.getLayoutParams();
       }
       Objects.requireNonNull(objArray, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
       if (x.d()) {
          objArray.height = -1;
          objArray.topMargin = a1.d(0x7f07028e);
       }else {
          objArray.height = a1.d(0x7f070340);
          objArray.addRule(10);
       }
       return;
    }
    public final void d3(int p0){
       LiveLiteRecommendSideBarRootVC liveLiteReco = LiveLiteRecommendSideBarRootVC.class;
       if (PatchProxy.isSupport(liveLiteReco) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveLiteReco, "9")) {
          return;
       }
       QPhoto qPhoto = this.y.n(p0);
       if (qPhoto == null || !qPhoto.isLiveStream()) {
          this.V2().f(null);
          this.z.l();
          LiveLiteRecommendSideBarRootVC tq = this.q;
          if (tq.isInitialized()) {
             tq.getValue().Kh();
          }
       }else {
          this.k = qPhoto;
          if (this.V2().c().getValue() == LiveLiteRecommendSideBarCoreModel$RecommendPanelStatus.FINISH_OPEN) {
             LiveLiteRecommendPanelFragment liveLiteReco1 = this.Z2();
             Objects.requireNonNull(liveLiteReco1);
             if (!PatchProxy.applyVoidOneRefs(qPhoto, liveLiteReco1, LiveLiteRecommendPanelFragment.class, "18")) {
                liveLiteReco1.I.a.setValue(qPhoto);
                qPhoto = qPhoto.mEntity;
                if (qPhoto instanceof LiveStreamFeed) {
                   liveLiteReco1.I.f.onNext(qPhoto);
                }
             }
          }else if(a.g(this.V2().b(), qPhoto) ^ 0x01){
             this.V2().f(qPhoto);
             this.Z2().Kh();
          }
       }
       return;
    }
}
