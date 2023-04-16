package kotlin.sequences.SequencesKt___SequencesKt$elementAt$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.IndexOutOfBoundsException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Number;

public final class SequencesKt___SequencesKt$elementAt$1 extends Lambda implements l	// class@0018cc
{
    public final int $index;

    public void SequencesKt___SequencesKt$elementAt$1(int p0){
       this.$index = p0;
       super(1);
    }
    public final Object invoke(int p0){
       throw new IndexOutOfBoundsException("Sequence doesn\'t contain element at index "+this.$index+'.');
    }
    public Object invoke(Object p0){
       return this.invoke(p0.intValue());
    }
}
