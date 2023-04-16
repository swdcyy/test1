package com.alipay.android.phone.mrpc.core.x;
import com.alipay.android.phone.mrpc.core.g;
import java.lang.Object;
import com.alipay.android.phone.mrpc.core.z;
import java.lang.Class;
import java.lang.ClassLoader;
import com.alipay.android.phone.mrpc.core.y;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public final class x	// class@000e5e
{
    public g a;
    public z b;

    public void x(g p0){
       super();
       this.a = p0;
       this.b = new z(this);
    }
    public final g a(){
       return this.a;
    }
    public final Object a(Class p0){
       Class[] uClassArray = new Class[]{p0};
       return Proxy.newProxyInstance(p0.getClassLoader(), uClassArray, new y(this.a, p0, this.b));
    }
}
