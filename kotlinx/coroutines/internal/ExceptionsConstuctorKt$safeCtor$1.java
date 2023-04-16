package kotlinx.coroutines.internal.ExceptionsConstuctorKt$safeCtor$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Throwable;
import kotlin.Result;
import qrd.j0;

public final class ExceptionsConstuctorKt$safeCtor$1 extends Lambda implements l	// class@001b39
{
    public final l $block;

    public void ExceptionsConstuctorKt$safeCtor$1(l p0){
       this.$block = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Throwable invoke(Throwable p0){
       p0 = Result.constructor-impl(this.$block.invoke(p0));
       if (Result.isFailure-impl(p0)) {
          p0 = null;
       }
       return p0;
    }
}
