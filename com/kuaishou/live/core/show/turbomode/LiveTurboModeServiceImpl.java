package com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl;
import qy1.a;
import lp3.a;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$a;
import nsd.u;
import d61.c0;
import java.lang.String;
import p91.m;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rl2.a;
import com.kuaishou.live.core.show.startup.LiveExperienceOptimizationConfig;
import wg3.a;
import android.content.SharedPreferences;
import java.lang.reflect.Type;
import km8.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$b;
import com.kuaishou.android.live.model.QLivePlayConfig;
import java.util.Map;
import com.kuaishou.live.core.show.startup.LiveExperienceOptimizationConfig$ElementSwitch;
import trd.t0;
import d61.l0;
import java.util.HashMap;
import com.kuaishou.live.core.show.turbomode.LiveTurboModeServiceImpl$isLowPerformancePhone$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.turbomode.OptimizedElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lp3.e;
import ry1.b;
import lp3.c;
import brd.t;
import rl2.c;
import erd.g;
import crd.b;
import x61.c;
import com.kuaishou.live.bottombar.service.model.LiveNormalBottomBarItem;
import z61.b;
import rl2.d;
import qrd.l1;
import pp.c;
import qy1.a$a;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.basic.degrade.LivePerformanceDegradeManager;
import java.util.Objects;
import r41.b;
import java.util.HashSet;
import com.kuaishou.android.live.log.LiveLogTag;
import ekd.k1;
import androidx.lifecycle.LiveData;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import mrd.a;
import java.lang.Integer;
import com.kuaishou.live.viewcontroller.ViewController;
import f33.a;
import sl2.a;
import e17.i;

public final class LiveTurboModeServiceImpl extends a implements a	// class@001228
{
    public final a d;
    public LiveExperienceOptimizationConfig e;
    public final LiveStreamFeedWrapper f;
    public final MutableLiveData g;
    public b h;
    public a i;
    public final LiveTurboModeServiceImpl$b j;
    public final boolean k;
    public Map l;
    public final int m;
    public final int n;
    public final int o;
    public final l0 p;
    public final l0 q;
    public final l0 r;
    public final HashMap s;
    public final boolean t;
    public final p u;
    public final Fragment v;
    public static final String w;
    public static final LiveTurboModeServiceImpl$a x;

    static {
       LiveTurboModeServiceImpl.x = new LiveTurboModeServiceImpl$a(null);
       LiveTurboModeServiceImpl.w = c0.a.b("udata/pkg/kwai-client-image/live_pure_mode/live_pure_mode_comment_icon.webp");
    }
    public void LiveTurboModeServiceImpl(m p0,LiveStreamFeed p1,Fragment p2){
       Map map;
       a.p(p0, "liveBasicContext");
       a.p(p1, "photo");
       a.p(p2, "hostFragment");
       super();
       this.v = p2;
       this.d = new a(p0);
       LiveExperienceOptimizationConfig liveExperien = LiveExperienceOptimizationConfig.class;
       String str = a.a.getString("pureModeConfig", "");
       liveExperien = (str == null || str == "")? null: b.a(str, liveExperien);
       this.e = liveExperien;
       this.f = new LiveStreamFeedWrapper(p1);
       this.g = new MutableLiveData();
       this.j = new LiveTurboModeServiceImpl$b(this);
       LiveExperienceOptimizationConfig liveExperien1 = null;
       boolean b = (p1.mConfig.mPatternType == 1)? true: false;
       this.k = b;
       LiveTurboModeServiceImpl te = this.e;
       if (te != null) {
          liveExperien = te.elementSwitches;
          if (liveExperien != null) {
             map = liveExperien.toMap();
             if (map != null) {
             label_006b :
                this.l = map;
                this.n = 1;
                this.o = 2;
                this.p = l0.e("live.ExperienceOptimizationEnabled");
                this.q = l0.d("live.showTurboModeEnableToast");
                this.r = l0.f("live.lastLowPerformanceNoticeTime");
                this.s = new HashMap();
                te = this.e;
                if (te != null) {
                   liveExperien1 = te.newSilentLiveUser;
                }
                this.t = liveExperien1;
                this.u = s.c(LiveTurboModeServiceImpl$isLowPerformancePhone$2.INSTANCE);
                return;
             }
          }
       }
       map = t0.z();
       goto label_006b ;
    }
    public boolean Ko(OptimizedElement p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveTurboModeServiceImpl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "element");
       Boolean uBoolean = this.l.get(p0.getKey());
       boolean b = (uBoolean != null)? uBoolean.booleanValue(): true;
       return this.To(b);
    }
    public void Qo(){
       LivePerformanceDegradeManager c;
       LiveTurboModeServiceImpl liveTurboMod = LiveTurboModeServiceImpl.class;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoid(objArray, this, liveTurboMod, str)) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, liveTurboMod, "9")) {
          c uoc1 = this.Po().a(b.class);
          a.o(uoc1, "serviceManager\n      .ge¡­btainService::class.java\)");
          this.h = uoc1.W().subscribe(new c(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, liveTurboMod, "10")) {
          c uoc = this.Po().a(c.class);
          a.o(uoc, "serviceManager.getServic¡­omBarService::class.java\)");
          LiveNormalBottomBarItem liveNormalBo = new LiveNormalBottomBarItem();
          liveNormalBo.mFeatureId = 1042;
          liveNormalBo.mTextRes = 0x7f102c5f;
          liveNormalBo.mIconRes = 0x7f081392;
          liveNormalBo.mIsVisible = Boolean.valueOf(this.So());
          liveNormalBo.mClickCallback = new d(this);
          this.g.setValue(liveNormalBo);
          uoc.v1(this.g);
       }
       b.Z(a.K0.a(), "isNewUser "+this.t);
       c = LivePerformanceDegradeManager.c;
       LiveTurboModeServiceImpl tj = this.j;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoidOneRefs(tj, c, LivePerformanceDegradeManager.class, "6")) {
          a.p(tj, "observer");
          if (LivePerformanceDegradeManager.a) {
             b uob = c.h();
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoidOneRefs(tj, uob, b.class, str)) {
                a.p(tj, "observer");
                uob.g(true);
                uob.b.add(tj);
                b.Z(LiveLogTag.LIVE_PERFORMANCE_DEGRADE, "addPerformanceLevelObserver");
             }
          }
       }
       return;
    }
    public void Ro(){
       if (PatchProxy.applyVoid(null, this, LiveTurboModeServiceImpl.class, "6")) {
          return;
       }
       k1.n(this);
       LiveTurboModeServiceImpl th = this.h;
       if (th != null) {
          th.dispose();
       }
       LivePerformanceDegradeManager c = LivePerformanceDegradeManager.c;
       LiveTurboModeServiceImpl tj = this.j;
       Objects.requireNonNull(c);
       String str = "7";
       if (!PatchProxy.applyVoidOneRefs(tj, c, LivePerformanceDegradeManager.class, str)) {
          String str1 = "observer";
          a.p(tj, str1);
          if (LivePerformanceDegradeManager.a) {
             b uob = c.h();
             Objects.requireNonNull(uob);
             if (!PatchProxy.applyVoidOneRefs(tj, uob, b.class, str)) {
                a.p(tj, str1);
                b.Z(LiveLogTag.LIVE_PERFORMANCE_DEGRADE, "addPerformanceLevelObserver:"+uob.b.remove(tj));
                uob.g(false);
             }
          }
       }
       return;
    }
    public final boolean So(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveTurboModeServiceImpl liveTurboMod = LiveTurboModeServiceImpl.class;
       LiveTurboModeServiceImpl obj = PatchProxy.apply(null, this, liveTurboMod, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.e;
       boolean b = false;
       LiveExperienceOptimizationConfig enableLivePu = (obj != null)? obj.enableLivePureMode: null;
       if (enableLivePu != null && this.k != null) {
          Boolean uBoolean = PatchProxy.apply(null, this, liveTurboMod, "1");
          if (uBoolean == patchProxyRe) {
             uBoolean = this.u.getValue();
          }
          if (uBoolean.booleanValue() || this.t != null) {
             b = true;
          }
       }
    label_003f :
       return b;
    }
    public final boolean To(boolean p0){
       LiveTurboModeServiceImpl liveTurboMod = LiveTurboModeServiceImpl.class;
       if (PatchProxy.isSupport(liveTurboMod)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, liveTurboMod, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       p0 = (!this.qm() || p0)? true: false;
       return p0;
    }
    public final void Uo(){
       if (PatchProxy.applyVoid(null, this, LiveTurboModeServiceImpl.class, "11")) {
          return;
       }
       b value = this.g.getValue();
       if (value != null) {
          value.mIsVisible = Boolean.valueOf(this.So());
          this.g.setValue(value);
       }
       return;
    }
    public final void Vo(){
       if (PatchProxy.applyVoid(null, this, LiveTurboModeServiceImpl.class, "12")) {
          return;
       }
       Iterator iterator = this.l.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          boolean b = this.To(uEntry.getValue().booleanValue());
          b.Z(a.K0.a(), key+" is enabled "+b);
          a uoa = this.s.get(key);
          if (uoa != null) {
             uoa.onNext(Boolean.valueOf(b));
          }
       }
       return;
    }
    public final void Wo(int p0){
       LiveTurboModeServiceImpl liveTurboMod = LiveTurboModeServiceImpl.class;
       if (PatchProxy.isSupport(liveTurboMod) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, liveTurboMod, "15")) {
          return;
       }
       liveTurboMod = this.i;
       if (liveTurboMod != null) {
          a.d(this.v, liveTurboMod);
          this.i = null;
       }
       a uoa = new a(p0, this, this.l.keySet(), this.d);
       a.c(this.v, uoa);
       this.i = uoa;
       return;
    }
    public boolean qm(){
       Integer obj = PatchProxy.apply(null, this, LiveTurboModeServiceImpl.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.p.b(Integer.valueOf(this.m));
       LiveTurboModeServiceImpl tm = this.m;
       boolean b = true;
       if (obj != null && obj.intValue() == tm) {
          if (this.So() && !this.f.isGRPRCustomizedLive()) {
          label_0067 :
             return b;
          }
       }else if(this.So()){
          obj = this.p.b(Integer.valueOf(this.m));
          tm = this.n;
          if (obj != null && (obj.intValue() == tm && !this.f.isGRPRCustomizedLive())) {
             goto label_0067 ;
          }
       }
       b = false;
       goto label_0067 ;
    }
    public void sc(boolean p0){
       LiveTurboModeServiceImpl liveTurboMod = LiveTurboModeServiceImpl.class;
       if (PatchProxy.isSupport(liveTurboMod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveTurboMod, "4")) {
          return;
       }
       liveTurboMod = this.p;
       LiveTurboModeServiceImpl tn = (p0)? this.n: this.o;
       liveTurboMod.i(Integer.valueOf(tn));
       if (p0) {
          i.a(R.style.arg_RES_7f11066a, 0x7f102c73);
       }else {
          i.a(R.style.arg_RES_7f11066a, 0x7f102c72);
       }
       this.Vo();
       return;
    }
    public t vo(OptimizedElement p0){
       LiveTurboModeServiceImpl obj = PatchProxy.applyOneRefs(p0, this, LiveTurboModeServiceImpl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "element");
       obj = this.s;
       String key = p0.getKey();
       a uoa = obj.get(key);
       if (uoa == null) {
          Boolean uBoolean = this.l.get(p0.getKey());
          boolean b = (uBoolean != null)? uBoolean.booleanValue(): true;
          uoa = a.h(Boolean.valueOf(this.To(b)));
          a.o(uoa, "BehaviorSubject.createDe\x20\x02s[element.key] ?: true\) \)\x00");
          obj.put(key, uoa);
       }
       return uoa;
    }
}
