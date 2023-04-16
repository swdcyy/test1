package kotlin.sequences.SequencesKt___SequencesKt$requireNoNulls$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import wsd.m;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class SequencesKt___SequencesKt$requireNoNulls$1 extends Lambda implements l	// class@0018df
{
    public final m $this_requireNoNulls;

    public void SequencesKt___SequencesKt$requireNoNulls$1(m p0){
       this.$this_requireNoNulls = p0;
       super(1);
    }
    public final Object invoke(Object p0){
       if (p0 != null) {
          return p0;
       }
       throw new IllegalArgumentException("null element found in "+this.$this_requireNoNulls+'.');
    }
}
