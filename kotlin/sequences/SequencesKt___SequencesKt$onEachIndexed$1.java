package kotlin.sequences.SequencesKt___SequencesKt$onEachIndexed$1;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Number;

public final class SequencesKt___SequencesKt$onEachIndexed$1 extends Lambda implements p	// class@0018de
{
    public final p $action;

    public void SequencesKt___SequencesKt$onEachIndexed$1(p p0){
       this.$action = p0;
       super(2);
    }
    public final Object invoke(int p0,Object p1){
       this.$action.invoke(Integer.valueOf(p0), p1);
       return p1;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.intValue(), p1);
    }
}
