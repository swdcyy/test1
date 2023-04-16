package com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantCashierModule$a;
import la4.b;
import com.kuaishou.merchant.transaction.live.orderconfirmpanel.rnbridge.MerchantCashierModule;
import com.facebook.react.bridge.Callback;
import java.lang.Object;
import java.lang.Exception;
import la4.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import pk4.a;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.f;
import lnc.i3;
import java.lang.Boolean;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import com.kuaishou.merchant.KernelsLogBiz;
import java.lang.RuntimeException;
import p74.a;
import java.lang.Throwable;
import o74.a;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public class MerchantCashierModule$a implements b	// class@000849
{
    public final Callback b;
    public final MerchantCashierModule c;

    public void MerchantCashierModule$a(MerchantCashierModule p0,Callback p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void a(Exception p0){
       a.b(this, p0);
    }
    public void b(){
       h.h(this);
    }
    public void d(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, MerchantCashierModule$a.class, str)) {
          return;
       }
       MerchantCashierModule$a tb = this.b;
       int i = 1;
       Object[] objArray1 = new Object[i];
       ReactApplicationContext reactApplica = this.c.getReactApplicationContext();
       String str1 = PatchProxy.applyOneRefs(reactApplica, objArray, a.class, str);
       if (str1 != PatchProxyResult.class) {
       }else if(reactApplica == null){
          str1 = "";
       }else {
          f unionPay = PayManager.getInstance().getUnionPay();
          i3 oi3 = i3.f();
          oi3.a("installWechatSdk", Boolean.valueOf(PayManager.getInstance().isSupportWechatPay()));
          oi3.a("installAlipaySdk", Boolean.valueOf(PayManager.getInstance().isSupportAlipay()));
          oi3.a("installWechat", Boolean.valueOf(SystemUtil.U(reactApplica)));
          oi3.a("installAlipay", Boolean.valueOf(SystemUtil.M(reactApplica, "com.eg.android.AlipayGphone")));
          Boolean uBoolean = Boolean.valueOf(PayManager.getInstance().isSupportUnionPay());
          try{
             oi3.a("installUnionPaySdk", uBoolean);
             if (unionPay == null || !unionPay.b(reactApplica)) {
                i = false;
             }
             oi3.a("installUnionPay", Boolean.valueOf(i));
          }catch(java.lang.RuntimeException e1){
             a.l(KernelsLogBiz.LIVE_MERCHANT_PAYMENT, "LiveMerchantPaymentUtil", e1.getMessage(), e1);
          }
          str1 = oi3.toString();
       }
       objArray1[0] = str1;
       tb.invoke(objArray1);
       return;
    }
    public void e(){
       a.a(this);
    }
    public void f(boolean p0){
       h.d(this, p0);
    }
    public void n(PluginInstallerUIHandler$e p0){
       h.a(this, p0);
    }
    public void o(){
       h.b(this);
    }
    public void onStart(){
       a.c(this);
    }
    public void p(){
       h.c(this);
    }
}
