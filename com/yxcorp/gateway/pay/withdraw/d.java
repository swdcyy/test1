package com.yxcorp.gateway.pay.withdraw.d;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import com.yxcorp.gateway.pay.response.BindResult;

public final class d implements o	// class@0012d9
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object apply(Object p0){
       return BindResult.fail(p0.getMessage());
    }
}
