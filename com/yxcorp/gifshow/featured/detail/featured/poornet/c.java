package com.yxcorp.gifshow.featured.detail.featured.poornet.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.featured.detail.featured.poornet.c$a;
import xda.f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.featured.detail.featured.poornet.b;
import xda.b;
import lnc.u1;
import com.kwai.framework.activitycontext.ActivityContext;
import df5.b;
import hf5.b;
import df5.e;
import hf5.g;
import com.yxcorp.gifshow.util.rx.RxBus;
import ub6.a;
import brd.t;
import t45.d;
import brd.z;
import xda.l;
import erd.g;
import crd.b;
import xda.j;
import com.kwai.component.photo.detail.slide.milano.MilanoContainerEventBus;
import xda.k;
import io.reactivex.internal.functions.Functions;
import xda.i;
import xda.g;
import xda.a;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetInfo;
import java.util.List;
import java.lang.System;
import com.yxcorp.gifshow.featured.detail.featured.poornet.PoorNetPhotoInfo;
import android.os.SystemClock;
import sy6.a;
import java.util.UUID;
import m9a.w;
import com.kuaishou.aegon.netcheck.NetworkQualityEstimator;
import com.kwai.video.hodor.Hodor;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mea.c;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import xda.h;
import com.kuaishou.live.common.core.basic.tools.h;
import m56.f;
import m56.g;

public class c extends PresenterV2	// class@000f47
{
    public PoorNetInfo A;
    public PoorNetPhotoInfo B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public a I;
    public g J;
    public b K;
    public MilanoContainerEventBus L;
    public final b M;
    public final e N;
    public long p;
    public b q;
    public boolean r;
    public boolean s;
    public int t;
    public b u;
    public long v;
    public long w;
    public long x;
    public long y;
    public QPhoto z;

    public void c(){
       super();
       this.r = false;
       this.t = 0;
       this.v = -1;
       this.w = -1;
       this.x = -1;
       this.y = -1;
       this.M = new c$a(this);
       this.N = new f(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       b uob = b.a(-953099949).e();
       this.q = uob;
       if (uob == null) {
          return;
       }
       this.t = 0;
       u1.a(this);
       this.F = ActivityContext.g().h();
       this.p = this.q.mNetMonitorTimerInterval;
       this.K.De(this.M);
       this.J.L5(this.N);
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new l(this)));
       this.X7(this.J.m().subscribe(new j(this)));
       this.X7(this.L.B.subscribe(new k(this), Functions.e));
       this.X7(this.L.P.subscribe(new i(this), Functions.d()));
       this.X7(this.L.Q.subscribe(new g(this), Functions.d()));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       if (this.q == null) {
          return;
       }
       u1.b(this);
       this.K.c3(this.M);
       this.J.p8(this.N);
       this.a9();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "13")) {
          return;
       }
       if (this.A != null && this.B != null) {
          a.C("appendPhotoInfo");
          int i = this.A.mPhotoInfos.indexOf(this.B);
          if (i >= 0) {
             this.A.mPhotoInfos.set(i, this.B);
          }else {
             this.A.mPhotoInfos.add(this.B);
          }
       }else {
          a.C("appendPhotoInfo,but mPoorNetInfo = null or mCurrentPhotoInfo = null");
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, c.class, "12")) {
          return;
       }
       if (this.B != null) {
          a.C("buildPhotoInfoAfterDetach");
          this.B.mPhotoLeaveTime = System.currentTimeMillis();
          this.B.mPhotoSystemClockLeaveTime = SystemClock.elapsedRealtime();
          c tB = this.B;
          tB.mDuration = tB.mPhotoLeaveTime - tB.mPhotoEnterTime;
          tB.mSystemClockDuration = tB.mPhotoSystemClockLeaveTime - tB.mPhotoSystemClockEnterTime;
          tB.mLeaveInSideBar = this.I.r();
          c tD = this.D;
          this.B.mStalledCnt = tD;
          this.E = this.E + tD;
       }else {
          a.C("buildPhotoInfoAfterDetach,but mCurrentPhotoInfo = null");
       }
       return;
    }
    public final void S8(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "14")) {
          return;
       }
       a.C("buildStartPoorNetLog");
       PoorNetInfo poorNetInfo = new PoorNetInfo();
       this.A = poorNetInfo;
       poorNetInfo.mPoorNetIdentity = UUID.randomUUID().toString();
       c tA = this.A;
       tA.mIsDebugInfo = this.q.mEnableDebugLog;
       tA.mStartTime = this.v;
       tA.mSystemClockStartTime = this.w;
       tA.mStartNetType = w.a();
       this.A.mStartScore = NetworkQualityEstimator.b();
       this.A.mStartCdnSpeed = Hodor.instance().getNetSpeedKbpsForPreload();
       tA = this.A;
       c tz = this.z;
       String str = (tz == null)? "null": tz.getPhotoId();
       tA.mStartPhotoId = str;
       this.A.mStartPhotoIndex = this.I.a0();
       tA = this.A;
       Object obj = PatchProxy.apply(objArray, objArray, c.class, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(c.f() != null && c.f().mEnablePoorNetworkOpt != null){
          b = true;
       }else {
          b = false;
       }
       tA.mEnablePoorNetOpt = b;
       tA = this.B;
       if (tA != null) {
          tA.mEnterInSideBar = this.I.r();
       }
       this.P8();
       b.a(-953099949).l(this.A);
       return;
    }
    public final void V8(String p0){
       int netSpeedKbps;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "9")) {
          return;
       }
       if (w.b()) {
          a.C("current net disconnection, reason: "+p0);
          if (this.v < 0) {
             this.v = System.currentTimeMillis();
             this.w = SystemClock.elapsedRealtime();
             if (this.z != null) {
                this.C = 1;
             }
             this.S8();
          }
       }else if(this.q.mCdnNetSpeedThreshold > null){
          netSpeedKbps = Hodor.instance().getNetSpeedKbpsForPreload();
          a.C("current net speed: "+netSpeedKbps+" kbps mNetSpeedThreshold: "+this.q.mCdnNetSpeedThreshold+" reason: "+p0);
          this.Y8(netSpeedKbps, this.q.mCdnNetSpeedThreshold);
       }else {
          netSpeedKbps = NetworkQualityEstimator.b();
          a.C("current net score: "+netSpeedKbps+" mNetSpeedThreshold: "+this.q.mNetScoreThreshold+" reason: "+p0);
          this.Y8(netSpeedKbps, this.q.mNetScoreThreshold);
       }
       return;
    }
    public final void W8(String p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "16")) {
          return;
       }
       if (TextUtils.x(b.a(-953099949).d())) {
          return;
       }
       if (this.X8()) {
          a.C("finishPoorNetSession reason: "+p0);
          this.x = System.currentTimeMillis();
          this.y = SystemClock.elapsedRealtime();
          this.R8();
          this.P8();
          if (!PatchProxy.applyVoidOneRefs(p0, this, uoc, "15")) {
             if (this.A != null) {
                a.C("buildEndPoorNetLog reason: "+p0);
                uoc = this.A;
                uoc.mEndTime = this.x;
                uoc.mSystemClockEndTime = this.y;
                uoc.mEndNetType = w.a();
                this.A.mEndScore = NetworkQualityEstimator.b();
                this.A.mEndCdnSpeed = Hodor.instance().getNetSpeedKbpsForPreload();
                uoc = this.A;
                c tz = this.z;
                String str = (tz == null)? "null": tz.getPhotoId();
                uoc.mEndPhotoId = str;
                this.A.mEndPhotoIndex = this.I.a0();
                uoc = this.A;
                uoc.mDuration = this.x - uoc.mStartTime;
                uoc.mSystemClockDuration = this.y - uoc.mSystemClockStartTime;
                uoc.mViewCount = this.C;
                uoc.mLeaveReason = p0;
                uoc.mTotalStalledCnt = this.E;
                uoc.mManualLoadMoreCnt = this.H;
                uoc.mManualRefreshCnt = this.G;
                b.a(-953099949).l(this.A);
             }else {
                a.C("buildEndPoorNetLog, but mPoorNetInfo = null, reason: "+p0);
             }
             int i = 0;
             this.C = i;
             this.E = i;
             this.G = i;
             this.H = i;
          }
          this.v = -1;
          this.w = -1;
          this.x = -1;
          this.y = -1;
          p0.d = null;
       }
       return;
    }
    public boolean X8(){
       boolean b = (this.v > 0 && this.x < 0)? true: false;
       return b;
    }
    public final void Y8(int p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoc, "10")) {
          return;
       }
       if (p0 < p1) {
          if (this.v < 0) {
             this.v = System.currentTimeMillis();
             this.w = SystemClock.elapsedRealtime();
             if (this.z != null) {
                this.C = 1;
             }
             this.S8();
          }
       }else {
          this.W8("NORMAL");
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, c.class, "7")) {
          return;
       }
       if (this.p - null > 0 && this.r == null) {
          c tu = this.u;
          if (tu == null || tu.isDisposed()) {
             b uob = t.interval(1, this.p, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new h(this), h.b);
             this.u = uob;
             this.X7(uob);
          }
          this.r = true;
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, c.class, "8")) {
          return;
       }
       c tu = this.u;
       if (tu != null) {
          if (!tu.isDisposed()) {
             this.u.dispose();
          }
          this.u = null;
          this.r = false;
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.I = this.q8(a.class);
       this.J = this.q8(g.class);
       this.K = this.q8(b.class);
       this.L = this.q8(MilanoContainerEventBus.class);
       return;
    }
    public void onBackground(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       a.C("PoorNetLogPto background");
       this.F = false;
       this.a9();
       this.W8("BACKGROUND");
       return;
    }
    public void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "5")) {
          return;
       }
       a.C("PoorNetLogPto foreground");
       this.F = true;
       return;
    }
}
