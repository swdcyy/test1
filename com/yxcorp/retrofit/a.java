package com.yxcorp.retrofit.a;
import com.yxcorp.retrofit.c;
import brd.z;
import java.lang.Object;
import java.util.Random;
import java.lang.Throwable;
import java.lang.Integer;
import retrofit2.a;
import brd.w;
import brd.t;
import okhttp3.OkHttpClient;
import crd.b;
import ajd.a;
import java.lang.String;
import com.yxcorp.retrofit.e;
import android.content.Context;
import ekd.p0;
import com.yxcorp.retrofit.model.RetrofitException;
import java.io.IOException;
import java.lang.Exception;
import okhttp3.Request;
import yid.a;
import erd.c;
import yid.d;
import erd.o;
import java.net.SocketTimeoutException;
import java.lang.StringBuilder;
import mjd.a;
import java.lang.Math;
import java.util.concurrent.TimeUnit;
import java.lang.annotation.Annotation;
import java.lang.Class;
import zid.a;
import yid.b;
import erd.g;
import com.yxcorp.retrofit.model.a;
import okhttp3.OkHttpClient$Builder;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import com.yxcorp.retrofit.timing.LoggedInterceptorWrapper;
import java.util.Collection;
import yid.e;
import com.google.gson.Gson;
import t45.d;
import cjd.d;
import erd.a;
import com.yxcorp.retrofit.throttling.v2.a;
import com.yxcorp.retrofit.throttling.a;
import com.yxcorp.retrofit.c$a;
import com.yxcorp.retrofit.d;
import com.yxcorp.retrofit.f;
import com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2$a;
import ljd.a;
import java.util.Iterator;
import okhttp3.EventListener$Factory;
import com.yxcorp.retrofit.throttling.v2.ThrottlingInterceptorV2;
import com.yxcorp.retrofit.throttling.ThrottlingInterceptor;
import com.yxcorp.retrofit.interceptor.TimeoutInterceptor;
import fjd.b;
import com.yxcorp.retrofit.region.APISchedulingInterceptor;
import pjd.c;
import hjd.b;
import ok.o;
import com.yxcorp.retrofit.idc.interceptor.RouterInterceptor;
import com.yxcorp.retrofit.interceptor.DynamicParamsInterceptor;
import com.yxcorp.retrofit.interceptor.CommonParamsInterceptor;
import com.yxcorp.retrofit.interceptor.ContentLengthInterceptor;
import com.yxcorp.retrofit.interceptor.HeaderInterceptor;
import com.yxcorp.retrofit.interceptor.HeaderParamInterceptor;
import yid.c;
import com.yxcorp.retrofit.idc.c;
import com.yxcorp.retrofit.g;
import com.yxcorp.retrofit.SchedulerPolicy;

public abstract class a implements c	// class@0013c1
{
    public final Random mRandom;
    public final boolean mRetryTimesValid;
    public final z mScheduler;
    public static OkHttpClient sApiClient;
    public static int sApiRetryTimes;

    public void a(z p0){
       super(p0, 0);
    }
    public void a(z p0,int p1){
       super();
       this.mRandom = new Random();
       this.mScheduler = p0;
       a.sApiRetryTimes = p1;
       this.mRetryTimesValid = this.isRetryTimesValid();
    }
    public static Integer a(a p0,Throwable p1,Integer p2){
       return p0.lambda$null$1(p1, p2);
    }
    public static w b(a p0,a p1,int p2,int p3,Integer p4){
       return p0.lambda$null$2(p1, p2, p3, p4);
    }
    public static w c(a p0,a p1,int p2,int p3,t p4){
       return p0.lambda$exponentialAPIRetryFunction$3(p1, p2, p3, p4);
    }
    public static OkHttpClient getClient(){
       return a.sApiClient;
    }
    public static void lambda$addApiRetryFunctionIfNecessary$0(a p0,b p1){
       if (p0 == null || (p0 instanceof a && (!p0.c("retryTimes") || p0.C(e.h().f())))) {
          return;
       }
       throw new RetrofitException(new IOException("Network disconnected"), null, 0, "");
    }
    private w lambda$exponentialAPIRetryFunction$3(a p0,int p1,int p2,t p3){
       return p3.zipWith(t.range(1, (a.sApiRetryTimes + 1)), new a(this)).flatMap(new d(this, p0, p1, p2));
    }
    private Integer lambda$null$1(Throwable p0,Integer p1){
       if (!p0 instanceof RetrofitException) {
          throw this.wrapAsExceptionIfNeeded(p0);
       }
       RetrofitException retrofitExce = p0;
       if (retrofitExce.mResponseCode != null) {
          throw this.wrapAsExceptionIfNeeded(retrofitExce);
       }
       Throwable cause = p0.getCause();
       if (!cause instanceof IOException) {
          throw this.wrapAsExceptionIfNeeded(p0);
       }
       if (cause instanceof SocketTimeoutException && p1.intValue() > 1) {
          throw this.wrapAsExceptionIfNeeded(p0);
       }
       if (p1.intValue() <= a.sApiRetryTimes) {
          return p1;
       }
       throw this.wrapAsExceptionIfNeeded(p0);
    }
    private w lambda$null$2(a p0,int p1,int p2,Integer p3){
       if (p0 instanceof a) {
          p0.b("retryTimes", String.valueOf(p3));
          a.c("BaseRetrofitConfig", "retryTimes: "+p3);
       }
       return t.timer((TimeUnit.SECONDS.toMillis((long)(p1 + (int)Math.pow((double)p2, (double)(p3.intValue() - 1)))) + (long)this.mRandom.nextInt((this.getRetryRandomizedTimeMs() + 1))), TimeUnit.MILLISECONDS);
    }
    public final t addApiRetryFunctionIfNecessary(t p0,a p1,Annotation[] p2){
       object oobject;
       if (this.mRetryTimesValid == null) {
          return p0;
       }
       int len = p2.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return p0;
          }
          oobject = p2[i];
          if (oobject.annotationType() == a.class) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return p0.doOnSubscribe(new b(p1)).retryWhen(this.exponentialAPIRetryFunction(p1, oobject.initDelay(), oobject.exponentialBase()));
    }
    public abstract String buildBaseUrl();
    public a buildCall(a p0){
       return new a(new a(p0));
    }
    public OkHttpClient buildClient(){
       if (a.sApiClient == null) {
          OkHttpClient$Builder uBuilder = this.createOkHttpClientBuilder(10);
          ArrayList uArrayList = new ArrayList();
          List list = uBuilder.interceptors();
          for (int i = 0; i < list.size(); i = i + 1) {
             uArrayList.add(new LoggedInterceptorWrapper(list.get(i), i));
          }
          uBuilder.interceptors().clear();
          uBuilder.interceptors().addAll(uArrayList);
          a.sApiClient = uBuilder.build();
       }
       return a.sApiClient;
    }
    public e buildCommonParams(){
       return null;
    }
    public Gson buildGson(){
       return new Gson();
    }
    public final t buildObservable(t p0,a p1,Annotation[] p2){
       if (this.observeOnMainScheduler(p2)) {
          p0 = p0.observeOn(d.a);
       }
       return this.addApiRetryFunctionIfNecessary(this.buildObservableBeforeRetry(p0.doOnComplete(d.c).doOnError(d.d).doOnNext(new a()).doOnNext(new a()), p1, p2), p1, p2);
    }
    public t buildObservableBeforeRetry(t p0,a p1,Annotation[] p2){
       return p0;
    }
    public c$a buildParams(){
       if (e.h() != null && e.h().g() != null) {
          return e.h().g().V();
       }
       return new f();
    }
    public OkHttpClient$Builder createOkHttpClientBuilder(int p0){
       return this.createOkHttpClientBuilder(p0, null);
    }
    public OkHttpClient$Builder createOkHttpClientBuilder(int p0,ThrottlingInterceptorV2$a p1){
       Iterator iterator;
       Iterator iterator1;
       Iterator iterator2;
       long l = (long)p0;
       TimeUnit sECONDS = TimeUnit.SECONDS;
       OkHttpClient$Builder uBuilder = new OkHttpClient$Builder().connectTimeout(l, sECONDS).readTimeout(l, sECONDS).writeTimeout(l, sECONDS);
       boolean b = this.enableInterceptorUpgrade();
       a.c("BaseRetrofitConfig", "enableInterceptorUpgrade:"+b);
       if (b) {
          iterator = a.a("start").iterator();
          while (iterator.hasNext()) {
             uBuilder.addInterceptor(iterator.next());
          }
       }
       Interceptor loggingInter = this.getLoggingInterceptor();
       if (loggingInter != null) {
          uBuilder.addInterceptor(loggingInter);
       }
       EventListener$Factory eventListene = this.getEventListenerFactory();
       if (eventListene != null) {
          uBuilder.eventListenerFactory(eventListene);
       }
       boolean b1 = this.enableNewCommonParams();
       uBuilder.addInterceptor(new ThrottlingInterceptorV2(p1)).addInterceptor(new ThrottlingInterceptor()).addInterceptor(new TimeoutInterceptor());
       b routerProvid = this.getRouterProvider();
       boolean b2 = this.enableAdvanceInterceptor();
       String str = "before_host_complete";
       if (b2) {
          if (!b) {
             List advancedInte = this.getAdvancedInterceptors();
             if (advancedInte != null && advancedInte.size() > 0) {
                iterator1 = advancedInte.iterator();
                while (iterator1.hasNext()) {
                   uBuilder.addInterceptor(iterator1.next());
                }
             }
          }else {
             iterator1 = a.a(str).iterator();
             while (iterator1.hasNext()) {
                uBuilder.addInterceptor(iterator1.next());
             }
             b b4 = b.b;
             uBuilder.addInterceptor(new APISchedulingInterceptor(this.getRegionScheduler(), b4)).addInterceptor(new RouterInterceptor(routerProvid, b4));
             iterator1 = a.a("after_host_complete").iterator();
             while (iterator1.hasNext()) {
                uBuilder.addInterceptor(iterator1.next());
             }
          }
       }
       if (b) {
          iterator1 = a.a("before_param_complete").iterator();
          while (iterator1.hasNext()) {
             uBuilder.addInterceptor(iterator1.next());
          }
       }
       uBuilder.addInterceptor(new DynamicParamsInterceptor(this.buildParams(), e.h().f(), b1, false)).addInterceptor(new CommonParamsInterceptor(this.buildCommonParams(), b1, false));
       uBuilder.addInterceptor(new ContentLengthInterceptor()).addInterceptor(new HeaderInterceptor(this.buildParams(), b1, false)).addInterceptor(new HeaderParamInterceptor(this.buildCommonParams(), b1, false));
       if (b) {
          iterator = a.a("after_param_complete").iterator();
          while (iterator.hasNext()) {
             uBuilder.addInterceptor(iterator.next());
          }
       }
       if (!b2 && b) {
          iterator = a.a(str).iterator();
          while (iterator.hasNext()) {
             uBuilder.addInterceptor(iterator.next());
          }
          b b3 = b.b;
          uBuilder.addInterceptor(new APISchedulingInterceptor(this.getRegionScheduler(), b3)).addInterceptor(new RouterInterceptor(routerProvid, b3));
          iterator2 = a.a("after_host_complete").iterator();
          while (iterator2.hasNext()) {
             uBuilder.addInterceptor(iterator2.next());
          }
       }
       if (b) {
          iterator2 = a.a("end").iterator();
          while (iterator2.hasNext()) {
             uBuilder.addInterceptor(iterator2.next());
          }
       }
       return uBuilder;
    }
    public boolean enableAdvanceInterceptor(){
       return false;
    }
    public boolean enableInterceptorUpgrade(){
       return false;
    }
    public boolean enableNewCommonParams(){
       return false;
    }
    public final o exponentialAPIRetryFunction(a p0,int p1,int p2){
       return new c(this, p0, p1, p2);
    }
    public List getAdvancedInterceptors(){
       return null;
    }
    public EventListener$Factory getEventListenerFactory(){
       return null;
    }
    public z getExecuteScheduler(){
       return this.mScheduler;
    }
    public abstract Interceptor getLoggingInterceptor();
    public c getRegionScheduler(){
       return null;
    }
    public int getRetryRandomizedTimeMs(){
       return 0;
    }
    public b getRouterProvider(){
       return c.n();
    }
    public boolean isRetryTimesValid(){
       boolean sApiRetryTim = a.sApiRetryTimes;
       sApiRetryTim = (sApiRetryTim > 0 && sApiRetryTim <= 10)? true: false;
       return sApiRetryTim;
    }
    public final boolean observeOnMainScheduler(Annotation[] p0){
       int len = p0.length;
       boolean b = false;
       int i = 0;
       while (true) {
          if (i >= len) {
             return true;
          }
          object oobject = p0[i];
          if (oobject.annotationType() == g.class) {
             if (oobject.policy() == SchedulerPolicy.UI_SCHEDULER) {
                b = true;
                break ;
             }
             break ;
          }else {
             i = i + 1;
          }
       }
       return b;
    }
    public final Exception wrapAsExceptionIfNeeded(Throwable p0){
       if (p0 instanceof Exception) {
          return p0;
       }
       return new Exception(p0);
    }
}
