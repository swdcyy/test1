package com.yxcorp.gifshow.featured.detail.featured.preinit.c;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.featured.detail.featured.preinit.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import z56.e;
import com.kwai.sdk.switchconfig.a;

public final class c implements x	// class@000f4e
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object get(){
       Object obj = PatchProxy.apply(null, null, f.class, "3");
       boolean b = true;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(e.a()){
          b = false;
       }else if(e.b() || e.c()){
          b = b ^ a.t().d("disableFeaturedPreReq", false);
       }
       return Boolean.valueOf(b);
    }
}
