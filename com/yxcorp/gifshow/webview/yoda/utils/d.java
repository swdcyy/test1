package com.yxcorp.gifshow.webview.yoda.utils.d;
import xz7.c;
import java.lang.Object;
import java.util.Map;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.webview.cookie.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.retrofit.e;
import ua6.b;
import ua6.b$a;
import wkd.b;
import ia0.g;
import com.yxcorp.retrofit.f;
import com.yxcorp.gifshow.log.h;
import com.kwai.middleware.azeroth.Azeroth2;
import o97.a;

public final class d implements c	// class@0017cc
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = null;
       HashMap hashMap = PatchProxy.apply(objArray, objArray, g.class, "7");
       if (hashMap != PatchProxyResult.class) {
       }else {
          hashMap = new HashMap();
          if (e.h().e()) {
             hashMap.putAll(b.c.a().d());
          }else {
             b.a(-1961311520).e().d(hashMap);
          }
          g.g(hashMap);
          hashMap.put("sid", b.a(0x4b316083).getSessionId());
          a uoa = Azeroth2.B.q();
          if (uoa != null && (uoa.H5(objArray, "enable_ex_cl_cookie", false) && !hashMap.containsKey("cl"))) {
             hashMap.put("cl", "0");
          }
       }
    label_0076 :
       p0.putAll(hashMap);
       return;
    }
}
