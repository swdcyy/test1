package com.kuaishou.merchant.basic.MerchantYodaHostSwitchWebViewClient;
import ym4.d;
import com.kuaishou.merchant.basic.MerchantYodaHostSwitchWebViewClient$a;
import nsd.u;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import fjd.b;
import jb6.d;
import java.util.List;
import bb6.c;
import bjd.d;
import bb6.c$b;
import com.kuaishou.merchant.basic.MerchantYodaHostSwitchWebViewClient$mUrlStructure$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.util.Collection;
import ekd.q;
import jt3.g;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import lnc.i3;
import java.lang.Number;
import android.net.Uri;
import k2b.u1;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import bb6.d;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import com.kwai.framework.network.cdn.CdnHostGroupType;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kwai.logger.KwaiLog;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kuaishou.merchant.basic.MerchantWebViewEvent;
import com.kuaishou.merchant.basic.MerchantWebViewEvent$EventType;
import com.kuaishou.webkit.WebView;
import com.kwai.sdk.switchconfig.a;
import com.kwai.yoda.bridge.g;
import yz7.d;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;

public final class MerchantYodaHostSwitchWebViewClient extends d	// class@00159f
{
    public String o;
    public final b p;
    public final List q;
    public final d r;
    public final p s;
    public int t;
    public static final MerchantYodaHostSwitchWebViewClient$a u;

    static {
       MerchantYodaHostSwitchWebViewClient.u = new MerchantYodaHostSwitchWebViewClient$a(null);
    }
    public void MerchantYodaHostSwitchWebViewClient(YodaBaseWebView p0,String p1){
       super(p0, p1);
       b uob = d.a();
       this.p = uob;
       List list = uob.d("merchant");
       this.q = list;
       this.r = c.b.a();
       this.s = s.c(new MerchantYodaHostSwitchWebViewClient$mUrlStructure$2(this));
       int i = (!q.f(list))? list.size(): 5;
       this.t = i;
       return;
    }
    public String C(){
       return "MerchantYodaHostSwitchWebViewPage";
    }
    public final g H(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaHostSwitchWebViewClient.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public final void I(int p0,String p1){
       Uri uri;
       MerchantYodaHostSwitchWebViewClient merchantYoda = MerchantYodaHostSwitchWebViewClient.class;
       if (PatchProxy.isSupport(merchantYoda) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, merchantYoda, "5")) {
          return;
       }
       i3 oi3 = i3.f();
       oi3.c("errorCode", Integer.valueOf(p0));
       oi3.d("loadUrl", p1);
       String str = PatchProxy.applyOneRefs(p1, this, merchantYoda, "6");
       if (str != PatchProxyResult.class) {
       }else if(p1 == null || !p1.length()){
          uri = 1;
       }else {
          uri = null;
       }
       String str1 = "";
       if (!uri) {
          str = Uri.parse(p1).getHost();
          if (str == null) {
          }
       }
       oi3.d("Host", str);
       u1.Y("MERCHANT_H5_HOST_FAIL", oi3.e(), 7);
       return;
    }
    public final void J(String p0){
       this.o = p0;
    }
    public final void K(String p0){
       String host;
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantYodaHostSwitchWebViewClient.class, "4")) {
          return;
       }
       try{
          a.d(MerchantCommonLogBiz.KERNELS, "HostSwitchCdnWebView", "switch cdn host in progress");
          Iterator iterator = d.b.a().keySet().iterator();
          while (iterator.hasNext()) {
             CdnHostGroupType uCdnHostGrou = iterator.next();
             if (p0 != null) {
                host = Uri.parse(p0).getHost();
                if (host != null) {
                   this.r.g(uCdnHostGrou.getTypeName(), host);
                }
             }
          }
       }catch(java.lang.Exception e6){
          a.g(MerchantCommonLogBiz.KERNELS, "HostSwitchCdnWebView", "switched failed. "+e6);
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaHostSwitchWebViewClient.class, "8")) {
          return;
       }
       super.f();
       Object[] objArray = new Object[0];
       KwaiLog.m("KwaiLog", "MerchantYodaWebViewClient_onPageFinished", this.D(), objArray);
       RxBus.f.b(new MerchantWebViewEvent(MerchantWebViewEvent$EventType.Leave, this.D()));
       return;
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantYodaHostSwitchWebViewClient.class, "7")) {
          return;
       }
       super.onPageFinished(p0, p1);
       String originalUrl = p0.getOriginalUrl();
       if (originalUrl == null) {
          originalUrl = p1;
       }
       Object[] objArray = new Object[0];
       KwaiLog.m("KwaiLog", "MerchantYodaWebViewClient_onPageFinished", originalUrl, objArray);
       RxBus f = RxBus.f;
       MerchantWebViewEvent$EventType enter = MerchantWebViewEvent$EventType.Enter;
       String originalUrl1 = p0.getOriginalUrl();
       if (originalUrl1 != null) {
          p1 = originalUrl1;
       }
       f.b(new MerchantWebViewEvent(enter, p1));
       return;
    }
    public void onReceivedError(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(MerchantYodaHostSwitchWebViewClient.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, MerchantYodaHostSwitchWebViewClient.class, "2")) {
          return;
       }
       super.onReceivedError(p0, p1, p2, p3);
       if (!a.t().d("merchantH5HostSwitch", false)) {
          return;
       }
       MerchantCommonLogBiz kERNELS = MerchantCommonLogBiz.KERNELS;
       char c = ']';
       a.d(kERNELS, "HostSwitchCdnWebView", "onReceiveErrorLog\(\) called with: errorCode = ["+p1+c);
       YodaBaseWebView yodaBaseWebV = this.h(p0);
       if (d.b(yodaBaseWebV)) {
          return;
       }
       g og = null;
       String currentUrl = (yodaBaseWebV != null)? yodaBaseWebV.getCurrentUrl(): og;
       boolean b = TextUtils.equals(currentUrl, p3);
       a.d(kERNELS, "HostSwitchCdnWebView", "onReceiveErrorLog\(\) called with: mainRequest = ["+b+c);
       if (b && (p1 != -6 && (p1 == -2 || (p1 == -8 && this.t > null)))) {
          this.I(p1, p3);
          this.K(this.o);
          CdnHostGroupType uCdnHostGrou = this.H().a();
          if (uCdnHostGrou != null) {
             og = this.r.f(uCdnHostGrou.getTypeName(), this.H().d(), this.H().b(), this.H().c());
          }
          this.o = og;
          if (og == null) {
             return;
          }else if(yodaBaseWebV != null){
             yodaBaseWebV.loadUrl(og);
          }
          this.t = this.t - 1;
       }
    label_00cb :
       return;
    }
    public void onReceivedHttpError(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MerchantYodaHostSwitchWebViewClient.class, "3")) {
          return;
       }
       MerchantCommonLogBiz kERNELS = MerchantCommonLogBiz.KERNELS;
       String str = "HostSwitchCdnWebView";
       a.d(kERNELS, str, "onReceivedHttpErrorLog\(\) called with: errorResponse StatusCode = ["+p2.getStatusCode()+"]");
       super.onReceivedHttpError(p0, p1, p2);
       if (!a.t().d("merchantH5HostSwitch", false)) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.h(p0);
       if (d.b(yodaBaseWebV)) {
          return;
       }
       String str1 = p1.getUrl().toString();
       boolean b = TextUtils.equals(this.o, str1);
       a.d(kERNELS, str, "onReceivedHttpErrorLog\(\) called with: mainRequest = ["+b+']');
       if (b) {
          int statusCode = p2.getStatusCode();
          this.I(statusCode, str1);
          if (statusCode >= 500 && this.t > null) {
             this.K(this.o);
             CdnHostGroupType uCdnHostGrou = this.H().a();
             str1 = (uCdnHostGrou != null)? this.r.f(uCdnHostGrou.getTypeName(), this.H().d(), this.H().b(), this.H().c()): null;
             this.o = str1;
             if (str1 == null) {
                return;
             }else if(yodaBaseWebV != null){
                yodaBaseWebV.loadUrl(str1);
             }
             this.t = this.t - 1;
          }
       }
       return;
    }
}
