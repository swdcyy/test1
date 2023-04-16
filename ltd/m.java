package ltd.m;
import ltd.o;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Object;
import msd.l;
import kotlin.jvm.internal.a;
import kotlin.TypeCastException;

public class m extends o	// class@001cd3
{

    public void m(){
       super();
    }
    public boolean R(){
       return false;
    }
    public o T(){
       return null;
    }
    public final boolean U(){
       throw new IllegalStateException("head cannot be removed".toString());
    }
    public final void b0(l p0){
       o oo = this.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       int i = a.g(oo, this) ^ 0x01;
       while (i) {
          a.y(3, "T");
          if (oo instanceof o) {
             p0.invoke(oo);
          }
          oo = oo.M();
       }
       return;
    }
    public final boolean c0(){
       boolean b = (this.L() == this)? true: false;
       return b;
    }
    public final void d0(){
       o oo = this.L();
       if (oo == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       o oo1 = this;
       int i = a.g(oo, this) ^ 0x01;
       while (i) {
          o oo2 = oo.M();
          oo.a0(oo1, oo2);
          oo1 = oo;
          oo = oo2;
       }
       Object obj = this.L();
       if (obj == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
       this.a0(oo1, obj);
       return;
    }
}
