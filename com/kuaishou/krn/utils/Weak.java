package com.kuaishou.krn.utils.Weak;
import com.kuaishou.krn.utils.Weak$1;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import vsd.n;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Weak	// class@000921
{
    public WeakReference a;

    public void Weak(){
       super(Weak$1.INSTANCE);
    }
    public void Weak(a p0){
       a.p(p0, "initializer");
       super();
       this.a = new WeakReference(p0.invoke());
    }
    public final Object a(Object p0,n p1){
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, Weak.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       a.p(p1, "property");
       return this.a.get();
    }
    public final void b(Object p0,n p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Weak.class, "3")) {
          return;
       }
       a.p(p1, "property");
       this.a = new WeakReference(p2);
       return;
    }
}
