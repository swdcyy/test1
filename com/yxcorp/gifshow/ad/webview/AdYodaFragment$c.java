package com.yxcorp.gifshow.ad.webview.AdYodaFragment$c;
import myc.k;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.util.Iterator;
import java.util.List;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;

public class AdYodaFragment$c extends k	// class@00189c
{
    public final AdYodaFragment g;

    public void AdYodaFragment$c(AdYodaFragment p0,YodaBaseWebView p1){
       this.g = p0;
       super(p1);
    }
    public void onProgressChanged(WebView p0,int p1){
       AdYodaFragment$c uoc = AdYodaFragment$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "1")) {
          return;
       }
       super.onProgressChanged(p0, p1);
       Iterator iterator = this.g.j.iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0, p1);
       }
       return;
    }
}
