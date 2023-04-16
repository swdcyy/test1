package com.kwai.live.gzone.bridge.function.d$a;
import vxc.z;
import com.kwai.live.gzone.bridge.function.d;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.utility.n;
import lnc.l1;
import android.widget.AbsoluteLayout;
import com.kwai.live.gzone.bridge.function.JsWebViewDisplayTypeParams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public class d$a extends z	// class@000c88
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final d o;

    public void d$a(d p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
       }else {
          boolean b = false;
          int i = (int)((float)n.k(this.e()) * 0x3f400000);
          int i1 = (int)((float)n.j(this.e()) * 0x3f400000);
          if (l1.a()) {
             if (this.k.getWidth() < i) {
             label_003f :
                b = true;
             }
          }else if(this.k.getHeight() < i1){
             goto label_003f ;
          }
          this.o.l(this.k, new JsWebViewDisplayTypeParams(b), this.l, this.m, null, this.n);
       }
       return;
    }
}
