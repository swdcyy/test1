package ltd.n;
import ltd.e0;
import java.lang.String;
import java.lang.Object;
import ltd.o;
import ltd.z;
import kotlin.TypeCastException;

public final class n	// class@001cd5
{
    public static final Object a;
    public static final Object b;

    static {
       n.a = new e0("CONDITION_FALSE");
       n.b = new e0("LIST_EMPTY");
    }
    public static void a(){
    }
    public static void b(){
    }
    public static void c(){
    }
    public static void d(){
    }
    public static void e(){
    }
    public static final Object f(){
       return n.a;
    }
    public static final Object g(){
       return n.b;
    }
    public static final o h(Object p0){
       z oz = (!p0 instanceof z)? null: p0;
       if (oz) {
          oz = oz.a;
          if (oz != null) {
          label_0015 :
             return oz;
          }
       }
       if (p0 != null) {
          o oo = p0;
          goto label_0015 ;
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
       }
    }
}
