package com.kwai.yoda.helper.WebViewMemOptHelper$b;
import o97.b;
import java.lang.Object;
import java.lang.String;
import com.kwai.yoda.helper.WebViewMemOptHelper$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.yoda.helper.WebViewMemOptHelper;

public final class WebViewMemOptHelper$b implements b	// class@001260
{

    public void WebViewMemOptHelper$b(){
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewMemOptHelper$b.class, "1")) {
       }else {
          a.q(p0, "key");
          if (p1 != null) {
             WebViewMemOptHelper.f = p1;
          }
       }
       return;
    }
}
