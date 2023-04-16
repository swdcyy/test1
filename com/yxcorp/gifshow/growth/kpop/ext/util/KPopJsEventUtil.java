package com.yxcorp.gifshow.growth.kpop.ext.util.KPopJsEventUtil;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import fg6.a;
import com.yxcorp.gifshow.growth.kpop.ext.util.KPopJsEventUtil$StateInfo;
import com.google.gson.Gson;
import com.kwai.yoda.event.d;
import com.kwai.yoda.bridge.YodaBaseWebView;

public final class KPopJsEventUtil	// class@001417
{
    public static final KPopJsEventUtil a;

    static {
       KPopJsEventUtil.a = new KPopJsEventUtil();
    }
    public void KPopJsEventUtil(){
       super();
    }
    public final void a(int p0){
       KPopJsEventUtil kPopJsEventU = KPopJsEventUtil.class;
       if (PatchProxy.isSupport(kPopJsEventU) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, kPopJsEventU, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       w.C().w("KPopJsEventUtil", "dispatchJsEvent state="+p0, objArray);
       d.f().c(null, "KwaiBubbleStateChange", a.a.q(new KPopJsEventUtil$StateInfo(p0)));
       return;
    }
}
