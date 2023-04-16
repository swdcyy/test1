package com.tachikoma.core.utility.b$a;
import erd.o;
import java.lang.String;
import java.lang.Object;
import s0d.e;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import brd.e0;
import com.yxcorp.image.callercontext.a;
import com.tachikoma.core.utility.b;
import brd.a0;
import com.tachikoma.core.utility.c;
import io.reactivex.i;

public final class b$a implements o	// class@000dd3
{
    public final String b;

    public void b$a(String p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a obj = PatchProxy.applyOneRefs(p0, this, b$a.class, "1");
       if (obj != patchProxyRe) {
       }else {
          obj = b.b(this.b);
          Object obj1 = PatchProxy.applyTwoRefs(p0, obj, null, b.class, "6");
          obj = (obj1 != patchProxyRe)? obj1: a0.k(new c(p0, obj));
       }
       return obj;
    }
}
