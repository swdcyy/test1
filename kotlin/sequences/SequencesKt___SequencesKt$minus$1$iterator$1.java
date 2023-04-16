package kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import java.lang.Boolean;
import kotlin.jvm.internal.a;

public final class SequencesKt___SequencesKt$minus$1$iterator$1 extends Lambda implements l	// class@0018d5
{
    public final Ref$BooleanRef $removed;
    public final SequencesKt___SequencesKt$minus$1 this$0;

    public void SequencesKt___SequencesKt$minus$1$iterator$1(SequencesKt___SequencesKt$minus$1 p0,Ref$BooleanRef p1){
       this.this$0 = p0;
       this.$removed = p1;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Object p0){
       boolean b = true;
       if (this.$removed.element == null && a.g(p0, this.this$0.b)) {
          p0.element = b;
          b = false;
       }
       return b;
    }
}
