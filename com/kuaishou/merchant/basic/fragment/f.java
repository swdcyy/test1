package com.kuaishou.merchant.basic.fragment.f;
import gr8.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import android.os.SystemClock;
import ht3.b;
import brd.t;
import gr8.b;
import brd.x;
import com.kuaishou.merchant.basic.fragment.c;
import com.kuaishou.merchant.basic.fragment.a;
import erd.g;
import crd.b;
import ht3.m;
import com.kuaishou.merchant.basic.fragment.b;
import lnc.i3;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import ct3.a;
import n04.a;
import q87.c;
import ht3.k;
import com.kuaishou.merchant.basic.fragment.e;
import ht3.n;
import android.app.Activity;
import ua4.a;
import java.util.Objects;
import kotlin.jvm.internal.a;
import java.lang.Long;
import java.lang.Math;
import java.lang.StringBuilder;
import k2b.u1;
import ta4.b;
import java.lang.Integer;
import com.kuaishou.merchant.preload.PreloadConfig;
import qa4.d;
import com.kuaishou.merchant.preload.PreloadConfig$a;
import ua4.b;
import android.util.LruCache;
import ua4.c;
import com.kuaishou.merchant.preload.view.ViewPreloadManager;
import java.util.Map;
import org.json.JSONObject;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import com.kwai.sdk.switchconfig.a;
import java.lang.Double;
import java.lang.reflect.Type;
import java.util.Random;
import java.lang.Boolean;
import com.kuaishou.merchant.basic.fragment.MerchantRecycleFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.kuaishou.merchant.basic.fragment.d;
import io.reactivex.internal.functions.Functions;
import ht3.j;

public class f	// class@0015c2
{
    public int A;
    public int B;
    public final PublishSubject C;
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public b k;
    public a l;
    public b m;
    public b n;
    public b o;
    public b p;
    public b q;
    public b r;
    public boolean s;
    public boolean t;
    public long u;
    public boolean v;
    public b w;
    public String x;
    public boolean y;
    public int z;

    public void f(a p0){
       super();
       this.s = false;
       this.t = false;
       this.v = false;
       this.z = 0;
       this.A = Integer.MIN_VALUE;
       this.B = Integer.MIN_VALUE;
       this.C = PublishSubject.g();
       this.h = SystemClock.elapsedRealtime();
       this.k = p0;
       this.m = p0.m().compose(p0.ge()).subscribe(new c(this), a.b);
       this.n = p0.m().compose(p0.ge()).subscribe(new m(this), b.b);
    }
    public final void a(i3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "18")) {
          return;
       }
       p0.d("business", "KwaiShop");
       p0.d("page2", this.k.C1());
       String str = this.k.D1();
       if (!TextUtils.isEmpty(str)) {
          p0.d("pageChName", str);
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       this.i = SystemClock.elapsedRealtime();
       b9.a(this.q);
       return;
    }
    public final long c(long p0){
       f ti = this.i;
       if (ti > 0) {
       }else {
          ti = this.c;
       }
       return (ti - p0);
    }
    public final long d(){
       f obj = PatchProxy.apply(null, this, f.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = 0;
       if (this.g - l > 0) {
          return l;
       }
       obj = this.l;
       if (obj == null || !obj.S(this.k)) {
          return (this.a - this.h);
       }
       Object[] objArray = new Object[0];
       a.C().w("MerchantPagePerfLogger", "getT_1, firstLoadFragment", objArray);
       return (this.a - this.l.a());
    }
    public t e(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.doOnSubscribe(new k(this)).doOnNext(new e(this)).doOnError(new n(this));
    }
    public void f(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "7")) {
          return;
       }
       if (p0 instanceof a) {
          this.l = p0;
          Object[] objArray = new Object[0];
          a.C().w("MerchantPagePerfLogger", "onAttachMerchantActivity", objArray);
       }
       return;
    }
    public final void g(){
       i3 oi3;
       f z;
       String str9;
       long l5;
       long l6;
       Object obj2;
       boolean b = this;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, b, uof, "9")) {
          return;
       }
       if (b.t != null) {
          return;
       }
       a b1 = a.b;
       String str = b.k.C1();
       Objects.requireNonNull(b1);
       if (!PatchProxy.applyVoidOneRefs(str, b1, a.class, "1")) {
          str9 = a.a;
          if (str9 != null && a.g(str, str9)) {
             a.a = objArray;
          }
       }
       str = "MerchantPageCostTime";
       String str1 = "t3";
       String str2 = "t2";
       String str3 = "t1";
       String str4 = "t0";
       String str5 = "t-1";
       String str6 = "MerchantPagePerfLogger";
       String str7 = "]";
       long l = 0;
       int i = 0;
       if (b.z == null) {
          if (b.k.C2()) {
             if (!PatchProxy.applyVoid(objArray, b, uof, "10")) {
                oi3 = i3.f();
                b.a(oi3);
                oi3.c(str5, Long.valueOf(this.d()));
                oi3.c(str4, Long.valueOf(Math.max(l, (b.b - b.a))));
                long l1 = Math.max(l, b.c(b.a));
                oi3.c(str3, Long.valueOf(l1));
                oi3.c(str2, Long.valueOf(l1));
                oi3.c(str1, Long.valueOf(l1));
                Object[] objArray1 = new Object[i];
                a.C().w(str6, "reportNoRequest, MerchantPageCostTime=["+oi3+str7, objArray1);
                u1.Y(str, oi3.e(), 7);
             }
             b.t = true;
          }
          return;
       }else {
          String str8 = str6;
          b.t = true;
          b9.a(b.m);
          b9.a(b.o);
          b9.a(b.p);
          b9.a(b.q);
          b9.a(b.r);
          if (b.z != 2 || (PatchProxy.applyVoid(objArray, b, uof, "12") || b.s == null)) {
             str2 = str8;
             str5 = str7;
          }else {
             String str10 = str;
             f g = b.g;
             if (g - l <= 0) {
                g = b.a;
             }
             f uof1 = g;
             z = b.j;
             g = (z - l > 0 && z - uof1 < 0)? z: uof1;
             i3 oi31 = i3.f();
             b.a(oi31);
             String str11 = str8;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             long l2 = Math.max(l, b.c(g));
             String str12 = str10;
             oi31.c(str5, Long.valueOf(this.d()));
             str5 = str7;
             long l3 = b.f - g;
             oi31.c(str4, Long.valueOf(Math.max(0, (b.b - g))));
             oi31.c(str3, Long.valueOf(l2));
             long l4 = (this.k())? l2: l3;
             oi31.c(str2, Long.valueOf(l4));
             f u = b.u;
             if (u <= 0) {
                b.z = 4;
                str2 = str11;
             }else {
                f e = b.e;
                if (e > 0 && e - u < 0) {
                   l5 = (b.f - g) + (u - b.d);
                   l6 = 1;
                }else {
                   l5 = u - g;
                   l6 = 0;
                }
                oi31.c("bad_case", Long.valueOf(l6));
                g = b.w;
                int i1 = (g != null)? g.a(): 0;
                oi31.c("preload_cache", Integer.valueOf(i1));
                g = b.w;
                b b2 = (g != null)? g.b: 0;
                oi31.c("cache_timeout", Long.valueOf(b2));
                if (!this.k()) {
                   l2 = l5;
                }
                oi31.c(str1, Long.valueOf(l2));
                if (this.k()) {
                   oi31.c("t4", Long.valueOf(l3));
                   oi31.c("t5", Long.valueOf(l5));
                }
                c obj = PatchProxy.apply(null, b, uof, "13");
                PatchProxyResult patchProxyRe1 = patchProxyRe;
                if (obj != patchProxyRe1) {
                   i1 = obj.intValue();
                }else {
                   PreloadConfig$a companion = PreloadConfig.Companion;
                   d uod = companion.d(b.k.C1());
                   if (uod == null) {
                      i1 = 0;
                   }else {
                      int b3 = uod.a();
                      int b4 = uod.b();
                      boolean b5 = uod.c();
                      b3 = (companion.a() && b3)? 1: 0;
                      b4 = (companion.c() && b4)? 1: 0;
                      i1 = (companion.b() && b5)? 1: 0;
                      i1 = i1 + ((b3 * 4) + (b4 * 2));
                   }
                }
                oi31.c("preload_switch", Integer.valueOf(i1));
                oi31.c("shop_cold_start", Integer.valueOf(b.y));
                if (!PatchProxy.applyVoidOneRefs(oi31, b, uof, "14") && !TextUtils.isEmpty(b.x)) {
                   b2 = b.b;
                   f x = b.x;
                   Objects.requireNonNull(b2);
                   obj = PatchProxy.applyOneRefs(x, b2, b.class, "4");
                   if (obj == patchProxyRe1) {
                      a.p(x, "traceId");
                      obj = b.a.remove(x);
                   }
                   if (obj != null) {
                      oi31.c("relayCacheStatus", Integer.valueOf(obj.e));
                      oi31.c("saveRequestTime", Long.valueOf(obj.a));
                      oi31.c("waitRequestTime", Long.valueOf(obj.b));
                      oi31.c("totalRequestTime", Long.valueOf(obj.c));
                      oi31.c("saveLayoutTime", Long.valueOf(obj.d));
                   }
                }
             label_02b6 :
                Object[] objArray3 = new Object[0];
                str2 = str11;
                a.C().w(str2, "report, MerchantPageCostTime=["+oi31+str5, objArray3);
                u1.Y(str12, oi31.e(), 7);
                if (!PatchProxy.applyVoid(null, b, uof, "15")) {
                   ViewPreloadManager h = ViewPreloadManager.h;
                   str9 = b.k.C1();
                   Objects.requireNonNull(h);
                   Object obj1 = PatchProxy.applyOneRefs(str9, h, ViewPreloadManager.class, "18");
                   if (obj1 != patchProxyRe1) {
                      obj2 = obj1;
                   }else if(str9 != null){
                      obj2 = ViewPreloadManager.f.remove(str9);
                   }else {
                      obj2 = null;
                   }
                   if (obj2 != null && !obj2.isEmpty()) {
                      oi31 = i3.f();
                      b.a(oi31);
                      oi31.d("missViewMap", new JSONObject(obj2).toString());
                      a.s(MerchantCommonLogBiz.PRELOADER, str2, "report, MERCHANT_MISS_VIEW_PRELOAD_MAP=["+oi31+str5);
                      if (new Random().nextDouble() - a.t().getValue("missViewPreloadSamplingRate", Double.class, Double.valueOf(0)).doubleValue() < 0) {
                         u1.Y("MERCHANT_MISS_VIEW_PRELOAD_MAP", oi31.e(), 7);
                      }
                   }
                }
             }
          }
       label_0378 :
          if (!PatchProxy.applyVoid(null, b, uof, "17")) {
             oi3 = i3.f();
             b.a(oi3);
             z = b.z;
             if (z == 2) {
                i = 1;
             }else if(z == 3){
                i = 0;
             }else {
                i = -1;
             }
             oi3.c("status", Integer.valueOf(i));
             z = b.B;
             str9 = Integer.MIN_VALUE;
             if (z != str9) {
                oi3.c("http_error_code", Integer.valueOf(z));
             }
             z = b.A;
             if (z != str9) {
                oi3.c("error_code", Integer.valueOf(z));
             }
             Object[] objArray2 = new Object[0];
             a.C().w(str2, "report, MerchantInterfaceReqStatus=["+oi3+str5, objArray2);
             u1.Y("MerchantInterfaceReqStatus", oi3.e(), 7);
          }
          return;
       }
    }
    public void h(b p0){
       this.w = p0;
    }
    public void i(String p0){
       this.x = p0;
    }
    public void j(boolean p0){
       this.y = p0;
    }
    public final boolean k(){
       f obj = PatchProxy.apply(null, this, f.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       boolean b = true;
       if (obj == null || obj.a() != b) {
          b = false;
       }
       return b;
    }
    public void onPerfLogFragmentEvent(int p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().w("MerchantPagePerfLogger", "onPerfLogFragmentEvent, page="+this.k.C1()+" event="+p0+" type="+p1, objArray);
       if (p0) {
          int i = 1;
          if (p0 == i && p1 == i) {
             this.b = SystemClock.elapsedRealtime();
             f tk = this.k;
             if (tk instanceof MerchantRecycleFragment && (tk.Gh() && !this.k.K0())) {
                Object[] objArray1 = new Object[0];
                a.C().w("MerchantPagePerfLogger", "onPerfLogFragmentEvent lazyInit", objArray1);
                this.r = this.k.gh().subscribe(new d(this), Functions.e);
             }else if(this.k.getDispatchDrawObservable() != null){
                this.q = this.k.getDispatchDrawObservable().subscribe(new j(this), Functions.e);
             }
          }
       }else if(!p1){
          this.a = SystemClock.elapsedRealtime();
       }
       return;
    }
}
