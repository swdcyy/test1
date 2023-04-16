package com.kwai.live.gzone.activitybanner.a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.kwai.live.gzone.activitybanner.LiveGzoneAudienceActivityBannerPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.webkit.WebSettings;
import t37.k;
import android.view.View$OnTouchListener;

public class a implements WebViewFragment$b	// class@000c59
{
    public final LiveGzoneAudienceActivityBannerPresenter b;

    public void a(LiveGzoneAudienceActivityBannerPresenter p0){
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
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       p1.getSettings().setBuiltInZoomControls(false);
       p1.getSettings().setSupportZoom(false);
       p1.getSettings().setDisplayZoomControls(false);
       p1.setOnTouchListener(new k(this));
       return;
    }
}
