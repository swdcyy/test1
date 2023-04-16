package com.kwai.eve.typevalue.WrappedTypeValue$a;
import rsd.f;
import java.lang.Object;
import vsd.n;
import com.kwai.eve.typevalue.WrappedTypeValue;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import vsd.c;
import java.util.Objects;
import java.util.Map;

public final class WrappedTypeValue$a implements f	// class@000dd5
{

    public void WrappedTypeValue$a(){
       super();
    }
    public Object a(Object p0,n p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, WrappedTypeValue$a.class, "1");
       if (obj != PatchProxyResult.class) {
       }else {
          a.p(p0, "thisRef");
          a.p(p1, "property");
          obj = p0.get(p1.getName());
       }
       return obj;
    }
    public void b(Object p0,n p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WrappedTypeValue$a.class, "2")) {
       }else {
          a.p(p0, "thisRef");
          a.p(p1, "property");
          Objects.requireNonNull(p2, "null cannot be cast to non-null type kotlin.Any");
          p0.put(p1.getName(), p2);
       }
       return;
    }
}
