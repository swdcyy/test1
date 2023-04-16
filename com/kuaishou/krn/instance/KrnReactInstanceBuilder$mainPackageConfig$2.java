package com.kuaishou.krn.instance.KrnReactInstanceBuilder$mainPackageConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ve.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ve.a$a;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import kj0.f;

public final class KrnReactInstanceBuilder$mainPackageConfig$2 extends Lambda implements a	// class@0008be
{
    public static final KrnReactInstanceBuilder$mainPackageConfig$2 INSTANCE;

    static {
       KrnReactInstanceBuilder$mainPackageConfig$2.INSTANCE = new KrnReactInstanceBuilder$mainPackageConfig$2();
    }
    public void KrnReactInstanceBuilder$mainPackageConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       a$a obj = PatchProxy.apply(null, this, KrnReactInstanceBuilder$mainPackageConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a();
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       obj.a = uoc.f().l;
       return new a(obj);
    }
}
