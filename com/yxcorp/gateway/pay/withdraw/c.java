package com.yxcorp.gateway.pay.withdraw.c;
import tv8.a;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import java.lang.String;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tv8.d;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import com.yxcorp.gateway.pay.withdraw.b;
import erd.o;
import com.yxcorp.gateway.pay.service.GatewayPayApiService;
import lv8.o;
import iv8.a;
import lv8.n;
import tv8.b;
import tv8.c;

public class c extends a	// class@0012d8
{

    public void c(BaseActivity p0){
       super(p0);
    }
    public t a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(new d(this, p0)).subscribeOn(d.c).observeOn(d.a).flatMap(b.b);
    }
    public t a(String p0,String p1){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, c.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = "alipay";
       t ot = PatchProxy.applyThreeRefs(obj, p0, p1, this, a.class, "1");
       if (ot != patchProxyRe) {
       }else {
          ot = o.a().authParams(obj, p0, p1);
       }
       return ot.map(new a()).observeOn(n.b).map(new b(this)).observeOn(n.a).flatMap(new c(this, p0, p1));
    }
}
