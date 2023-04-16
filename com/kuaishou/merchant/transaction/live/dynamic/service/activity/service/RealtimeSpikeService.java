package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService;
import oj4.a;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.String;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$mDataProducer$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vd4.b;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$e;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$f;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.rx.RxBus;
import wd4.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import nj4.a;
import java.lang.Boolean;
import java.lang.Exception;
import java.lang.Throwable;
import com.google.gson.JsonObject;
import pe4.a;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Integer;
import com.kuaishou.merchant.transaction.base.logger.MerchantTransactionLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import com.yxcorp.utility.SystemUtil;
import jc4.f;
import java.lang.CharSequence;
import mj4.g;
import p14.e;
import t45.d;
import brd.z;
import mj4.h;
import erd.r;
import mj4.i;
import erd.o;
import mj4.j;
import mj4.k;
import z1.k;
import p14.f;
import mj4.l;
import mj4.m;
import mj4.n;
import mj4.o;
import mj4.f;
import gd4.d;
import rk0.b;
import gd4.d$a;
import java.util.Map;
import lk4.b;
import lk4.a;
import java.util.LinkedHashMap;
import mj4.b;
import cjd.e;
import mj4.c;
import mj4.d;
import mj4.e;
import erd.a;
import java.util.concurrent.TimeUnit;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$d;
import java.lang.Runnable;
import ekd.k1;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeSpikeService$b;
import vd4.n;
import vd4.n$a;

public final class RealtimeSpikeService extends a	// class@0007ce
{
    public a A;
    public final p B;
    public final k C;
    public boolean D;
    public int E;
    public final String F;
    public static final RealtimeSpikeService$a G;

    static {
       RealtimeSpikeService.G = new RealtimeSpikeService$a(null);
    }
    public void RealtimeSpikeService(Fragment p0,int p1,int p2,String p3){
       super(p0, p1, p2);
       this.F = p3;
       this.B = s.c(new RealtimeSpikeService$mDataProducer$2(this));
       this.C = new RealtimeSpikeService$c(this);
    }
    public final void B9(){
       RealtimeSpikeService realtimeSpik = RealtimeSpikeService.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, realtimeSpik, "5")) {
          return;
       }
       if (this.D == null) {
          return;
       }
       this.k9("RealtimeSpikeService: 开启服务");
       t ot = PatchProxy.apply(objArray, this, realtimeSpik, "1");
       if (ot == PatchProxyResult.class) {
          ot = this.B.getValue();
       }
       this.X7(ot.subscribe(new RealtimeSpikeService$e(this), new RealtimeSpikeService$f(this)));
       if (!this.s9()) {
          this.k9("RealtimeSpikeService: 暂停商详的轮询服务");
          RxBus.f.b(new b(b.b));
       }
       return;
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RealtimeSpikeService.class, "4")) {
          return;
       }
       boolean b = true;
       this.D = b;
       super.E8();
       RealtimeSpikeService tA = this.A;
       a.m(tA);
       Objects.requireNonNull(tA);
       a obj = PatchProxy.apply(objArray, tA, a.class, "1");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = tA.saleType;
          if (obj != 3 && (obj != 8 || !tA.f())) {
             b = false;
          }
       }
       if (!b) {
          this.k9("RealtimeSpikeService: onBind: 不满足数据条件，尝试关停服务");
          this.x9();
          return;
       }else {
          this.B9();
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService.class, "2")) {
          return;
       }
       super.F8();
       this.k9("RealtimeSpikeService: service created");
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService.class, "14")) {
          return;
       }
       super.H8();
       if (!this.s9()) {
          this.k9("RealtimeSpikeService: 恢复商详轮询");
          RxBus.f.b(new b(b.c));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService.class, "13")) {
          return;
       }
       String str = "RealtimeSpikeService: onUnbind";
       try{
          this.k9(str);
          super.J8();
       }catch(java.lang.Exception e0){
          this.h9(e0.getMessage(), e0);
       }
       this.D = false;
       return;
    }
    public String a9(){
       return "realtimeActivityStateManager";
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService.class, "3")) {
          return;
       }
       super.j8();
       this.A = this.q8(a.class);
       return;
    }
    public JsonObject o9(){
       JsonObject jsonObject;
       RealtimeSpikeService obj = PatchProxy.apply(null, this, RealtimeSpikeService.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.A;
       if (obj != null) {
          jsonObject = obj.a();
          if (jsonObject != null) {
          label_0020 :
             return jsonObject;
          }
       }
       jsonObject = new JsonObject();
       goto label_0020 ;
    }
    public int q9(){
       boolean b1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RealtimeSpikeService obj = PatchProxy.apply(objArray, this, RealtimeSpikeService.class, "9");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.A;
       int i = 1;
       if (obj != null) {
          JsonObject jsonObject = obj.a();
          if (jsonObject != null) {
             JsonElement obj1 = PatchProxy.applyOneRefs(jsonObject, objArray, uoa, "2");
             boolean b = false;
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                try{
                   obj1 = jsonObject.e0("soldStock");
                   Integer integer1 = (obj1 != null)? Integer.valueOf(obj1.p()): objArray;
                   JsonElement jsonElement1 = jsonObject.e0("originalStock");
                   Integer integer2 = (jsonElement1 != null)? Integer.valueOf(jsonElement1.p()): objArray;
                   JsonElement jsonElement2 = jsonObject.e0("reserveStock");
                   Integer integer3 = (jsonElement2 != null)? Integer.valueOf(jsonElement2.p()): objArray;
                   if (integer1 != null && (integer2 != null && (integer3 != null && (integer1.intValue() < integer2.intValue() && integer3.intValue() <= 0)))) {
                      b1 = true;
                   }
                }catch(java.lang.Exception e5){
                   a.g(MerchantTransactionLogBiz.BASE, "JsonObject", "计算是否真抢光失败，原因："+e5.getMessage());
                }
             label_0084 :
                b1 = false;
             }
             if (b1) {
                i = 3;
             }else {
                try{
                   JsonElement obj2 = PatchProxy.applyOneRefs(jsonObject, objArray, uoa, "1");
                   if (obj2 != patchProxyRe) {
                      b = obj2.booleanValue();
                   }else {
                      obj2 = jsonObject.e0("soldStock");
                      Integer integer = (obj2 != null)? Integer.valueOf(obj2.p()): objArray;
                      JsonElement jsonElement = jsonObject.e0("originalStock");
                      if (jsonElement != null) {
                         objArray = Integer.valueOf(jsonElement.p());
                      }
                      if (integer != null && (objArray != null && integer.intValue() >= objArray.intValue())) {
                         b = true;
                      }
                   }
                }catch(java.lang.Exception e0){
                   a.g(MerchantTransactionLogBiz.BASE, "JsonObject", "计算是否真抢光失败，原因："+e0.getMessage());
                }
                if (b) {
                   i = 4;
                }
             }
          }
       }
       return i;
    }
    public String t9(){
       return "spike";
    }
    public final t u9(){
       String str2;
       g a;
       RealtimeSpikeService tA;
       String str3;
       t ot;
       z a1;
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RealtimeSpikeService obj = PatchProxy.apply(objArray, this, RealtimeSpikeService.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = 1;
       if (this.s9() == str) {
          String str1 = "enablePurchasePanelSignalFilter";
          boolean b = false;
          if (SystemUtil.I() || f.a(str1, b)) {
             obj = this.F;
             str2 = (obj == null || !obj.length())? 1: null;
             if (!str2) {
                this.k9("RealtimeSpikeService: 创建信令数组Producer");
                a = g.a;
                obj = this.A;
                a.m(obj);
                str2 = obj.d();
                a.m(str2);
                tA = this.A;
                a.m(tA);
                str3 = tA.b();
                a.m(str3);
                RealtimeSpikeService tC = this.C;
                RealtimeSpikeService tF = this.F;
                Objects.requireNonNull(a);
                ot = PatchProxy.applyFourRefs(str2, str3, tC, tF, a, g.class, "2");
                if (ot != patchProxyRe) {
                }else {
                   a1 = d.a;
                   ot1 = RxBus.f.f(e.class).observeOn(a1).subscribeOn(a1);
                   ot = ot1.filter(h.b).map(new i(str2, str3, tF)).filter(j.b).map(new k(tC));
                }
             }
          }
          if (f.a(str1, b)) {
             obj = this.F;
             if (obj != null && obj.length()) {
                str = null;
             }
             if (str) {
                b.j9(this, "RealtimeSpikeService: 无liveStreamId->降级创建单信令Producer", objArray, 2, objArray);
             }
          }
          this.k9("RealtimeSpikeService: 使用单个信令通道");
          g a2 = g.a;
          obj = this.A;
          a.m(obj);
          str2 = obj.d();
          a.m(str2);
          tA = this.A;
          a.m(tA);
          String str4 = tA.b();
          a.m(str4);
          RealtimeSpikeService tC1 = this.C;
          Objects.requireNonNull(a2);
          ot = PatchProxy.applyThreeRefs(str2, str4, tC1, a2, g.class, "1");
          if (ot != patchProxyRe) {
          }else {
             a1 = d.a;
             ot1 = RxBus.f.f(f.class).observeOn(a1).subscribeOn(a1);
             ot1 = ot1.filter(l.b).map(m.b).filter(new n(str2, str4)).map(new o(tC1));
          label_011f :
             ot = ot1;
          }
       }else {
          this.k9("RealtimeSpikeService: 使用接口轮询通道");
          f b1 = f.b;
          tA = this.A;
          a.m(tA);
          str3 = tA.b();
          a.m(str3);
          Map map = d.n.a(this.R8()).y0();
          tA = this.A;
          a.m(tA);
          a reqParam = tA.reqParam;
          int i = this.R8().hashCode();
          Objects.requireNonNull(b1);
          if (PatchProxy.isSupport(f.class)) {
             ot = PatchProxy.applyFourRefs(str3, map, reqParam, Integer.valueOf(i), b1, f.class, "1");
             if (ot != patchProxyRe) {
             }
          }
          b uob = a.a();
          LinkedHashMap linkedHashMa = PatchProxy.applyTwoRefs(map, reqParam, b1, f.class, "2");
          if (linkedHashMa != patchProxyRe) {
          }else {
             linkedHashMa = new LinkedHashMap();
             linkedHashMa.putAll(map);
             linkedHashMa.remove("id");
             linkedHashMa.put("sceneType", "SEK_KILL");
             if (reqParam != null) {
                linkedHashMa.putAll(reqParam);
             }
          }
          ot1 = uob.f(str3, linkedHashMa).repeatWhen(new b(i)).map(new e()).doOnNext(new c(i)).map(d.b).doFinally(new e(i)).delaySubscription(3000, TimeUnit.MILLISECONDS);
          goto label_011f ;
       }
       return ot;
    }
    public final void x9(){
       if (PatchProxy.applyVoid(null, this, RealtimeSpikeService.class, "12")) {
          return;
       }
       this.k9("RealtimeSpikeService: 延迟0秒关停服务");
       k1.r(new RealtimeSpikeService$d(this), 0);
       return;
    }
    public final void y9(boolean p0){
       long l;
       RealtimeSpikeService realtimeSpik = RealtimeSpikeService.class;
       if (PatchProxy.isSupport(realtimeSpik) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, realtimeSpik, "7")) {
          return;
       }
       this.k9("RealtimeSpikeService: refreshPage: post="+p0);
       if (p0) {
          RealtimeSpikeService$b uob = new RealtimeSpikeService$b(this.R8(), this.b9());
          realtimeSpik = this.A;
          if (realtimeSpik != null) {
             a.m(realtimeSpik);
             l = realtimeSpik.c();
          }else {
             l = 0;
          }
          k1.r(uob, l);
       }else {
          n.z.b(this.b9(), 800, null, null);
       }
       return;
    }
}
