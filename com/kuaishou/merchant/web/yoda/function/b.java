package com.kuaishou.merchant.web.yoda.function.b;
import vxc.z;
import com.kuaishou.merchant.web.yoda.function.SelectIdCardFunction;
import com.kuaishou.webkit.WebView;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.io.Serializable;
import com.kuaishou.merchant.web.yoda.params.JsSelectIdCardParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.webview.helper.e;
import com.kuaishou.merchant.web.yoda.function.a;
import f55.g;
import com.kuaishou.merchant.basic.util.m;
import com.kuaishou.merchant.web.yoda.function.SelectIdCardFunction$Result;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.function.c;

public class b extends z	// class@0009e4
{
    public final YodaBaseWebView k;
    public final String l;
    public final String m;
    public final String n;
    public final SelectIdCardFunction o;

    public void b(SelectIdCardFunction p0,WebView p1,YodaBaseWebView p2,String p3,String p4,String p5){
       this.o = p0;
       this.k = p2;
       this.l = p3;
       this.m = p4;
       this.n = p5;
       super(p1);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else if(p0 != null){
          m.a(e.f(this.k), p0, new a(this));
       }else {
          SelectIdCardFunction$Result result = new SelectIdCardFunction$Result(null);
          result.mResult = 0x1e850;
          this.o.l(this.k, result, this.l, this.m, null, this.n);
       }
       return;
    }
}
