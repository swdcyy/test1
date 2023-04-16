package com.yxcorp.gateway.pay.api.d;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gateway.pay.response.BindResult;
import com.yxcorp.gateway.pay.api.PayManager;

public final class d implements o	// class@001223
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return PayManager.lambda$bindWithDrawType$3(p0);
    }
}
