package kotlin.sequences.SequencesKt___SequencesKt$minus$2;
import wsd.m;
import java.lang.Object;
import java.util.Iterator;
import java.util.HashSet;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.sequences.SequencesKt___SequencesKt$minus$2$iterator$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class SequencesKt___SequencesKt$minus$2 implements m	// class@0018d8
{
    public final m a;
    public final Object[] b;

    public void SequencesKt___SequencesKt$minus$2(m p0,Object[] p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       return SequencesKt___SequencesKt.n0(this.a, new SequencesKt___SequencesKt$minus$2$iterator$1(ArraysKt___ArraysKt.ky(this.b))).iterator();
    }
}
