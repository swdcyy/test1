package com.yxcorp.gifshow.webview.api.EnhancedWebView;
import com.kuaishou.webkit.WebView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.f1;

public abstract class EnhancedWebView extends WebView	// class@0016f9
{

    public void EnhancedWebView(Context p0){
       super(p0);
       this.k(p0);
    }
    public void EnhancedWebView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.k(p0);
    }
    public void EnhancedWebView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.k(p0);
    }
    public void k(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EnhancedWebView.class, "1")) {
          return;
       }
       f1.a();
       return;
    }
    public abstract void setProgressVisibility(int p0);
}
