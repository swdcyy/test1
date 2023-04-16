package com.yxcorp.gateway.pay.activity.a$a$a;
import com.kwai.yoda.bridge.g$b;
import com.yxcorp.gateway.pay.activity.a$a;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.webview.yoda.PayYodaWebView;
import java.util.Objects;
import gv8.i1;
import java.lang.Runnable;
import ekd.k1;
import java.util.HashMap;
import java.util.Map;
import nv8.e;
import android.graphics.Bitmap;
import gv8.j1;
import java.lang.Integer;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;
import rx7.e0;

public class a$a$a implements g$b	// class@001211
{
    public final a$a a;

    public void a$a$a(a$a p0){
       this.a = p0;
       super();
    }
    public void H(WebView p0,String p1,boolean p2){
       if (PatchProxy.isSupport(a$a$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.valueOf(p2), this, a$a$a.class, "2")) {
          return;
       }
       g.d("PayYodaWebViewFragment WebViewClient setupForFinish. isLoadSuccess="+p2+", url="+p1);
       if (p0 instanceof PayYodaWebView) {
          Objects.requireNonNull(p0);
          k1.o(new i1(p0));
       }
       HashMap hashMap = new HashMap();
       hashMap.put("result_name", "SUCCESS");
       e.e("webViewLoadFinishResult", hashMap, a$a.a(this.a));
       return;
    }
    public void O(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a$a.class, "1")) {
          return;
       }
       g.d("PayYodaWebViewFragment WebViewClient setupForLoading: url="+p1);
       if (p0 instanceof PayYodaWebView) {
          Objects.requireNonNull(p0);
          k1.o(new j1(p0));
       }
       return;
    }
    public void q0(WebView p0,int p1,String p2,String p3){
       if (PatchProxy.isSupport(a$a$a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, a$a$a.class, "3")) {
          return;
       }
       g.d("PayYodaWebViewFragment WebViewClient setupForError. errorCode="+p1+", description="+p2+", url="+p3);
       if (p0 instanceof PayYodaWebView) {
          Objects.requireNonNull(p0);
          k1.o(new i1(p0));
       }
       HashMap hashMap = new HashMap();
       hashMap.put("result_name", "FAIL");
       e.e("webViewLoadFinishResult", hashMap, a$a.a(this.a));
       return;
    }
    public void r0(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a$a.class, "4")) {
          return;
       }
       g.d("PayYodaWebViewFragment WebViewClient setupForHttpError");
       HashMap hashMap = new HashMap();
       hashMap.put("result_name", "FAIL");
       e.e("webViewLoadFinishResult", hashMap, a$a.a(this.a));
       return;
    }
    public void s0(WebView p0){
       e0.a(this, p0);
    }
}
