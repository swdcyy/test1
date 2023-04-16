package com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService;
import oj4.a;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$a;
import nsd.u;
import androidx.fragment.app.Fragment;
import java.lang.String;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$mDataProducer$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vd4.b;
import kotlin.jvm.internal.a;
import java.util.Objects;
import nj4.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oj4.f;
import java.lang.Runnable;
import ekd.k1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.google.gson.JsonElement;
import java.lang.Integer;
import java.lang.StringBuilder;
import java.lang.Exception;
import java.lang.Throwable;
import brd.t;
import com.yxcorp.utility.SystemUtil;
import jc4.f;
import java.lang.CharSequence;
import mj4.p;
import com.yxcorp.gifshow.util.rx.RxBus;
import p14.e;
import t45.d;
import brd.z;
import mj4.q;
import erd.r;
import mj4.r;
import erd.o;
import mj4.s;
import mj4.t;
import p14.f;
import mj4.u;
import mj4.v;
import mj4.w;
import mj4.x;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$c;
import com.kuaishou.merchant.transaction.live.dynamic.service.activity.service.RealtimeWelfareService$d;
import erd.g;
import crd.b;

public final class RealtimeWelfareService extends a	// class@0007d4
{
    public a A;
    public final p B;
    public boolean C;
    public int D;
    public boolean E;
    public final String F;
    public static final RealtimeWelfareService$a G;

    static {
       RealtimeWelfareService.G = new RealtimeWelfareService$a(null);
    }
    public void RealtimeWelfareService(Fragment p0,int p1,int p2,String p3){
       super(p0, p1, p2);
       this.F = p3;
       this.B = s.c(new RealtimeWelfareService$mDataProducer$2(this));
    }
    public void E8(){
       RealtimeWelfareService realtimeWelf = RealtimeWelfareService.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, realtimeWelf, "4")) {
          return;
       }
       boolean b = true;
       this.C = b;
       super.E8();
       RealtimeWelfareService tA = this.A;
       a.m(tA);
       Objects.requireNonNull(tA);
       Object obj = PatchProxy.apply(objArray, tA, a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(tA.saleType == 6 && tA.f()){
          b = false;
       }
       if (!b) {
          this.k9("RealtimeWelfareService: onBind: 不满足数据条件，尝试关停服务");
          if (!PatchProxy.applyVoid(objArray, this, realtimeWelf, "12")) {
             this.k9("RealtimeWelfareService: 延迟0秒关停服务");
             k1.r(new f(this), 0);
          }
          return;
       }else {
          this.x9();
          return;
       }
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, RealtimeWelfareService.class, "2")) {
          return;
       }
       super.F8();
       this.k9("RealtimeWelfareService: service created");
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, RealtimeWelfareService.class, "14")) {
          return;
       }
       super.H8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, RealtimeWelfareService.class, "13")) {
          return;
       }
       super.J8();
       this.C = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, RealtimeWelfareService.class, "3")) {
          return;
       }
       super.j8();
       this.A = this.q8(a.class);
       return;
    }
    public JsonObject o9(){
       JsonObject jsonObject;
       RealtimeWelfareService obj = PatchProxy.apply(null, this, RealtimeWelfareService.class, "10");
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
       Integer integer;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RealtimeWelfareService.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = 1;
       int i1 = 2;
       try{
          RealtimeWelfareService tA = this.A;
          if (tA != null) {
             JsonObject jsonObject = tA.a();
             if (jsonObject != null) {
                JsonElement jsonElement = jsonObject.e0("soldStatus");
                if (jsonElement != null) {
                   integer = Integer.valueOf(jsonElement.p());
                label_0032 :
                   if (integer != null && !integer.intValue()) {
                      i = 2;
                   }
                }
             }
          }
          integer = objArray;
          goto label_0032 ;
       }catch(java.lang.Exception e3){
          b.j9(this, "RealtimeWelfareService: 返回兜底售卖状态，原因："+e3.getMessage(), objArray, i1, objArray);
       }
    label_0056 :
       return i;
    }
    public String t9(){
       return "welfare";
    }
    public final t u9(){
       p a;
       RealtimeWelfareService tA;
       t ot;
       t ot1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       RealtimeWelfareService obj = PatchProxy.apply(objArray, this, RealtimeWelfareService.class, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str = 1;
       String str1 = "enablePurchasePanelSignalFilter";
       boolean b = false;
       if (SystemUtil.I() || f.a(str1, b)) {
          obj = this.F;
          String str2 = (obj == null || !obj.length())? 1: null;
          if (!str2) {
             this.k9("RealtimeWelfareService: 创建信令数组Producer");
             a = p.a;
             obj = this.A;
             a.m(obj);
             str2 = obj.d();
             a.m(str2);
             tA = this.A;
             a.m(tA);
             String str3 = tA.b();
             a.m(str3);
             RealtimeWelfareService tF = this.F;
             Objects.requireNonNull(a);
             ot = PatchProxy.applyThreeRefs(str2, str3, tF, a, p.class, "2");
             if (ot != patchProxyRe) {
             }else {
                z a1 = d.a;
                ot1 = RxBus.f.f(e.class).observeOn(a1).subscribeOn(a1);
                ot = ot1.filter(q.b).map(new r(str2, str3, tF)).filter(s.b).map(t.b);
             }
          }else if(f.a(str1, b)){
             obj = this.F;
             if (obj != null && obj.length()) {
                str = null;
             }
             if (str) {
                b.j9(this, "RealtimeWelfareService: 无liveStreamId->降级创建单信令Producer", objArray, 2, objArray);
             }
          }
          this.k9("RealtimeWelfareService: 使用单个信令通道");
          p a2 = p.a;
          tA = this.A;
          a.m(tA);
          String str4 = tA.d();
          a.m(str4);
          RealtimeWelfareService tA1 = this.A;
          a.m(tA1);
          str = tA1.b();
          a.m(str);
          Objects.requireNonNull(a2);
          z obj1 = PatchProxy.applyTwoRefs(str4, str, a2, p.class, "1");
          if (obj1 != patchProxyRe) {
             ot = obj1;
          }else {
             obj1 = d.a;
             ot1 = RxBus.f.f(f.class).observeOn(obj1).subscribeOn(obj1);
             ot = ot1.filter(u.b).map(v.b).filter(new w(str4, str)).map(x.b);
          }
       }else {
          goto label_0094 ;
       }
       return ot;
    }
    public final void x9(){
       RealtimeWelfareService realtimeWelf = RealtimeWelfareService.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, realtimeWelf, "5")) {
          return;
       }
       if (this.C == null) {
          return;
       }
       this.k9("RealtimeWelfareService: 开启服务");
       t ot = PatchProxy.apply(objArray, this, realtimeWelf, "1");
       if (ot == PatchProxyResult.class) {
          ot = this.B.getValue();
       }
       this.X7(ot.subscribe(new RealtimeWelfareService$c(this), new RealtimeWelfareService$d(this)));
       return;
    }
}
