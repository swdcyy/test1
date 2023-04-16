package kotlin.sequences.SequencesKt___SequencesKt$minus$4;
import wsd.m;
import java.lang.Object;
import java.util.Iterator;
import java.util.HashSet;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt$minus$4$iterator$1;
import msd.l;

public final class SequencesKt___SequencesKt$minus$4 implements m	// class@0018dc
{
    public final m a;
    public final m b;

    public void SequencesKt___SequencesKt$minus$4(m p0,m p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       HashSet hashSet = SequencesKt___SequencesKt.U2(this.b);
       if (hashSet.isEmpty()) {
          return this.a.iterator();
       }
       return SequencesKt___SequencesKt.n0(this.a, new SequencesKt___SequencesKt$minus$4$iterator$1(hashSet)).iterator();
    }
}
