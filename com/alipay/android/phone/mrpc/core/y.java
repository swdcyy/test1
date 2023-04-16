package com.alipay.android.phone.mrpc.core.y;
import java.lang.reflect.InvocationHandler;
import com.alipay.android.phone.mrpc.core.g;
import java.lang.Class;
import com.alipay.android.phone.mrpc.core.z;
import java.lang.Object;
import java.lang.reflect.Method;

public final class y implements InvocationHandler	// class@000e5f
{
    public g a;
    public Class b;
    public z c;

    public void y(g p0,Class p1,z p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       return this.c.a(p1, p2);
    }
}
