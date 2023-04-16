package com.kuaishou.krn.instance.KrnReactInstanceBuilder;
import com.kuaishou.krn.instance.KrnReactInstanceBuilder$mainPackageConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.krn.c;
import kotlin.jvm.internal.a;
import kj0.l;
import java.util.Collection;

public final class KrnReactInstanceBuilder	// class@0008bf
{
    public static final p a;
    public static final KrnReactInstanceBuilder b;

    static {
       KrnReactInstanceBuilder.b = new KrnReactInstanceBuilder();
       KrnReactInstanceBuilder.a = s.c(KrnReactInstanceBuilder$mainPackageConfig$2.INSTANCE);
    }
    public void KrnReactInstanceBuilder(){
       super();
    }
    public final List a(){
       ArrayList obj = PatchProxy.apply(null, this, KrnReactInstanceBuilder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       l ol = uoc.g();
       a.o(ol, "KrnManager.get\(\).krnInitParams");
       List list = ol.H();
       if (list != null && list.size() > 0) {
          obj.addAll(list);
       }
       return obj;
    }
}
