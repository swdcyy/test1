package com.kwai.kxb.service.BaseServiceProviderKt$KxbLog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ru6.o;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ru6.b;
import java.util.Objects;
import ru6.p;
import kotlin.jvm.internal.a;

public final class BaseServiceProviderKt$KxbLog$2 extends Lambda implements a	// class@0007e1
{
    public static final BaseServiceProviderKt$KxbLog$2 INSTANCE;

    static {
       BaseServiceProviderKt$KxbLog$2.INSTANCE = new BaseServiceProviderKt$KxbLog$2();
    }
    public void BaseServiceProviderKt$KxbLog$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final o invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = PatchProxy.apply(null, this, BaseServiceProviderKt$KxbLog$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = b.b;
       Objects.requireNonNull(obj);
       p op = PatchProxy.apply(null, obj, b.class, "1");
       if (op != patchProxyRe) {
       }else {
          op = b.a;
          if (op == null) {
             a.S("logServiceProvider");
          }
       }
       return op.get();
    }
}
