package kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import ftd.k;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import kotlin.Result;
import asd.c;

public final class ProduceKt$awaitClose$4$1 extends Lambda implements l	// class@00199d
{
    public final k $cont;

    public void ProduceKt$awaitClose$4$1(k p0){
       this.$cont = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       this.$cont.resumeWith(Result.constructor-impl(l1.a));
    }
}
