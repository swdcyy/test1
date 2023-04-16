package com.kuaishou.merchant.web.trilateral.b;
import ym4.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.app.Activity;
import cn4.a;
import java.lang.String;
import com.kuaishou.merchant.web.trilateral.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.webkit.WebView;
import n04.a;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import tkd.b;
import tkd.d;
import vs3.a;
import com.kwai.yoda.bridge.g;
import u07.t$a;
import u07.f;
import cn4.c;
import u07.u;
import cn4.d;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.sdk.switchconfig.a;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.app.H5PayCallback;
import wkd.b;
import ayc.g;
import com.yxcorp.gifshow.webview.api.EnhancedWebView$a;
import com.yxcorp.gifshow.webview.yoda.g;

public class b extends d	// class@0009e0
{
    public Activity o;
    public a p;
    public YodaBaseWebView q;
    public H5PayCallback r;

    public void b(YodaBaseWebView p0,Activity p1,a p2,String p3){
       super(p0, p3);
       this.r = new a(this);
       this.o = p1;
       this.p = p2;
       this.q = p0;
    }
    public String C(){
       return "MerchantTrilateralWebPage";
    }
    public final boolean H(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       b = (obj == null || obj.isFinishing())? true: false;
       return b;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.C().w("MerchantTrilateralYodaWebViewClient", "shouldOverrideUrlLoading:url="+p1, objArray);
       if (this.H() || TextUtils.x(p1)) {
          this.c();
          return super.shouldOverrideUrlLoading(p0, p1);
       }else if(this.p.d(p1)){
          if (this.p.b(p1)) {
             d.a(0x7074b578).a30(this.o, p1);
          }
          this.q(p1);
          return true;
       }else if(!this.p.c(p1)){
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "4") && !this.H()) {
             t$a uoa = f.e(new t$a(this.o));
             uoa.W0(R.string.arg_RES_7f103489);
             uoa.y0(R.string.arg_RES_7f103486);
             uoa.S0(R.string.arg_RES_7f103488);
             uoa.Q0(R.string.arg_RES_7f103487);
             uoa.u0(new c(this, p0));
             uoa.t0(new d(p0, p1));
             uoa.Y(PopupInterface.a);
          }
          this.q(p1);
          return true;
       }else {
          Object obj1 = PatchProxy.applyOneRefs(p1, this, uob, "2");
          if (obj1 != patchProxyRe) {
             i = obj1.booleanValue();
          }else {
             obj = new Object[i];
             a.C().w("MerchantTrilateralYodaWebViewClient", "shouldInterceptAliPayWithUrl start :url="+p1, obj);
             if (a.t().d("enableNativeAlipay", i)) {
                b = new PayTask(this.o).payInterceptorWithUrl(p1, true, this.r);
                Object[] objArray1 = new Object[i];
                a.C().w("MerchantTrilateralYodaWebViewClient", "shouldInterceptAliPayWithUrl, payInterceptorWithUrl, interceptAlipay =["+b+" ]", objArray1);
                i = b;
             }
          }
          if (i) {
             return true;
          }else {
             b.a(0x63531a27).a().a(p0, p1);
             this.c();
             return super.shouldOverrideUrlLoading(p0, p1);
          }
       }
    }
}
