package kotlin.sequences.SequencesKt__SequencesKt$generateSequence$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class SequencesKt__SequencesKt$generateSequence$1 extends Lambda implements l	// class@0018c0
{
    public final a $nextFunction;

    public void SequencesKt__SequencesKt$generateSequence$1(a p0){
       this.$nextFunction = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       a.p(p0, "it");
       return this.$nextFunction.invoke();
    }
}
