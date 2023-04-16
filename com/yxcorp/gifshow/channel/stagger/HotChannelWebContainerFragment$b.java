package com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$b;

public class HotChannelWebContainerFragment$b implements WebViewFragment$b	// class@00105c
{
    public final HotChannelWebContainerFragment b;

    public void HotChannelWebContainerFragment$b(HotChannelWebContainerFragment p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotChannelWebContainerFragment$b.class, "1")) {
          return;
       }
       if (p1 instanceof KwaiYodaWebView) {
          p1.setOnOverScrolledCallBack(this.b.w);
       }
       return;
    }
}
