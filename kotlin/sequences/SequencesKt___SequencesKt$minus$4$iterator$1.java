package kotlin.sequences.SequencesKt___SequencesKt$minus$4$iterator$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Boolean;

public final class SequencesKt___SequencesKt$minus$4$iterator$1 extends Lambda implements l	// class@0018db
{
    public final HashSet $other;

    public void SequencesKt___SequencesKt$minus$4$iterator$1(HashSet p0){
       this.$other = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Object p0){
       return this.$other.contains(p0);
    }
}
