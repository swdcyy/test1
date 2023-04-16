package com.yxcorp.gifshow.webview.bridge.w$b;
import com.kwai.yoda.function.c;
import com.yxcorp.gifshow.webview.bridge.w$a;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import com.yxcorp.gifshow.webview.jsmodel.system.JsIsLowPhoneResult;
import com.kwai.yoda.function.FunctionResultParams;
import fu5.d;
import f55.c;
import com.kwai.bridge.a;

public class w$b extends c	// class@001737
{

    public void w$b(){
       super();
    }
    public void w$b(w$a p0){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(w$b.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, w$b.class, "1")) {
             return;
          }
       }
       JsIsLowPhoneResult jsIsLowPhone = new JsIsLowPhoneResult();
       jsIsLowPhone.mResult = 1;
       jsIsLowPhone.isLowPerformanceDevice = a.c(d.class).f();
       this.l(p0, jsIsLowPhone, p1, p2, null, p4);
       return;
    }
}
