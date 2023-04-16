package com.kwai.yoda.helper.WebViewMemOptHelper$c;
import o97.b;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.yoda.helper.WebViewMemOptHelper;
import java.util.Map;

public final class WebViewMemOptHelper$c implements b	// class@001261
{

    public void WebViewMemOptHelper$c(){
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WebViewMemOptHelper$c.class, "1")) {
       }else {
          a.q(p0, "key");
          if (p1 != null) {
             WebViewMemOptHelper.g.f().put(p0, p1);
          }
       }
       return;
    }
}
