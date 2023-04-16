package lj0.c;
import bk0.h;
import ik0.m;
import com.kuaishou.krn.model.LaunchModel;
import com.kuaishou.krn.model.LoadingStateTrack;
import java.lang.Object;
import com.kuaishou.krn.load.JsRuntimeState;
import java.lang.Enum;
import com.kuaishou.krn.model.BundleType;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.ref.WeakReference;
import com.kuaishou.krn.model.PluginTrackInfo;
import com.kuaishou.krn.log.model.a;
import android.os.Bundle;
import android.os.SystemClock;
import java.lang.String;
import java.lang.Long;
import java.lang.StringBuilder;
import ek0.d;
import java.lang.System;
import hg.a;
import java.util.UUID;
import bk0.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.experiment.ExpConfigKt;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.krn.KrnInternalManager;
import kj0.f;
import kj0.d;
import bk0.k;
import zj0.x;
import zj0.u;
import java.util.Objects;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import java.lang.Double;
import bk0.m;
import com.kuaishou.krn.instance.KrnShareEngineUtils;
import vj0.b;
import sj0.b;
import fk0.a;
import vj0.a;
import com.facebook.react.bridge.CatalystInstance;
import jk0.b;
import jk0.c;
import ukd.a;
import android.app.Activity;
import ik0.g;
import com.kuaishou.krn.instance.JsFramework;
import com.facebook.react.a;
import lj0.b;
import com.facebook.react.a$k;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.krn.log.model.KrnPageFunnelLoadTime;
import java.lang.Throwable;
import com.kuaishou.krn.c;
import java.lang.Integer;
import lk0.k;

public class c implements h	// class@002f78
{
    public final Long a;
    public final Long b;
    public final LaunchModel c;
    public final String d;
    public boolean e;
    public boolean f;
    public final String g;
    public a h;
    public p i;
    public k j;
    public int k;
    public BundleType l;
    public WeakReference m;
    public b n;
    public LoadingStateTrack o;
    public KdsPluginLibraryType p;
    public a q;
    public Boolean r;
    public AtomicBoolean s;
    public a t;

    public void c(m p0,LaunchModel p1,LoadingStateTrack p2,long p3,long p4){
       double d;
       boolean b = this;
       long l = p3;
       super();
       b.e = false;
       b.f = false;
       b.g = "isRebuildingEngine";
       b.k = JsRuntimeState.NOT_START.ordinal();
       b.l = BundleType.INTERNAL;
       b.s = new AtomicBoolean(false);
       a uoa = null;
       b.t = uoa;
       b.m = new WeakReference(p0);
       b.c = p1;
       b.o = p2;
       PluginTrackInfo pluginTrackI = p1.j();
       a uoa1 = new a(p4, pluginTrackI.f(), pluginTrackI.e());
       b.q = v4;
       Bundle uBundle = p1.g();
       long longx = (uBundle != null)? uBundle.getLong("startTimeNodeSinceBoot", SystemClock.elapsedRealtime()): SystemClock.elapsedRealtime();
       Long longx1 = Long.valueOf(longx);
       b.a = longx1;
       Long longx2 = Long.valueOf(SystemClock.elapsedRealtime());
       b.b = longx2;
       if (uBundle != null) {
          uBundle.putLong("onCreateTimestamp", l);
       }
       if (longx1 != null && longx2 != null) {
          d.e("##### "+this.p()+" activityÆô¶¯ºÄÊ±£º"+(longx2.longValue() - longx1.longValue()));
       }
       long l1 = System.currentTimeMillis();
       long l2 = SystemClock.elapsedRealtime();
       d = a.e();
       this.a();
       String str = UUID.randomUUID().toString();
       b.d = str;
       if (uBundle != null) {
          uBundle.putString("SessionId", str);
       }
       b.i = new p();
       if (!PatchProxy.applyVoid(uoa, b, c.class, "3")) {
          k obj = PatchProxy.apply(uoa, uoa, ExpConfigKt.class, "24");
          boolean b1 = true;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             d uod = KrnInternalManager.c.a().c();
             if (uod != null) {
                b1 = uod.getBoolean("KrnPageFunnelSwitch", b1);
             }
          }
          if (b1) {
             obj = new k(str);
             b.j = obj;
             b.i.E(obj);
          }
       }
       b.i.C(b);
       this.k().y(p1, p3, p4);
       if (this.y()) {
          LoadingStateTrack loadingState = this.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.isSupport(LoadingStateTrack.class) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p3), loadingState, LoadingStateTrack.class, "35")) {
             loadingState.k.C0 = l;
          }
          loadingState = this.o();
          Objects.requireNonNull(loadingState);
          if (!PatchProxy.isSupport(LoadingStateTrack.class) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), Double.valueOf(d), loadingState, LoadingStateTrack.class, "37")) {
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             KrnBundleLoadInfo krnBundleLoa = KrnBundleLoadInfo.class;
             if (!PatchProxy.isSupport(krnBundleLoa) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), Double.valueOf(d), loadingState, krnBundleLoa, "9")) {
                loadingState.E0 = l1;
                if (loadingState.c != null) {
                   a.b(null, "engine_init", d, 5);
                }
             }
          }
       }
    label_019b :
       this.k().t(l1, l2);
       return;
    }
    public boolean A(){
       Object obj = PatchProxy.apply(null, this, c.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.i.I().c;
    }
    public boolean B(){
       Object obj = PatchProxy.apply(null, this, c.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return KrnShareEngineUtils.b.a(this.s(), this.i().a());
    }
    public void C(BundleType p0){
       this.l = p0;
    }
    public final void a(){
       int b;
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "13")) {
          return;
       }
       b uob = this.j().c(this.s(), this.o, this.y());
       this.n = uob;
       CatalystInstance uCatalystIns = uob.b();
       if (uCatalystIns != null) {
          c to = this.o;
          b = uCatalystIns.hasRunJSBundle();
          Objects.requireNonNull(to);
          LoadingStateTrack loadingState = LoadingStateTrack.class;
          if (!PatchProxy.isSupport(loadingState) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), to, loadingState, "6")) {
             to.k.h0 = b;
          }
       }
       d.e("create new krn react instance: "+this.n);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "14") && c.a().H()) {
          Bundle uBundle = this.c.g();
          if (KrnInternalManager.c(this.b(), uBundle)) {
             b = 0;
             Object[] objArray1 = new Object[b];
             Object obj = a.b("com.kuaishou.krn.debug.devtools.KdsDevtoolsManager", "getInstance", objArray1);
             if (obj != null) {
                m om = this.m.get();
                if (om != null) {
                   objArray = om.getActivity();
                }
                if (objArray == null) {
                   d.i("KdsDevtools: ctx is null");
                }else {
                   d.e("KdsDevtools: call connectDevtools......");
                   Object[] objArray2 = new Object[]{objArray,uBundle};
                   a.a(obj, "connectDevtools", objArray2);
                   d.e("KdsDevtools: call addAgent......");
                   Object[] objArray3 = new Object[]{this.b(),this.c.d()};
                   a.a(obj, "addAgent", objArray3);
                   this.n.i().b(new b(this));
                }
             }
          }
       }
       return;
    }
    public String b(){
       a bundleId;
       String obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.a();
       if (TextUtils.isEmpty(obj)) {
          c th = this.h;
          if (th != null) {
             bundleId = th.bundleId;
          }
       }
       return bundleId;
    }
    public a c(){
       return this.h;
    }
    public String d(){
       c th = this.h;
       a version = (th != null)? th.version: "";
       return version;
    }
    public int e(){
       c th = this.h;
       a versionCode = (th != null)? th.versionCode: 0;
       return versionCode;
    }
    public String f(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.b();
    }
    public k g(){
       return this.j;
    }
    public a h(){
       return this.q;
    }
    public b i(){
       return this.n;
    }
    public final a j(){
       Object obj = PatchProxy.apply(null, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return KrnInternalManager.c.b();
    }
    public x k(){
       return this.i;
    }
    public m l(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.m;
       if (obj != null) {
          objArray = obj.get();
       }
       return objArray;
    }
    public LaunchModel m(){
       return this.c;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "24")) {
          return;
       }
       c tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(objArray, tj, k.class, "9")) {
             tj.c.setBusinessJsLoadStartTime(Long.valueOf(System.currentTimeMillis()));
          }
       }
       return;
    }
    public LoadingStateTrack o(){
       return this.o;
    }
    public String p(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b()+"_"+this.f();
    }
    public void q(long p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoc, "25")) {
          return;
       }
       uoc = this.j;
       if (uoc != null) {
          Objects.requireNonNull(uoc);
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, uoc, ok, "10")) {
             uoc.c.setBusinessJsLoadEndTime(Long.valueOf(System.currentTimeMillis()));
             if (p1 != null) {
                uoc.G("BUSINESS_JS_LOAD_END", p1);
             }
          }
       }
       return;
    }
    public a r(){
       Object obj = PatchProxy.apply(null, this, c.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i().i();
    }
    public final b s(){
       boolean b;
       c uoc = c.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "17");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = this.c.a();
       JsFramework jsFramework = this.c.d();
       int i = this.c.i();
       Object obj1 = PatchProxy.apply(objArray, this, uoc, "18");
       b uob = null;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          uoc = this.c;
          Objects.requireNonNull(uoc);
          LaunchModel launchModel = PatchProxy.apply(objArray, uoc, LaunchModel.class, "8");
          if (launchModel != patchProxyRe) {
          }else if(uoc.h == null){
             uoc.h = uoc.g().getString("bundleCache", "");
          }
          launchModel = uoc.h;
          if (TextUtils.isEmpty(launchModel)) {
             b = c.b().f().a();
          }else if(Boolean.parseBoolean(launchModel) || TextUtils.equals(launchModel, "1")){
             b = 1;
          }else {
             b = null;
          }
       }
       boolean b1 = b;
       uoc = this.c;
       Objects.requireNonNull(uoc);
       Object obj2 = PatchProxy.apply(objArray, uoc, LaunchModel.class, "7");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(uoc.i == null){
          uoc.i = Boolean.valueOf(uoc.o("forceShareEngine", uob));
       }
       b = uoc.i.booleanValue();
       boolean b2 = b;
       uob = new b(str, jsFramework, i, b1, b2, true);
       return obj;
    }
    public String t(){
       return this.d;
    }
    public String toString(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       StringBuilder obj = PatchProxy.apply(objArray, this, c.class, "12");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "KrnContext{mBundleId=\'"+this.c.a()+", mComponentName=\'"+this.c.b()+", mStartTimeNodeSinceBoot="+this.a+", mCreateTimeNodeSinceBoot="+this.b+", mBundleMeta="+this.h+", mPageLoadStart="+this.e+", mPageLoadResult="+this.f+", mJsRuntimeState="+this.k+", mBundleType="+this.l+", mBundlePreloaded="+this.w()+", mSessionId="+this.d+", mKrnReactInstance="+this.n.hashCode()+", catalystInstanceKey=";
       c tn = this.n;
       Objects.requireNonNull(tn);
       Object[] objArray1 = PatchProxy.apply(objArray, tn, b.class, "9");
       if (objArray1 != patchProxyRe) {
       }else {
          CatalystInstance uCatalystIns = tn.b();
          if (uCatalystIns != null) {
             objArray = Integer.valueOf(uCatalystIns.hashCode());
          }
          objArray1 = objArray;
       }
       return obj+objArray1+'}';
    }
    public Long u(){
       return this.a;
    }
    public int v(){
       c th = this.h;
       int i = (th != null)? (int)th.taskId: -1;
       return i;
    }
    public boolean w(){
       b obj = PatchProxy.apply(null, this, c.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.i();
       if (obj == null) {
          return false;
       }
       return obj.d;
    }
    public void x(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "22")) {
          return;
       }
       c tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.applyVoid(objArray, tj, k.class, "7")) {
             tj.c.setBundleInfoLoadStartTime(Long.valueOf(System.currentTimeMillis()));
          }
       }
       return;
    }
    public boolean y(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uoc, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.r == null) {
          Object obj1 = PatchProxy.apply(objArray, this, uoc, "2");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(c.a().K() || (k.a(this.b(), this.f()) || this.c.l() - ExpConfigKt.m() <= 0)){
             b = true;
          }else {
             b = false;
          }
          this.r = Boolean.valueOf(b);
       }
       return this.r.booleanValue();
    }
    public void z(long p0,Throwable p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, this, uoc, "23")) {
          return;
       }
       uoc = this.j;
       if (uoc != null) {
          Objects.requireNonNull(uoc);
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), p1, uoc, ok, "8")) {
             uoc.c.setBundleInfoLoadEndTime(Long.valueOf(System.currentTimeMillis()));
             if (p1 != null) {
                uoc.G("BUNDLE_INFO_LOAD_END", p1);
             }
          }
       }
       return;
    }
}
