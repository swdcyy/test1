package com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$t;
import nsd.u;
import java.lang.Object;
import java.util.HashMap;
import rw3.a;
import mrd.a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$Meta;
import java.lang.String;
import java.util.Map;
import java.lang.Integer;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$k;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$l;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$m;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$n;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$o;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$p;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$q;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$r;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$s;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$a;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$b;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$c;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$d;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$e;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$f;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$g;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$h;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$i;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository$j;
import com.kwai.sdk.switchconfig.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.lang.Throwable;
import com.yxcorp.retrofit.model.RetrofitException;
import aegon.chrome.net.NetworkException;
import retrofit2.HttpException;
import com.yxcorp.retrofit.model.KwaiException;
import android.os.SystemClock;
import java.util.IdentityHashMap;
import java.lang.Boolean;
import brd.y;
import z1.a;

public final class MerchantHomePerfRepository	// class@0016d3
{
    public Map A;
    public final c B;
    public boolean C;
    public boolean a;
    public boolean b;
    public final Map c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public boolean y;
    public a z;
    public static final MerchantHomePerfRepository$t D;

    static {
       MerchantHomePerfRepository.D = new MerchantHomePerfRepository$t(null);
    }
    public void MerchantHomePerfRepository(){
       super();
       this.c = new HashMap();
       this.z = new a();
       this.A = new HashMap();
       this.B = a.g();
       boolean b = true;
       this.C = b;
       MerchantHomePerfRepository$Meta[] metaArray = MerchantHomePerfRepository$Meta.values();
       int len = metaArray.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          object oobject = metaArray[i1];
          String key = oobject.getKey();
          this.A.put(key, oobject.getDefaultValue());
       }
       this.c.put(Integer.valueOf(i), new MerchantHomePerfRepository$k(this));
       this.c.put(Integer.valueOf(b), new MerchantHomePerfRepository$l(this));
       this.c.put(Integer.valueOf(2), new MerchantHomePerfRepository$m(this));
       this.c.put(Integer.valueOf(3), new MerchantHomePerfRepository$n(this));
       this.c.put(Integer.valueOf(4), new MerchantHomePerfRepository$o(this));
       this.c.put(Integer.valueOf(5), new MerchantHomePerfRepository$p(this));
       this.c.put(Integer.valueOf(6), new MerchantHomePerfRepository$q(this));
       this.c.put(Integer.valueOf(17), new MerchantHomePerfRepository$r(this));
       this.c.put(Integer.valueOf(7), new MerchantHomePerfRepository$s(this));
       this.c.put(Integer.valueOf(8), new MerchantHomePerfRepository$a(this));
       this.c.put(Integer.valueOf(9), new MerchantHomePerfRepository$b(this));
       this.c.put(Integer.valueOf(10), new MerchantHomePerfRepository$c(this));
       this.c.put(Integer.valueOf(11), new MerchantHomePerfRepository$d(this));
       this.c.put(Integer.valueOf(12), new MerchantHomePerfRepository$e(this));
       this.c.put(Integer.valueOf(13), new MerchantHomePerfRepository$f(this));
       this.c.put(Integer.valueOf(14), new MerchantHomePerfRepository$g(this));
       this.c.put(Integer.valueOf(15), new MerchantHomePerfRepository$h(this));
       this.c.put(Integer.valueOf(16), new MerchantHomePerfRepository$i(this));
       this.c.put(Integer.valueOf(1024), new MerchantHomePerfRepository$j(this));
       this.C = a.t().d("enableMerchantMallRepairPagePerformance", b);
       return;
    }
    public final long a(long p0,long p1){
       long l = 0;
       if (p0 - l > 0) {
          l = p0 + p1;
       }
       return l;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantHomePerfRepository.class, "28")) {
          return;
       }
       if (this.y == null && this.e - null) {
          this.y = true;
          MerchantHomePerfRepository td = this.d;
          i3 obj = this.A.get(MerchantHomePerfRepository$Meta.SIDE_BAR_SHOW_REAL_TIME.getKey());
          if (obj != null) {
             long l = td - obj.longValue();
             obj = i3.f();
             obj.d("business", "KwaiShop");
             obj.d("page2", "MERCHANT_HOME_PAGE");
             obj.d("pageChName", "小店首页");
             obj.c("t_show", Long.valueOf(this.d));
             obj.c("t_click", Long.valueOf(this.a(this.e, l)));
             obj.c("t_show_buyer", Long.valueOf(this.a(this.h, l)));
             obj.c("t_show_seller", Long.valueOf(this.a(this.i, l)));
             obj.c("t_page", Long.valueOf(this.a(this.l, l)));
             obj.c("t_page_fail", Long.valueOf(this.a(this.n, l)));
             obj.c("t_page_success", Long.valueOf(this.a(this.m, l)));
             obj.c("t_feed", Long.valueOf(this.a(this.o, l)));
             obj.c("t_feed_fail", Long.valueOf(this.a(this.q, l)));
             obj.c("t_feed_success", Long.valueOf(this.a(this.p, l)));
             obj.c("t_feed_cell", Long.valueOf(this.a(this.r, l)));
             obj.c("t_disappear", Long.valueOf(this.a(this.s, l)));
             obj.c("t_destroy", Long.valueOf(this.a(this.t, l)));
             String obj1 = this.A.get(MerchantHomePerfRepository$Meta.PRELOAD_TYPE.getKey());
             obj1 = (obj1 != null)? obj1.toString(): objArray;
             obj.d("preloadType", obj1);
             Object[] obj2 = this.A.get(MerchantHomePerfRepository$Meta.CACHE_TYPE.getKey());
             obj1 = (obj2 != null)? obj2.toString(): objArray;
             obj.d("cacheType", obj1);
             obj2 = this.A.get(MerchantHomePerfRepository$Meta.PRE_BUILT_CONNECTION.getKey());
             obj1 = (obj2 != null)? obj2.toString(): objArray;
             obj.d("preConnection", obj1);
             obj2 = this.A.get(MerchantHomePerfRepository$Meta.PREDICTION.getKey());
             obj1 = (obj2 != null)? obj2.toString(): objArray;
             obj.d("prediction", obj1);
             obj2 = this.A.get(MerchantHomePerfRepository$Meta.PREDICTION_TO_PRELOAD.getKey());
             obj1 = (obj2 != null)? obj2.toString(): objArray;
             obj.d("predictionToPreload", obj1);
             obj2 = this.A.get(MerchantHomePerfRepository$Meta.PREDICTION_PRIORITY.getKey());
             if (obj2 != null) {
                objArray = obj2.toString();
             }
             obj.d("predictionPriority", objArray);
             u1.Y("MerchantHomePerformance", obj.e(), 7);
             if (SystemUtil.I()) {
                a.d(MerchantHomeLogBiz.Performance, "MerchantHomePerfRepository", "logMerchantHomePerformance: "+obj.e());
             }
          }
       }
       return;
    }
    public final void c(Throwable p0){
       String str;
       String str1;
       RetrofitException mResponseCod;
       int errorCode;
       KwaiException mErrorCode;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantHomePerfRepository.class, "19")) {
          return;
       }
       i3 oi3 = i3.f();
       if (this.a != null) {
          if (this.b != null) {
             str = "MERCHANT_HOME_PAGE_MALL";
             str1 = "首页商城tab";
          }else {
             str = "MERCHANT_HOME_PAGE3";
             str1 = "小店首页-动态化";
          }
       }else {
          str = "MERCHANT_HOME_PAGE";
          str1 = "小店首页";
       }
       oi3.d("business", "KwaiShop");
       oi3.d("page2", str);
       oi3.d("pageChName", str1);
       str1 = Integer.MIN_VALUE;
       if (p0 instanceof RetrofitException) {
          RetrofitException retrofitExce = p0;
          mResponseCod = retrofitExce.mResponseCode;
          if (mResponseCod == null) {
             retrofitExce = retrofitExce.mCause;
             if (retrofitExce instanceof NetworkException) {
                errorCode = retrofitExce.getErrorCode();
                if (errorCode == 2) {
                   mResponseCod = -1009;
                }else if(errorCode == 4 || errorCode == 6){
                   mResponseCod = -1001;
                }else {
                   mResponseCod = errorCode;
                }
             }
          }
       }else if(p0 instanceof HttpException){
          mResponseCod = p0.code();
       }else if(p0 instanceof KwaiException){
          mErrorCode = p0.mErrorCode;
       }else {
          mErrorCode = Integer.MIN_VALUE;
       }
       mResponseCod = Integer.MIN_VALUE;
    label_0081 :
       if (mResponseCod != str1) {
          oi3.c("http_error_code", Integer.valueOf(mResponseCod));
       }
       if (errorCode != str1) {
          oi3.c("error_code", Integer.valueOf(errorCode));
       }
       int i = (p0 == null)? 1: 0;
       oi3.c("status", Integer.valueOf(i));
       u1.Y("MerchantInterfaceReqStatus", oi3.e(), 7);
       return;
       errorCode = Integer.MIN_VALUE;
       goto label_0081 ;
    }
    public final void d(Object p0){
       this.w = true;
    }
    public final void e(){
       String str;
       String str1;
       MerchantHomePerfRepository merchantHome = MerchantHomePerfRepository.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantHome, "24")) {
          return;
       }
       this.u = SystemClock.elapsedRealtime();
       if (PatchProxy.applyVoid(objArray, this, merchantHome, "26") || (this.w != null || (this.x == null && this.u - null > 0))) {
          if (this.a != null) {
             if (this.b != null) {
                str = "MERCHANT_HOME_PAGE_MALL";
                str1 = "首页商城tab";
             }else {
                str = "MERCHANT_HOME_PAGE3";
                str1 = "小店首页-动态化";
             }
          }else {
             str = "MERCHANT_HOME_PAGE";
             str1 = "小店首页";
          }
          i3 oi3 = i3.f();
          oi3.d("business", "KwaiShop");
          oi3.d("page2", str);
          oi3.d("pageChName", str1);
          oi3.c("t-1", Long.valueOf((this.g - this.f)));
          oi3.c("t0", Long.valueOf((this.j - this.g)));
          str1 = "t2";
          String str2 = "t1";
          if (this.a != null && (this.b != null && this.C != null)) {
             oi3.c(str2, Long.valueOf((this.k - this.g)));
             oi3.c(str1, Long.valueOf((this.m - this.g)));
          }else {
             oi3.c(str2, Long.valueOf((this.m - this.g)));
             oi3.c(str1, Long.valueOf((this.p - this.g)));
          }
          long l = this.u - this.g;
          this.v = l;
          oi3.c("t3", Long.valueOf(l));
          a.s(MerchantHomeLogBiz.Performance, "MerchantHomePerfRepository", "MerchantPageCostTime = ["+oi3+']');
          int i = 7;
          if (!SystemUtil.I()) {
             u1.Y("MerchantPageCostTime", oi3.e(), i);
          }
          MerchantHomePerfRepository tv = this.v;
          if (!PatchProxy.isSupport(merchantHome) || !PatchProxy.applyVoidOneRefs(Long.valueOf(tv), this, merchantHome, "27")) {
             MerchantHomePerfRepository$Meta[] metaArray = MerchantHomePerfRepository$Meta.values();
             int len = metaArray.length;
             for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject = metaArray[i1];
                String key = oobject.getKey();
                this.z.a().put(key, this.A.get(oobject.getKey()));
             }
             this.z.a().put("draw", Long.valueOf(tv));
             if (!SystemUtil.I()) {
                u1.Y("MerchantHomePerformanceRecord", this.z.toString(), i);
             }
             a.s(MerchantHomeLogBiz.Performance, "MerchantHomePerfRepository", "MerchantHomePerformanceRecord = "+this.z);
          }
          this.b();
          this.x = true;
       }
    label_016a :
       this.B.onNext(Boolean.TRUE);
       return;
    }
    public final void f(boolean p0){
       this.a = p0;
    }
    public final void onEvent(int p0){
       MerchantHomePerfRepository merchantHome = MerchantHomePerfRepository.class;
       if (PatchProxy.isSupport(merchantHome) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, merchantHome, "4")) {
          return;
       }
       this.onEvent(p0, null);
       return;
    }
    public final void onEvent(int p0,Object p1){
       MerchantHomePerfRepository merchantHome = MerchantHomePerfRepository.class;
       if (PatchProxy.isSupport(merchantHome) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, merchantHome, "5")) {
          return;
       }
       a uoa = this.c.get(Integer.valueOf(p0));
       if (uoa != null) {
          uoa.accept(p1);
       }
       return;
    }
}
