package com.yxcorp.gifshow.webview.yoda.function.i;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.webview.yoda.function.i$a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Exception;

public class i extends c	// class@0017bf
{
    public i$a f;

    public void i(i$a p0){
       super();
       this.f = p0;
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, oi, "1")) {
             return;
          }
       }
       try{
          if (!p0 instanceof YodaBaseWebView) {
             return;
          }else {
             i tf = this.f;
             if (tf != null) {
                tf.a(p0, p1, p2, p3, p4);
             }
             return;
          }
       }catch(java.lang.Exception e8){
          throw new YodaException(0x1e84a, e8.getMessage());
       }
    }
}
