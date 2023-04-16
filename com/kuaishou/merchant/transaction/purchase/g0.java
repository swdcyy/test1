package com.kuaishou.merchant.transaction.purchase.g0;
import erd.o;
import java.lang.Object;
import com.google.gson.JsonObject;
import vm4.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import vm4.c;
import sm4.b;
import sm4.a;
import ojd.c;
import okhttp3.RequestBody;
import java.util.Map;
import vm4.e;

public final class g0 implements o	// class@00092f
{
    public static final g0 b;

    static {
       g0.b = new g0();
    }
    public void g0(){
       super();
    }
    public final Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, null, b.class, "1");
       if (ot != PatchProxyResult.class) {
       }else if(c.a()){
          p0 = a.a().e(c.d(p0));
       }else {
          p0 = a.a().f(e.a(p0));
       }
       ot = p0;
       return ot;
    }
}
