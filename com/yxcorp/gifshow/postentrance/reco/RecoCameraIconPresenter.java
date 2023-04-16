package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$a;
import nsd.u;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$showDuration$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$b;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$leavePostPendingTime$2;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2;
import pr6.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$f;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$e;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$u;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$t;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$m;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$s;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a0c.g;
import q87.c;
import ezb.f;
import ekd.q$b;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher$d;
import com.yxcorp.gifshow.postentrance.CameraViewSwitcher;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import brd.t;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$n;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import vzb.a;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$o;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$p;
import w16.h;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$q;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$r;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import lnc.b9;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$d;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$i;
import java.util.concurrent.Callable;
import g26.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$j;
import erd.o;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$k;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Objects;
import java.util.Map;
import com.kuaishou.android.model.mix.PostShowStartUpInfo;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$l;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$g;
import com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$h;
import com.yxcorp.gifshow.postentrance.util.d;
import java.lang.Number;
import ezb.k;
import android.content.SharedPreferences;
import com.yxcorp.gifshow.util.DateUtils;
import java.lang.Throwable;
import com.yxcorp.gifshow.widget.CameraIconImageSwitcher;
import kotlin.Pair;
import java.lang.Boolean;
import java.lang.StringBuilder;
import lnc.a1;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import lnc.x6;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import lnc.i3;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import java.lang.Long;
import android.content.SharedPreferences$Editor;
import oe6.g;

public abstract class RecoCameraIconPresenter extends PresenterV2	// class@001071
{
    public final RecoCameraIconPresenter$m A;
    public final RecoCameraIconPresenter$s B;
    public final d C;
    public long p;
    public CameraViewSwitcher q;
    public RecoCameraIconPresenter$c r;
    public b s;
    public RecoCameraIconPresenter$d t;
    public final Runnable u;
    public Runnable v;
    public final RecoCameraIconPresenter$e w;
    public final q$b x;
    public final q$b y;
    public View z;
    public static final p D;
    public static final RecoCameraIconPresenter$b E;
    public static final p F;
    public static final p G;
    public static final p H;
    public static final RecoCameraIconPresenter$a I;

    static {
       RecoCameraIconPresenter.I = new RecoCameraIconPresenter$a(null);
       RecoCameraIconPresenter.D = s.c(RecoCameraIconPresenter$Companion$showDuration$2.INSTANCE);
       RecoCameraIconPresenter.E = new RecoCameraIconPresenter$b();
       RecoCameraIconPresenter.F = s.c(RecoCameraIconPresenter$Companion$leavePostPendingTime$2.INSTANCE);
       RecoCameraIconPresenter.G = s.c(RecoCameraIconPresenter$Companion$postHomeEntranceRecoShowFrequency$2.INSTANCE);
       RecoCameraIconPresenter.H = s.c(RecoCameraIconPresenter$Companion$postShowStartUpInfoMap$2.INSTANCE);
    }
    public void RecoCameraIconPresenter(d p0){
       a.p(p0, "fragment");
       super();
       this.C = p0;
       this.u = new RecoCameraIconPresenter$f(this);
       this.w = new RecoCameraIconPresenter$e(this);
       this.x = RecoCameraIconPresenter$u.a;
       this.y = new RecoCameraIconPresenter$t(this);
       this.A = new RecoCameraIconPresenter$m(this);
       this.B = new RecoCameraIconPresenter$s(this);
    }
    public static final RecoCameraIconPresenter$c P8(RecoCameraIconPresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("recoCameraItem");
       }
       return p0;
    }
    public void E8(){
       z a;
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "onBind", objArray);
       RecoCameraIconPresenter tq = this.q;
       String str = "cameraViewSwitcher";
       if (tq == null) {
          a.S(str);
       }
       RecoCameraIconPresenter tr = this.r;
       String str1 = "recoCameraItem";
       if (tr == null) {
          a.S(str1);
       }
       tq.f(tr, this.x, this.A);
       tq = this.q;
       if (tq == null) {
          a.S(str);
       }
       RecoCameraIconPresenter tr1 = this.r;
       if (tr1 == null) {
          a.S(str1);
       }
       tq.g(tr1, this.y, this.B);
       this.X7(this.C.h().k().subscribe(new RecoCameraIconPresenter$n(this), Functions.d()));
       RxBus f = RxBus.f;
       a = d.a;
       this.X7(f.f(a.class).observeOn(a).subscribe(new RecoCameraIconPresenter$o(this), RecoCameraIconPresenter$p.b));
       t ot = f.f(h.class).observeOn(a).subscribeOn(a);
       this.X7(ot.subscribe(new RecoCameraIconPresenter$q(this), RecoCameraIconPresenter$r.b));
       a.b().registerActivityLifecycleCallbacks(this.w);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "onCreate", objArray);
       this.r = new RecoCameraIconPresenter$c(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "8")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "onDestroy", objArray);
       b9.a(this.s);
       k1.m(this.u);
       RecoCameraIconPresenter tv = this.v;
       if (tv != null) {
          k1.m(tv);
       }
       this.v = null;
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "7")) {
          return;
       }
       a.b().unregisterActivityLifecycleCallbacks(this.w);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "10")) {
          return;
       }
       RecoCameraIconPresenter tt = this.t;
       if (tt != null) {
          this.S8(tt);
       }
       return;
    }
    public final void S8(RecoCameraIconPresenter$d p0){
       Object[] objArray1;
       t ot;
       a b;
       RecoCameraIconPresenter$d uod1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecoCameraIconPresenter recoCameraIc = RecoCameraIconPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, recoCameraIc, "14")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       String str = "RecoCameraIconPresenter";
       g.C().w(str, "fetchIcon", objArray);
       RecoCameraIconPresenter$d uod = null;
       this.t = uod;
       b9.a(this.s);
       if (!this.Z8()) {
          objArray1 = new Object[i];
          g.C().w(str, "fetchIcon, disableShowReco", objArray1);
          return;
       }else if(this.a9()){
          Object[] objArray2 = new Object[i];
          g.C().w(str, "fetchIcon, need pending", objArray2);
          this.t = p0;
          return;
       }else {
          a uoa = PatchProxy.apply(uod, p0, RecoCameraIconPresenter$d.class, "2");
          if (uoa != patchProxyRe) {
          }else {
             uoa = p0.a.d;
             a.o(uoa, "eveRecommendData.mIconUrl");
          }
          RecoCameraIconPresenter$i oi = (uoa.length() > 0)? 1: null;
          if (oi) {
             ot = t.fromCallable(new RecoCameraIconPresenter$i(uoa));
          }else if(p0.a().b == 7){
             ot = y6.s(b.class, LoadPolicy.SILENT_IF_DOWNLOADED).w(new RecoCameraIconPresenter$j(p0)).map(RecoCameraIconPresenter$k.b);
          }else {
             ot = uod;
          }
          if (ot == null) {
             objArray1 = new Object[i];
             g.C().w(str, "cdn Observable is null", objArray1);
             return;
          }else {
             b = p0.a().b;
             if (PatchProxy.isSupport(recoCameraIc)) {
                uod1 = PatchProxy.applyOneRefs(Integer.valueOf(b), this, recoCameraIc, "16");
                if (uod1 != patchProxyRe) {
                label_00ec :
                   CDNUrl[][] uCDNUrlArray = new CDNUrl[][1];
                   this.s = ot.flatMap(new RecoCameraIconPresenter$l(uCDNUrlArray, uod1, p0)).subscribeOn(d.c).observeOn(d.a).subscribe(new RecoCameraIconPresenter$g(this, uCDNUrlArray, p0, uod1), new RecoCameraIconPresenter$h(this));
                   return;
                }
             }
             RecoCameraIconPresenter$a i1 = RecoCameraIconPresenter.I;
             Objects.requireNonNull(i1);
             Object obj = PatchProxy.apply(uod, i1, RecoCameraIconPresenter$a.class, "4");
             if (obj != patchProxyRe) {
             }else {
                obj = RecoCameraIconPresenter.H.getValue();
             }
             if (obj != null) {
                PostShowStartUpInfo postShowStar = obj.get(Integer.valueOf(b));
                if (postShowStar != null) {
                   uod = postShowStar.mOriginTagPic;
                }
             }
             uod1 = uod;
             goto label_00ec ;
          }
       }
    }
    public final CameraViewSwitcher V8(){
       RecoCameraIconPresenter obj = PatchProxy.apply(null, this, RecoCameraIconPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.q;
       if (obj == null) {
          a.S("cameraViewSwitcher");
       }
       return obj;
    }
    public final int W8(){
       long l;
       d uod = d.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, this, RecoCameraIconPresenter.class, "19");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       int i = 0;
       try{
          Object obj1 = PatchProxy.apply(null, null, uod, "33");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          label_0030 :
             if (DateUtils.J(l)) {
                Object obj2 = PatchProxy.apply(null, null, uod, "31");
                int i1 = (obj2 != patchProxyRe)? obj2.intValue(): k.a.getInt("post_material_recommend_daily_show_count", i);
                i = i1;
             }
          }else {
             l = k.a.getLong("post_material_recommend_last_show_time", 0);
             goto label_0030 ;
          }
       }catch(java.lang.Exception e0){
          g.C().e("RecoCameraIconPresenter", "getDailyShowCount error", e0);
       }
       return i;
    }
    public abstract CameraIconImageSwitcher X8();
    public abstract Pair Y8();
    public final boolean Z8(){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecoCameraIconPresenter recoCameraIc = RecoCameraIconPresenter.class;
       Object[] objArray = null;
       RecoCameraIconPresenter obj = PatchProxy.apply(objArray, this, recoCameraIc, "11");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.q;
       String str = "cameraViewSwitcher";
       if (obj == null) {
          a.S(str);
       }
       int priority = obj.e().getPriority();
       RecoCameraIconPresenter tr = this.r;
       if (tr == null) {
          a.S("recoCameraItem");
       }
       if (priority > tr.getPriority()) {
          g og = g.C();
          StringBuilder str1 = "current priority: ";
          RecoCameraIconPresenter tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          objArray = new Object[0];
          og.w("RecoCameraIconPresenter", str1+tq.e().getPriority()+" disable recommend", objArray);
          return 0;
       }else {
          Object[] obj1 = PatchProxy.apply(objArray, this, recoCameraIc, "17");
          String str2 = 1;
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             b = this.W8();
             RecoCameraIconPresenter$a i = RecoCameraIconPresenter.I;
             Object[] objArray1 = new Object[0];
             g.C().w("RecoCameraIconPresenter", "checkFrequencyLimit, count: "+b+' '+"dayTimes: "+i.b().a(), objArray1);
             b = (b < i.b().a())? true: false;
          }
          if (!b) {
             obj1 = new Object[0];
             g.C().w("RecoCameraIconPresenter", "frequency limited", obj1);
             return 0;
          }else {
             return str2;
          }
       }
    }
    public final boolean a9(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecoCameraIconPresenter recoCameraIc = RecoCameraIconPresenter.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, recoCameraIc, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!this.C.l()) {
          return true;
       }
       if ((a1.k() - this.p) - RecoCameraIconPresenter.I.a() < 0) {
          return true;
       }
       Object obj1 = PatchProxy.apply(objArray, this, recoCameraIc, "13");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          RecordPostPlugin recordPostPl = y6.r(RecordPostPlugin.class);
          b = (recordPostPl != null)? recordPostPl.y7(): false;
       }
       if (b) {
          return true;
       }else {
          return false;
       }
    }
    public final void b9(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       g.C().w("RecoCameraIconPresenter", "resetCameraView", objArray);
       k1.m(this.u);
       RecoCameraIconPresenter tq = this.q;
       if (tq == null) {
          a.S("cameraViewSwitcher");
       }
       RecoCameraIconPresenter tr = this.r;
       if (tr == null) {
          a.S("recoCameraItem");
       }
       tq.a(tr);
       return;
    }
    public final void c9(){
       RecoCameraIconPresenter$c g;
       boolean b;
       int i3;
       Object obj = this;
       RecoCameraIconPresenter recoCameraIc = RecoCameraIconPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, recoCameraIc, "3")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       g.C().w("RecoCameraIconPresenter", "updateRecoCameraView", objArray1);
       RecoCameraIconPresenter r = obj.r;
       String str = "recoCameraItem";
       if (r == null) {
          a.S(str);
       }
       g = r.g;
       if (g != null && obj.z != null) {
          r = obj.r;
          if (r == null) {
             a.S(str);
          }
          if (r.j() != null) {
             k1.m(obj.u);
             CameraIconImageSwitcher uCameraIconI = this.X8();
             r = obj.r;
             if (r == null) {
                a.S(str);
             }
             Drawable uDrawable = r.j();
             a.m(uDrawable);
             RecoCameraIconPresenter z = obj.z;
             r = obj.r;
             if (r == null) {
                a.S(str);
             }
             RecoCameraIconPresenter$d uod = r.k();
             int i1 = 1;
             if (uod != null) {
                a uoa = uod.a();
                if (uoa != null && uoa.b == i1) {
                   b = true;
                label_0072 :
                   r = obj.r;
                   if (r == null) {
                      a.S(str);
                   }
                   RecoCameraIconPresenter$c d = r.d;
                   r = obj.r;
                   if (r == null) {
                      a.S(str);
                   }
                   uCameraIconI.i(uDrawable, g, z, true, false, b, d, r.f);
                   r = obj.u;
                   RecoCameraIconPresenter$a i2 = RecoCameraIconPresenter.I;
                   Objects.requireNonNull(i2);
                   Number number = PatchProxy.apply(objArray, i2, RecoCameraIconPresenter$a.class, "1");
                   if (number == PatchProxyResult.class) {
                      number = RecoCameraIconPresenter.D.getValue();
                   }
                   k1.r(r, number.longValue());
                   r = obj.r;
                   if (r == null) {
                      a.S(str);
                   }
                   uod = r.k();
                   if (uod != null) {
                      uoa = uod.a();
                      if (uoa != null) {
                         i3 oi3 = i3.f();
                         oi3.d("materialId", uoa.a);
                         oi3.c("materialType", Integer.valueOf(uoa.b));
                         CustomEvent uCustomEvent = CustomEvent.newBuilder().setCustomKey("clearPostHomeReco").setCustomValue(oi3.e()).build();
                         a.o(uCustomEvent, "eveCustomEvent");
                         EveManagerWrapper.e.n(uCustomEvent);
                      }
                   }
                   d uod1 = d.class;
                   if (!PatchProxy.applyVoid(objArray, obj, recoCameraIc, "18")) {
                      i3 = this.W8() + 1;
                      long l = a1.k();
                      Object[] objArray2 = new Object[i];
                      g.C().w("RecoCameraIconPresenter", "increaseFrequency, newCount: "+i3+"newTimestamp: "+l, objArray2);
                      if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), objArray, uod1, "34")) {
                         SharedPreferences$Editor uEditor1 = k.a.edit();
                         uEditor1.putLong("post_material_recommend_last_show_time", l);
                         g.a(uEditor1);
                      }
                      if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i3), objArray, uod1, "32")) {
                         SharedPreferences$Editor uEditor = k.a.edit();
                         uEditor.putInt("post_material_recommend_daily_show_count", i3);
                         g.a(uEditor);
                      }
                   }
                   return;
                }
             }
             b = false;
             goto label_0072 ;
          }
       }
    label_0172 :
       objArray = new Object[i];
       g.C().w("RecoCameraIconPresenter", "updateRecoCameraView invalidate", objArray);
       this.b9();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RecoCameraIconPresenter.class, "4")) {
          return;
       }
       Object obj = this.r8("camera_view_switcher");
       a.o(obj, "inject\(CameraEntranceAcc¡­Ids.CAMERA_VIEW_SWITCHER\)");
       this.q = obj;
       return;
    }
}
