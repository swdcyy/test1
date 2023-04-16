package com.kwai.yoda.bridge.g$a;
import com.kwai.yoda.bridge.g$b;
import com.kwai.yoda.bridge.g;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import rx7.e0;
import android.graphics.Bitmap;
import com.kuaishou.webkit.WebResourceRequest;
import com.kuaishou.webkit.WebResourceResponse;

public class g$a implements g$b	// class@001190
{
    public final g a;

    public void g$a(g p0){
       this.a = p0;
       super();
    }
    public void H(WebView p0,String p1,boolean p2){
       e0.c(this, p0, p1, p2);
    }
    public void O(WebView p0,String p1,Bitmap p2){
       e0.e(this, p0, p1, p2);
    }
    public void q0(WebView p0,int p1,String p2,String p3){
       e0.b(this, p0, p1, p2, p3);
    }
    public void r0(WebView p0,WebResourceRequest p1,WebResourceResponse p2){
       e0.d(this, p0, p1, p2);
    }
    public void s0(WebView p0){
       e0.a(this, p0);
    }
}
