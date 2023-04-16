package com.pagemanager.util.Weak;
import com.pagemanager.util.Weak$1;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import vsd.n;

public final class Weak	// class@000b4a
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
       a.p(p1, "property");
       return this.a.get();
    }
}
