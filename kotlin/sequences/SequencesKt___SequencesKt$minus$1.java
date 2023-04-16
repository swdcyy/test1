package kotlin.sequences.SequencesKt___SequencesKt$minus$1;
import wsd.m;
import java.lang.Object;
import java.util.Iterator;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.sequences.SequencesKt___SequencesKt$minus$1$iterator$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class SequencesKt___SequencesKt$minus$1 implements m	// class@0018d6
{
    public final m a;
    public final Object b;

    public void SequencesKt___SequencesKt$minus$1(m p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       Ref$BooleanRef uBooleanRef = new Ref$BooleanRef();
       uBooleanRef.element = false;
       return SequencesKt___SequencesKt.i0(this.a, new SequencesKt___SequencesKt$minus$1$iterator$1(this, uBooleanRef)).iterator();
    }
}
