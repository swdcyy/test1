package com.yxcorp.gateway.pay.webview.b$i;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Iterator;
import androidx.fragment.app.Fragment;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gateway.pay.webview.PayWebView;
import lv8.g;

public class b$i extends d	// class@001287
{
    public final b e;

    public void b$i(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$i.class, "1")) {
       }else {
          b$i oi = null;
          if (this.e.a.getSupportFragmentManager() != null && this.e.a.getSupportFragmentManager().getFragments() != null) {
             Iterator iterator = this.e.a.getSupportFragmentManager().getFragments().iterator();
             while (iterator.hasNext()) {
                if (iterator.next() != null) {
                   oi = 1;
                }
             }
          }
          if (!oi) {
             if (this.e.a.mWebView.canGoBack()) {
                this.e.a.mWebView.goBack();
             }else {
                g.d("PayJsInject popBack finish");
                this.e.a.finish();
             }
          }
       }
       return;
    }
}
