package kotlin.sequences.SequencesKt___SequencesKt$filterIndexed$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import msd.p;
import java.lang.Object;
import trd.i0;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class SequencesKt___SequencesKt$filterIndexed$1 extends Lambda implements l	// class@0018cd
{
    public final p $predicate;

    public void SequencesKt___SequencesKt$filterIndexed$1(p p0){
       this.$predicate = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(i0 p0){
       a.p(p0, "it");
       return this.$predicate.invoke(Integer.valueOf(p0.e()), p0.f()).booleanValue();
    }
}
