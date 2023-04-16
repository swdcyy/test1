package com.kuaishou.nearby_poi.poi.manager.MTWebViewManager$a;
import com.kuaishou.webkit.WebViewClient;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceRequest;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.net.Uri;

public class MTWebViewManager$a extends WebViewClient	// class@000a28
{

    public void MTWebViewManager$a(){
       super();
    }
    public void onPageFinished(WebView p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MTWebViewManager$a.class, "3")) {
          return;
       }
       super.onPageFinished(p0, p1);
       return;
    }
    public void onPageStarted(WebView p0,String p1,Bitmap p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MTWebViewManager$a.class, "2")) {
          return;
       }
       super.onPageStarted(p0, p1, p2);
       return;
    }
    public boolean shouldOverrideUrlLoading(WebView p0,WebResourceRequest p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MTWebViewManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       p0.loadUrl(p1.getUrl().toString());
       return true;
    }
}
