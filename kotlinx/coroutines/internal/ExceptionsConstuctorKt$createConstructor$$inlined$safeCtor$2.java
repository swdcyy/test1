package kotlinx.coroutines.internal.ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.reflect.Constructor;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.Result;
import kotlin.TypeCastException;
import java.lang.String;
import qrd.j0;

public final class ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$2 extends Lambda implements l	// class@001b36
{
    public final Constructor $constructor$inlined;

    public void ExceptionsConstuctorKt$createConstructor$$inlined$safeCtor$2(Constructor p0){
       this.$constructor$inlined = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Throwable invoke(Throwable p0){
       Object[] objArray = new Object[]{p0};
       p0 = this.$constructor$inlined.newInstance(objArray);
       if (p0 == null) {
          throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
       }
       p0 = Result.constructor-impl(p0);
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
}
