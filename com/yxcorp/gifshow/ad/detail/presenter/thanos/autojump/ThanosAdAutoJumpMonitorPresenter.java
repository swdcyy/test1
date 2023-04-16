package com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$e;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$d;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$b;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.utility.RomUtils;
import com.kwai.adclient.kscommerciallogger.snapshot.SegmentManager;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.adclient.kscommerciallogger.snapshot.a;
import com.kwai.adclient.kscommerciallogger.snapshot.Span;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import p49.f;
import p49.c;
import p49.c$a;
import p49.f$a;
import com.yxcorp.gifshow.ad.detail.presenter.thanos.autojump.ThanosAdAutoJumpMonitorPresenter$f;
import p49.a;
import wkd.b;
import u49.e;
import brd.t;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import fw8.r;
import fw8.r$a;
import o56.c;
import o56.a;
import android.app.Application;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import android.content.Context;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;

public final class ThanosAdAutoJumpMonitorPresenter extends PresenterV2	// class@0016c8
{
    public BaseFragment p;
    public QPhoto q;
    public String r;
    public boolean s;
    public boolean t;
    public ThanosAdAutoJumpMonitorPresenter$HomeBtnWatcherReceiver u;
    public final p v;
    public final r$a w;
    public final ThanosAdAutoJumpMonitorPresenter$d x;
    public final a y;
    public final Runnable z;
    public static final ThanosAdAutoJumpMonitorPresenter$a A;

    static {
       ThanosAdAutoJumpMonitorPresenter.A = new ThanosAdAutoJumpMonitorPresenter$a(null);
    }
    public void ThanosAdAutoJumpMonitorPresenter(){
       super();
       this.r = "";
       this.v = s.c(ThanosAdAutoJumpMonitorPresenter$mIsSwitchOpen$2.INSTANCE);
       this.w = new ThanosAdAutoJumpMonitorPresenter$e(this);
       this.x = new ThanosAdAutoJumpMonitorPresenter$d(this);
       this.y = new ThanosAdAutoJumpMonitorPresenter$b(this);
       this.z = new ThanosAdAutoJumpMonitorPresenter$c(this);
    }
    public void E8(){
       boolean b;
       ThanosAdAutoJumpMonitorPresenter thanosAdAuto = ThanosAdAutoJumpMonitorPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, thanosAdAuto, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Boolean obj = PatchProxy.apply(objArray, this, thanosAdAuto, "9");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          obj = PatchProxy.apply(objArray, this, thanosAdAuto, "1");
          if (obj == patchProxyRe) {
             obj = this.v.getValue();
          }
          if (obj.booleanValue()) {
             Object obj1 = PatchProxy.apply(objArray, this, thanosAdAuto, "10");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             }else if(!RomUtils.s() && (!RomUtils.w() && (RomUtils.p() || RomUtils.m()))){
                b = true;
             }else {
                b = false;
             }
             if (b) {
                b = true;
             }
          }
          b = false;
       }
       if (!b) {
          return;
       }else {
          StringBuilder str = SegmentManager.Instance.loadSessionId();
          a.o(str, "SegmentManager.Instance.loadSessionId\(\)");
          this.r = str;
          thanosAdAuto = this.p;
          String str1 = "mFragment";
          if (thanosAdAuto == null) {
             a.S(str1);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(thanosAdAuto.getParentFragment());
          ThanosAdAutoJumpMonitorPresenter tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          slidePlayVie.P(tp, this.y);
          str = "onBind page2 ";
          tp = this.p;
          if (tp == null) {
             a.S(str1);
          }
          this.P8(str+tp.o());
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter.class, "4")) {
          return;
       }
       this.P8("onUnbind becomesDetachedOnPageSelected stopMonitor");
       k1.m(this.z);
       this.S8();
       SegmentManager.Instance.clearBySessionId(this.r);
       return;
    }
    public final void P8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ThanosAdAutoJumpMonitorPresenter.class, "11")) {
          return;
       }
       SegmentManager.Instance.loadSegment(this.r, "QUICK_APP_AUTO_JUMP", 30).e().c(p0);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter.class, "12")) {
          return;
       }
       ThanosAdAutoJumpMonitorPresenter tq = this.q;
       if (tq == null) {
          a.S("mPhoto");
       }
       PhotoAdvertisement photoAdverti = k.B(tq);
       if (photoAdverti != null) {
          a.o(photoAdverti, "CommercialFeedExt.getPhotoAd\(mPhoto\) ?: return");
          f.a.a(c.Z.b()).a(this.r, false, new ThanosAdAutoJumpMonitorPresenter$f(this, photoAdverti));
          b.a(0x1ca87f04).d("https://csc.kuaishou.com/rest/csc/route/mark?cscSource=ad").subscribe(Functions.d(), Functions.d());
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter.class, "6")) {
          return;
       }
       r.c().g(this.w);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       uoc.a().unregisterActivityLifecycleCallbacks(this.x);
       this.V8();
       return;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter.class, "8")) {
          return;
       }
       if (this.u != null) {
          Activity activity = this.getActivity();
          if (activity != null) {
             UniversalReceiver.f(activity, this.u);
          }
          this.u = null;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, ThanosAdAutoJumpMonitorPresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       return;
    }
}
