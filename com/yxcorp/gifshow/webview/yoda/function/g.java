package com.yxcorp.gifshow.webview.yoda.function.g;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.webview.yoda.function.g$a;
import erd.g;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import txc.c;
import q87.c;
import vxc.e;
import com.yxcorp.gifshow.webview.bridge.a;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public class g extends c	// class@0017bc
{
    public g$a f;
    public g g;

    public void g(g$a p0){
       super();
       this.f = p0;
    }
    public void g(g p0){
       super();
       this.g = p0;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(g.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, g.class, "1")) {
             return;
          }
       }
       try{
          if (!p0 instanceof KwaiYodaWebView) {
             Object[] objArray1 = new Object[0];
             c.C().w("KwaiGlobalFunction", "is not KwaiYodaWebVIew", objArray1);
             return;
          }else {
             e jsInjectKwai = p0.getJsInjectKwai();
             if (jsInjectKwai instanceof a && !PatchProxy.applyVoidTwoRefs(jsInjectKwai, p3, this, g.class, "2")) {
                g tg = this.g;
                if (tg != null) {
                   tg.accept(jsInjectKwai);
                }else {
                   tg = this.f;
                   if (tg != null) {
                      tg.a(jsInjectKwai, p3);
                   }
                }
             }
             return;
          }
       }catch(java.lang.Exception e5){
          throw new YodaException(0x1e84a, e5.getMessage());
       }
    }
}
