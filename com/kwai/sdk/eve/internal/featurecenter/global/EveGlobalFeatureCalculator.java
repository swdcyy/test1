package com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator;
import an7.a;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$Companion;
import nsd.u;
import vm7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$context$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$api$2;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickIntent$2;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.eve.EveManager;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$1;
import msd.p;
import msd.l;
import brd.t;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$2;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$activate$3;
import erd.g;
import crd.b;
import android.content.Context;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$timeTickReceiver$2$1;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.api.EveApi;
import com.kwai.sdk.eve.internal.featurecenter.global.FeatureCalculateConfig;
import com.kwai.sdk.eve.internal.common.EvePreference;
import java.lang.CharSequence;
import zsd.u;
import vsd.d;
import nsd.m0;
import java.lang.Boolean;
import android.content.SharedPreferences;
import en7.q;
import java.util.Objects;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import com.google.gson.Gson;
import com.kwai.sdk.eve.internal.common.utils.DataKt;
import java.lang.IllegalArgumentException;
import android.content.IntentFilter;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.lang.Runnable;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import cn7.b;
import cn7.b$a;
import zn7.g;
import zn7.a;
import android.content.Intent;
import sm7.l;
import qrd.l1;
import com.kwai.sdk.eve.InferenceState;
import java.lang.Throwable;
import ml5.a;
import com.kwai.eve.typevalue.Type;
import com.kwai.sdk.eve.InitConfig;
import h97.g;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import java.util.Map;
import java.lang.System;
import tm7.a;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3;
import erd.a;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import com.kwai.sdk.eve.internal.featurecenter.global.EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2;

public final class EveGlobalFeatureCalculator implements a	// class@001509
{
    public final p api$delegate;
    public final p context$delegate;
    public long currentFeatureCalcIntervalMs;
    public final boolean enable;
    public final a eveContext;
    public String featureReportInferenceId;
    public final Object lock;
    public boolean receiverRegistered;
    public final p timeTickIntent$delegate;
    public final p timeTickReceiver$delegate;
    public b triggerInferDisposable;
    public static final EveGlobalFeatureCalculator$Companion Companion;

    static {
       EveGlobalFeatureCalculator.Companion = new EveGlobalFeatureCalculator$Companion(null);
    }
    public void EveGlobalFeatureCalculator(a p0,boolean p1){
       a.p(p0, "eveContext");
       super();
       this.eveContext = p0;
       this.enable = p1;
       this.currentFeatureCalcIntervalMs = -1;
       this.lock = new Object();
       this.context$delegate = s.c(new EveGlobalFeatureCalculator$context$2(this));
       this.api$delegate = s.c(new EveGlobalFeatureCalculator$api$2(this));
       this.timeTickIntent$delegate = s.c(EveGlobalFeatureCalculator$timeTickIntent$2.INSTANCE);
       this.timeTickReceiver$delegate = s.c(new EveGlobalFeatureCalculator$timeTickReceiver$2(this));
    }
    public final void activate(){
       if (PatchProxy.applyVoid(null, this, EveGlobalFeatureCalculator.class, "7")) {
          return;
       }
       EveManager.c(EveManager.p, "EveGlobalFeatureCalculate", null, null, new EveGlobalFeatureCalculator$activate$1(this), 6, null).subscribe(new EveGlobalFeatureCalculator$activate$2(this), EveGlobalFeatureCalculator$activate$3.INSTANCE);
       return;
    }
    public final void cancelFeatureCalculate(){
       if (PatchProxy.applyVoid(null, this, EveGlobalFeatureCalculator.class, "14")) {
          return;
       }
       this.currentFeatureCalcIntervalMs = -1;
       this.cancelFeatureReportTrigger();
       if (this.receiverRegistered != null) {
          UniversalReceiver.f(this.getContext(), this.getTimeTickReceiver());
       }
       this.receiverRegistered = false;
       return;
    }
    public final void cancelFeatureReportTrigger(){
       if (PatchProxy.applyVoid(null, this, EveGlobalFeatureCalculator.class, "15")) {
          return;
       }
       EveGlobalFeatureCalculator ttriggerInfe = this.triggerInferDisposable;
       if (ttriggerInfe != null && !ttriggerInfe.isDisposed()) {
          ttriggerInfe.dispose();
       }
       this.triggerInferDisposable = null;
       return;
    }
    public final String featureCalculateConfigKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "feature_calculate_config_"+p0;
    }
    public final EveApi getApi(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.api$delegate.getValue();
    }
    public final Context getContext(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.context$delegate.getValue();
    }
    public final FeatureCalculateConfig getLocalFeatureCalculateConfig(String p0){
       Boolean tRUE;
       String str = String.class;
       EvePreference obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.eveContext.g();
       p0 = this.featureCalculateConfigKey(p0);
       if (u.S1(p0)) {
          throw new IllegalArgumentException("pref key is empty");
       }
       d uod = m0.d(str);
       boolean b = false;
       FeatureCalculateConfig uFeatureCalc = null;
       if (a.g(uod, m0.d(Boolean.TYPE))) {
          if (obj.a().getBoolean(p0, b)) {
             tRUE = Boolean.TRUE;
          label_00ca :
             if (tRUE != null) {
                uFeatureCalc = DataKt.a().h(tRUE, FeatureCalculateConfig.class);
             }
             return uFeatureCalc;
          }
       }else if(a.g(uod, m0.d(str))){
          p0 = obj.a().getString(p0, "");
          if (p0 == null || !p0.length()) {
             b = true;
          }
          if (!b) {
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.String");
             goto label_00ca ;
          }
       }else if(a.g(uod, m0.d(Integer.TYPE))){
          int i = Integer.MIN_VALUE;
          int intx = obj.a().getInt(p0, i);
          if (intx != i) {
             intx = Integer.valueOf(intx);
             goto label_00ca ;
          }
       }else if(a.g(uod, m0.d(Long.TYPE))){
          long longx = obj.a().getLong(p0, Long.MIN_VALUE);
          if (longx - Long.MIN_VALUE) {
             p0 = Long.valueOf(longx);
             goto label_00ca ;
          }
       }else if(a.g(uod, m0.d(Float.TYPE))){
          float floatx = obj.a().getFloat(p0, Float.MIN_VALUE);
          if (floatx - Float.MIN_VALUE) {
             floatx = Float.valueOf(floatx);
             goto label_00ca ;
          }
       }
       tRUE = uFeatureCalc;
       goto label_00ca ;
    }
    public final IntentFilter getTimeTickIntent(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.timeTickIntent$delegate.getValue();
    }
    public final EveGlobalFeatureCalculator$timeTickReceiver$2$1 getTimeTickReceiver(){
       Object obj = PatchProxy.apply(null, this, EveGlobalFeatureCalculator.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.timeTickReceiver$delegate.getValue();
    }
    public final void init(){
       if (PatchProxy.applyVoid(null, this, EveGlobalFeatureCalculator.class, "5")) {
          return;
       }
       if (this.enable == null) {
          EveLog.i$default("EveGlobalFeatureCalculator#init disable,do nothing", false, 2, null);
          return;
       }else {
          EveLog.i$default("EveGlobalFeatureCalculator#init active task", false, 2, null);
          this.activate();
          this.requestFeatureCalculateConfig(ApiRequestTiming.COLD_START);
          return;
       }
    }
    public final String lastFeatureReportKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "last_feature_report_"+p0;
    }
    public final Long lastFeatureReportTime(String p0){
       EvePreference obj = PatchProxy.applyOneRefs(p0, this, EveGlobalFeatureCalculator.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.eveContext.g();
       p0 = this.lastFeatureReportKey(p0);
       if (u.S1(p0)) {
          throw new IllegalArgumentException("pref key is empty");
       }
       d uod = m0.d(Long.class);
       boolean b = false;
       Long longx = null;
       if (a.g(uod, m0.d(Boolean.TYPE))) {
          if (obj.a().getBoolean(p0, b)) {
             longx = Boolean.TRUE;
          }
       }else if(a.g(uod, m0.d(String.class))){
          p0 = obj.a().getString(p0, "");
          if (p0 == null || !p0.length()) {
             b = true;
          }
          if (!b) {
             Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Long");
             longx = p0;
          }
       }else if(a.g(uod, m0.d(Integer.TYPE))){
          int intx = obj.a().getInt(p0, Integer.MIN_VALUE);
          if (intx != Integer.MIN_VALUE) {
             longx = Integer.valueOf(intx);
          }
       }else if(a.g(uod, m0.d(Long.TYPE))){
          long longx1 = obj.a().getLong(p0, Long.MIN_VALUE);
          if (longx1 - Long.MIN_VALUE) {
             longx = Long.valueOf(longx1);
          }
       }else if(a.g(uod, m0.d(Float.TYPE))){
          float floatx = obj.a().getFloat(p0, Float.MIN_VALUE);
          if (floatx - Float.MIN_VALUE) {
             longx = Float.valueOf(floatx);
          }
       }
       return longx;
    }
    public final void matcherThreadRun(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "12")) {
          return;
       }
       LabeledRunnable labeledRunna = new LabeledRunnable("EveGlobalFeatureCalculate", null, "dataStream", p0, 2, null);
       b$a.a(this.eveContext.h(), v0, false, 2, null);
       return;
    }
    public final void onFeatureCalculateConfig(FeatureCalculateConfig p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveGlobalFeatureCalculator.class, "10")) {
          return;
       }
       String str = "EveGlobalFeatureCalculator onFeatureCalculateConfig for ";
       if (p0 == null) {
          EveLog.i$default(str+p1+" is null, do nothing", false, 2, null);
          return;
       }else if(!p0.getFeatureCalc()){
          this.cancelFeatureCalculate();
          EveLog.i$default(str+p1+" disable featureCalc", false, 2, null);
          return;
       }else if(p0.getFeatureCalcIntervalMins() <= 0){
          this.cancelFeatureCalculate();
          EveLog.i$default(str+p1+" illegal featureCalcIntervalMins:"+p0.getFeatureCalcIntervalMins(), false, 2, null);
          return;
       }else if(this.eveContext.i().b("EveGlobalFeatureCalculate") == null){
          this.cancelFeatureCalculate();
          EveLog.i$default(str+p1+" task not exist", false, 2, null);
          return;
       }else {
          long l = p0.getFeatureCalcIntervalMins() * (long)0xea60;
          EveGlobalFeatureCalculator tcurrentFeat = this.currentFeatureCalcIntervalMs;
          if (!l - tcurrentFeat) {
             EveLog.i$default(str+p1+" interval:"+l+" not change, do nothing", false, 2, null);
             return;
          }else {
             EveLog.i$default(str+p1+" interval change from "+tcurrentFeat+" to "+l+", cancel old feature report trigger, recalculate", false, 2, null);
             this.cancelFeatureReportTrigger();
             this.currentFeatureCalcIntervalMs = l;
             if (this.receiverRegistered == null) {
                UniversalReceiver.e(this.getContext(), this.getTimeTickReceiver(), this.getTimeTickIntent());
                this.receiverRegistered = true;
             }
             EveLog.i$default(str+p1+" triggerFeatureReportInferIfNeed", false, 2, null);
             this.triggerFeatureReportInferIfNeed(p1);
             return;
          }
       }
    }
    public final void onInferResult(l p0){
       String str1;
       String userId;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "8")) {
          return;
       }
       if (a.g(p0.d(), "featureReport")) {
          EveGlobalFeatureCalculator tlock = this.lock;
          _monitor_enter(tlock);
          String str = null;
          this.featureReportInferenceId = str;
          _monitor_exit(tlock);
          if (p0.g() != InferenceState.SUCCESS) {
             str1 = "EveGlobalFeatureCalculator onInferResult "+p0.d()+" state:"+p0.g()+" is not success";
             Throwable throwable = p0.a();
             if (throwable != null) {
                EveLog.e$default(str1, throwable, false, 4, str);
             }else {
                EveLog.i$default(str1, false, 2, str);
             }
             return;
          }else {
             a uoa = p0.f();
             if (uoa == null) {
                EveLog.i$default("EveGlobalFeatureCalculator onInferResult "+p0.d()+" result is null", false, 2, str);
                return;
             }else if(uoa.i() != Type.Map){
                EveLog.i$default("EveGlobalFeatureCalculator onInferResult "+p0.d()+" result is not map, type:"+uoa, false, 2, str);
                return;
             }else {
                g og = this.eveContext.b().b();
                if (og != null) {
                   userId = og.getUserId();
                   if (userId != null) {
                   label_00c1 :
                      this.recordFeatureReport(userId);
                      str1 = DataKt.a().q(uoa.d());
                      a.m(str1);
                      EveLogger.INSTANCE.logCustomEvent("EVE_REALTIME_FEATURES", str1);
                   }
                }
                userId = "";
                goto label_00c1 ;
             }
          }
       }
       return;
    }
    public void onUserChange(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveGlobalFeatureCalculator.class, "6")) {
          return;
       }
       a.p(p0, "fromUid");
       a.p(p1, "toUid");
       if (this.enable == null) {
          EveLog.i$default("EveGlobalFeatureCalculator disable, onUserChange do nothing", false, 2, null);
          return;
       }else {
          EveLog.i$default("EveGlobalFeatureCalculator onUserChange from:"+p0+" to:"+p1, false, 2, null);
          this.requestFeatureCalculateConfig(ApiRequestTiming.LOGIN);
          return;
       }
    }
    public final void recordFeatureReport(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "19")) {
          return;
       }
       this.eveContext.g().b(this.lastFeatureReportKey(p0), Long.valueOf(System.currentTimeMillis()));
       return;
    }
    public final void requestFeatureCalculateConfig(ApiRequestTiming p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "9")) {
          return;
       }
       g og = this.eveContext.b().b();
       String str = (og != null)? og.getUserId(): null;
       boolean b = false;
       StringBuilder str1 = (str == null || !str.length())? 1: null;
       int i = 2;
       String str2 = ", with uid:";
       if (str1) {
          EveLog.i$default("EveGlobalFeatureCalculator requestFeatureCalculateConfig error params when "+p0+str2+str, b, i, null);
          return;
       }else {
          EveLog.i$default("EveGlobalFeatureCalculator requestFeatureCalculateConfig when "+p0+str2+str, b, i, null);
          this.getApi().d().b(str, p0, new EveGlobalFeatureCalculator$requestFeatureCalculateConfig$1(this, str), new EveGlobalFeatureCalculator$requestFeatureCalculateConfig$2(this, str), new EveGlobalFeatureCalculator$requestFeatureCalculateConfig$3(str));
          return;
       }
    }
    public final void scatter(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "13")) {
          return;
       }
       LabeledRunnable labeledRunna = new LabeledRunnable("EveGlobalFeatureCalculate", null, "globalFeatureCalculator", p0, 2, null);
       b$a.a(this.eveContext.h(), v0, false, 2, null);
       return;
    }
    public final void triggerFeatureReportInferIfNeed(String p0){
       long l;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveGlobalFeatureCalculator.class, "11")) {
          return;
       }
       a uoa = this.eveContext.i().b("EveGlobalFeatureCalculate");
       String str = "EveGlobalFeatureCalculator triggerFeatureReportInferIfNeed for ";
       Object obj = null;
       if (uoa == null) {
          EveLog.i$default(str+p0+" error, task not exist", false, 2, obj);
          return;
       }else {
          Long longx = this.lastFeatureReportTime(p0);
          String str1 = "EveGlobalFeatureCalculator triggerFeatureReportInferIfNeed uid:";
          if (longx == null) {
             this.recordFeatureReport(p0);
             EveLog.i$default(str1+p0+" lastFeatureReportTime is null, record now is lastFeatureReportTime", false, 2, obj);
             l = System.currentTimeMillis();
          }else {
             l = longx.longValue();
          }
          long l1 = this.currentFeatureCalcIntervalMs - (System.currentTimeMillis() - l);
          if (l1 - (long)0xea60 > 0) {
             EveLog.i$default(str1+p0+" lastFeatureReportTime is "+l+", diff:"+l1+" over one minute, wait next callback", false, 2, obj);
             return;
          }else {
             EveGlobalFeatureCalculator ttriggerInfe = this.triggerInferDisposable;
             if (ttriggerInfe != null && !ttriggerInfe.isDisposed()) {
                EveLog.i$default(str+p0+" dispose old trigger infer", false, 2, obj);
                ttriggerInfe.dispose();
             }
             long l2 = Math.max(0, l1);
             EveLog.i$default(str+p0+" lastFeatureReportTime "+l+" delay "+l2, false, 2, obj);
             this.triggerInferDisposable = t.timer(l2, TimeUnit.MILLISECONDS).subscribe(new EveGlobalFeatureCalculator$triggerFeatureReportInferIfNeed$2(this, p0, uoa));
             return;
          }
       }
    }
    public final void updateLocalFeatureCalculateConfig(String p0,FeatureCalculateConfig p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveGlobalFeatureCalculator.class, "16")) {
          return;
       }
       this.eveContext.g().b(this.featureCalculateConfigKey(p0), DataKt.a().q(p1));
       return;
    }
}
