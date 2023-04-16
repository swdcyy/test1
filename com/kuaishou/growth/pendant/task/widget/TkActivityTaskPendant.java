package com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import com.kuaishou.growth.pendant.task.widget.KemTaskPendant;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$a;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$mUgActivityTkStrategy$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$animResourceFetcher$2;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$mPendingData$2;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import jf0.b;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$b;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import com.kuaishou.growth.taskcenter.model.TaskPendantConfig;
import java.util.concurrent.TimeUnit;
import lf0.e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.content.ContextWrapper;
import kf0.f;
import ge0.e;
import android.view.ViewGroup;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import tx4.h;
import sx4.e;
import android.view.View;
import rx4.a;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Throwable;
import android.app.Activity;
import fg6.a;
import com.google.gson.Gson;
import java.lang.System;
import rx4.b;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$c;
import tx4.p;
import ge0.a;
import tx4.l;
import com.kuaishou.growth.pendant.task.tk.bridge.TaskPendantJs2NativeInvoker;
import sx4.e$a;
import tx4.o;
import java.lang.Integer;
import java.lang.Boolean;
import gf0.a;
import java.lang.Long;
import java.util.Objects;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$e;
import kf0.s;

public final class TkActivityTaskPendant extends KemTaskPendant	// class@0006ea
{
    public String h;
    public boolean i;
    public long j;
    public long k;
    public boolean l;
    public boolean m;
    public Runnable n;
    public e o;
    public a p;
    public b q;
    public final p r;
    public final p s;
    public final p t;
    public final o u;
    public static final TkActivityTaskPendant$a v;

    static {
       TkActivityTaskPendant.v = new TkActivityTaskPendant$a(null);
    }
    public void TkActivityTaskPendant(Context p0){
       a.p(p0, "context");
       super(p0);
       this.r = s.c(TkActivityTaskPendant$mUgActivityTkStrategy$2.INSTANCE);
       this.s = s.c(TkActivityTaskPendant$animResourceFetcher$2.INSTANCE);
       this.t = s.c(TkActivityTaskPendant$mPendingData$2.INSTANCE);
       this.u = new TkActivityTaskPendant$d(this);
    }
    public void b(float p0){
       if (PatchProxy.isSupport(TkActivityTaskPendant.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, TkActivityTaskPendant.class, "10")) {
          return;
       }
       TkActivityTaskPendant tq = this.q;
       if (tq != null) {
          a.m(tq);
          tq.b(p0);
       }else {
          this.getMPendingData().c(Float.valueOf(p0));
       }
       return;
    }
    public void c(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TkActivityTaskPendant.class, "9")) {
          return;
       }
       a.p(p0, "response");
       TkActivityTaskPendant tq = this.q;
       if (tq != null) {
          a.m(tq);
          tq.a(p0);
       }else {
          this.getMPendingData().d(p0);
       }
       TaskCommonParams mParams = this.getMParams();
       if (!PatchProxy.applyVoidOneRefs(mParams, this, TkActivityTaskPendant.class, "11")) {
          TaskPendantConfig mPendantConf = mParams.getMPendantConfig();
          int mDisappearSe = (mPendantConf != null)? mPendantConf.getMDisappearSecondsIfComplete(): 0;
          long l = TimeUnit.SECONDS.toMillis((long)mDisappearSe);
          if (l - null > 0) {
             e uoe = new e(this, mParams);
             this.n = uoe;
             k1.r(uoe, l);
          }
       }
       return;
    }
    public final GifshowActivity getActivity(){
       Context obj = PatchProxy.apply(null, this, TkActivityTaskPendant.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getContext();
       while (true) {
          if (!obj instanceof ContextWrapper) {
             return null;
          }
          if (obj instanceof GifshowActivity) {
             break ;
          }else {
             obj = obj.getBaseContext();
          }
       }
       return obj;
    }
    public final f getAnimResourceFetcher(){
       Object obj = PatchProxy.apply(null, this, TkActivityTaskPendant.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public int getLayoutResourceId(){
       return 0x7f0d0781;
    }
    public final TkActivityTaskPendant$b getMPendingData(){
       Object obj = PatchProxy.apply(null, this, TkActivityTaskPendant.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public final e getMUgActivityTkStrategy(){
       Object obj = PatchProxy.apply(null, this, TkActivityTaskPendant.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, TkActivityTaskPendant.class, "13")) {
          return;
       }
       super.onDetachedFromWindow();
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "TkActivityTaskPendant", "onDetachedFromWindow "+this.h, false, 4, null);
       k1.m(this.n);
       TkActivityTaskPendant tq = this.q;
       if (tq != null && !PatchProxy.applyVoid(null, tq, b.class, "4")) {
          tq.a.b("clearAnimation", null, null);
       }
       this.q = null;
       tq = this.o;
       if (tq != null) {
          this.removeView(tq.getView());
          tq.close();
       }
       this.o = null;
       tq = this.p;
       if (tq != null) {
          tq.onPause();
       }
       tq = this.p;
       if (tq != null) {
          tq.onStop();
       }
       tq = this.p;
       if (tq != null) {
          tq.onDestroy();
       }
       this.p = null;
       this.getAnimResourceFetcher().a();
       return;
    }
    public void p(TaskCommonParams p0){
       String str = this;
       String obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, str, TkActivityTaskPendant.class, "4")) {
          return;
       }
       a.p(obj, "params");
       super.p(p0);
       obj = this.getMPendantConfig().getMTkBundleId();
       str.h = obj;
       GifshowActivity gifshowActiv = (obj == null || u.S1(obj))? 1: null;
       if (gifshowActiv) {
          TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "initPendantView mBundleId is null", null, false, 12, null);
          return;
       }else if(this.getActivity() != null){
          gifshowActiv = this.getActivity();
          if (gifshowActiv == null || gifshowActiv.isFinishing() != true) {
             ViewGroup viewGroup = null;
             try{
                obj = a.a.q(this.getMParams());
             }catch(java.lang.Exception e0){
                TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "initPendantView param to json error ", e0, false, 8, null);
                obj = viewGroup;
             }
             long l = (obj == null || u.S1(obj))? 1: 0;
             if (l) {
                TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "initPendantView jsonParams is null", null, false, 12, null);
                return;
             }else {
                str.j = System.currentTimeMillis();
                GifshowActivity activity = this.getActivity();
                a.m(activity);
                TkActivityTaskPendant h = str.h;
                a.m(h);
                b uob = new b(activity, viewGroup, h, "GrowthPendant");
                uob.d(new TkActivityTaskPendant$c(str));
                b uob1 = uob.c(new a());
                uob1.g(true);
                a uoa = uob1.b();
                str.p = uoa;
                if (uoa != null) {
                   Object[] objArray = new Object[true];
                   objArray[0] = obj;
                   uoa.n(this.getMUgActivityTkStrategy().b(str.h), new TaskPendantJs2NativeInvoker(str), str.u, "task_view", objArray);
                }
                return;
             }
          }
       }
       TaskCenterLogUtil.a(TaskCenterLogUtil.b, "TkActivityTaskPendant", "initPendantView getActivity is null", null, false, 12, null);
       return;
    }
    public final boolean q(){
       if (this.m != null) {
          return true;
       }
       this.m = true;
       return false;
    }
    public final void r(boolean p0,Integer p1){
       if (PatchProxy.isSupport(TkActivityTaskPendant.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, TkActivityTaskPendant.class, "7")) {
          return;
       }
       if (this.l == null) {
          a a = a.a;
          TaskCommonParams mParams = this.getMParams();
          Long longx = Long.valueOf((System.currentTimeMillis() - this.j));
          Boolean uBoolean = Boolean.valueOf(p0);
          Long longx1 = Long.valueOf(this.k);
          Objects.requireNonNull(a);
          a uoa = a.class;
          if (PatchProxy.isSupport(uoa)) {
             Object[] objArray = new Object[]{mParams,Boolean.TRUE,longx,uBoolean,longx1,p1};
             if (PatchProxy.applyVoid(objArray, a, uoa, "9")) {
             label_00c4 :
                this.l = true;
             }
          }
          a.p(mParams, "taskParams");
          i3 oi3 = i3.f();
          oi3.d("activityId", mParams.getMActivityId());
          oi3.d("taskToken", mParams.getMTaskToken());
          Boolean tRUE = Boolean.TRUE;
          oi3.a("isTk", tRUE);
          if (longx != null) {
             oi3.c("totalCost", longx);
          }
          String str = (a.g(uBoolean, tRUE))? "1": "0";
          oi3.d("tkCreateResult", str);
          TaskPendantConfig mPendantConf = mParams.getMPendantConfig();
          str = (mPendantConf != null)? mPendantConf.getMTkBundleId(): null;
          oi3.d("tkBundleId", str);
          if (longx1 != null) {
             oi3.c("tkCreateCost", longx1);
          }
          if (p1 != null) {
             oi3.c("tkErrorCode", p1);
          }
          u1.R("GROWTH_TASK_PENDANT_INIT", oi3.toString(), 9);
          goto label_00c4 ;
       }
       return;
    }
    public final void s(){
       if (PatchProxy.applyVoid(null, this, TkActivityTaskPendant.class, "14")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       if (this.i != null) {
          return;
       }
       if (!this.getMUgActivityTkStrategy().a(this.h)) {
          return;
       }
       this.i = true;
       GifshowActivity activity = this.getActivity();
       if (activity != null) {
          k1.o(new TkActivityTaskPendant$e(activity, this));
       }
       return;
    }
    public final void setTKViewContainer(e p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, TkActivityTaskPendant.class, "8")) {
          return;
       }
       TkActivityTaskPendant to = this.o;
       if (to != null) {
          a.m(to);
          this.removeView(to.getView());
          this.o = null;
       }
       this.o = p0;
       if (p0 != null) {
          this.addView(p0.getView());
          b uob1 = new b(p0);
          this.q = uob1;
          a.m(uob1);
          float f = s.d.b();
          Objects.requireNonNull(uob1);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), uob1, uob, "5")) {
             uob1.a.b("setUiAdaptRatio", String.valueOf(f), null);
          }
          TkActivityTaskPendant tq = this.q;
          a.m(tq);
          TaskCommonParams mParams = this.getMParams();
          Objects.requireNonNull(tq);
          if (!PatchProxy.applyVoidOneRefs(mParams, tq, uob, "2")) {
             tq.a.b("updateConfig", a.a.q(mParams), null);
          }
          if (this.getMPendingData().a() != null) {
             tq = this.q;
             a.m(tq);
             Float uFloat = this.getMPendingData().a();
             a.m(uFloat);
             tq.b(uFloat.floatValue());
             this.getMPendingData().c(null);
          }
          if (this.getMPendingData().b() != null) {
             tq = this.q;
             a.m(tq);
             tq.a(this.getMPendingData().b());
             this.getMPendingData().d(null);
          }
          tq = this.p;
          if (tq != null) {
             tq.onResume();
          }
       }
       return;
    }
}
