package kotlin.sequences.SequencesKt___SequencesKt$minus$3;
import wsd.m;
import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;
import java.util.Collection;
import trd.u;
import kotlin.sequences.SequencesKt___SequencesKt$minus$3$iterator$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class SequencesKt___SequencesKt$minus$3 implements m	// class@0018da
{
    public final m a;
    public final Iterable b;

    public void SequencesKt___SequencesKt$minus$3(m p0,Iterable p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       Collection uCollection = u.a0(this.b);
       if (uCollection.isEmpty()) {
          return this.a.iterator();
       }
       return SequencesKt___SequencesKt.n0(this.a, new SequencesKt___SequencesKt$minus$3$iterator$1(uCollection)).iterator();
    }
}
