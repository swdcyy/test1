package com.yxcorp.gifshow.activity.web.OperateWebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.activity.web.OperateWebViewFragment;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebSettings;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Boolean;
import isa.a;
import fw8.d;
import uh5.e;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Configuration;
import zf6.l;
import kx8.k;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.activity.web.b;
import r97.d0;

public class OperateWebViewFragment$b implements WebViewFragment$b	// class@0014b6
{
    public final OperateWebViewFragment b;

    public void OperateWebViewFragment$b(OperateWebViewFragment p0){
       this.b = p0;
       super();
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public boolean J(WebView p0,String p1){
       return false;
    }
    public String T1(){
       return g.c(this);
    }
    public void w1(WebViewFragment p0,WebView p1){
       boolean b;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OperateWebViewFragment$b.class, "1")) {
          return;
       }
       OperateWebViewFragment$b tb = this.b;
       int i = tb.Ph(tb.getContext());
       WebSettings settings = p1.getSettings();
       StringBuilder str = p1.getSettings().getUserAgentString()+" TBHT/"+i+" FTSFHT/"+i+" FBSFHT/";
       OperateWebViewFragment$b tb1 = this.b;
       Objects.requireNonNull(tb1);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.apply(null, tb1, OperateWebViewFragment.class, "2");
       int i1 = 0;
       if (obj != patchProxyRe) {
          i1 = obj.intValue();
       }else {
          obj = PatchProxy.apply(null, tb1, OperateWebViewFragment.class, "7");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             OperateWebViewFragment g = tb1.G;
             b = (g != null && d.a(g.k()))? true: false;
          }
          if (!b) {
             i1 = e.c();
          }
       }
       settings.setUserAgentString(str+i1);
       if (p1 instanceof KwaiYodaWebView) {
          p1.setOnOverScrolledCallBack(this.b.H);
       }
       l.t(a.a().a(), "13");
       tb1 = this.b;
       Objects.requireNonNull(tb1);
       if (!PatchProxy.applyVoid(null, tb1, OperateWebViewFragment.class, "12") && k.a()) {
          tb1.Ch().setClientLogCallback(new b(tb1));
       }
       return;
    }
}
