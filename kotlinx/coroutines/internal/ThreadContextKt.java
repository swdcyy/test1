package kotlinx.coroutines.internal.ThreadContextKt;
import ltd.e0;
import java.lang.String;
import kotlinx.coroutines.internal.ThreadContextKt$countAll$1;
import kotlinx.coroutines.internal.ThreadContextKt$findOne$1;
import kotlinx.coroutines.internal.ThreadContextKt$updateState$1;
import kotlinx.coroutines.internal.ThreadContextKt$restoreState$1;
import kotlin.coroutines.CoroutineContext;
import java.lang.Object;
import ltd.o0;
import msd.p;
import ftd.d3;
import kotlin.TypeCastException;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import java.lang.Number;

public final class ThreadContextKt	// class@001cef
{
    public static final e0 a;
    public static final p b;
    public static final p c;
    public static final p d;
    public static final p e;

    static {
       ThreadContextKt.a = new e0("ZERO");
       ThreadContextKt.b = ThreadContextKt$countAll$1.INSTANCE;
       ThreadContextKt.c = ThreadContextKt$findOne$1.INSTANCE;
       ThreadContextKt.d = ThreadContextKt$updateState$1.INSTANCE;
       ThreadContextKt.e = ThreadContextKt$restoreState$1.INSTANCE;
    }
    public static final void a(CoroutineContext p0,Object p1){
       if (p1 == ThreadContextKt.a) {
          return;
       }
       if (p1 instanceof o0) {
          p1.c();
          p0.fold(p1, ThreadContextKt.e);
       }else {
          Object obj = p0.fold(null, ThreadContextKt.c);
          if (obj != null) {
             obj.i(p0, p1);
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
          }
       }
       return;
    }
    public static final Object b(CoroutineContext p0){
       p0 = p0.fold(Integer.valueOf(0), ThreadContextKt.b);
       if (p0 == null) {
          a.L();
       }
       return p0;
    }
    public static final Object c(CoroutineContext p0,Object p1){
       e0 a;
       if (p1 != null) {
       }else {
          p1 = ThreadContextKt.b(p0);
       }
       if (p1 == Integer.valueOf(0)) {
          a = ThreadContextKt.a;
       }else if(p1 instanceof Integer){
          a = p0.fold(new o0(p0, p1.intValue()), ThreadContextKt.d);
       }else if(p1 != null){
          a = p1.V(p0);
       }else {
          throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
       }
       return a;
    }
}
