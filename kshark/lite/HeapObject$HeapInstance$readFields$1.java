package kshark.lite.HeapObject$HeapInstance$readFields$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import kshark.lite.HeapObject$b;
import qrd.p;
import vsd.n;
import java.lang.Object;
import kshark.lite.HeapObject$HeapClass;
import wsd.m;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kshark.lite.HeapObject$HeapInstance$readFields$1$1;
import kotlin.sequences.SequencesKt___SequencesKt;

public final class HeapObject$HeapInstance$readFields$1 extends Lambda implements l	// class@001b8d
{
    public final p $fieldReader;
    public final n $fieldReader$metadata;
    public final HeapObject$b this$0;

    public void HeapObject$HeapInstance$readFields$1(HeapObject$b p0,p p1,n p2){
       this.this$0 = p0;
       this.$fieldReader = p1;
       this.$fieldReader$metadata = p2;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final m invoke(HeapObject$HeapClass p0){
       a.p(p0, "heapClass");
       return SequencesKt___SequencesKt.b1(CollectionsKt___CollectionsKt.l1(p0.l()), new HeapObject$HeapInstance$readFields$1$1(this, p0));
    }
}
