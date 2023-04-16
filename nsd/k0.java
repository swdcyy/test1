package nsd.k0;
import nsd.r;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Collection;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import java.lang.StringBuilder;

public final class k0 implements r	// class@001ecc
{
    public final Class b;
    public final String c;

    public void k0(Class p0,String p1){
       a.p(p0, "jClass");
       a.p(p1, "moduleName");
       super();
       this.b = p0;
       this.c = p1;
    }
    public Collection a(){
       throw new KotlinReflectionNotSupportedError();
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof k0 && a.g(this.j(), p0.j()))? true: false;
       return b;
    }
    public int hashCode(){
       return this.j().hashCode();
    }
    public Class j(){
       return this.b;
    }
    public String toString(){
       return this.j().toString()+" \(Kotlin reflection is not available\)";
    }
}
