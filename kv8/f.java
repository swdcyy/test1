package kv8.f;
import kv8.a;
import android.app.Activity;
import java.lang.String;
import fv8.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.f;
import lv8.g;
import lv8.d;
import com.yxcorp.gateway.pay.response.UnionPayParams;
import com.google.gson.Gson;
import java.lang.ref.WeakReference;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.content.Intent;
import java.lang.Integer;
import ekd.j0;

public final class f extends a	// class@002c25
{
    public b b;

    public void f(Activity p0){
       super(p0);
    }
    public void a(String p0,b p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       this.b = p1;
       f unionPay = PayManager.getInstance().getUnionPay();
       String str = null;
       int i = 30;
       if (unionPay == null) {
          f tb = this.b;
          if (tb != null) {
             tb.onPayFinish(i, str);
          }
          g.d("unionPay failed, not support this PayType!");
          return;
       }else {
          try{
             unionPay.a(this.a.get(), 103, d.a.h(p0, UnionPayParams.class).mTradeNo, "00");
             return;
          }catch(com.google.gson.JsonSyntaxException e6){
             e6.printStackTrace();
             unionPay = this.b;
             if (unionPay != null) {
                unionPay.onPayFinish(i, str);
             }
             g.d("unionPay failed, payParams invalid: "+p0);
             return;
          }
       }
    }
    public boolean a(){
       Object obj = PatchProxy.apply(null, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return PayManager.getInstance().isSupportUnionPay();
    }
    public boolean b(int p0,int p1,Intent p2){
       f obj;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.b;
       boolean b = false;
       if (obj == null) {
          return b;
       }else if(p2 == null){
          obj.onPayFinish(2, null);
          return true;
       }else {
          String str = j0.f(p2, "pay_result");
          if (("success").equalsIgnoreCase(str)) {
             this.b.onPayFinish(true, null);
          }else if(("cancel").equalsIgnoreCase(str)){
             obj = this.b;
             b = 3;
          }else if(("fail").equalsIgnoreCase(str)){
             this.b.onPayFinish(2, null);
          }else {
             obj = this.b;
          }
          obj.onPayFinish(b, null);
          return true;
       }
    }
}
