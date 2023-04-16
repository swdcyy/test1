package cra.c0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import java.lang.Number;
import java.lang.StringBuilder;

public final class c0	// class@00237a
{
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public void c0(Object p0,Object p1,Object p2,Object p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final Object a(){
       return this.a;
    }
    public final Object b(){
       return this.b;
    }
    public final Object c(){
       return this.c;
    }
    public final Object d(){
       return this.d;
    }
    public final Object e(){
       return this.a;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof c0 && (a.g(this.a, p0.a) && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && a.g(this.d, p0.d)))))) {
          return true;
       }
       return false;
    }
    public final Object f(){
       return this.b;
    }
    public final Object g(){
       return this.c;
    }
    public final void h(Object p0){
       this.b = p0;
    }
    public int hashCode(){
       c0 obj = PatchProxy.apply(null, this, c0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       int i = 0;
       int i1 = (obj != null)? obj.hashCode(): 0;
       i1 = i1 * 31;
       c0 tb = this.b;
       int i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.c;
       i2 = (tb != null)? tb.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tb = this.d;
       if (tb != null) {
          i = tb.hashCode();
       }
       return (i1 + i);
    }
    public final void i(Object p0){
       this.c = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, c0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return '('+this.a+", "+this.b+", "+this.c+", "+this.d+')';
    }
}
