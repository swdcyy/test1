package com.kuaishou.webkit.internal.loader.DexOptimizer$1;
import java.lang.reflect.InvocationHandler;
import android.os.IBinder;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import java.lang.Integer;

public class DexOptimizer$1 implements InvocationHandler	// class@001332
{
    public final IBinder val$pmsBinderProxy;

    public void DexOptimizer$1(IBinder p0){
       this.val$pmsBinderProxy = p0;
       super();
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       if (("transact").equals(p1.getName())) {
          p2[3] = Integer.valueOf(0);
       }
       return p1.invoke(this.val$pmsBinderProxy, p2);
    }
}
