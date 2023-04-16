package kotlin.sequences.SequencesKt___SequencesJvmKt$filterIsInstance$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Class;
import java.lang.Object;
import java.lang.Boolean;

public final class SequencesKt___SequencesJvmKt$filterIsInstance$1 extends Lambda implements l	// class@0018c5
{
    public final Class $klass;

    public void SequencesKt___SequencesJvmKt$filterIsInstance$1(Class p0){
       this.$klass = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(Object p0){
       return this.$klass.isInstance(p0);
    }
}
