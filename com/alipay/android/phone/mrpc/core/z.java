package com.alipay.android.phone.mrpc.core.z;
import java.lang.ThreadLocal;
import com.alipay.android.phone.mrpc.core.x;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.reflect.Method;
import android.os.Looper;
import com.alipay.mobile.framework.service.annotation.OperationType;
import java.lang.Class;
import java.lang.annotation.Annotation;
import com.alipay.mobile.framework.service.annotation.ResetCookie;
import java.lang.reflect.Type;
import java.lang.String;
import com.alipay.android.phone.mrpc.core.a.e;
import com.alipay.android.phone.mrpc.core.a.f;
import com.alipay.android.phone.mrpc.core.j;
import com.alipay.android.phone.mrpc.core.g;
import com.alipay.android.phone.mrpc.core.v;
import com.alipay.android.phone.mrpc.core.a.d;
import com.alipay.android.phone.mrpc.core.a.c;
import java.lang.Void;
import com.alipay.android.phone.mrpc.core.RpcException;
import java.lang.IllegalStateException;
import java.lang.IllegalThreadStateException;

public final class z	// class@000e60
{
    public byte c;
    public AtomicInteger d;
    public x e;
    public static final ThreadLocal a;
    public static final ThreadLocal b;

    static {
       z.a = new ThreadLocal();
       z.b = new ThreadLocal();
    }
    public void z(x p0){
       super();
       this.c = 0;
       this.e = p0;
       this.d = new AtomicInteger();
    }
    public final Object a(Method p0,Object[] p1){
       OperationType operationTyp = (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper())? 1: null;
       if (!operationTyp) {
          operationTyp = p0.getAnnotation(OperationType.class);
          boolean b = (p0.getAnnotation(ResetCookie.class) != null)? true: false;
          Type genericRetur = p0.getGenericReturnType();
          p0.getAnnotations();
          ThreadLocal a = z.a;
          a.set(null);
          ThreadLocal b1 = z.b;
          b1.set(null);
          if (operationTyp != null) {
             String str = operationTyp.value();
             int i = this.d.incrementAndGet();
             try{
                if (this.c == null) {
                   e uoe = new e(i, str, p1);
                   if (b1.get() != null) {
                      uoe.a(b1.get());
                   }
                   j oj = new j(this.e.a(), p0, i, str, uoe.a(), b);
                   byte[] uobyteArray = b1.get().a();
                   b1.set(null);
                   uobyteArray = new d(genericRetur, uobyteArray).a();
                   if (genericRetur != Void.TYPE) {
                      a.set(uobyteArray);
                   }
                }
                return a.get();
             }catch(com.alipay.android.phone.mrpc.core.RpcException e13){
                e13.setOperationType(str);
                throw e13;
             }
          }else {
             throw new IllegalStateException("OperationType must be set.");
          }
       }else {
          throw new IllegalThreadStateException("can\'t in main thread call rpc .");
       }
    }
}
