package kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$3;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.Result;
import java.lang.String;
import kotlin.TypeCastException;
import qrd.j0;

public final class ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$3 extends Lambda implements l	// class@001b37
{
    public final Constructor $constructor$inlined;

    public void ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$3(Constructor p0){
       this.$constructor$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Throwable invoke(Throwable p0){
       Object[] objArray = new Object[]{p0.getMessage()};
       Object obj = this.$constructor$inlined.newInstance(objArray);
       if (obj == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
       }
       obj.initCause(p0);
       p0 = Result.constructor-impl(obj);
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
}
