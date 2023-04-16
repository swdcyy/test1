package kotlin.sequences.SequencesKt___SequencesKt$d;
import wsd.m;
import java.util.Comparator;
import java.lang.Object;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import trd.x;

public final class SequencesKt___SequencesKt$d implements m	// class@0018ca
{
    public final m a;
    public final Comparator b;

    public void SequencesKt___SequencesKt$d(m p0,Comparator p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Iterator iterator(){
       List list = SequencesKt___SequencesKt.W2(this.a);
       x.p0(list, this.b);
       return list.iterator();
    }
}
