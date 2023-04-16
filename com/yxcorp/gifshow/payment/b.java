package com.yxcorp.gifshow.payment.b;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.payment.GatewayPayBaseInitModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import dwb.j;
import java.lang.StringBuilder;
import q87.c;

public final class b implements x	// class@000e3f
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       Boolean uBoolean = PatchProxy.apply(null, null, GatewayPayBaseInitModule.class, "5");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          boolean b = a.t().d("kspayCookieSecure", true);
          Object[] objArray = new Object[0];
          j.C().w("GatewayPayInitModule", "KspayCookieSecure: "+b, objArray);
          uBoolean = Boolean.valueOf(b);
       }
       return uBoolean;
    }
}
