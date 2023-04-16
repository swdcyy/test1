package ftd.k2;
import ftd.t1;
import ltd.m;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import ltd.o;
import kotlin.jvm.internal.a;
import ftd.f2;
import kotlin.TypeCastException;

public final class k2 extends m implements t1	// class@000ea1
{

    public void k2(){
       super();
    }
    public boolean E(){
       return true;
    }
    public k2 b(){
       return this;
    }
    public final String e0(String p0){
       StringBuilder str = "List{"+p0+"}[";
       o oo = this.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       int i = 1;
       int i1 = a.g(oo, this) ^ 1;
       while (i1) {
          if (oo instanceof f2) {
             Object obj = oo;
             if (i) {
                i = 0;
             }else {
                str = str+", ";
             }
             str = str+obj;
          }
          oo = oo.M();
       }
       oo = str+"]";
       a.h(oo, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       return oo;
    }
    public String toString(){
       return super.toString();
    }
}
