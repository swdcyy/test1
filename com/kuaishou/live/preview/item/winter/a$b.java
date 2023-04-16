package com.kuaishou.live.preview.item.winter.a$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.kuaishou.live.preview.item.winter.a;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;

public class a$b implements WebViewFragment$b	// class@000e61
{
    public final a b;

    public void a$b(a p0){
       this.b = p0;
       super();
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public String T1(){
       return g.c(this);
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "1")) {
          return;
       }
       p1.setEnabled(false);
       if (p1 instanceof KwaiYodaWebView) {
          p1.setDisableTouch(true);
       }
       return;
    }
}
