package com.yxcorp.gifshow.webview.helper.H5ImageRenderHelper$PhantomWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import android.content.Context;
import com.kwai.yoda.bridge.YodaBaseWebView;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.yoda.g;
import com.kuaishou.webkit.WebViewClient;
import tkd.b;
import tkd.d;
import vxc.f;
import vxc.e;
import com.yxcorp.gifshow.webview.view.c;
import java.lang.Object;
import java.lang.String;

public class H5ImageRenderHelper$PhantomWebView extends KwaiYodaWebView	// class@001754
{
    public int u;
    public int v;

    public void H5ImageRenderHelper$PhantomWebView(Context p0){
       super(p0);
       this.setVisibility(4);
       this.setEnabled(false);
       this.setDrawingCacheEnabled(true);
       JsNativeEventCommunication jsNativeEven = new JsNativeEventCommunication(p0, this);
       g og = new g(this);
       og.A(jsNativeEven);
       this.setWebViewClient(og);
       e uoe = d.a(-1995910978).gL();
       uoe.d(p0, this, null, jsNativeEven);
       this.addJavascriptInterface(uoe, "Kwai");
    }
    public int getImageHeight(){
       return this.v;
    }
    public int getImageWidth(){
       return this.u;
    }
    public void setImageHeight(int p0){
       this.v = p0;
    }
    public void setImageWidth(int p0){
       this.u = p0;
    }
}
