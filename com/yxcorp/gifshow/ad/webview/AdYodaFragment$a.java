package com.yxcorp.gifshow.ad.webview.AdYodaFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$c;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.ad.webview.l;
import k59.v1;
import java.lang.Runnable;
import ekd.k1;

public class AdYodaFragment$a implements KwaiYodaWebView$c	// class@00189a
{
    public final AdYodaFragment a;

    public void AdYodaFragment$a(AdYodaFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment$a.class, "1")) {
          return;
       }
       Iterator iterator = this.a.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       if (!this.a.q.v()) {
          return;
       }
       k1.o(new v1(this));
       return;
    }
}
