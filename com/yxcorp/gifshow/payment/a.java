package com.yxcorp.gifshow.payment.a;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.payment.GatewayPayBaseInitModule;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xf6.h;
import dwb.j;
import java.lang.StringBuilder;
import q87.c;

public final class a implements x	// class@000e39
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       String str = PatchProxy.apply(null, null, GatewayPayBaseInitModule.class, "4");
       if (str != PatchProxyResult.class) {
       }else {
          str = h.c();
          Object[] objArray = new Object[0];
          j.C().w("GatewayPayInitModule", "GatewayDebugHost: "+str, objArray);
       }
       return str;
    }
}
